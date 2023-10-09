package es2;

import java.util.Scanner;

public class Es2 {
  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    try {
      System.out.println("Enter km routes:");
      int kms = Integer.parseInt(scann.nextLine());

      System.out.println("enter the liters consumed:");
      int litres = Integer.parseInt(scann.nextLine());

      System.out.println(kms / litres);
    } catch (ArithmeticException ex) {
      System.out.println("0 is not a permitted value for the quantity of litres");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

  }
}

