public class Methods {
    
    public static void exampleMethod() {
        System.out.println("bla bla bla");
    }

    public static void exampleMethod2(String text, int number) {
        for (int i = 0; i <= 5; i++) { 
            System.out.println(text + " " + number);
        }
    }
    
    public static void main(String[] args) {
        exampleMethod();
        exampleMethod2("test", 123);
    }
}
