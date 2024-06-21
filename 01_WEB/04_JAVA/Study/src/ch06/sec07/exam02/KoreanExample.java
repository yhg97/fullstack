package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Koean K1 = new Koean("박자바", "01022-3321");

        //Koean 객체 생성

        System.out.println("k1.nation : " + K1.nation);
        System.out.println("k1.name : " + K1.name);
        System.out.println("k1.ssn : " + K1.ssn);
        System.out.println();


        //Korean 또 다른 객체 생성
        Koean K2 = new Koean("김자바", "22222-3321");

        //Koean 객체 생성

        System.out.println("k2.nation : " + K2.nation);
        System.out.println("k2.name : " + K2.name);
        System.out.println("k2.ssn : " + K2.ssn);
        System.out.println();
    }
}
