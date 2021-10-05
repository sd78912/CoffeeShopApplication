package com.coffee.model;

public class Coffee
{

    private Integer Userid;
    private  Integer OrderID;
    private String Username;
    private String Foodname;
    private Integer Amount;

    public Coffee() {

    }
    public Coffee(Integer OrderID,Integer Amount,Integer Userid,String Foodname, String Username) {
        this.OrderID = OrderID;
        this.Userid = Userid;
        this.Username = Username;
        this.Foodname = Foodname;
        this.Amount = Amount;
    }
    public Integer getOrderID() {
        return OrderID;
    }

    public void setOrderID(Integer OrderID) {
        this.OrderID = OrderID;
    }


    public Integer getUserId() {
        return Userid;
    }

    public void setUserId(Integer Userid) {
        this.Userid = Userid;
    }



    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getFoodname() {
        return Foodname;
    }

    public void setFoodname(String Foodname) {
        this.Foodname = Foodname;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    }



