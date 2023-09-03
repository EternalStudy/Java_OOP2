package Lesson_3.task3;

public class Main {
    public static void main(String[] args) {
        MyParamValue myParamValue = (val) -> {
            for (int i = 0; i < val; i++) {
                System.out.println(i);
            }
            return val + 10;
        };
        int num = myParamValue.getValue(20);
        System.out.println(myParamValue.getValue(10));
        System.out.println(num);
    }
}
