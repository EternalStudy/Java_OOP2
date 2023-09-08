/*Создайте класс "Кот" (Cat) со следующими свойствами:
__
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида]
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. 
Мне <возраст> года(лет). Мой владелец - <имя владельца>.". */

package HomeWork.HW_1.Cat;
class Cat_HW1 {
private String name;
private Integer age;
private String owner;

public Cat_HW1(String name, Integer age, String owner) {
    this.name = name;
    this.age = age;
    this.owner = owner;
}

public Integer getAge() {
    return age;
}

public void isPositive(boolean result) {
    if (result) {
        System.out.println("Age is positive.");
    } else {
        System.out.println("Age is not positive.");
    }
}

public void greet() {
    System.out.println("Hello, I'm " + name + "!");
}

public void makeSound() {
    System.out.println("Meow!");
}

@Override
public String toString() {
    return "Cat{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", owner='" + owner + '\'' +
            '}';
}
}