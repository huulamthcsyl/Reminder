import services.ReminderService;

public class Main {
    public static void main(String[] args) {
        ReminderService reminderService = new ReminderService();
        reminderService.initReminder();
    }
}