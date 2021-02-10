
    /*$RCSfile: validateInteger.js,v $ $Rev: 376673 $ $Date: 2006-02-10 13:42:31 +0000 (Fri, 10 Feb 2006) $ */
    /**
    * Check to see if fields are a valid integer.
    * Fields are not checked if they are disabled.
    * <p>
    * @param form The form validation is taking place on.
    */
    function validateInteger(form) {
        var bValid = true;
        var focusField = null;
        var i = 0;
        var fields = new Array();
 
        var oInteger = eval('new ' + jcv_retrieveFormName(form) +  '_IntegerValidations()');
        for (var x in oInteger) {
            if (!jcv_verifyArrayElement(x, oInteger[x])) {
                continue;
            }
            var field = form[oInteger[x][0]];
            if (!jcv_isFieldPresent(field)) {
              continue;
            }

            if ((field.type == 'hidden' ||
                field.type == 'text' ||
                field.type == 'textarea' ||
                field.type == 'select-one' ||
                field.type == 'radio')) {

                var value = '';
                // get field's value
                if (field.type == "select-one") {
                    var si = field.selectedIndex;
                    if (si >= 0) {
                        value = field.options[si].value;
                    }
                } else {
                    value = field.value;
                }

                if (value.length > 0) {

                    if (!jcv_isDecimalDigits(value)) {
                        bValid = false;
                        if (i == 0) {
                            focusField = field;
                        }
                        fields[i++] = oInteger[x][1];

                    } else {
                        var iValue = parseInt(value, 10);
                        if (isNaN(iValue) || !(iValue >= -2147483648 && iValue <= 2147483647)) {
                            if (i == 0) {
                                focusField = field;
                            }
                            fields[i++] = oInteger[x][1];
                            bValid = false;
                       }
                   }
               }
            }
        }
        if (fields.length > 0) {
           jcv_handleErrors(fields, focusField);
        }
        return bValid;
    }
