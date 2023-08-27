package lesson_2.work1;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Вызов методов makeSound()
        dog.makeSound(); // Выводит "Buddy barks."
        cat.makeSound(); // Выводит "Whiskers meows."
    }
}