package HomeWork.HW_5;

public class CalcController {
    private CalcModel model;
    private CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }
    public double inputValueOne(){
        return view.userInputOne();
    }
    public double inputValueTwo(){
        return view.userInputTwo();
    }
    public String inputOperator() {
        return view.userInputOp();
    }
    public void calc() {
        double result;
        try {
            switch (inputOperator()){
                case "+":
                    result = model.sumNumber(inputValueOne(), inputValueTwo());
                    break;
                case "-":
                    result = model.substractNumbers(inputValueOne(), inputValueTwo());
                    break;
                case "*":
                    result = model.multiplNumbers(inputValueOne(), inputValueTwo());
                    break;
                case "/":
                    result = model.divNumbers(inputValueOne(), inputValueTwo());
                    break;
                default:
                    view.printError("Введен неверный оператор!");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException er) {
            view.printError(er.getMessage());
        }
    }
}