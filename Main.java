import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Dimensions
        Dimensions dimensions = new Dimensions(10.0, 5.0, 20.0);

        // Создаем экземпляр класса Cargo
        Cargo cargo = new Cargo(dimensions, 15.0, "123 Main St", true, "ABC123", false);

        // Выводим информацию о грузе
        System.out.println("Исходный груз:");
        System.out.println("Адрес доставки: " + cargo.getDeliveryAddress());
        System.out.println("Габариты (объем): " + cargo.getDimensions().calculateVolume());

        // Создаем копию груза с измененным адресом
        Cargo modifiedCargo = cargo.withNewAddress("456 Elm St");

        // Проверяем, что копирование произошло
        System.out.println("\nИзмененный груз:");
        System.out.println("Адрес доставки: " + modifiedCargo.getDeliveryAddress());
        System.out.println("Габариты (объем): " + modifiedCargo.getDimensions().calculateVolume());

        // Проверяем, что исходный объект не изменился
        System.out.println("\nИсходный груз после изменения:");
        System.out.println("Адрес доставки: " + cargo.getDeliveryAddress());
        System.out.println("Габариты (объем): " + modifiedCargo.getDimensions().calculateVolume());

        // Простая демонстрация лифта
        Elevator elevator = new Elevator(-3, 26);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = scanner.nextInt();
            elevator.move(floor);
        }
    }
}

