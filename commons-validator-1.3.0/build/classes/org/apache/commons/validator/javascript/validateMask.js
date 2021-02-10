
    /*$RCSfile: validateMask.js,v $ $Rev: 376673 $ $Date: 2006-02-10 13:42:31 +0000 (Fri, 10 Feb 2006) $ */
    /**
    * Check to see if fields are a valid using a regular expression.
    * Fields are not checked if they are disabled.
    * <p>
    * @param form The form validation is taking place on.
    */
    function validateMask(form) {
        var isValid = true;
        var focusField = null;
        var i = 0;
        var fields = new Array();
 
        var oMasked = eval('new ' + jcv_retrieveFormName(form) +  '_mask()');      
        for (var x in oMasked) {
            if (!jcv_verifyArrayElement(x, oMasked[x])) {
                continue;
            }
            var field = form[oMasked[x][0]];
            if (!jcv_isFieldPresent(field)) {
              continue;
            }

            if ((field.type == 'hidden' ||
                field.type == 'text' ||
                 field.type == 'textarea' ||
				 field.type == 'file') &&
                 (field.value.length > 0)) {

                if (!jcv_matchPattern(field.value, oMasked[x][2]("mask"))) {
                    if (i == 0) {
                        focusField = field;
                    }
                    fields[i++] = oMasked[x][1];
                    isValid = false;
                }
            }
        }

        if (fields.length > 0) {
           jcv_handleErrors(fields, focusField);
        }
        return isValid;
    }

    function jcv_matchPattern(value, mask) {
       return mask.exec(value);
    }
