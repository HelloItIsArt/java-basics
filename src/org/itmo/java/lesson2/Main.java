package org.itmo.java.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","X6",Color.GREEN,true);

//        System.out.println(car);

        car.setSeatPlace(5);
        car.setPrice(10000000);
        car.setEngineCapacity(5.0);
//        System.out.println(car);
        car.setColor(Color.BLACK);
//        System.out.println(car.getColor());

        long totalPrice = CarService.totalPrice(car, 2000000);
        System.out.println(totalPrice);
    }
    public String getInfo(){
        return "info";
    }
    public String getInfo(String info){
        return info;
    }
    public String getInfo(Integer age){
        return String.valueOf(age);
    }
}
