// Polymorphism Example in Java
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        // Invoking overloaded methods
        s1.printInfo(s1.name, s1.age); // Outputs: Aman 24
    }
}
