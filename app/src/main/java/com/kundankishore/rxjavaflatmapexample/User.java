package com.kundankishore.rxjavaflatmapexample;

import android.location.Address;

/**
 * Created by Caliber on 08-08-2018.
 */

public class User {
    private String name;
    private String email;
    private String gender;
    private Address address;

    // getters and setters

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}