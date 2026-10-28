// Question: How can methods read and return a user’s name and age?
package Methods;

import java.util.Scanner;

// method that get the age and name of a user
public class GetAgeGetName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println(getName(input));


        System.out.print("Enter your age: ");
        System.out.println(getAge(input));
    }


//    static String getName() {
//        String name;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        name = input.nextLine();
//        return name;
//    }
//
//    static int getAge() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age;
//        age = input.nextInt();
//        return age;
//    }

    static String getName(Scanner input) {
        return input.nextLine();
    }

    static int getAge(Scanner input) {
        return input.nextInt();
    }
}
