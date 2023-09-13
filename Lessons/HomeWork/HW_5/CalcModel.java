package HomeWork.HW_5;

public class CalcModel {
    public double sumNumber(double value1, double value2)
    {
        return value1+value2;
    }
    public double substractNumbers(double value1, double value2)
    {
        return value1 - value2;
    }
    public double multiplNumbers(double value1, double value2)
    {
        return value1 * value2;
    }
    public double divNumbers(double value1, double value2)
    {
        if(value2 == 0) throw new ArithmeticException("На ноль нельзя делить");
        else return value1/value2;
    }
}
