import java.io.*;
import java.util.*;

public class Home
{

    public static ArrayList<Room> rooms = new ArrayList<Room>();
    public static ArrayList<Device> devices = new ArrayList<Device>();
    public static ArrayList<Light> lights = new ArrayList<Light>();
    public static ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    public static ArrayList<Camera> cameras = new ArrayList<Camera>();
    public static ArrayList<IoT_Temperature_Device> temdevices = new ArrayList<IoT_Temperature_Device>();
    public static ArrayList<Visitor> visitors = new ArrayList<Visitor>();
    public static ArrayList<Appliance> devs_temdevs = new ArrayList<Appliance>();

    public static ArrayList<Door_Window> exdoors = new ArrayList<Door_Window>();
    public static ArrayList<Door_Window> indoors = new ArrayList<Door_Window>();
    public static ArrayList<Door_Window> windows = new ArrayList<Door_Window>();
    public static ArrayList<Door_Window> doors_windows = new ArrayList<Door_Window>();

    public static void main(String[] args)
    {                
        Room rm0 = new Room ("Αυλή");
        Room rm1 = new Room ("Σαλόνι");
        Room rm2 = new Room ("Κουζίνα");
        Room rm3 = new Room ("Μπάνιο");
        Room rm4 = new Room ("Υπνοδωμάτιο 1");
        Room rm5 = new Room ("Υπνοδωμάτιο 2");

        //devices Σαλόνι
        Device dev1 = new Device ("TV 1","Σαλόνι");
        Device dev2 = new Device ("Ψεκαστήρας 1","Σαλόνι");
        Device dev3 = new Device ("Ψεκαστήρας 2","Σαλόνι");
        Device dev4 = new Device ("Ψεκαστήρας 3","Σαλόνι");
        Device dev5 = new Device ("Ηχοσύστημα 1","Σαλόνι");

        //devices Κουζίνα
        Device dev6 = new Device ("Καφετιέρα","Κουζίνα");
        Device dev7 = new Device ("Boiler 1","Κουζίνα");
        Device dev8 = new Device ("Ψεκαστήρας 4","Κουζίνα");
        Device dev9 = new Device ("Ψεκαστήρας 5","Κουζίνα");

        //devices Μπάνιο
        Device dev10 = new Device ("Boiler 2","Μπάνιο");
        Device dev11 = new Device ("Ψεκαστήρας 6","Μπάνιο");

        //devices Υπνοδωμάτιο 1
        Device dev12 = new Device ("TV 2","Υπνοδωμάτιο 1");
        Device dev13 = new Device ("Ηχοσύστημα 2","Υπνοδωμάτιο 1");
        Device dev14 = new Device ("Ψεκαστήρας 7","Υπνοδωμάτιο 1");

        //devices Υπνοδωμάτιο 2
        Device dev15 = new Device ("TV 3","Υπνοδωμάτιο 2");
        Device dev16 = new Device ("Ψεκαστήρας 8","Υπνοδωμάτιο 2");

        //temperature devices Σαλόνι
        IoT_Temperature_Device temp_dev1 = new IoT_Temperature_Device ("Air Condition 1","Σαλόνι");
        IoT_Temperature_Device temp_dev2 = new IoT_Temperature_Device ("Heater 1","Σαλόνι");

        //temperature devices Κουζίνα
        IoT_Temperature_Device temp_dev3 = new IoT_Temperature_Device ("Φούρνος","Κουζίνα");
        IoT_Temperature_Device temp_dev4 = new IoT_Temperature_Device ("Ψυγείο","Κουζίνα");

        //temperature devices Μπάνιο
        IoT_Temperature_Device temp_dev5 = new IoT_Temperature_Device ("Αερόθερμο","Μπάνιο");

        //temperature devices Υπνοδωμάτιο 1
        IoT_Temperature_Device temp_dev6 = new IoT_Temperature_Device ("Air Condition 2 ","Υπνοδωμάτιο 1");
        IoT_Temperature_Device temp_dev7 = new IoT_Temperature_Device ("Heater 2","Υπνοδωμάτιο 1");               

        //temperature devices Υπνοδωμάτιο 2
        IoT_Temperature_Device temp_dev8 = new IoT_Temperature_Device ("Air Condition 3","Υπνοδωμάτιο 2");
        IoT_Temperature_Device temp_dev9 = new IoT_Temperature_Device ("Heater 3","Υπνοδωμάτιο 2");

        //windows Σπιτιού
        Door_Window win1 = new Door_Window ("Παράθυρο 1","Σαλόνι");
        Door_Window win2 = new Door_Window ("Παράθυρο 2","Σαλόνι");
        Door_Window win3 = new Door_Window ("Παράθυρο 3","Σαλόνι");
        Door_Window win4 = new Door_Window ("Παράθυρο 4","Κουζίνα");
        Door_Window win5 = new Door_Window ("Παράθυρο 5","Μπάνιο");
        Door_Window win6 = new Door_Window ("Παράθυρο 6","Υπνοδωμάτιο 1");
        Door_Window win7 = new Door_Window ("Παράθυρο 7","Υπνοδωμάτιο 2");

        //doors Σπιτιού
        Door_Window exdr1 = new Door_Window ("Εξωτερική Πόρτα 1","Σαλόνι","Αυλή",true);
        Door_Window exdr2 = new Door_Window ("Εξωτερική Πόρτα 2","Κουζίνα","Αυλή",true);
        Door_Window indr1 = new Door_Window ("Εσωτερική Πόρτα 1","Σαλόνι","Κουζίνα",false);
        Door_Window indr2 = new Door_Window ("Εσωτερική Πόρτα 2","Σαλόνι","Μπάνιο",false);
        Door_Window indr3 = new Door_Window ("Εσωτερική Πόρτα 3","Σαλόνι","Υπνοδωμάτιο 1",false);
        Door_Window indr4 = new Door_Window ("Εσωτερική Πόρτα 4","Σαλόνι","Υπνοδωμάτιο 2",false);

        //cameras Αυλή
        Camera cam1 = new Camera("Κάμερα 1","Αυλή");
        Camera cam2 = new Camera("Κάμερα 2","Αυλή");

        //cameras Σαλόνι

        Camera cam3 = new Camera("Κάμερα 3","Σαλόνι");
        Camera cam4 = new Camera("Κάμερα 4","Σαλόνι");
        Camera cam5 = new Camera("Κάμερα 5","Σαλόνι");

        //cameras Κουζίνα
        Camera cam6 = new Camera("Κάμερα 6","Κουζίνα");

        //cameras Μπάνιο
        Camera cam7 = new Camera("Κάμερα 7","Μπάνιο");

        //cameras Υπνοδωμάτιο 1
        Camera cam8 = new Camera("Κάμερα 8","Υπνοδωμάτιο 1");

        //cameras Υπνοδωμάτιο 2
        Camera cam9 = new Camera("Κάμερα 9","Υπνοδωμάτιο 2");

        //lights Αυλή
        Light light1 = new Light("Φως 1","Αυλή");
        Light light2 = new Light("Φως 2","Αυλή");
        Light light3 = new Light("Φως 3","Αυλή");
        Light light4 = new Light("Φως 4","Αυλή");

        //lights Σαλόνι
        Light light5 = new Light("Φως 5","Σαλόνι");
        Light light6 = new Light("Φως 6","Σαλόνι");
        Light light7 = new Light("Φως 7","Σαλόνι");
        Light light8 = new Light("Φως 8","Σαλόνι");

        //lights Κουζίνα
        Light light9 = new Light("Φως 9","Κουζίνα");
        Light light10 = new Light("Φως 10","Κουζίνα");

        //lights Μπάνιο
        Light light11 = new Light("Φως 11","Μπάνιο");
        Light light12 = new Light("Φως 12","Μπάνιο");

        //lights Υπνοδωμάτιο 1
        Light light13 = new Light("Φως 13","Υπνοδωμάτιο 1");

        //lights Υπνοδωμάτιο 2
        Light light14 = new Light("Φως 14","Υπνοδωμάτιο 2");

        //sensors Αυλή
        Sensor sen1 = new Sensor("Αισθητήρας κίνησης 1","Αυλή");
        Sensor sen2 = new Sensor("Αισθητήρας κίνησης 2","Αυλή");

        //sensors Σαλόνι
        Sensor sen3 = new Sensor("Αισθητήρας κίνησης 3","Σαλόνι");
        Sensor sen4 = new Sensor("Αισθητήρας κίνησης 4","Σαλόνι");
        Sensor sen5 = new Sensor("Αισθητήρας κίνησης 5","Σαλόνι");
        Sensor sen6 = new Sensor("Αισθητήρας υγρασίας 1","Σαλόνι");
        Sensor sen7 = new Sensor("Αισθητήρας θερμοκρασίας 1","Σαλόνι");
        Sensor sen8 = new Sensor("Αισθητήρας καπνού 1","Σαλόνι");
        Sensor sen9 = new Sensor("Αισθητήρας καπνού 2","Σαλόνι");

        //sensors Κουζίνα 
        Sensor sen10 = new Sensor("Αισθητήρας κίνησης6","Κουζίνα");
        Sensor sen11 = new Sensor("Αισθητήρας καπνού3","Κουζίνα");

        //sensors Μπάνιο
        Sensor sen12 = new Sensor("Αισθητήρας κίνησης 7","Μπάνιο");
        Sensor sen13 = new Sensor("Αισθητήρας καπνού 4","Μπάνιο");

        //sensors Υπνοδωμάτιο 1
        Sensor sen14 = new Sensor("Αισθητήρας κίνησης 8","Υπνοδωμάτιο 1");
        Sensor sen15 = new Sensor("Αισθητήρας καπνού 5","Υπνοδωμάτιο 1");

        //sensors Υπνοδωμάτιο 2        
        Sensor sen16 = new Sensor("Αισθητήρας κίνησης 9","Υπνοδωμάτιο 2");
        Sensor sen17 = new Sensor("Αισθητήρας καπνού 6","Υπνοδωμάτιο 2");

        Security ASF = new Security();

        int choiceentry = 1;
        while (choiceentry != 7) {
            System.out.println();
            System.out.println("Επέλεξε τον αριθμό του Use Case που θες να τρέξεις αλλίως επέλεξε έναν άλλο αριθμό για να τερματίσεις το πρόγραμμα");
            System.out.println("1.Επιλογή σεναρίου ασφαλείας");
            System.out.println("2.Χειρισμός καμερών");
            System.out.println("3.Ρύθμιση φωτισμού");
            System.out.println("4.Παραχώρηση άδειας εισόδου");
            System.out.println("5.Διαχείρηση συσκευών");
            System.out.println("6.Χειρισμός Πορτών/παραθύρων");           
            choiceentry = readInt();
            switch(choiceentry){
                case 1:
                EpilogiSenariouAsfalias();
                break;
                case 2:
                XeirismosKameron();
                break;
                case 3:
                RithmisiFotismou();
                break;
                case 4:
                ParaxorisiAdeiasEisodou();
                break;
                case 5:
                DiaxeirisiSuskeuon();
                break;
                case 6:
                XeirismosPortonParathiron();
                break;
                default:
                choiceentry = 7;
                System.out.println("Το πρόγραμμα τερματίζει.");

            }
        }

    }

    public static int readInt() {
        byte b[] = new byte[16];
        String str;

        try {
            System.in.read(b); 
            str = (new String(b)).trim();
            return Integer.parseInt(str);
        } catch (IOException e) {
            System.out.println("Exception: " + e.toString());
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.toString() + "\nReturned value: -1");
            return -1;
        }
    } 

    public static float readFloat() {
        byte b[] = new byte[16];
        String str;

        try {
            System.in.read(b);
            str = (new String(b)).trim(); 
            return Float.parseFloat(str);
        } catch (IOException e) {
            System.out.println("Exception: " + e.toString());
            return 0;
        }catch (NumberFormatException e) {
            System.out.println("Exception: " + e.toString() + "\nReturnedvalue: -1");
            return -1;
        }
    }

    public static String readString() {
        byte b[] = new byte[32];
        String str;

        try {
            System.in.read(b);
            str = (new String(b)).trim();
            return str;
        } catch (IOException e) {
            System.out.println("Exception: " + e.toString());
            return "";
        }
    }

    public static boolean readBoolean() {
        byte b[] = new byte[16];
        String str;

        try {
            System.in.read(b);
            str = (new String(b)).trim();
            Boolean bool = new Boolean(str);
            return bool.booleanValue();
        } catch (IOException e) {
            System.out.println("Exception: " + e.toString());
            return false;
        }
    } 

    static void EpilogiSenariouAsfalias()
    {

        System.out.println("Επέλεξε το αριθμό ενός από τα παρακάτω σενάρια ασφαλείας");
        System.out.println("Επίπεδο 0");
        System.out.println("Επίπεδο 1");
        System.out.println("Επίπεδο 2");
        System.out.println("Επίπεδο 3");
        System.out.println("Επίπεδο 4");
        Security.Senario(readInt());

    }

    static void XeirismosKameron()
    {
        int x=1;
        int roomentry;
        int cameraentry;
        int onoffentry;
        for (Room obj : Home.rooms) {
            System.out.print(x);
            System.out.print(".");
            System.out.println(obj.getroom_name());
            x = x + 1;
        }
        x = 1;
        System.out.println("Επέλεξε τον αριθμό του Δωματίου που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
        roomentry = readInt();
        while (roomentry > Home.rooms.size() || roomentry < 0)
        {
            System.out.println("Διάλεξες άκυρο.");  
            System.out.println("Διάλεξε ξανά.");
            roomentry = readInt();
        }
        if(roomentry != 0){
            for (Camera obj : Home.rooms.get(roomentry - 1).rmcameras) {
                System.out.print(x);
                System.out.print(".");
                System.out.println(obj.getdevice_name());
                x = x + 1;
            }
            System.out.println("Επέλεξε τον αριθμό της κάμερας που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
            cameraentry = readInt();
            while (cameraentry > Home.rooms.get(roomentry - 1).rmcameras.size() || cameraentry < 0)
            {
                System.out.println("Διάλεξες άκυρο.");  
                System.out.println("Διάλεξε ξανά.");
                cameraentry = readInt();
            }

            if(cameraentry != 0)
            {
                System.out.println(Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getdevice_name());
                if(Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getdamaged() == true){
                    System.out.println("Η κάμερα είναι χαλασμένη.");
                    System.out.println("live feed ανενεργό.");
                }
                else{
                    if(Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getopen() == true){
                        System.out.println("Η κάμερα είναι ανοικτή.");
                        System.out.println("live feed ενεργό.");
                    }
                    else{
                        System.out.println("Η κάμερα είναι κλειστή.");
                        System.out.println("live feed ανενεργό.");
                    }

                }

                System.out.println("Επέλεξε 1 για ενεργοποίηση/απενεργοποίηση της κάμερας ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                onoffentry = readInt();
                while (onoffentry != 0 && onoffentry != 1)
                {
                    System.out.println("Διάλεξες άκυρο.");  
                    System.out.println("Διάλεξε ξανά.");
                    onoffentry = readInt();
                }
                if (onoffentry != 0)
                {
                    if(Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getdamaged() == true)
                    {
                        System.out.println("Η κάμερα είναι χαλασμένη.");  
                    }   
                    else if (Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getopen() == true)
                    {
                        if (Security.getactive_senario() == 3 || Security.getactive_senario() == 4)
                        {  do
                            {
                                System.out.println("Ένα από τα επίπεδα 3 ή 4 είναι ενεργοποιημένο.");
                                System.out.println("Παρακαλώ επέλεξε άλλο σενάριο ασφαλείας.");
                                EpilogiSenariouAsfalias();
                            }while(Security.getactive_senario() == 3 || Security.getactive_senario() == 4 );
                            Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setclosed();
                            Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setlive_feed();
                            
                        }
                        else
                        {
                            Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setclosed();
                            Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setlive_feed();
                        }
                    }
                    else if (Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).getopen() == false)
                    {
                        Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setopen();
                        Home.rooms.get(roomentry - 1).rmcameras.get(cameraentry - 1).setlive_feed();
                    }
                }
            }
        }
    }

    static void RithmisiFotismou()
    {
        int x=1;
        int settingentry;
        int roomentry;
        int lightentry;
        int onoffentry;
        for (Room obj : Home.rooms) {
            System.out.print(x);
            System.out.print(".");
            System.out.println(obj.getroom_name());
            x = x + 1;
        }
        x = 1;
        System.out.println("Επέλεξε τον αριθμό του Δωματίου που θες ή επέλεξε 7 για Light Track ή 0 για να επιστρέψεις στο κεντρικό μενού.");
        roomentry = readInt();
        while (roomentry > Home.rooms.size() || roomentry < 0 || roomentry == 7)
        {
            System.out.println("Διάλεξες άκυρο.");  
            System.out.println("Διάλεξε ξανά.");
            roomentry = readInt();
        }
        if(roomentry != 0){
            if(roomentry == 7)
            {

                if(Light.getLight_Track() == true){
                    System.out.println("Το Light Track είναι ενεργό.");
                }
                else if (Light.getLight_Track() == false)
                {
                    System.out.println("Το Light Track είναι ανενεργό.");
                }
                System.out.println("Επέλεξε 1 για ενεργοποίηση/απενεργοποίηση Light Track ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                onoffentry = readInt();                
                while (onoffentry != 0 && onoffentry != 1)
                {
                    System.out.println("Διάλεξες άκυρο.");  
                    System.out.println("Διάλεξε ξανά.");
                    onoffentry = readInt();
                } 
                if(onoffentry != 0)
                {
                    Light.setLight_Track();
                }
            }
            else 
            {
                for (Light obj : Home.rooms.get(roomentry - 1).rmlights) {
                    System.out.print(x);
                    System.out.print(".");
                    System.out.println(obj.getdevice_name());
                    x = x + 1;
                }
                System.out.println("Επέλεξε τον αριθμό του φωτιστικού που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                lightentry = readInt();
                while (lightentry > Home.rooms.get(roomentry - 1).rmlights.size() || lightentry < 0)
                {
                    System.out.println("Διάλεξες άκυρο.");  
                    System.out.println("Διάλεξε ξανά.");
                    lightentry = readInt();
                }

                if(lightentry != 0)
                {
                    System.out.println(Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getdevice_name());
                    if(Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getdamaged() == true){
                        System.out.println("Το φως είναι χαλασμένο.");
                    }
                    else{
                        if(Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getopen() == true){
                            System.out.println("Το φως είναι ανοικτό.");
                        }
                        else{
                            System.out.println("Το φως είναι κλειστό.");
                        }

                    }

                    System.out.println("Επέλεξε 2 για ρύθμιση του φωτιστικού ή 1 για ενεργοποίηση/απενεργοποίηση του φωτιστικού ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                    onoffentry = readInt();
                    while (onoffentry != 0 && onoffentry != 1 && onoffentry != 2)
                    {
                        System.out.println("Διάλεξες άκυρο.");  
                        System.out.println("Διάλεξε ξανά.");
                        onoffentry = readInt();
                    }
                    if (onoffentry != 0)
                    {
                        if (onoffentry == 1){
                            if(Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getdamaged() == true)
                            {
                                System.out.println("Το φως είναι χαλασμένο.");  
                            }   
                            else if (Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getopen() == true)
                            {
                                Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setclosed();
                            }
                            else if (Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getopen() == false)
                            {
                                Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setopen();
                            }
                        }
                        else 
                        {
                            if(Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getdamaged() == true)
                            {
                                System.out.println("Το φως είναι χαλασμένο.");  
                            }   
                            else if (Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getopen() == true)
                            {
                                System.out.println("Επέλεξε 2 για ρύθμιση RGB ή 1 για για ρύθμιση φωτεινότητας ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                                settingentry = readInt();
                                while (settingentry != 0 && settingentry != 1 && settingentry != 2)
                                {
                                    System.out.println("Διάλεξες άκυρο.");  
                                    System.out.println("Διάλεξε ξανά.");
                                    settingentry = readInt();
                                }
                                if (settingentry != 0)
                                {
                                    if (settingentry == 1)
                                    {
                                        System.out.println("Η φωτεινότητα είναι στο " + Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getdimmer() + " τις εκατό.");
                                        System.out.println("Δώσε τιμή φωτεινότητας από 0 έως 100 τις εκατό.");       
                                        Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setdimmer(readInt());
                                    }
                                    else if (settingentry == 2)
                                    {
                                        System.out.println("Οι τιμές RGB είναι:");
                                        System.out.println("RED:" + Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getred());
                                        System.out.println("GREEN:"+ Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getgreen());
                                        System.out.println("BLUE:"+ Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getblue());
                                        System.out.println();
                                        System.out.println("Δώσε τιμή για το RED");
                                        Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setred(readInt());
                                        System.out.println("Δώσε τιμή για το GREEN");
                                        Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setgreen(readInt());
                                        System.out.println("Δώσε τιμή για το BLUE");
                                        Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).setblue(readInt());

                                    }

                                }

                            }
                            else if (Home.rooms.get(roomentry - 1).rmlights.get(lightentry - 1).getopen() == false)
                            {
                                System.out.println("Το φως είναι κλειστό.");
                            }

                        }
                    }
                }   
            }
        }
    }

    static void ParaxorisiAdeiasEisodou()
    {
        int x=1;
        int visentry;
        int visentry2;
        int infoentry;
        for (Visitor obj : Home.visitors) {
            System.out.print(x);
            System.out.print(".");
            System.out.println(obj.getvis_name() + " " + obj.getvis_surname());
            x = x + 1;
        }
        x = 1;
        System.out.println("Επέλεξε τον αριθμό του Επισκέπτη που θες για άνοιγμα στοιχείων και διαγραφή ή τροποποίηση.");
        System.out.println("Για Δημιουργία επέλεξε τον επόμενο αριθμό μετά τον τελευταίο στη λίστα ή 0 για να επιστρέψεις στο κεντρικό μενού.");
        visentry = readInt();
        while (visentry > (Home.visitors.size() + 1) || visentry < 0)
        {
            System.out.println("Διάλεξες άκυρο.");  
            System.out.println("Διάλεξε ξανά.");
            visentry = readInt();
        }
        if(visentry != 0)
        {
            if (visentry == (Home.visitors.size() + 1)){
                Visitor vis = new Visitor();
            }else{
                System.out.println("1.Όνομα: " + Home.visitors.get(visentry - 1).getvis_name());
                System.out.println("2.Επώνυμο: " + Home.visitors.get(visentry - 1).getvis_surname());
                System.out.println("3.Κωδικός: " + Home.visitors.get(visentry - 1).getvis_password());

                System.out.println("Επέλεξε τον αριθμό 1 για Διαγραφή, 2 για Tροποποίηση ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                visentry2 = readInt();
                while (visentry2 > 2 || visentry2 < 0)
                {
                    System.out.println("Διάλεξες άκυρο.");  
                    System.out.println("Διάλεξε ξανά.");
                    visentry2 = readInt();
                }
                if(visentry2 != 0){

                    if(visentry2 == 1){
                        Visitor.delete_vis(visentry);
                    }else{
                        System.out.println("Επέλεξε τον αριθμό του στοιχείου που θες να τροποποιήσεις.");
                        infoentry = readInt();
                        Home.visitors.get(visentry - 1).change_vis(visentry, infoentry);
                    }

                }

            }
        }

    }

    static void DiaxeirisiSuskeuon()
    {
        int x=1;
        int roomentry;
        int deviceentry;
        int onoffentry;
        for (Room obj : Home.rooms) {
            System.out.print(x);
            System.out.print(".");
            System.out.println(obj.getroom_name());
            x = x + 1;
        }
        x = 1;
        System.out.println("Επέλεξε τον αριθμό του Δωματίου που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
        roomentry = readInt();
        while (roomentry > Home.rooms.size() || roomentry < 0)
        {
            System.out.println("Διάλεξες άκυρο.");  
            System.out.println("Διάλεξε ξανά.");
            roomentry = readInt();
        }
        if(roomentry != 0)
        {
            for (Appliance obj : Home.rooms.get(roomentry - 1).rmdevs_temdevs) {
                System.out.print(x);
                System.out.print(".");
                System.out.println(obj.getdevice_name());
                x = x + 1;
            }
            System.out.println("Επέλεξε τον αριθμό της συσκευής που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
            deviceentry = readInt();
            while (deviceentry > Home.rooms.get(roomentry - 1).rmdevs_temdevs.size() || deviceentry < 0)
            {
                System.out.println("Διάλεξες άκυρο.");  
                System.out.println("Διάλεξε ξανά.");
                deviceentry = readInt();
            }
            if(deviceentry != 0)
            {
                System.out.println(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getdevice_name());
                if(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getdamaged() == true){
                    System.out.println("Η συσκευή είναι χαλασμένη.");
                }
                else{
                    if(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getopen() == true){
                        System.out.println("Η συσκευή είναι ανοικτή.");
                        if(Home.temdevices.contains(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1)))
                        {
                            System.out.println("Θερμοκρασία:" + Home.rooms.get(roomentry - 1).rmtemdevices.get(deviceentry -  Home.rooms.get(roomentry - 1).rmdevices.size() - 1).gettemperature() + "℃"); 
                        }
                    }
                    else{
                        System.out.println("Η συσκευή είναι κλειστή.");
                    }

                }
                if(Home.temdevices.contains(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1)))
                {
                    System.out.println("Επέλεξε 2 για ρύθμιση Θερμοκρασία ή 1 για ενεργοποίηση/απενεργοποίηση της συσκευής ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                    onoffentry = readInt();
                    while (onoffentry != 0 && onoffentry != 1 && onoffentry != 2)
                    {
                        System.out.println("Διάλεξες άκυρο.");  
                        System.out.println("Διάλεξε ξανά.");
                        onoffentry = readInt();
                    }
                }
                else
                {
                    System.out.println("Επέλεξε 1 για ενεργοποίηση/απενεργοποίηση της συσκευής ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                    onoffentry = readInt();
                    while (onoffentry != 0 && onoffentry != 1)
                    {
                        System.out.println("Διάλεξες άκυρο.");  
                        System.out.println("Διάλεξε ξανά.");
                        onoffentry = readInt();
                    } 
                }
                if (onoffentry != 0)
                {
                    if (onoffentry == 1){
                        if(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getdamaged() == true)
                        {
                            System.out.println("Η συσκευή είναι χαλασμένη.");  
                        }   
                        else if (Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getopen() == true)
                        {
                            Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).setclosed();
                        }
                        else if (Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getopen() == false)
                        {
                            Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).setopen();
                        }
                    }else if (onoffentry == 2){
                        if(Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getdamaged() == true)
                        {
                            System.out.println("Η συσκευή είναι χαλασμένη.");  
                        }   
                        else if (Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getopen() == true)
                        {
                            System.out.println("Θερμοκρασία:" + Home.rooms.get(roomentry - 1).rmtemdevices.get(deviceentry -  Home.rooms.get(roomentry - 1).rmdevices.size() - 1).gettemperature() + "℃");
                            System.out.println();
                            System.out.println("Δώσε νέα τιμή θρμοκρασία."); 
                            Home.rooms.get(roomentry - 1).rmtemdevices.get(deviceentry -  Home.rooms.get(roomentry - 1).rmdevices.size() - 1).settemperature(readFloat());

                        }
                        else if (Home.rooms.get(roomentry - 1).rmdevs_temdevs.get(deviceentry - 1).getopen() == false)
                        {
                            System.out.println("Η συσκευή είναι κλειστή.");  
                        }
                    }

                }

            }
        }

    }

    static void XeirismosPortonParathiron()
    {
        int x=1;
        int roomentry;
        int door_windowentry;
        int onoffentry;
        for (Room obj : Home.rooms) {
            System.out.print(x);
            System.out.print(".");
            System.out.println(obj.getroom_name());
            x = x + 1;
        }
        x = 1;
        System.out.println("Επέλεξε τον αριθμό του Δωματίου που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
        roomentry = readInt();
        while (roomentry > Home.rooms.size() || roomentry < 0)
        {
            System.out.println("Διάλεξες άκυρο.");  
            System.out.println("Διάλεξε ξανά.");
            roomentry = readInt();
        }
        if(roomentry != 0){
            for (Door_Window obj : Home.rooms.get(roomentry - 1).rmdoors_windows) {
                System.out.print(x);
                System.out.print(".");
                System.out.println(obj.getdevice_name());
                x = x + 1;
            }
            System.out.println("Επέλεξε τον αριθμό της πόρτας ή του παραθύρου που θες ή 0 για να επιστρέψεις στο κεντρικό μενού.");
            door_windowentry = readInt();
            while (door_windowentry > Home.rooms.get(roomentry - 1).rmdoors_windows.size() || door_windowentry < 0)
            {
                System.out.println("Διάλεξες άκυρο.");  
                System.out.println("Διάλεξε ξανά.");
                door_windowentry = readInt();
            }

            if(door_windowentry != 0)
            {
                System.out.println(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getdevice_name());
                if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getdamaged() == true){
                    System.out.println("Ο αισθητήρας της πόρτας ή του παραθύρου είναι χαλασμένος.");
                }
                else{
                    if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getopen() == true){
                        System.out.println("Η πόρτα ή το παραθύρο είναι ανοικτή/ό.");
                        if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == true)
                        {
                            System.out.println("Η πόρτα ή το παραθύρο είναι κλειδωμένη/ο.");
                        }
                        else if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == false)
                        {
                            System.out.println("Η πόρτα ή το παραθύρο είναι ξεκλείδωτη/η.");
                        }
                    }
                    else if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getopen() == false)
                    {
                        System.out.println("Η πόρτα ή το παραθύρο είναι κλειστή/ό.");
                        if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == true)
                        {
                            System.out.println("Η πόρτα ή το παραθύρο είναι κλειδωμένη/ο.");
                        }
                        else if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == false)
                        {
                            System.out.println("Η πόρτα ή το παραθύρο είναι ξεκλείδωτη/ο.");
                        }
                    }

                }                
                System.out.println();
                System.out.println("Επέλεξε 2 για κλειδώσεις/ξεκλειδώσεις την πόρτα ή το παραθύρο ");
                System.out.println("ή 1 για ανοίξεις/κλείσεις την πόρτα ή το παραθύρο");
                System.out.println("ή 0 για να επιστρέψεις στο κεντρικό μενού.");
                onoffentry = readInt();
                while (onoffentry != 0 && onoffentry != 1 && onoffentry != 2)
                {
                    System.out.println("Διάλεξες άκυρο.");  
                    System.out.println("Διάλεξε ξανά.");
                    onoffentry = readInt();
                }
                if (onoffentry != 0)
                {
                    if(onoffentry == 2){
                        if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getdamaged() == true)
                        {
                            System.out.println("Ο αισθητήρας της πόρτας ή του παραθύρου είναι χαλασμένος.");  
                        }   
                        else if (Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == true)
                        {
                            if (Security.getactive_senario() == 4)
                            {  do
                                {
                                    System.out.println("Το επίπεδο 4 είναι ενεργοποιημένο.");
                                    System.out.println("Παρακαλώ επέλεξε άλλο σενάριο ασφαλείας.");
                                    EpilogiSenariouAsfalias();
                                }while(Security.getactive_senario() == 4 );
                                Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).unlockdw();
                            }
                            else
                            {
                                Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).unlockdw();
                            }
                        }
                        else if (Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getlocked() == false)
                        {
                            Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).lockdw();
                        }
                    }
                    else if(onoffentry == 1)
                    {
                        if(Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getdamaged() == true)
                        {
                            System.out.println("Ο αισθητήρας της πόρτας ή του παραθύρου είναι χαλασμένος.");  
                        }   
                        else if (Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getopen() == false)
                        {
                            if (Security.getactive_senario() == 4)
                            {  do
                                {
                                    System.out.println("Το επίπεδο 4 είναι ενεργοποιημένο.");
                                    System.out.println("Παρακαλώ επέλεξε άλλο σενάριο ασφαλείας.");
                                    EpilogiSenariouAsfalias();
                                }while(Security.getactive_senario() == 4 );
                            }
                            else
                            {
                                Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).opendw();
                            }
                        }
                        else if (Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).getopen() == true)
                        {
                            Home.rooms.get(roomentry - 1).rmdoors_windows.get(door_windowentry - 1).closedw();
                        }
                    }
                }
            }
        }
    }
}
