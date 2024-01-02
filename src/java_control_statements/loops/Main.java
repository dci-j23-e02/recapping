package java_control_statements.loops;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   /*
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    String[] fruites = {"apple", "banana", "orange"};
    for (String item : fruites) {
      System.out.println(item);
    }

    String name = "";
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a name:");
    name = input.nextLine();
    while (! name.equalsIgnoreCase("Safwan")){
      System.out.println("Please enter other name:");
      name = input.nextLine();
    }
    System.out.println("Congrats, the name you've entered is correct.");
    */
    int number = 5;
    int guess;
    int counter = 3;
    String choice = "";
    Scanner input = new Scanner(System.in);

    do{
      System.out.println("Please guess the number, you still have: "+counter+" times");
      guess = input.nextInt();
      counter--;
      if(counter <= 0 && guess != number){
        System.out.println("You have reached to the game limit, do you want guss more: (y/n)");
        choice = input.next();
        if(choice.equalsIgnoreCase("y") ){
          counter++;
          continue;
        }else{
          break;
        }

      }

    }while(guess != number);
    if(guess == number) {
      System.out.println("Congrats, the number you've entered is correct.");
    }else{
      System.out.println("Game over !!!");
    }

  }
}
