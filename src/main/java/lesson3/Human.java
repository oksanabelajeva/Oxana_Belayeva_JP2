package lesson3;

public class Human {

    private String name;
    private int age;

    public static void main(String[] args) {
        Human human = new Human();
        human.sayHi("John", 20);
    }

    public void sayHi(String name, int age) {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old.");
    }
}
