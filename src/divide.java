public class Divide extends Operation {
    private Expression per2;

    public Divide(Expression per1, Expression per2) {
        super(per1);
        this.per2 = per2;
    }

    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin{
        int denominator = per2.evaluate(x, y, z);
        if(denominator == 0){
            throw new ArithmeticExceptoin("Деление на ноль");
        }
        return per1.evaluate(x, y, z) / denominator;

    }
}