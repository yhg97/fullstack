package ch09.sec02.exam01;

public class Aeample {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();

        //B객체 생성
        A.B b = a.new B();
    }
}
