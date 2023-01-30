public class Driver {
    private String firstName;
    private String lastName;
    private int number;
    int driverNum = 0;

    public Driver(String f, String l, int n) {
        this.firstName = f;
        this.lastName = l;
        this.number = n;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return "Driver [First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Employee Number: " + getNumber() + "]";
    }
}
