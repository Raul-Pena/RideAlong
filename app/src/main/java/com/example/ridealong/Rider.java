package com.example.ridealong;

public class Rider {
    private String fName, lName, pwrd, eml;
    private byte usrType;
    public Rider(){
        this.usrType = -1;
        this.lName = "";
        this.fName = "";
        this.pwrd = "";
        this.eml = "";
    }

    public void setUserType(byte user){ this.usrType = user; }
    public void setFName(String firstName){ this.fName = firstName; }
    public void setLName(String lastName){ this.lName = lastName; }
    public void setPassword(String password){ this.pwrd = password;}
    public void setEmail(String email){ this.eml = email; }

    public byte getUserType(){ return this.usrType; }
    public String getFName(){ return this.fName; }
    public String getLName(){ return this.lName; }
    public String getPassword(){ return this.pwrd;}
    public String getEmail(){ return this.eml; }

}
