public class Sqrt {
    private Expression per;

    public Sqrt(Expression per) {
        this.per = per;
    }
    public int evaluate(int x, int y, int z) {
        return Math.sqrt(per.evaluate(x, y, z));
    }
}
