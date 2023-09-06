package HomeWork.HW_1.Cat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        //Cat_HW1 cat = new Cat_HW1(null, null, null);
        List<Cat_HW1> cats =  new ArrayList<>();
        cats.add(new Cat_HW1("Мышь", 5, "Стас"));
        cats.add(new Cat_HW1("Суета", 3, "Даня"));
        cats.add(new Cat_HW1("Мурза", 8, "Яна"));
        cats.add(new Cat_HW1("Барсик", 20, "Яна"));

        MyPredicate<Integer> isPositive = age -> age > 0 || age < 20;
        boolean result = isPositive.test(((Cat_HW1) cats).getAge());
        ((Cat_HW1) cats).Positive(result);
        ((Cat_HW1) cats).greet();
        ((Cat_HW1) cats).makeSound();
        System.out.println("Before sorting:");
        for (Cat_HW1 catSort : cats) {
            System.out.println(catSort);
        }
        Comparator<Cat_HW1> ageComparator = Comparator.comparingInt(catSort -> catSort.getAge());
        Collections.sort(cats, ageComparator);
        System.out.println("\nAfter sorting by age (ascending):");
        for (Cat_HW1 catSort : cats) {
            System.out.println(catSort);
        }

    }
}
