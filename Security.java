import java.io.*;
import java.util.*;

public class Security
{

    public static int active_senario;
    public static boolean bypassDev_Sch;

    public Security()
    {
        active_senario = 0;
        bypassDev_Sch = false;

        defaultunlockalldw();

    }

    public static void Senario(int active_sen)
    {

        active_senario = active_sen;

        if (active_senario == 0) {
            System.out.println("Λεπτομέριες Επιπέδου 0: όλες οι πόρτες και όλα τα παράθυρα είναι ξεκλείδωτα και οι συσκευές λειτουργούν με βάση το πρόγραμμα ημέρας.");
            unlockalldw();

            bypassDev_Sch = false;

        }
        else if (active_senario == 1) {
            System.out.println("Λεπτομέριες Επιπέδου 1: οι εξωτερικές πόρτες είναι κλειδωμένες, τα παράθυρα και οι εσωτερικές πόρτες είναι ξεκλείδωτα. Οι συσκευές λειτουργούν με βάση το πρόγραμμα ημέρας.");
            unlockindoors();
            unlockwindows();

            closeexdoors();
            lockexdoors();

            bypassDev_Sch = false;
        }

        else if (active_senario == 2) {
            System.out.println("Λεπτομέριες Επιπέδου 2:  οι εξωτερικές πόρτες και τα παράθυρα είναι κλειδωμένα και οι εσωτερικές πόρτες ξεκλείδωτες. Οι συσκευές λειτουργούν με βάση το πρόγραμμα ημέρας.");
            unlockindoors();

            closeexdoors();
            closewindows();
            lockexdoors();           
            lockwindows();

            bypassDev_Sch = false;
        }

        else if (active_senario == 3) {
            System.out.println("Λεπτομέριες Επιπέδου 3: οι εξωτερικές πόρτες και τα παράθυρα είναι κλειδωμένα, οι εσωτερικές πόρτες ξεκλείδωτες και όλες οι συσκευές απενεργοποιημένες.");
            unlockindoors();

            closeexdoors();
            closewindows();
            lockexdoors();           
            lockwindows();

            bypassDev_Sch = true;
            closelights();
            closedevices();
            closetemdevices();
            opencameras();
            opensensors();
        }

        else if (active_senario == 4) {
            System.out.println("Λεπτομέριες Επιπέδου 4: όλες οι πόρτες και τα παράθυρα είναι κλειδωμένα και οι συσκευές απενεργοποιημένες.");
            closealldw();
            lockalldw();

            bypassDev_Sch = true;
            closelights();
            closedevices();
            closetemdevices();
            opencameras();
            opensensors();
        }

    }

    public static int getactive_senario()
    {
        return active_senario;   
    }

    public static void defaultunlockalldw()
    {
        for (Door_Window obj : Home.doors_windows) {
            obj.unlockdwsec();
        }
    }

    public static void closelights(){
        for (Light obj : Home.lights) {
            obj.setclosedsec();
        }
    }

    public static void closedevices(){
        for (Device obj : Home.devices) {
            obj.setclosedsec();
        }
    }

    public static void closetemdevices(){
        for (IoT_Temperature_Device obj : Home.temdevices) {
            if (obj.device_name.contains("Ψυγείο")){    
            }else obj.setclosedsec();
        }
    }

    public static void opencameras(){
        for (Camera obj : Home.cameras) {
            obj.setopensec();
        }
    }

    public static void opensensors(){
        for (Sensor obj : Home.sensors) {
            obj.setopensec();
        }
    }

    public static void closealldw()
    {
        for (Door_Window obj : Home.doors_windows) {
            obj.closedwsec();
        }
        System.out.println("Όλες οι πόρτες και τα παράθυρα κλείσανε.");
    }

    public static void lockalldw()
    {
        for (Door_Window obj : Home.doors_windows) {
            obj.lockdwsec();
        }
        System.out.println("Όλες οι πόρτες και τα παράθυρα κλειδώσανε.");
    }

    public static void openalldw()
    {
        for (Door_Window obj : Home.doors_windows) {
            obj.opendwsec();
        }
        System.out.println("Όλες οι πόρτες και τα παράθυρα ανοίξανε");
    }

    public static void unlockalldw()
    {
        for (Door_Window obj : Home.doors_windows) {
            obj.unlockdwsec();
        }
        System.out.println("Όλες οι πόρτες και τα παράθυρα ξεκλειδώσανε.");
    }

    public static void closeexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.closedwsec();
        }
        System.out.println("Οι εξωτερικές πόρτες κλείσανε.");
    }

    public static void closeindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.closedwsec();
        }
        System.out.println("Οι εσωτερικές πόρτες κλείσανε.");
    }

    public static void closewindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.closedwsec();
        }
        System.out.println("Τα παράθυρα κλείσανε.");
    }

    public static void lockexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.lockdwsec();
        }
        System.out.println("Οι εξωτερικές πόρτες κλειδώσανε.");
    }

    public static void lockindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.lockdwsec();
        }
        System.out.println("Οι εσωτερικές πόρτες κλειδώσανε.");
    }

    public static void lockwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.lockdwsec();
        }
        System.out.println("Τα παράθυρα κλειδώσανε.");
    }

    public static void openexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.opendwsec();
        }
        System.out.println("Οι εξωτερικές πόρτες ανοίξανε.");
    }

    public static void openindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.opendwsec();
        }
        System.out.println("Οι εσωτερικές πόρτες ανοίξανε.");
    }

    public static void openwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.opendwsec();
        }
        System.out.println("Τα παράθυρα ανοίξανε.");
    }

    public static void unlockexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.unlockdwsec();
        }
        System.out.println("Οι εξωτερικές πόρτες ξεκλειδώσανε.");
    }

    public static void unlockindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.unlockdwsec();
        }
        System.out.println("Οι εσωτερικές πόρτες ξεκλειδώσανε.");
    }

    public static void unlockwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.unlockdwsec();
        }
        System.out.println("Τα παράθυρα ξεκλειδώσανε.");
    }

}