package ch06.sec07.exam01;


import ch06.sec07.exam01.Car;
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명: "+ myCar.model);
        System.out.println("색깔: "+ myCar.color);
        System.out.println("최고속도: "+ myCar.speed);
    }
}
