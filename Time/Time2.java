package Time;

class Time2 {
    private int hour, minute, second;
    final int HOUR = 0, MINUTE = 0, SECOND = 0;

    public Time2() {
        this.hour = HOUR;
        this.minute = MINUTE;
        this.second = SECOND;

    }

    public Time2(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 59|| minute < 0) {
            System.out.println("Minute is not a valid");
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second > 59||second < 0) {
            System.out.println("Second is not a valid");
            this.second = 0;
        } else {
            this.second = second;
        }
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

    public Time2 nextSecond() {
        this.second++;
        if (this.second>59) {
            System.out.println("Second is not a valid");
            this.second=0;
        }
        return this;
    }

    public Time2 nextMinute() {
        this.minute++;
        if (this.minute>59) {
            System.out.println("Minute is not a valid");
            this.minute=0;
        }
        return this;
    }

    public String toString() {
        return String.format("%02d", hour) + ":" 
        + String.format("%02d", minute) 
        + ":" + String.format("%02d", second);
    }
}
