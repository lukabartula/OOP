package org.example.week7.lecture.OperationInterface;


@FunctionalInterface
public interface OperationInterface {
    int operation (int x, int y);
}

@FunctionalInterface
interface MessageInterface{
    String saySomething(String something);
}

class Main {

    public static int operate (int x, int y, OperationInterface instance){
        return instance.operation(x,y);
    }

    public static void main(String[] args) {
        OperationInterface add = (int first, int second) -> first+second;
        OperationInterface multiply = (int x, int y) -> x*y;
        OperationInterface divide = (int x, int y) -> x/y;

        MessageInterface message = (mySomething) -> "Hello";

        MessageInterface otherMessage = argument -> {
            System.out.println("reko sam joj cao, cao cao zdravo");
            return "Hello";
        };

        System.out.println(operate(2,45, add));
        System.out.println(operate(200,45, divide));
        System.out.println(operate(2,34, multiply));

    }
}
