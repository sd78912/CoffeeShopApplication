package com.coffee.dao.impl;
import com.coffee.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coffee.dao.CoffeeDAO;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CoffeeDAOimpl implements  CoffeeDAO
{
    private static final String SQL_INSERT_DATA = "INSERT INTO coffee(orderid,amount,foodname,username)" +
            "VALUES (?, ?, ?, ?)";
    private static final String SQL_DELETE_DATA = "DELETE FROM coffee WHERE userid=?";
    private static final String SQL_UPDATE_DATA= "UPDATE coffee SET orderid=?, amount=?, foodname=?,username=? WHERE userid=?";

    @Autowired
    DataSource dataSource;

    @Override
    public void saveData(Integer Orderid, Integer Amount, String Foodname, String Username) {
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(SQL_INSERT_DATA)) {
            ps.setInt(1, Orderid);
            ps.setInt(2, Amount);
            ps.setString(3, Foodname);
            ps.setString(4, Username);
            ps.execute();
        } catch (SQLException throwables) {

            throw new RuntimeException("Error on  saving coffee details", throwables);
        }

    }

    @Override
    public List<Coffee> getCoffee(int Orderid) {
        List<Coffee> CoffeeList = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM coffee where orderid=?")) {
                ps.setInt(1, Orderid);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Coffee coffee = new Coffee();
                        coffee.setOrderID(rs.getInt("Orderid"));
                        coffee.setAmount(rs.getInt("Amount"));
                        coffee.setFoodname(rs.getString("Foodname"));
                        coffee.setUserId(rs.getInt("Userid"));
                        coffee.setUsername(rs.getString("Username"));
                        CoffeeList.add(coffee);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return CoffeeList;
    }

    @Override
    public void deleteData(Integer Userid)
    {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQL_DELETE_DATA))
        {
            ps.setInt(1,Userid);
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




    }
    @Override
    public void updateCoffee(Integer Userid, Integer Orderid,Integer Amount,String Foodname,String Username) {
        try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_DATA)) {
            ps.setInt(1,Orderid);
            ps.setInt(2, Amount);
            ps.setString(3, Foodname);
            ps.setString(4,Username);
            ps.setInt(5, Userid);
            ps.execute();
        }
        catch (SQLException throwables) {

            throw new RuntimeException("Error on  saving course application details", throwables);
        }
    }

}