package NesoAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            displayMenu();
            int choice = input.nextInt();

            if(choice == 1){
                //ADD
                System.out.println("Enter an integer");
                integers.add(input.nextInt());
                System.out.println("Added");
            } else if(choice == 2){
                //Remove
                System.out.println("Enter the number to remove");
                int elementToRemove = input.nextInt();
                if(integers.contains(elementToRemove)){
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed");
                } else
                    System.out.println("Element not found");
            } else if(choice == 3){
                System.out.println("Your List: " + integers);
            }
            else if(choice == 4){
                System.out.println("Good bye");
                break;
            }
        }

    }

    private static void displayMenu(){
        System.out.println();
        System.out.println("1 - Add element");
        System.out.println("2 - Remove element");
        System.out.println("3 - Display element");
        System.out.println("4 - Exit");
        System.out.println();
        System.out.println("Your choice: ");
    }

}
