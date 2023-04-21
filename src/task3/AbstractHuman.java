package task3;

import java.util.Objects;

public abstract class AbstractHuman{
    public String name;
    public String type;

    public AbstractHuman(){}

    public void setType(String invited){
        if(Objects.equals(invited, "got an invitation")) this.type= "Funny";
        else if (Objects.equals(invited, "didn't get an invitation")) this.type="Strange";
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
