package Time;

public class TimeMain {
    public static void main(String[] args) {
        Time2 waktu = new Time2(5, 0, 59);
        System.out.println(waktu);

        System.out.println(waktu.nextSecond().nextSecond()
        .nextSecond());
    }
}
