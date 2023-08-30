package HomeWork.HW_1.Rectangle;

public class main {
  public static void main(String[] args) {
    Rectangle_HW_2 rectangle = new Rectangle_HW_2();
    basicMath basicMath = new basicMath();

        rectangle.setWidth(20);
        rectangle.setHeight(10);
        rectangle.printRectangle();
        int area = basicMath.calculateArea(Constanse.width, Constanse.height);
        int perimeter = basicMath.calculatePerimeter(Constanse.width, Constanse.height);
        System.out.println(
                "Периметр = " + perimeter + "\n" +
                        "Площадь = " + area + "\n");
    }
}
