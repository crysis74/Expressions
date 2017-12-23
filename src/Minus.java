public class Minus  extends Binary {


    public Minus(Expression per1, Expression per2) {

        super(per1, per2);

    }

    public int result(int first, int second) throws ArithmeticExceptoin {
        return first - second;
    }
}
