package org.oscat.oscat.model;

public class Validator {

    ValidationType validationType;
    ValidationStatus validationStatus;

    public ValidationType getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationType validationType) {
        this.validationType = validationType;
    }

    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(ValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
    }

    public void validate() {
        // Will be overwritten by subclasses

    }

}
