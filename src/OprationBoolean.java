/**
 * OprationBoolean
 */
public class OprationBoolean {

    public static void main(String[] args) {
        var absen = 80;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

    }
}