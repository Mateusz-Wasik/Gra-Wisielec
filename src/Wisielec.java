import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    List<String> words = List.of("komputer","monitor","klawiatura","mysz");
    String word;
    char[]userWord;

    int lives=8;


    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wisielec - gra polega na zgadywaniu kkolejnych liter w słowie. Kategoria-sprzęt komputerowy. ZACZYNAMY!");

        Random random = new Random();
        word = words.get(random.nextInt(words.size()));

        userWord = new char[word.length()];

        Arrays.fill(userWord, '_');
        System.out.println();








        while (!gameEnded() && !outOfLives()) {
            System.out.println(userWord);
            System.out.println("podaj kolejną literę");
            char letter = scanner.nextLine().charAt(0);
            checkLetter(letter);

        }

        if(gameEnded()){
            System.out.println("BRAWO, odgadles cale haslo. Poprawne haslo to:"+word);
        }
        else {
            System.out.println("Niestety nie masz wiecej prób. Poprawna odpowiedz to: "+word);
        }




        scanner.close();
    }







    private void checkLetter(char letter){
        boolean foundLetter = false;

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == letter){
                userWord[i]=letter;
                foundLetter=true;
            }


            }

        if(!foundLetter){
            System.out.println("Niestety nie ma tekiej litery w hasle. Pozostało ci jeszcze "+(lives-1)+" prób.");
            lives--;

        }
        }


    private boolean gameEnded()
    {
        return word.equals(String.valueOf(userWord));

    }

    private boolean outOfLives(){
        return lives == 0;
    }

    }







