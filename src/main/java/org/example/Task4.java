package org.example;

import java.util.Random;

public class Task4 {
  static Random random = new Random();

  public static boolean insideCyllinder1(double x, double z){
    return (x*x+z*z <= 2);
  }

  public static boolean insideCyllinder2(double y, double z){
    return (y*y+z*z <= 2);
  }

  public static void calculateVolume(){
    int n = 10000;
    int sum = 0;
    double cubeVolume = 4*4*4;
    for (int i = 0; i < n; i++) {
      double x = -2 + 4 * random.nextDouble();
      double y = -2 + 4 * random.nextDouble();
      double z = -2 + 4 * random.nextDouble();
      if(insideCyllinder1(x,z) && insideCyllinder2(y,z)){
        sum++;
      }
    }
    System.out.println("Об'єм: " + (double) sum/n * cubeVolume);
  }

  public static void main(String[] args) {
    calculateVolume();
  }

}
