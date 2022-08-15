import java.io.*;
import java.util.*;

public class IoT_Temperature_Device extends Appliance
{

    float temperature;

    public IoT_Temperature_Device(String device_name, String room)
    {
        super(device_name, room);

        Home.temdevices.add(this);
        Home.devs_temdevs.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmtemdevices.add(this);
            } 
        }

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdevs_temdevs.add(this);
            } 
        }
    }

    public float gettemperature(){
        return temperature;
    }

    public void settemperature(float temp){
        temperature = temp;
    }
}
