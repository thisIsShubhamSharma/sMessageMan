package com.shubhamsharma2412.supermessageman.User;

public class UserObject {
    private String uid,
                   phone,
                   name;

    public UserObject(String aUid, String aPhone,String aName){
        this.phone = aPhone;
        this.name = aName;
        this.uid = aUid;
    }

    public String getUid() { return uid; }
    public String getName() { return name; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
}
