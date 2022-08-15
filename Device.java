import java.io.*;
import java.util.*;

public class Device extends Appliance
{

    public Device(String device_name, String room)
    {
        super(device_name, room);

        Home.devices.add(this);
        Home.devs_temdevs.add(this);

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdevices.add(this);
            } 
        }

        for (int i = 0; i < 6; i++){
            if (this.room == Home.rooms.get(i).getroom_name())
            {
                Home.rooms.get(i).rmdevs_temdevs.add(this);
            } 
        }
    }

}
