
package com.demo.framgia.demoretrofit.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String ADDRESS = "address";
    private static final String GENDER = "gender";
    private static final String PHONE = "phone";

    @SerializedName(ID)
    @Expose
    private String id;
    @SerializedName(NAME)
    @Expose
    private String name;
    @SerializedName(EMAIL)
    @Expose
    private String email;
    @SerializedName(ADDRESS)
    @Expose
    private String address;
    @SerializedName(GENDER)
    @Expose
    private String gender;
    @SerializedName(PHONE)
    @Expose
    private Phone phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
