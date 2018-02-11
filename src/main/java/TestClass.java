
enum Abc {

    SUN(1), MON(2), TUE(3);

    int dayNumber;

    Abc(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }


}


public class TestClass {

    public void test(){
        //System.out.println(Abc.MON.getDayNumber());


        for(Abc a : Abc.values()){
            System.out.println(a.getDayNumber());
        }



    }

    public static void main(String [] args){
        TestClass obj = new TestClass();
        obj.test();

    }

}
