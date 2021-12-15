package com.example.swiftappstask.pojo;

public class RequestID {
   private int UserID;
   private String Name;
   private int BuildingID;
   private int BuildingQty;
   private int UnitID;
   private int Lat;


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBuildingID() {
        return BuildingID;
    }

    public void setBuildingID(int buildingID) {
        BuildingID = buildingID;
    }

    public int getBuildingQty() {
        return BuildingQty;
    }

    public void setBuildingQty(int buildingQty) {
        BuildingQty = buildingQty;
    }

    public int getUnitID() {
        return UnitID;
    }

    public void setUnitID(int unitID) {
        UnitID = unitID;
    }

    public int getLat() {
        return Lat;
    }

    public void setLat(int lat) {
        Lat = lat;
    }
}
