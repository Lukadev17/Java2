package ge.btu.luka.gagnidze.currency.controller;

import ge.btu.luka.gagnidze.currency.model.BuyOrSell;
import ge.btu.luka.gagnidze.currency.model.Currency;
import ge.btu.luka.gagnidze.currency.model.CurrencyData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/currency")
public class CurrencyController {

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Currency> getCurrency(){
        return CurrencyData.getInstance();
    }



    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    public double buyCurrency(BuyOrSell buyobj){
        ArrayList<Currency> currencydata= CurrencyData.getInstance();
        double amount=buyobj.getAmount();
        double result=0;
        String to=buyobj.getTo();
        for (Currency currency : currencydata){
            if (currency.getTitle().equals(to)){
                result=amount/currency.getSell();

            }

        }
        return result;

    }
    @POST
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    public double sellCurency(BuyOrSell buyobj){
        ArrayList<Currency> currencydata= CurrencyData.getInstance();
        double amount=buyobj.getAmount();
        double result=0;
        String to=buyobj.getTo();
        for (Currency currency : currencydata){
            if (currency.getTitle().equals(to)){
                result=amount*currency.getBuy();

            }

        }
        return result;

    }
}
