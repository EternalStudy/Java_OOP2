/*Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
Класс должен обладать следующими методами:
__
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)). */
package HomeWork.HW_1.Rectangle;

import lesson_2.work2.Constants;

public class Rectangle_HW_2 extends Constanse{

    public Rectangle_HW_2(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle_HW_2() {
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /*public Integer calculateArea() {
        Integer result;
        result = width * height;
        return result;
    }*/

    /*public Integer calculatePerimeter() {
        Integer result;
        result = 2 * (width + height);
        return result;
    }*/

    public void printRectangle() {
        System.out.println(
                "Высота прямоугольника: " + height + "\n" +
                        "Ширина прямоугольника: " + width + "\n");
    }
}
