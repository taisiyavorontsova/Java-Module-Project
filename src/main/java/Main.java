
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите марку машины №" + (i + 1));
            String model = scan.next();
            while (true) {
                try {
                    System.out.println("Введите скорость машины №" + (i + 1));
                    Integer speed = scan.nextInt();

                    if (speed > 0 && speed < 250) {
                        cars.add(new Car(model, speed));
                        break;
                    } else {
                        System.out.println("Неверно введена скорость. Попробуйте снова.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Введено не целое число для скорости. Попробуйте снова.");
                    scan.nextLine();
                }

            }
        }
        Speed speed = new Speed();
        speed.speedCalculation(cars);
    }

    static class Car {
        final String model;
        final int speed;

        Car(String model, int speed) {
            this.model = model;
            this.speed = speed;
        }
    }

    static class Speed {
        public void speedCalculation(ArrayList<Car> cars){

            if ((cars.get(0).speed * 24) > (cars.get(1).speed * 24) && (cars.get(0).speed * 24) > (cars.get(2).speed * 24)) {
                System.out.println("Самая быстрая машина:" + cars.get(0).model);
            } else if ((cars.get(1).speed * 24) > (cars.get(0).speed * 24) && (cars.get(1).speed * 24) > (cars.get(2).speed * 24)) {
                System.out.println("Самая быстрая машина:" + cars.get(1).model);
            } else if ((cars.get(2).speed * 24) > (cars.get(0).speed * 24) && (cars.get(2).speed * 24) > (cars.get(1).speed * 24)) {
                System.out.println("Самая быстрая машина:" + cars.get(2).model);
            }
        }
    }
}
