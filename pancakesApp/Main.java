package main.java.pancakesApp;

public class Main {

    public static void main(String[] args) {
        Pancake pancake = new Pancake();

        Mother mother = new Mother(pancake);
        Child child1 = new Child(pancake);
        Child child2 = new Child(pancake);

        mother.setName("Mother");
        child1.setName("Mike");
        child2.setName("John");

        mother.start();
        child1.start();
        child2.start();
    }
}
