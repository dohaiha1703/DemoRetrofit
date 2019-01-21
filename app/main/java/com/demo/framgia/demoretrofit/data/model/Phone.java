
package com.demo.framgia.demoretrofit.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Phone {
    private static final String MOBILE = "mobile";
    private static final String HOME = "home";
    private static final String OFFICE = "office";

    @SerializedName(MOBILE)
    @Expose
    private String mobile;
    @SerializedName(HOME)
    @Expose
    private String home;
    @SerializedName(OFFICE)
    @Expose
    private String office;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
