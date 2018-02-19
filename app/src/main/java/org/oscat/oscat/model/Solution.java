package org.oscat.oscat.model;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlElement
public class Solution {

    String solutionText;
    String justification;

    public String getSolutionText() {
        return solutionText;
    }

    public void setSolutionText(String solutionText) {
        this.solutionText = solutionText;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

}
