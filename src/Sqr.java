public class Sqr implements Expression {
    private Expression per;

    public Sqr(Expression per) {
        this.per = per;
    }
    public int evaluate(int x, int y, int z) {
        return (int)(Math.pow(per.evaluate(x, y, z),2));
    }
}
