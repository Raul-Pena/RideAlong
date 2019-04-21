package com.example.ridealong;

public class Driver {
    private String fName, lName, pwrd, eml, model, licPlate;
    private int year;
    private byte usrType;
    public Driver(){
        this.usrType = -1;
        this.lName = "";
        this.fName = "";
        this.pwrd = "";
        this.eml = "";
        this.model = "";
        this.year = 0;
        this.licPlate = "";
    }
    public Driver(Rider user, String model, int year, String licPlate){
        this.setModel(model);
        this.setPlateNum(licPlate);
        this.setYear(year);
        this.setUserType((byte) 1 );
        this.setFName(user.getFName());
        this.setLName(user.getLName());
        this.setPassword(user.getPassword());
        this.setEmail(user.getEmail());
    }

    public void setUserType(byte user){ this.usrType = user; }
    public void setFName(String firstName){ this.fName = firstName; }
    public void setLName(String lastName){ this.lName = lastName; }
    public void setPassword(String password){ this.pwrd = password;}
    public void setEmail(String email){ this.eml = email; }
    public void setModel(String model){ this.model = model; }
    public void setYear(int year){ this.year = year; }
    public void setPlateNum(String plateNum){ this.licPlate = plateNum; }

    public byte getUserType(){ return this.usrType; }
    public String getFName(){ return this.fName; }
    public String getLName(){ return this.lName; }
    public String getPassword(){ return this.pwrd;}
    public String getEmail(){ return this.eml; }
    public String getModel(){ return this.model; }
    public int getYear(){ return this.year; }
    public String getPlateNum(){ return this.licPlate; }

}
