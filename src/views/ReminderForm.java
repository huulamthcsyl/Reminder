package views;

import java.util.Scanner;

public class ReminderForm {
    public static long getReminderInput() {
        System.out.print("Nhập thời gian nghỉ ngơi: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }
}
