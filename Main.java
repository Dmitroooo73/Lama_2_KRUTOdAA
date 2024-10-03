import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        // Установка вывода в кодировке UTF-8
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Кодировка UTF-8 не поддерживается!");
            return; // Выход из программы, если кодировка не поддерживается
        }

        // Создание массива объектов Bicycle
        Bicycle[] bicycles = {
            new MountainBike("Trek", 24, 14.5, "Полная подвеска", 100),
            new KidsBike("Schwinn", 1, 6.8, true, 80),
            new BMX("Mongoose", 1, 9.0, "ТЯЖЕЛЫЙ Алюминий", 90)
        };

        // Демонстрация вывода информации и использования методов
        for (Bicycle bike : bicycles) {
            bike.displayInfo();
            bike.ride();
        }

        // Вывод общего количества созданных объектов
        System.out.println("Всего создано приятных велосипедов: " + Bicycle.getBicycleCount());

        // Ремонт велосипедов
        bicycles[0].repair(20);
        bicycles[1].repair(10);
        bicycles[2].repair(30);
    }
}
