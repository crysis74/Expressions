public class Constant implements Expression {
    private int constan;
    public Constant(int constan){
        this.constan = constan;
    }
    public int evaluate(int x, int y, int z) {
        return constan;
    }

}
