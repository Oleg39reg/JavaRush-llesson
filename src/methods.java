public class methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.age = 33;
        String s1 = "Вова";
        Person person2 = new Person();
        person2.setName(s1);
        person2.age = 20;
        person1.speak();
        person2.speak();
    }
}


class Person {
    String name;
    int age;

    void setName(String userName) {
        name = userName;
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
