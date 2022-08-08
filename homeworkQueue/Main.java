package homeworkQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static final int WAIT_DOORS_IN_SECONDS = 10;
    private static final int WAIT_MOVE_IN_SECONDS = 5;

    public static void main(String[] args) {
        Queue<Integer> elevator = new ArrayDeque<>();
        inputFloors(elevator);
        int time = printFloorsAndCalculateTime(elevator);
        System.out.println("Лифт проехался за " + time + " секунд");
    }
    private static void inputFloors (Queue<Integer> elevator) {
        Scanner scanner = new Scanner(System.in);
        int tmpFloor = -1;
        int prevFloor = -1;
        while (tmpFloor != 0) {
            System.out.println("Введите след этаж (от 1 до 25) или 0 чтобы закончить");
            tmpFloor = scanner.nextInt();
            if (tmpFloor == prevFloor) continue;
            prevFloor = tmpFloor;
            if (tmpFloor < 0 || tmpFloor > 25) {
                System.out.println("Нет такого этажа!");
            } else elevator.offer(tmpFloor);
        }
    }
    private static int printFloorsAndCalculateTime(Queue<Integer> elevator) {
        int prevFloor = 0;
        int currentFloor = 0;
        int time = 0;
        if (!elevator.isEmpty()) {
            prevFloor = elevator.poll();
            System.out.printf("Этаж " + prevFloor);
        } else {
            System.out.println("Лифт никуда не ездил");
            return 0;
        }
        while (!elevator.isEmpty()) {
            currentFloor = elevator.poll();
            time += Math.abs(currentFloor - prevFloor) * WAIT_MOVE_IN_SECONDS + WAIT_DOORS_IN_SECONDS;
            System.out.printf(" -> этаж %d", currentFloor);
        }
        System.out.println("\n");
        return time;
    }
}