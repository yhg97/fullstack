package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) throws Exception {
        try{
            findClass();

        }catch (ClassNotFoundException e){
            System.out.println("예외 처리: " + e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String2");
    }
}
