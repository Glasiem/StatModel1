package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

  static List<String> words = new ArrayList<String>();


  public static void guessTheWord(){
    Scanner scanner = new Scanner(System.in);
    int lives = 3;

    Collections.shuffle(words);
    System.out.println("Відгадайте слово з цього списку:");
    System.out.println(words);

    Random random = new Random();
    int randomIndex = random.nextInt(words.size());
    String chosenWord = words.get(randomIndex);
    do{
      System.out.print("Enter your guess: ");
      String playerGuess = scanner.nextLine().trim();
      if (chosenWord.toLowerCase().equals(playerGuess.toLowerCase())){
        System.out.println("You won!");
        return;
      }
      else {
        lives --;
        System.out.println("Залишилося " + lives + " спроб");
      }
    }while (lives > 0);
    System.out.println("Ви програли, слово було " + chosenWord);
  }

  public static void main(String[] args) {
    words.add("Apple");
    words.add("Banana");
    words.add("Cherry");
    words.add("Dog");
    words.add("Elephant");
    words.add("Flower");
    words.add("Giraffe");
    words.add("Honey");
    words.add("Ice Cream");
    words.add("Jellyfish");
    guessTheWord();
  }
}