public class methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 20);

        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 33);

        person1.speak();
        person2.speak();
    }
}


class Person {
    String name;
    int age;

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    int calcLateYearsToRetiremment() {
        int years = 65 - age;
        return years;

    }//метод

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");

        }//метод
    }

    void sayHello() {
        System.out.println("Привет " + name);
    }

}
