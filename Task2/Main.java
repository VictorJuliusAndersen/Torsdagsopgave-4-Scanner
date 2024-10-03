//Task 2

import java.util.Scanner;

public class Main{

private String name;

private int age;

private int yearsToRetire;

public static void main(String[] args){


System.out.println("Please type your name");

Scanner scanner = new Scanner(System.in);

String name =  scanner.nextLine();

System.out.println("Hello "+ name + " Please type your age ");


int age = Integer.parseInt(scanner.nextLine());

System.out.println("You are " + age + " years old");


int yearsToRetire = 67 - age;

System.out.println("You have " + yearsToRetire + " years until retirement");

}

}