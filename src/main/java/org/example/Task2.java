package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

  static List<String> words = new ArrayList<String>();

  public static void guessTheNum(){
    Scanner scanner = new Scanner(System.in);
    int tries = 0;
    Random random = new Random();
    System.out.println("Вам треба відгадати число від 1 до 100");
    int randomNum = random.nextInt(100)+1;
    do{
      System.out.println("Відгадуйте число: ");
      String playerGuess = scanner.nextLine().trim();
      try{
        if (randomNum == Integer.parseInt(playerGuess)){
          tries++;
          break;
        } else if (randomNum > Integer.parseInt(playerGuess)){
          System.out.println("Загадане число більше");
          tries++;
        } else {
          System.out.println("Загадане число менше");
          tries++;
        }
      }catch (Exception e){
        System.out.println("введено неправильні дані");
      }
    }while (true);
    System.out.println("Правильно! Ви вгадали число за " + tries + " спроб!");
  }


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
      System.out.print("Введіть відгадку: ");
      String playerGuess = scanner.nextLine().trim();
      if (chosenWord.toLowerCase().equals(playerGuess.toLowerCase())){
        System.out.println("Ви виграли!");
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
    guessTheNum();
  }
}