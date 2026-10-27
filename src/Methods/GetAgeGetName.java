package Methods;

import java.util.Scanner;

// method that get the age and name of a user
public class GetAgeGetName {
    static void main(String[] args) {
        System.out.print("Enter your name: ");
        System.out.println(getName());


        System.out.print("Enter your age: ");
        System.out.println(getAge());
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

    static String getName() {
        return new Scanner(System.in).nextLine();
    }

    static int getAge() {
        return new Scanner(System.in).nextInt();
    }
}
