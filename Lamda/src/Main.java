public class Main {

    static int xMain = 20;

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Expression ex = new ExpressionImpl();
        ExpressionHelper expressionHelper = new ExpressionHelper();

        Expression func = n -> n % 2 == 0;

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//        sum(nums, ex);
        sum(nums, func);
        sum(nums, (n -> n % 5 == 0) );
        sum(nums, ExpressionHelper::isEven);
        sum(nums, expressionHelper::isPositive);

        Operationable<Integer> operationable;
        operationable = Integer::sum;

        int result = operationable.calculate(10, 23);

        System.out.println(result);

        Operationable<String> oper = (x, y) -> x+y;

        String resultString = oper.calculate("10", "23");

        System.out.println(result);


        operationable = (x, y) -> {
            System.out.println("Вычитание: " + x + " - " + y);
            int res = x - y;
            return res;
        };

        result = operationable.calculate(10, 23);
        System.out.println(result);

        Operationable<Object> operat = new Operationable() {

            @Override
            public Integer calculate(Object x, Object y) {
                return 0;
            }
        };

        Operationable<Integer> oper2 = (x, y) -> x / y;

        calculator();
        calculator();

    }

    static int calculator() {

        int yCal = 20;

        Operationable<Integer> operationable = (x, y) -> {
            x = xMain;
            y = yCal;
            int resultSum = x + y;
            System.out.println("xMain:" + xMain);
            System.out.println("yCal:" + yCal);
            xMain += 20;
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            return resultSum;
        };

        return operationable.calculate(0 , 0);
    }

    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}