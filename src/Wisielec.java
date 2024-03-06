import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    List<String> words = List.of("komputer","monitor","klawiatura","mysz");
    String word;
    char[]userWord;
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("start gry");

        Random random = new Random();
        word = words.get(random.nextInt(words.size()));

        userWord = new char[word.length()];

        Arrays.fill(userWord, '_');
        System.out.println();






        while (!gameEnded()) {
            System.out.println(userWord);
            System.out.println("podaj kolejną literę");
            char letter = scanner.nextLine().charAt(0);
            checkLetter(letter);

        }


        scanner.close();
    }



    private void checkLetter(char letter){
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == letter){
                userWord[i]=letter;
            }
        }

    }




    private boolean gameEnded() {
        return false;
    }

}
