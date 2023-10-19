package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
  static Random random = new Random();

  public static void coinFlip(int n){
    int heads = 0;
    int tails = 0;
    for (int i = 0; i < n; i++) {
      int coin = random.nextInt(2);
      if (coin == 0){
        tails++;
      }
      else {
        heads++;
      }
    }
    System.out.println("Орел: " + heads);
    System.out.println("Решка: " + tails);
  }

  public static void diceRoll(int n){
    int[] nums = new int[6];
    for (int i = 0; i < n; i++) {
      int dice = random.nextInt(6);
      nums[dice]++;
    }
    System.out.println(Arrays.toString(nums));
  }

  public static void doubleDiceRoll(int n){
    int[][] nums = new int[6][6];
    for (int i = 0; i < n; i++) {
      int dice1 = random.nextInt(6);
      int dice2 = random.nextInt(6);
      nums[dice1][dice2]++;
    }

    for (int i = 0; i < 6; i++) {
      for (int j = i; j < 6; j++) {
        if(i != j) {
          System.out.println("На кубиках випало " + (i+1) + " і " + (j+1) + " " + (nums[j][i] + nums[i][j]) + "разів");
        }
        else System.out.println("На кубиках випало " + (i+1) + " і " + (j+1) + " " + nums[j][i] + " разів");
      }
    }
  }

  public static void main(String[] args) {
    int n = 1000;
    System.out.println("Монетка:");
    coinFlip(n);
    System.out.println("Кубик:");
    diceRoll(n);
    System.out.println("Два кубики:");
    doubleDiceRoll(n);
  }

}
