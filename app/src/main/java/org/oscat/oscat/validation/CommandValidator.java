package org.oscat.oscat.validation;

import org.oscat.oscat.model.Validator;

import java.util.List;

public class CommandValidator extends Validator {

    String commandToRun;
    boolean requiresPrivileges;
    List<String> acceptedOutputs;


}
