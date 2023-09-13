package HomeWork.HW_5;

public class main {
    public static void main(String[] args)
    {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController calcController = new CalcController(model, view);
        calcController.calc();
    }
}
