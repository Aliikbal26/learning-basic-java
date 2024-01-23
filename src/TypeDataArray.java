public class TypeDataArray {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Ali";
        stringArray[1] = "Ikbal";

        System.out.println(stringArray[1]);

        String[] name = {
                "Ali", "Ikbal", "Handsome"
        };

        System.out.println(name.length);

        String[][] members = {
                { "Ali", "Ikbal" },
                { "Budi", "Eko" },
                { "Dedi", "Kurnia" }
        };

        String[] member1 = members[0];

        System.out.println(member1[0]);
        System.out.println(members[2][1]);
    }
}
