package org.oscat.oscat.validation;

import org.oscat.oscat.model.Validator;

import java.util.List;

public class FileContainsValidator extends Validator {

    String filePath;
    boolean requiresPrivileges;
    String containsString;

    @Override
    public void validate() {

    }
}
