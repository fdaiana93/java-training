package Eager;


import java.util.Timer;

public class EagerInit {
private static final EagerInit instance=new EagerInit();
public String name;
    public String getName(){
        return name;
    }
private EagerInit(){
name="Eager Singleton"+ new Timer();
   }

    public static EagerInit getInstance()
{
    return instance;
}

}
