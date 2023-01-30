public class BusRoute {
    private int route;
    private String start;
    private String end;

    public BusRoute(int r, String s, String e) {
        this.route = r;
        this.start = s;
        this.end = e;
    }

    public void setRoute(int i) {
        this.route = i;
    }
    public void setStart(String i) {
        this.start = i;
    }
    public void setEnd(String i) {
        this.end = i;
    }
    public int getRoute() {
        return this.route;
    }
    public String getStart() {
        return this.start;
    }
    public String getEnd() {
        return this.end;
    }

    public String toString() {
        return "Bus Route [Route: " + getRoute() + ", Start: " + getStart() + ", End: " + getEnd() + "]";
    }

}
