public class Variable implements Expression {
    private char let;
    private int var;
    public Variable(char let){
        this.let = let;
    }
    public int evaluate(int x, int y, int z){
        switch (let){
            case 'x': return x;
            case 'y': return y;
            case 'z': return z;
            default: return 0;
        }
    }
}
