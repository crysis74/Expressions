public class Divide extends Binary {

    public Divide(Expression per1, Expression per2) {

        super(per1, per2);

    }

    public int result(int first, int second) throws ArithmeticExceptoin{

        if(second == 0){
            throw new ArithmeticExceptoin("Деление на ноль");
        }
        return first / second;

    }
}