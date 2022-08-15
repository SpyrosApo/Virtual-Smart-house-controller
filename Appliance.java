import java.io.*;
import java.util.*;

public abstract class Appliance
{
    String device_name;
    boolean open;
    boolean damaged;
    String room;

    public Appliance(String device_name, String room)
    {
        this.device_name = device_name;
        this.open = false;
        this.damaged = false;
        this.room = room;
    }

    public String getdevice_name()
    {
        return  device_name;
    }

    public boolean getopen()
    {
        return  open;
    }

    public boolean getdamaged()
    {
        return  damaged;
    }

    public void setopen()
    {
        open = true;
        if (device_name.contains("Φως")){
            System.out.println("Το φως άνοιξε.");
        }else System.out.println("Η συσκευή άνοιξε.");
    }

    public void setclosed()
    {
        open = false;
        if (device_name.contains("Φως")){
            System.out.println("Το φως έκλεισε.");
        }else System.out.println("Η συσκευή έκλεισε.");
    }

    public void setopensec()
    {
        open = true;
    }

    public void setclosedsec()
    {
        open = false;
    }

}
