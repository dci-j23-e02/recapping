package variables;

public class Main {

    public static void main(String[] args) {
        // Declare a variable initialise it with a value
        String greeting = "Hello , " ;
        System.out.println(greeting); // non initialised String is null



        // Reference vs Primitive data types

        // Reference data type example:
        Book book1 = new Book("Java", 10.85);

        Book book2 =  book1;

        // Primitive data types  example:
        int x = 5;
        int y = 10;
        char c1 = 'a';

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(y%x); // the Remainder after dividing y by x


        // naming the variable ( rules ) :
        // meaningful name , alphanumeric ,  _ , $
        // not allowed to start with digits, use keywords



    }



    }
