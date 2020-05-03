package ge.edu.btu.luka.gagnidze.services;

import ge.edu.btu.luka.gagnidze.models.Covid;
import ge.edu.btu.luka.gagnidze.models.SingletonCovid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidService {

    @WebMethod
    public List<Covid> getStatistic(){
        return SingletonCovid.getInstance();
    }

    @WebMethod
    public Covid CountryStatistic(String country){
        List<Covid> covidarray=SingletonCovid.getInstance();
        Covid result = null;
        for (int i=0; i< covidarray.size(); i++){
            if (covidarray.get(i).getCountry().equals(country)){
                result=covidarray.get(i);

            }
        }
        return result;
    }

    @WebMethod
    public int TotalConfirmed(){
        List<Covid> covidarray=SingletonCovid.getInstance();
        int sumOfTotalConfirmed=0;
        for (int i=0; i < covidarray.size(); i++){
            sumOfTotalConfirmed += covidarray.get(i).getConfirmed();
        }
        return sumOfTotalConfirmed;
    }

    @WebMethod
    public int TotalDeathget(){
        List<Covid> covidarray=SingletonCovid.getInstance();
        int sumOfTotalDeath=0;
        for (int i=0; i < covidarray.size(); i++){
            sumOfTotalDeath += covidarray.get(i).getDeaths();
        }
        return sumOfTotalDeath;
    }
    @WebMethod
    public int TotalRecoveryget(){
        List<Covid> covidarray=SingletonCovid.getInstance();
        int sumOfTotalRecovery=0;
        for (int i=0; i < covidarray.size(); i++){
            sumOfTotalRecovery += covidarray.get(i).getRecovered();
        }
        return sumOfTotalRecovery;
    }


}
