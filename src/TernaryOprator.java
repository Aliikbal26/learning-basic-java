public class TernaryOprator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;
        if (nilai >= 90) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Maaf, Anda Tidak Lulus";
        }
        ;

        // ternary opratoor
        String ucapan1 = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";
        System.out.println(ucapan1);

    };
}
