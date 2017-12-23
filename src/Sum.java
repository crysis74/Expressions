public class Sum extends Binary {

    public Sum(Expression per1, Expression per2){

        super(per1, per2);

    }
    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin {
        return per1.evaluate(x, y, z) + per2.evaluate(x, y, z);
    }



}
