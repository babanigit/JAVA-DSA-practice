// package practice.generics;

public class GenericExample {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.setValue(10);

        System.out.println("the value is :- " + intContainer.getValue());

    }

}