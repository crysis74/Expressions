    public class UnaryMinus  implements Expression {
    private Expression per;

    public UnaryMinus(Expression per) {
        this.per = per;
    }
    public int evaluate(int x, int y, int z) {
        return per.evaluate(x, y, z) - 1;
    }
}
