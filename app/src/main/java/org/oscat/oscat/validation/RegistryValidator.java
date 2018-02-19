package org.oscat.oscat.validation;

import org.oscat.oscat.model.ValidationStatus;
import org.oscat.oscat.model.Validator;
import org.oscat.oscat.util.WinRegistry;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class RegistryValidator extends Validator {

    String registryKey;
    String valueName;
    List<String> acceptedValues;

    @Override
    public void validate() {

        this.setValidationStatus(ValidationStatus.RUNNING);

        try {
            String registryValue = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, registryKey, valueName);

            if (acceptedValues.contains(registryValue)) {
                this.setValidationStatus(ValidationStatus.PASSED);
            } else {
                this.setValidationStatus(ValidationStatus.FAILED);
            }


        } catch (IllegalAccessException ex) {
            System.out.println(ex);
        } catch (InvocationTargetException ex) {
            System.out.println(ex);
        }

    }

}
