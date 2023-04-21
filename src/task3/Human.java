package task3;

public class Human extends AbstractHuman {
    public String type;
    public String invited;
    public Boolean isFunny;

    public Human(){
        this.name = "Unknown";
        this.invited="didn't get an invitation";
        this.type="Strange";
        this.isFunny=false;
    }

    public Human(String name, String invited, String type, Boolean isFunny){
        this.name = name;
        this.type = type;
        this.invited = invited;
        this.isFunny = isFunny;
    }

    @Override
    public String toString(){
        return this.invited + " cause this person is " + this.type;
    }


}
