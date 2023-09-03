package Lesson_3.task2;

public class Main {
    public static void main(String[] args) {
        MyParamValue myParamValue = (n) -> 10.0 / n;
        System.out.println(myParamValue.getValue(5.0));

        MyDoubleParamValue myDoubleParamValue = (val1, val2, val3) -> 10.0 * val1 * val2 * val3;
        MyDoubleParamValue myDoubleParamValue1 = (a, b, c) -> a + b + c;
        System.out.println("Значение myDoubleParamValue " + myDoubleParamValue.getValue(2, 2, 2));
        System.out.println("Значение myDoubleParamValue1 " + myDoubleParamValue1.getValue(5, 5, 5));
    }
}
