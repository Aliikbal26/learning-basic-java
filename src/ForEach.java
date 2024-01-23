public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Ali", "Ikbal", "Joni", "Juand"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println("Nama saya adalah : " + names[i]);
        }
        for (var name : names) {
            System.out.println(name);
        }
    }
}
