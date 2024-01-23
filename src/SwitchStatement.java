public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            default:
                System.out.println("Anda salah Server");
                break;
        }

        // switch lamda
        // java 14
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus ");
            case "B" -> System.out.println("Cukup Baik");
            case "C", "E" -> System.out.println(" Nilai Anda Kurang");
            default -> {
                System.out.println("Salah Server bang");
            }
        }

        // yield
        // String ucapan;
        var nilai1 = "A";
        String ucapan = switch (nilai1) {
            case "A":
                yield "Selamat Anda Lulus";
            case "B", "C":
                yield "Selamat, Tetap Belajar";
            default:
                yield "anda salah server mas";
        };
        System.out.println(ucapan);
    }
}
