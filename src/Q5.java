import java.util.Scanner;

public class Q5 {
    public static void main(String [] args){
        System.out.println("Please input a score(0-100) so that this program can calculate the grade for this student.");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score>=90){
            System.out.println("You receive a grade of A for "+score+" points.\n    (0-59 is C)\n   (60-89 is B)\n  (90-100 is A)");
        }else if (score<90 && score>=60){
            System.out.println("You receive a grade of B for "+score+" points.\n    (0-59 is C)\n   (60-89 is B)\n  (90-100 is A)");

        }else if (score<60){
            System.out.println("You receive a grade of C for "+score+" points.\n    (0-59 is C)\n   (60-89 is B)\n  (90-100 is A)");
        }
    }
}
