package java8;

/**
 * Interfaces can have method definition in Java 8
 * Defined method can be static and default but not public tag
 * Old abstract method can be default or public
 */

@FunctionalInterface
interface abc{

    void originalInterfaceMethod();

    default void defaultMethodWithBody(){
        System.out.println("This is for backward compatibility");
    }

    static void staticMethodWithBody(){
        System.out.println("This is new method introduced in Java");
    }

}


public class MethodsInInterface implements abc{

    @Override
    public void originalInterfaceMethod() {
        System.out.println("I am basic interface method");
    }

    public static void main(String [] args){
        MethodsInInterface obj = new MethodsInInterface();
        obj.originalInterfaceMethod();
        obj.defaultMethodWithBody();

        //calling statically
        abc.staticMethodWithBody();
    }

}
