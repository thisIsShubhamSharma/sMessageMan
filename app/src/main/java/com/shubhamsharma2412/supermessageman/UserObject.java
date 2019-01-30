package com.shubhamsharma2412.supermessageman;

public class UserObject {
    private String phone, name;

    public UserObject(String aPhone,String aName){
        this.phone = aPhone;
        this.name = aName;
    }

    public String getName() { return name; }

    public String getPhone() { return phone; }
}
