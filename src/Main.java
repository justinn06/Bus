import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        BusRoute route1 = new BusRoute(30, "Piazza Vittorio", "Piazza San Carlo");
        //System.out.println(route1.toString());

        Driver driver1 = new Driver("Justin", "Le Coeur", 1200);
        Driver driver2 = new Driver("James", "Watson", 1550);
        Driver driver3 = new Driver("Alex", "Gray", 2300);

        Bus bus1 = new Bus(102, driver1, route1);
        //System.out.println(bus1.toString());

        Bus bus2 = new Bus(1001, driver2, new BusRoute(431, "East End", "West End"));
        System.out.println(bus2.toString());

        Bus[] buses = new Bus[3];
        buses[0] = new Bus(1010, driver1, new BusRoute(521, "Piazza Dante", "Strada Pecetto"));
        buses[1] = new Bus(1014, driver2, new BusRoute(340, "Via Vincenzo", "Via Bellini"));
        buses[2] = new Bus(1015, driver3, new BusRoute(411, "Strada Alba", "Piazza Bianca"));

        //showBusDrivers(buses, 500);

        //printBusInfo(bus1);

    }
    static void showBusDrivers(Bus[] b, int n) {
        String names = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i].getRoute().getRoute() <= n)
                names = names + b[i].getDriver() + "\n";
        }
        System.out.println(names);
    }

    static void printBusInfo(Bus[] b) {
        //System.out.println(b.getDriver()); Why don't the getDriver and getRoute work here?
        //System.out.println(b.getRoute());
    }

}
