package CollegeStudentLecturer;
public class mainProgram {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen
        ("P1000", "Adi Putra");
        dosen1.setEmail("adi@wahoo.com");
        Mahasiswa mahasiswa1 = new  Mahasiswa("005314200", "Ria");
        mahasiswa1.setPembimbing(dosen1);
        mahasiswa1.setEmail("ria@gnail.com");
        
        Aktivitas [] aktivitas1 = new Aktivitas[ Mahasiswa.MAX_POIN];

        aktivitas1[0] = new Aktivitas("Webinar 1");
        aktivitas1[0].setDate(1, 1, 2022 );
        aktivitas1[1] = new Aktivitas("Webinar 2");
        aktivitas1[1].setDate(1, 1, 2022 );
        aktivitas1[2] = new Aktivitas("PINISSI 2022");
        aktivitas1[2].setDate(1, 1, 2022 );

        System.out.println(mahasiswa1.toString());
        mahasiswa1.setAktivitas(aktivitas1);
        mahasiswa1.printAktivitas();

    }
}
