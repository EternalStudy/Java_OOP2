package HomeWork.HW_1.Rectangle;

interface MathOperationpublic  {
    int add(int width, int height);
    default int calculateArea(int width, int height){
       return width * height;
    }
    default int calculatePerimeter(int width, int height){
        return 2 * (width + height);
    }
}


