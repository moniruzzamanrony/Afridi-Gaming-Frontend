package com.itvillage.afridigaming.dto.response;

/**
 * Created by Rasel on 5/26/2019.
 */

public class UserCreateProfileResponse {

    private String firstName;
    private String lastName;
    private String mobileNo;
    private Double acBalance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(Double acBalance) {
        this.acBalance = acBalance;
    }
}