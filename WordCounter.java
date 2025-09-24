
import java.util.*;;
public class WordCounter {
    

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence : ");

    String sentence = sc.nextLine();

    String[] words = sentence.trim().split("\\s+");

    System.out.println("number of words : " + words.length);

    sc.close();
}



}
