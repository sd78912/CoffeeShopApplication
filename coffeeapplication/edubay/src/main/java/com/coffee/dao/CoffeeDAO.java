package com.coffee.dao;
import com.coffee.model.Coffee;

import java.util.List;

public interface CoffeeDAO
{
    void saveData(Integer Orderid,Integer Amount,String Foodname,String Username);
    List<Coffee> getCoffee(int Orderid);
    void deleteData(Integer Userid);
    void updateCoffee(Integer Userid, Integer Orderid,Integer Amount,String Foodname,String Username);
}

