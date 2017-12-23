public class Sqr extends Operation {

    public Sqr(Expression per1) {

        super(per1);

    }
    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin {
        return (int)(Math.pow(per1.evaluate(x, y, z),2));
    }
}
