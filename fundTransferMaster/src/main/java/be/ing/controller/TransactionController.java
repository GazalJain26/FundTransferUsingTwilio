package be.ing.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Component
@Path("/transaction")
public class TransactionController {
    @GET
    @Path("/create")
    public String createTransaction() {
        //From User Id
        //To User Id
        //Get From User Details
        //Get To User Details
        return "Hello world!";
    }
    @POST
    @Path("/retrive")
    public String getTransacton(){
        return "Retrive Transactio";
    }


    @POST
    @Path("/update")
    public String updateTransacton(){
        return "Update Transaction";
    }


}