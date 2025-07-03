interface HillStation {
    void location();
    void famousFor();
}

class Manali implements HillStation {
    public void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    public void famousFor() {
        System.out.println(" -> It is famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie implements HillStation {
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    public void famousFor() {
        System.out.println(" -> It is famous for educational institutions");
    }
}

class Gulmarg implements HillStation {
    public void location() {
        System.out.println("Gulmarg is in J&K");
    }

    public void famousFor() {
        System.out.println(" -> It is famous for skiing");
    }
}

public class HillStations {
    public static void main(String[] args) {
        HillStation hill1 = new Manali();
        HillStation hill2 = new Mussoorie();
        HillStation hill3 = new Gulmarg();

        System.out.println("--- Using Interface Reference (Polymorphism) ---\n");
        hill1.location();
        hill1.famousFor();
        System.out.println();

        hill2.location();
        hill2.famousFor();
        System.out.println();

        hill3.location();
        hill3.famousFor();
        System.out.println();

        HillStation[] stations = { new Manali(), new Mussoorie(), new Gulmarg() };

        System.out.println("--- Using Array of HillStation ---\n");
        for (HillStation station : stations) {
            station.location();
            station.famousFor();
            System.out.println();
        }

        System.out.println("--- Using Subclass References ---\n");

        Manali manali = new Manali();
        manali.location();
        manali.famousFor();
        System.out.println();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();
        System.out.println();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}


// Output:
/*
Manali is in Himachal Pradesh
 -> It is famous for Hadimba Temple and adventure sports

Mussoorie is in Uttarakhand
 -> It is famous for educational institutions

Gulmarg is in J&K
 -> It is famous for skiing
*/