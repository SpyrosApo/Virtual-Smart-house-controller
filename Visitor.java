import java.io.*;
import java.util.*;

public class Visitor
{
    String vis_name;
    String vis_surname;
    String vis_password;
    String entry_hours;
    public static boolean sure;
    String pass_help;

    public Visitor()
    {
        
        System.out.println("Εισάγετε το όνομα του επισκέπτη.");
        this.vis_name = Home.readString();

        System.out.println("Εισάγετε το επώνυμο του επισκέπτη.");
        this.vis_surname = Home.readString();

        System.out.println("Εισάγετε τον κωδικό του επισκέπτη.");
        pass_help = Home.readString();

        passwordcheck1();
        passwordcheck2();
 
        this.vis_password = pass_help;
        
        System.out.println("O επισκέπτης προστέθηκε στη λίστα!");
        Home.visitors.add(this);
    }

    public void passwordcheck1(){
        while (pass_help.length() <= 3){
            System.out.println("Ανίσχυρος κωδικός. Εισάγετε άλλο κωδικό.");
            pass_help = Home.readString();
        }
    }

    public void passwordcheck2(){
        int s = Home.visitors.size();
        for (int i = 0; i < s; i++){
            while (pass_help.equals(Home.visitors.get(i).vis_password)){
                System.out.println("Ο κωδικός υπάρχει ήδη. Εισάγετε άλλο κωδικό.");
                pass_help = Home.readString();
                i = 0;
            }
        }

    }

    public static void delete_vis(int vis){
        System.out.println("Θες σίγουρα να διαγράψεις τον επισκέπτη;(true για επιβεβαίωση ή οτιδήποτε για ακύρωση)");
        sure = Home.readBoolean();

        if (sure == true){
            Home.visitors.remove(vis-1);
            System.out.println("O επισκέπτης διαγράφηκε από τη λίστα!");
        }else System.out.println("Διαγραφή ακυρώθηκε!");
    }

    public void change_vis(int vis, int info){
        Home.visitors.get(vis-1);
        if (info == 1){
            do{
                System.out.println("Άλλαξε το όνομα του επισκέπτη.");
                this.vis_name = Home.readString();
                System.out.println("Θες σίγουρα να αποθηκευτεί η αλλαγή;(true για επιβεβαίωση ή οτιδήποτε για ακύρωση)");
                sure = Home.readBoolean();

            } while (sure == false);
        }else if (info == 2){
            do{
                System.out.println("Άλλαξε το επώνυμο του επισκέπτη.");
                this.vis_surname = Home.readString();
                System.out.println("Θες σίγουρα να αποθηκευτεί η αλλαγή;(true για επιβεβαίωση ή οτιδήποτε για ακύρωση)");
                sure = Home.readBoolean();

            } while (sure == false);
        }else if (info == 3){
            do{
                System.out.println("Άλλαξε τον κωδικό του επισκέπτη.");
                pass_help = Home.readString();
                passwordcheck1();
                passwordcheck2();
                System.out.println("Θες σίγουρα να αποθηκευτεί η αλλαγή;(true για επιβεβαίωση ή οτιδήποτε για ακύρωση)");
                sure = Home.readBoolean();

            } while (sure == false);
        }
        System.out.println("Η αλλαγή αποθηκεύτηκε!");
    }

    public String getvis_name()
    {
        return  vis_name;
    }

    public String getvis_surname()
    {
        return  vis_surname;
    }

    public String getvis_password()
    {
        return  vis_password;
    }
}
