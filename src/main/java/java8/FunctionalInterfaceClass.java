package java8;

/**
 *  Functional interface are those which contains only one abstract method
 *  It can can multiple defined methods as well
 */

@FunctionalInterface
interface runme{
    void printme();
    default void testme(){}
    static void testmetoo(){}

}

public class FunctionalInterfaceClass implements runme {

    @Override
    public void printme() {
        //code
    }

    public static void main(String [] args){

    }
}
