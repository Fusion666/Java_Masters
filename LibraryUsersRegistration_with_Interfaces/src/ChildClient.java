import java.util.ArrayList;
import java.util.List;

public class ChildClient implements ISaveable{
    private String name;
    private String surname;
    private int yearBorn;
    private String access;
    private double subscription;
    private int id;

    public ChildClient(String name, String surname, int yearBorn, int id) {
        this.name = name;
        this.surname = surname;
        if (yearBorn > 1900) {
            this.yearBorn = yearBorn;
        } else {
            System.out.println("Error: incorrect year interval!");
        }
        this.id = id;
        this.access = "restricted";
        this.subscription = 5.00;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public void setSubscription(double subscription) {
        this.subscription = subscription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getAccess() {
        return access;
    }

    public double getSubscription() {
        return subscription;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ChildClient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearBorn=" + yearBorn +
                ", access='" + access + '\'' +
                ", subscription=" + subscription +
                ", id=" + id +
                '}';
    }


    @Override
    public List<String> write() {
        List<String> valuesForSaving = new ArrayList<String>();
        valuesForSaving.add(0, this.name);
        valuesForSaving.add(1, this.surname);
        valuesForSaving.add(2, "" + this.yearBorn);
        valuesForSaving.add(3, "" + this.id);

        return valuesForSaving;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.surname = savedValues.get(1);
            this.yearBorn = Integer.parseInt(savedValues.get(2));
            this.id = Integer.parseInt(savedValues.get(3));
        }
    }
}
