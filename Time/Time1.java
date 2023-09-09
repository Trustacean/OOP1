package Time;

class Time1 {
    private int hour, minute, second;
    final int HOUR = 0, MINUTE = 0, SECOND = 0;

    public Time1() {
        this.hour = HOUR;
        this.minute = MINUTE;
        this.second = SECOND;

    }

    public Time1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
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

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
