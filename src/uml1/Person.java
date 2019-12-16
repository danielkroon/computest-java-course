package uml1;

public class Person {
    private String name;
    private int age;
    private NAW NAW;


    public Person(String name, int age, NAW NAW) {
        this.name = name;
        this.age = age;
        this.NAW = NAW;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public NAW getNewNAW() {
        return NAW;
    }

    // override default Java toString methode
    public String toString() {
        return name + " " + age + " " + NAW.getAddress() + " " + NAW.getHouseNumber() + " " + NAW.getCity() + NAW.getCountry();
    }
}
