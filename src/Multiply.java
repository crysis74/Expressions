public class Multiply extends Operation {
        private Expression per2;

        public Multiply(Expression per1, Expression per2) {
            super(per1);
            this.per2 = per2;
        }

        public int evaluate(int x, int y, int z) throws ArithmeticExceptoin {
            return per1.evaluate(x, y, z) * per2.evaluate(x, y, z);
        }
    }

