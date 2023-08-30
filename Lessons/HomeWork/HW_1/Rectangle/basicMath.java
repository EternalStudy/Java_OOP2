package HomeWork.HW_1.Rectangle;

public class basicMath implements MathOperationpublic{

    @Override
    public int add(int width, int height) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int calculateArea(int width, int height) {
        return width * height;
    }
    @Override
    public int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
}
