package Introduction.oopconcepts;

public class ConditionalStatements {
    public static void main(String[] args){

        int score = 130;
        String grade;

        if (score > 90){
            grade = "A";
        }
        else if (score > 80){
            grade = "B";
        }
        else if (score > 70){
            grade = "C";
        }
        else{
            grade = "D";
        }
        System.out.println("Score is: " + score);
        System.out.println("GRade is: " + grade);
    }
}
