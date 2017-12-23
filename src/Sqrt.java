public class Sqrt extends Unary {

    public Sqrt(Expression per1) {

        super(per1);

    }

    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin {

        int result = (int)Math.sqrt(per1.evaluate(x, y, z));
        if (result < 0){
            throw new ArithmeticExceptoin("Ошибка взятия корня из отрицателнього числа");
        }
        return result;

    }
}
