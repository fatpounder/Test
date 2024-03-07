import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1))+" " +B.substring(0,1).toUpperCase().concat(B.substring(1)));
    }

}
