import javax.management.RuntimeErrorException;

public class Helloworld {

    static int testValue;
    public void testMethodOne(){
        System.out.println("You just triggered the method testMethodOne.");
    }

    public void testMethodTwo(){
        System.out.println("You just triggered method testMethodTwo.");
    }

    public void testMethodThree(){
        System.out.println("You just triggered method testMethodThree.");
    }

    public void testMethodDefault(){
        System.out.println("You just triggered the default method.");
    }

    public Helloworld(int parameter){
        testValue = parameter;
    }

    public static void main(String[] args){
        System.out.println("Helloworld!!");
        Helloworld object = new Helloworld(2);
        switch (testValue) {
            default:
                object.testMethodDefault();
                break;
            case 1:
                object.testMethodOne();
                break;
            case 2:
                object.testMethodTwo();
                break;
            case 3:
                object.testMethodThree();
                break;
        }
    }
}
