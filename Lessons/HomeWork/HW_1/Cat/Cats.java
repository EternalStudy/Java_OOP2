package HomeWork.HW_1.Cat;


class Cats implements Pet {
    public Object age;

    @Override
    public void makeSound() {
        System.out.println("The cat MEEEAAAOY");
    }

    @Override
    public void play() {
        System.out.println("The cat plays fetch.");
    }
}