public class MethodOverLoading{
    public static void main(String[] args){
      printValue(10);
      printValue(3.14);
      printValue("hello!");  
    }
    public static void printValue(int number){
        System.out.println("integer value: " + number);
    }
    public static void printValue(double number) {
        System.out.println("double value: " + number);
    }
    public static void printValue(String text){
        System.out.println("string value: " + text);
    }
}
