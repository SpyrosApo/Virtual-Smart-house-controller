import java.io.*;
import java.util.*;

public class Camera extends Appliance
{

    boolean live_feed;

    public Camera(String device_name, String room)
    {
        super(device_name, room);
        live_feed = false;

        Home.cameras.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmcameras.add(this);
            } 
        }
    }

    public boolean getlive_feed(){
        return live_feed;
    }

    public void setlive_feed(){
        if (live_feed == false){
            live_feed = true;
            System.out.println("Το Live Feed ενεργοποιήθηκε.");
        }
        else if (live_feed == true){
            live_feed = false;
            System.out.println("Το Live Feed απενεργοποιήθηκε.");
        }
    }
}
