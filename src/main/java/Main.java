
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println("Введите марку машины");
                String model = scan.next();
                System.out.println("Введите скорость машины");
                Integer speed = scan.nextInt();
                if (speed >= 240 || speed <= 0) {
                    System.out.println("Неверное введение скорости. Пожалуйста, введите заново.");
                } else {
                    cars.add(new Car(model, speed));
                    break;
                }
            }
        }
        Speed speed = new Speed();
        speed.speedCalculation(cars);
    }
}

class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
}

class Speed {
    public void speedCalculation(ArrayList<Car> cars){
        if((cars.get(0).speed * 24) > (cars.get(1).speed * 24) && (cars.get(0).speed * 24) >(cars.get(2).speed * 24)) {
            System.out.println("Самая быстрая машина:" + cars.get(0).model);
        }
        else if((cars.get(1).speed * 24) > (cars.get(0).speed * 24) && (cars.get(1).speed * 24) >(cars.get(2).speed * 24)) {
            System.out.println("Самая быстрая машина:" + cars.get(1).model);
        }
        else if((cars.get(2).speed * 24) > (cars.get(0).speed * 24) && (cars.get(2).speed * 24) >(cars.get(1).speed * 24)) {
            System.out.println("Самая быстрая машина:" + cars.get(2).model);
        }
    }
}
