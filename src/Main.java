import java.util.*;

public class Main {
    public static class Person {

        private String firstName;

        public Person(String firstName) {
            this.firstName = firstName;

        }

        public String getFirstName() {
            return firstName;
        }


        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            Person guest = (Person) obj;
            return (firstName == guest.firstName
                    || (firstName != null && firstName.equals(guest.getFirstName())));
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
            return result;
        }
    }

    public static final String CAT_NAME = "Barsic";
    public static final Random rndm = new Random();
    public static final String[] names = {"PITER", "RICK", "MORTY"};
    public static final Person[] persons = new Person[]{
            new Person(names[0]),
            new Person(names[1]),
            new Person(names[2])};


    public static String getRndName() {
        return names[rndm.nextInt(3)];

    }


    public static void check(Map<Integer, Person> test) {
        int r = 0, m = 0, p = 0;
        for (Map.Entry<Integer, Person> pair : test.entrySet()
                ) {
            if (pair.getValue().getFirstName().equals(names[0])) p++;
            if (pair.getValue().getFirstName().equals(names[1])) r++;
            if (pair.getValue().getFirstName().equals(names[2])) m++;
        }
        System.out.printf("P:%d\tR:%d\tM:%d\n", p, r, m);
    }

    public static void checkObj(Map<Integer, Person> test) {
        int r = 0, m = 0, p = 0;
        for (Map.Entry<Integer, Person> pair : test.entrySet()
                ) {
            if (pair.getValue().equals(persons[0])) p++;
            if (pair.getValue().equals(persons[1])) r++;
            if (pair.getValue().equals(persons[2])) m++;
        }
        System.out.printf("P:%d\tR:%d\tM:%d\n", p, r, m);
    }

    public static void main(String[] args) {

        Map<Integer, Person> personMap = new HashMap<>();
        for (int i = 0; i < 60; i++) {
            personMap.put(i, new Person(getRndName()));
        }
        personMap.forEach((k, v) -> System.out.println(k + " " + v.getFirstName()));
        check(personMap);
        checkObj(personMap);

    }


}
