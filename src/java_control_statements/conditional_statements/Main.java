package java_control_statements.conditional_statements;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Ternary operator ?:
   /* int a , b;
    a = 10;
    b = (a == 20) ? 10 : 20;

    //if(a == 20){
    //b = 10;
    //}else{
   // b = 20;
   // }

    System.out.println(b);


    String[] names = {"Safwan", "Ahmad", "Rene", "Chizuru"};

    for (int index = 0; index < names.length; index++) {
      if (names[index].equalsIgnoreCase("Rene")){
        break;
      }else if(names[index].equalsIgnoreCase("Safwan")){
        System.out.println("Safwan is the teacher of the class");

      }else if(names[index].equalsIgnoreCase("Ahmad")){
        System.out.println("do I see Ahmad");
        continue;
      }

      System.out.println(names[index]);
    }
 */


    int choice = 0;
    Scanner input = new Scanner(System.in);

    boolean exit = false;
    do{
      System.out.println("Please enter your choice between 1 and 3, or 0 to exit:");
      choice = input.nextInt();

      switch (choice){
        case 1:
          System.out.println("Java class");
          break;
        case 2:
          System.out.println("AWS class");
          exit = true;
          break;
        case 3:
            System.out.println("Python class");
            break;
        default: {
          if(choice !=0) System.out.println("Wrong option");

        }

      }



    }while (choice !=0 && !exit);





  }
}
