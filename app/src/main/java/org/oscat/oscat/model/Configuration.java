package org.oscat.oscat.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Configuration {

    String name;
    String description;
    Solution solution;
    String versionToTest = "*";
    Validator validator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public String getVersionToTest() {
        return versionToTest;
    }

    public void setVersionToTest(String versionToTest) {
        this.versionToTest = versionToTest;
    }

    public Validator getValidator() {
        return validator;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

}
