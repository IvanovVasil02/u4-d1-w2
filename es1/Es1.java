package es1;

import java.util.Scanner;

public class Es1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numberArray = new int[5];

    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = (int) Math.floor(Math.random() * 11);
      System.out.println(numberArray[i]);
    }


    while (true) {
      System.out.println("Enter a position from 1 to 5 to change the content");
      try {
        int position = Integer.parseInt(scanner.nextLine());
        if (position == 0) break;

        System.out.println("Enter the number that you want insert");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) break;

        changeElem(numberArray, position, number);
      } catch (NumberFormatException ex) {
        System.out.println("You have to enter a number...");
      }
    }
  }

  public static void changeElem(int[] container, int position, int number) {
    container[position - 1] = number;
    for (int j : container) {
      System.out.println(j);
    }
  }
}
