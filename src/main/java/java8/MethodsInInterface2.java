package java8;

/**
 * If two interfaces have same defined method then
 *      implementing class has to override it and give its own func
 */

interface mango{
    default void commonName(){
        System.out.println("Mango Method");
    }
}

interface orange{
    default void commonName(){
        System.out.println("Orange Method");
    }
}


public class MethodsInInterface2 implements mango, orange{


    @Override
    public void commonName() {
        System.out.println("New Mix Fruit Method");
    }

    public static void main(String [] args){
        MethodsInInterface2 obj = new MethodsInInterface2();
        obj.commonName();
    }

}
