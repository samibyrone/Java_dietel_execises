package Chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int hour) {
        this.hour = hour;
        timeValidation();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        timeValidation();
    }

    public void setSecond(int second) {
        this.second = second;
        timeValidation();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    private void timeValidation() {
        if (hour > 23 || minute > 59 || second > 59) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public String timeFormatDisplay() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
