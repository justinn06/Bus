public class Bus {
    private int id;
    private Driver driver;
    private BusRoute route;

    public Bus (int i, Driver d, BusRoute r) {
        this.id = i;
        this.driver = d;
        this.route = r;
    }

    public void setId(int i) {
        this.id = i;
    }
    public void setDriver(Driver i) {
        this.driver = i;
    }
    public void setRoute(BusRoute i) {
        this.route = i;
    }
    public int getId() {
        return this.id;
    }
    public Driver getDriver() {
        return this.driver;
    }
    public BusRoute getRoute() {
        return this.route;
    }

    public String printBusInfo() {
        return getDriver().getFirstName() + " " + getRoute().getStart();
    }

    public String toString() {
        return "Bus [ID: " + getId() + ", " + getDriver().toString() + ", " + getRoute().toString() + "]";
    }



}
