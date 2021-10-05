package com.coffee.controller;
import com.coffee.model.response.Response;
import com.coffee.dao.CoffeeDAO;
import com.coffee.model.Coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@ResponseStatus(HttpStatus.OK)
@CrossOrigin(origins = "*")
public class FileController {
    @Autowired
    CoffeeDAO coffeeDAO;

    public FileController() throws IOException {
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public Response addData(@RequestBody Coffee coffee) {
        coffeeDAO.saveData(coffee.getOrderID(), coffee.getAmount(), coffee.getFoodname(), coffee.getUsername());
        Response response = new Response();
        response.setMessage("DataAdded");
        response.setSuccess(true);
        return response;

    }

    @Autowired
    private CoffeeDAO coffeeDAOget;

    @GetMapping("/coffee/user/{Orderid}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    List<Coffee> getCoffeeByuserId(@PathVariable Integer Orderid) {
        return coffeeDAOget.getCoffee(Orderid);
    }

    @Autowired
    private CoffeeDAO coffeeDAOdelete;

    @DeleteMapping("/coffee/{Userid}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public Response deleteCoffee(@PathVariable Integer Userid)
    {
        coffeeDAOdelete.deleteData(Userid);
        Response response = new Response();
        response.setMessage("DataDeleted");
        response.setSuccess(true);
        return response;
    }
    @Autowired
    private CoffeeDAO coffeeDAOupdate;

    @PutMapping("/coffee/{Userid}")
    public Response updateData(@PathVariable Integer Userid, @RequestBody Coffee coffee){
        coffeeDAOupdate.updateCoffee(Userid,coffee.getOrderID(), coffee.getAmount(), coffee.getFoodname(), coffee.getUsername());
        Response response = new Response();
        response.setMessage("DataUpdated");
        response.setSuccess(true);
        return response;
    }
}












