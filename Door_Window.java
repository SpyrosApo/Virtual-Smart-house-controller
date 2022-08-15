import java.io.*;
import java.util.*;

public class Door_Window extends Appliance
{
    boolean locked;
    boolean external;
    String room1;

    public Door_Window(String device_name, String room, String room1, boolean external)
    {
        super(device_name, room);
        this.room1 = room1;
        this.locked = false;
        this.external = external;

        Home.doors_windows.add(this);

        if (this.external == true){
            Home.exdoors.add(this);
        }
        else {
            Home.indoors.add(this);
        }

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdoors_windows.add(this);
            } 
        }

        for (int i = 0; i < 6; i++){
            if (this.room1 == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdoors_windows.add(this);
            } 
        }
    }

    public boolean getlocked()
    {
        return  locked;
    }

    public Door_Window(String device_name, String room )
    {
        super(device_name, room);
        this.locked = false;

        Home.doors_windows.add(this);
        Home.windows.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdoors_windows.add(this);
            } 
        }
    }

    public void closedw()
    {
        open = false;
        if (device_name.contains("Παράθυρο")){
            System.out.println("Το παράθυρο έκλεισε.");
        }else if (device_name.contains("Πόρτα")){
            System.out.println("Η πόρτα έκλεισε.");
        }   
    }

    public void opendw()
    {
        if (locked == false)
        {
            open = true;
            if (device_name.contains("Παράθυρο")){
                System.out.println("Το παράθυρο άνοιξε.");
            }else if (device_name.contains("Πόρτα")){
                System.out.println("Η πόρτα άνοιξε.");
            }
        }else {
            if (device_name.contains("Παράθυρο")){
                System.out.println("Άκυρο! Το παράθυρο είναι κλειδωμένο.");
            }else if (device_name.contains("Πόρτα")){
                System.out.println("Άκυρο! Η πόρτα είναι κλειδωμένη.");
            }
        }
    }

    public void lockdw()
    {
        if (open == false)
        {
            locked = true;
            if (device_name.contains("Παράθυρο")){
                System.out.println("Το παράθυρο κλείδωσε.");
            }else if (device_name.contains("Πόρτα")){
                System.out.println("Η πόρτα κλείδωσε.");
            }
        }else{
            open = false;
            locked = true; 
            if (device_name.contains("Παράθυρο")){
                System.out.println("Το παράθυρο έκλεισε και κλείδωσε.");
            }else if (device_name.contains("Πόρτα")){
                System.out.println("Η πόρτα έκλεισε και κλείδωσε.");
            }
        }

    }

    public void unlockdw()
    {
        locked = false;

        if (device_name.contains("Παράθυρο")){
            System.out.println("Το παράθυρο ξεκλείδωσε.");
        }else if (device_name.contains("Πόρτα")){
            System.out.println("Η πόρτα ξεκλείδωσε.");
        }
    }

    public void closedwsec()
    {
        open = false;
    }

    public void opendwsec()
    {
        if (locked == false)
        {
            open = true;
        }
    }

    public void lockdwsec()
    {
        if (open == false)
        {
            locked = true;
        }else{
            open = false;
            locked = true;
        }

    }

    public void unlockdwsec()
    {
        locked = false;
    }
}
