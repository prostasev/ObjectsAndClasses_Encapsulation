public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1; // Изначальное значение текущего этажа
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
            System.out.println("Лифт на этаже: " + currentFloor);
        }
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor++;
            System.out.println("Лифт на этаже: " + currentFloor);
        }
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Ошибка: этаж вне диапазона");
            return;
        }

        while (currentFloor < floor) {
            moveUp();
        }
        while (currentFloor > floor) {
            moveDown();
        }
    }
}