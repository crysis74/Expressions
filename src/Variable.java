public class Variable implements Expression {
    private char let;
    public Variable(char let){
        this.let = let;
    }

    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin{

        switch (let){
            case 'x': return x;
            case 'y': return y;
            case 'z': return z;
            default: return 0;
        }
    }
}
