package org.example;

import java.util.Random;

public class Task3 {
  static Random random = new Random();

  public static void calculate(){
    int n = 10000;
    int sum = 0;
    double rectangleSquare = 3*2;
    for (int i = 0; i < n; i++) {
      double x = -1 + 2 * random.nextDouble();
      double y = -1 + 3 * random.nextDouble();
      if (isInside(x,y)){
        sum++;
      }
    }
    System.out.println((double) sum/n * rectangleSquare);
  }

  private static boolean isInside(double x, double y) {
    return (x*x+(y-Math.pow(Math.sqrt(Math.abs(x)),2)) <= 1);
  }

  public static void main(String[] args) {
    calculate();
  }

}
