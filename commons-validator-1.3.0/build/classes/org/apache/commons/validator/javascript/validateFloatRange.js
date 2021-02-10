
   /*$RCSfile: validateFloatRange.js,v $ $Rev: 376673 $ $Date: 2006-02-10 13:42:31 +0000 (Fri, 10 Feb 2006) $ */
    /**
    * Check to see if fields are in a valid float range.
    * Fields are not checked if they are disabled.
    * <p>
    * @param form The form validation is taking place on.
    */
    function validateFloatRange(form) {
        var isValid = true;
        var focusField = null;
        var i = 0;
        var fields = new Array();
        
        var oRange = eval('new ' + jcv_retrieveFormName(form) +  '_floatRange()');
        for (var x in oRange) {
            if (!jcv_verifyArrayElement(x, oRange[x])) {
                continue;
            }
            var field = form[oRange[x][0]];
            if (!jcv_isFieldPresent(field)) {
              continue;
            }
            
            if ((field.type == 'hidden' ||
                field.type == 'text' || field.type == 'textarea') &&
                (field.value.length > 0)) {
        
                var fMin = parseFloat(oRange[x][2]("min"));
                var fMax = parseFloat(oRange[x][2]("max"));
                var fValue = parseFloat(field.value);
                if (!(fValue >= fMin && fValue <= fMax)) {
                    if (i == 0) {
                        focusField = field;
                    }
                    fields[i++] = oRange[x][1];
                    isValid = false;
                }
            }
        }
        if (fields.length > 0) {
            jcv_handleErrors(fields, focusField);
        }
        return isValid;
    }
