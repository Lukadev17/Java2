package ge.edu.btu.luka.gagnidze.models;

import java.util.ArrayList;
import java.util.List;

public class SingletonCovid {
    private static List<Covid> covidarray;

    private SingletonCovid() {
    }
    public static List<Covid> getInstance(){
        if (covidarray==null) {
            Covid spain=new Covid("Spain", 200210,166256, 635895);
            Covid usa=new Covid("US", 760245,40702, 71003);
            Covid china=new Covid("Italy", 178972,23660, 51003);
            covidarray = new ArrayList<Covid>();
            covidarray.add(spain);
            covidarray.add(usa);
            covidarray.add(china);

        }
        return covidarray;
    }
}
