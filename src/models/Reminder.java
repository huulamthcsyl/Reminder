package models;

public class Reminder {
    private long period;
    private java.util.Timer timer;

    public Reminder() {
        this.period = 0;
    }

    public Reminder(long period) {
        this.period = period;
    }

    public void startTimer() {
        long basePeriod = period;
        timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                if (period == 0) {
                    System.out.println("Thời gian nghỉ ngơi");
                    period = basePeriod;
                } else {
                    period--;
                }
            }
        }, 0, period);
    }
}
