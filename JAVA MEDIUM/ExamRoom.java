import java.util.Scanner;
import java.util.TreeSet;
class ExamRoom {
    private int n;
    private TreeSet<Integer> seats;
    public ExamRoom(int n) {
        this.n = n;
        seats = new TreeSet<>();
    }
    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }
        int prev = -1, maxDist = -1, seat = -1;
        for (int s : seats) {
            if (prev == -1) {
                if (s != 0) {
                    int dist = s;
                    if (dist > maxDist) {
                        maxDist = dist;
                        seat = 0;
                    }
                }
            } else {
                int dist = (s - prev) / 2;
                if (dist > maxDist) {
                    maxDist = dist;
                    seat = prev + dist;
                }
            }
            prev = s;
        }

        if (n - 1 - prev > maxDist) {
            seat = n - 1;
        }
        seats.add(seat);
        return seat;
    }
    public void leave(int p) {
        seats.remove(p);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seats in the exam room:");
        int n = scanner.nextInt();
        ExamRoom examRoom = new ExamRoom(n);
        while (true) {
            System.out.println("Enter 'seat' or 'leave' followed by seat number (or 'exit' to end):");
            String command = scanner.next();
            if (command.equals("exit")) {
                break;
            } else if (command.equals("seat")) {
                int seat = examRoom.seat();
                System.out.println("Student seated at seat: " + seat);
            } else if (command.equals("leave")) {
                int seat = scanner.nextInt();
                examRoom.leave(seat);
                System.out.println("Student left seat: " + seat);
            } else {
                System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}
