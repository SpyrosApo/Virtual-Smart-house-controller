import java.io.*;
import java.util.*;

public class Sensor extends Appliance
{

    float mesurments;

    public Sensor(String device_name, String room)
    {
        super(device_name, room);

        Home.sensors.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmsensors.add(this);
            } 
        }
    }

    public float getmesurments(){
        return mesurments;
    }
}
