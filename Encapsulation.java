// Java Encapsulation
class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(java.lang.String string) {
        this.name = string;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Ajay");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
