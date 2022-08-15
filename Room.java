import java.io.*;
import java.util.*;

public class Room
{
    public ArrayList<Device> rmdevices = new ArrayList<Device>();
    public ArrayList<Light> rmlights = new ArrayList<Light>();
    public ArrayList<Sensor> rmsensors = new ArrayList<Sensor>();
    public ArrayList<Camera> rmcameras = new ArrayList<Camera>();
    public ArrayList<IoT_Temperature_Device> rmtemdevices = new ArrayList<IoT_Temperature_Device>();
    public ArrayList<Appliance> rmdevs_temdevs = new ArrayList<Appliance>();
    public ArrayList<Door_Window> rmdoors_windows = new ArrayList<Door_Window>();

    String room_name;

    public Room(String room_name)
    {
        this.room_name = room_name;
        Home.rooms.add(this);
    }

    public String getroom_name()
    {
        return  room_name;
    }
}
