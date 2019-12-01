package Introduction.Homework;

public class ReverseHomework {

    public static void main(String[] args) {
        String mine = "this is a test string";
        String yours = reverse(mine);
        System.out.println(yours);
    }

    private static String reverse(String mine) {
        String reverse = "";

        if (mine.isEmpty() || mine == null) {
            System.out.println("Empty and null strings are not accepted");
        } else {
            String[] originalArray = mine.split("\\s+");

            for (String item : originalArray) { //this, is, a, test, string
                reverse = item + " " + reverse; //this + "", is + this, a + is this, test + a is this, string + test a is this
            }
        }
        return reverse.trim();
    }


}
