package com.kitcenter.runners.homework.Lesson13;

import java.util.regex.Pattern;

public class WhiteCollar extends Human {

    private String companyName;

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        setCompanyName(companyName);
    }

    public void setCompanyName(String companyName) {

        if (Pattern.matches("^[a-zA-Z0-9._]+$", companyName)) {
            this.companyName = companyName;
        }
        else {

            System.out.println("Company name is invalid");
        }

    }

    public String getCompanyName() {
        return companyName;
    }
}
