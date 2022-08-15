import java.io.*;
import java.util.*;

public class Light extends Appliance
{

    int red;
    int blue;
    int green;
    int dimmer;
    static boolean Light_Track = false;

    public Light(String device_name, String room)
    {
        super(device_name, room);
        this.red = 255;
        this.blue = 255;
        this.green = 255;
        this.dimmer = 50;

        Home.lights.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmlights.add(this);
            } 
        }
    }

    public static boolean getLight_Track(){
        return Light_Track;
    }

    public static void setLight_Track(){
        if (Light_Track == false){
            Light_Track = true;
            System.out.println("Το Light Track ενεργοποιήθηκε.");
        }
        else if (Light_Track == true){
            Light_Track = false;
            System.out.println("Το Light Track απενεργοποιήθηκε.");
        }
    }

    public void setred(int red){
        this.red = red;
        while (this.red > 255 || this.red < 0){
            System.out.println("Ο αριθμός πρέπει να είναι ανάμεσα στο 0 και 255. Δώσε ξανά αριθμό.");
            this.red = Home.readInt();
        }
    }

    public void setblue(int blue){
        this.blue = blue;
        while (this.blue > 255 || this.blue < 0){
            System.out.println("Ο αριθμός πρέπει να είναι ανάμεσα στο 0 και 255. Δώσε ξανά αριθμό.");
            this.blue = Home.readInt();
        }
    }

    public void setgreen(int green){
        this.green = green;
        while (this.green > 255 || this.green < 0){
            System.out.println("Ο αριθμός πρέπει να είναι ανάμεσα στο 0 και 255. Δώσε ξανά αριθμό.");
            this.green = Home.readInt();
        }
    }

    public void setdimmer(int dimmer){
        this.dimmer = dimmer;
        while (this.dimmer > 100 || this.dimmer < 0){
            System.out.println("Ο αριθμός πρέπει να είναι ανάμεσα στο 0 και 100. Δώσε ξανά αριθμό.");
            this.dimmer = Home.readInt();
        }
    }

    public int getdimmer(){
        return dimmer;
    }

    public int getgreen(){
        return green;
    }

    public int getblue(){
        return blue;
    }

    public int getred(){
        return red;
    }
}
