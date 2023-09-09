package Modified;

public class TimeMain {
    public static void main(String[] args) {
        TimeModded waktu = new TimeModded(0, 0, 0);
        System.out.println(waktu);

        for (int i=1 ; i<60 ; i++) {
            System.out.println(waktu.nextSecond());

        }

    }
}
