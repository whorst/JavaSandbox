package Lambdas;

public class AnonymousInterfaces {

    //Multiple things can be accomplished with this
    //http://tutorials.jenkov.com/java/lambda-expressions.html

    interface LambdaInterface{
        int operation(int a, int b);
    }

    /*Anonymous Interfaces like these can have their own internal state, while Lambdas can not*/
    interface LambdaIsGreaterThan{
        Boolean operation(int a, int b);
    }
    public interface Finder {
        int find(String s1, String s2);
    }

    public void  lambdaInterfaceOperations(){
        LambdaInterface add = (int x, int y) -> x+y;
        LambdaInterface subtract = (int x, int y) -> x-y;
        LambdaInterface multiply = (int x, int y) -> x*y;

        //The below is to run the anonymous interface
        System.out.println(add.operation(1,2));
    }

    public void lambdaFunctionReturns() {
        LambdaIsGreaterThan bool = (int a, int b) -> {
            return a > b;
        };
    }
}
