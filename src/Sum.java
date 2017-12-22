public class Sum implements Expression{
    private Expression per1;
    private Expression per2;
    public Sum(Expression per1, Expression per2){
        this.per1 = per1;
        this.per2 = per2;
    }
    public int evaluate(int x, int y, int z){
        return per1.evaluate(x, y, z) + per2.evaluate(x, y, z);
    }



}
