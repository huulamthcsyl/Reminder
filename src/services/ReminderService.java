package services;

import models.Reminder;
import views.ReminderForm;

public class ReminderService {

    Reminder reminder;

    public void initReminder() {
        long period = ReminderForm.getReminderInput();
        reminder = new Reminder(period);
        reminder.startTimer();
    }
}
