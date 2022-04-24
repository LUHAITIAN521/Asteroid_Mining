package project.lab;

import java.util.Objects;

public class TP_GATE {
    String id;
    Asteroids asLocation=null;
    public boolean paired(TP_GATE t1,TP_GATE t2)
    {
        if(Objects.equals(t1.id, t2.id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String GetID()
    {
        return this.id;
    }

    public void  SetID(String tid)
    {
        this.id=tid;
    }

    public Asteroids GetA()
    {
        return asLocation;
    }

    public  void  SetA(Asteroids anew)
    {
        this.asLocation=anew;
    }
}
