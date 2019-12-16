package uml1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person newPerson1 = new Person("Daniel", 29,
                new NAW("Rondje", 1, "Hoorn", "Nederland"));
        Person newPerson2 = new Person("Mascha", 41,
                new NAW("Blankenstraat", 20, "Amsterdam", "Nederland"));
        Person newPerson3 = new Person("Daniel", 29,
                new NAW("Jeffery", 29, "Knollendam", "Nederland"));
        Person newPerson4 = new Person("Mascha", 41,
                new NAW("Igor", 31, "Leiden", "Nederland"));
        Person newPerson5 = new Person("Christiaan", 27,
                new NAW("De Dam", 20, "Amsterdam", "Nederland"));

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(newPerson1);
        personList.add(newPerson2);
        personList.add(newPerson3);
        personList.add(newPerson4);
        personList.add(newPerson5);

        for (Person item:personList) {
//            System.out.println(item.getName() + " " + item.getAge() + " " + item.getNewNAW().getAddress() + " "
//                    + item.getNewNAW().getHouseNumber() + " " + item.getNewNAW().getCity() + " " + item.getNewNAW().getCountry());
            System.out.println(item);
        }
    }
}
