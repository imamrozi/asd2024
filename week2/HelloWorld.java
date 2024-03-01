package week2;

public class HelloWorld {

    String message;

    public HelloWorld(){
        System.out.println("Object HelloWorld created!!!");
    }
    public HelloWorld(String msg){
        message = msg;
    }

    void sayHello(){
        System.out.println("Hello, "+message);
        System.out.println();
    }

    public static void main(String[] args) {
        HelloWorld hello1 = new HelloWorld();
        hello1.message = "good morning";
        hello1.sayHello();

        HelloWorld hello2 = new HelloWorld();
        hello2.message = "good night";
        hello2.sayHello();

        HelloWorld hello3 = new HelloWorld("good afternoon");
        hello3.sayHello();
    }
}
