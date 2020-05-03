package ge.edu.btu.luka.gagnidze.regform.model;

public class AAnimal {
    private  String name;
    private String  jishi;
    private String sqesi;
    private String age; //age sringad imito maqvs rom html inputshi shetanili mnishvneloba stringad modis, tumca shemedzlo
    //intshic gadameyvana

    public AAnimal() {

    }

    public AAnimal(String name, String jishi, String sqesi, String age) {
        this.name = name;
        this.jishi = jishi;
        this.sqesi = sqesi;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJishi() {
        return jishi;
    }

    public void setJishi(String jishi) {
        this.jishi = jishi;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSqesi(){
        return sqesi;
    }
    public void setSqesi(String sqesi){
        this.sqesi=sqesi;

    }
}