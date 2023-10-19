package org.example;

import java.util.Random;

public class Task3 {
  static Random random = new Random();

  public static void calculate1(){
    int n = 10000;
    int sum = 0;
    double rectangleSquare = 3*2;
    for (int i = 0; i < n; i++) {
      double x = -1 + 2 * random.nextDouble();
      double y = -1 + 3 * random.nextDouble();
      if (isInside1(x,y)){
        sum++;
      }
    }
    System.out.println("Площа: " + (double) sum/n * rectangleSquare);
  }

  private static boolean isInside1(double x, double y) {
    return (x*x+(y-Math.pow(Math.sqrt(Math.abs(x)),2)) <= 1);
  }

  public static void main(String[] args) {
    calculate1();
    calculate2();
  }

  private static void calculate2() {
    int n = 10000;
    int sum = 0;
    double rectangleSquare = 4*4;
    for (int i = 0; i < n; i++) {
      double x = 0 + 4 * random.nextDouble();
      double y = -2 + 4 * random.nextDouble();
      if (isInside2(x,y)){
        sum++;
      }
    }
    System.out.println("Площа: " + (double) sum/n * rectangleSquare);
  }

  private static boolean isInside2(double x, double y) {
    return (-x<= y && y <=x) && (2*x<= x*x+y*y && x*x+y*y<=4*x);
  }
}

