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


class Cat_HW1 extends Owner implements SoundMaker {
    private String name;
    Integer age;

    public Cat_HW1(String name, Integer age, String ownerName) {
        super(ownerName);
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void Positive(boolean result)
    {
        System.out.println("Возраст кота проверен " + result);
    }
    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + ownerName + ".");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " MEEEAAAOY.");
    }
}