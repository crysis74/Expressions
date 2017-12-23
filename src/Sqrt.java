public class Sqrt extends Unary {

    public Sqrt(Expression per1) {

        super(per1);

    }

    public int result(int first) throws ArithmeticExceptoin {

        int result = (int)Math.sqrt(first);
        if (result < 0){
            throw new ArithmeticExceptoin("Ошибка взятия корня из отрицателнього числа");
        }
        return result;

    }
}
