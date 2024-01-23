public class MethodVariableArgument {
    public static void main(String[] args) {
        // int[] values = { 40, 50, 85, 85, 90 };
        sayHello("Ali", 80, 80, 80, 80);
    }

    static void sayHello(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Lulus");
        } else {
            System.out.println("Maaf" + name + ",Tidak Lulus");
        }
    }
}
