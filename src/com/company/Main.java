package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Grocerylist grocerylist = new Grocerylist();

    public static void main(String[] args) {
        System.out.println("0 - to find total price");
        System.out.println("1 - to print list of grocery items");
        System.out.println("2 - to add items");
        System.out.println("3 - to modify items");
        System.out.println("4 - to remove items");
        System.out.println("5 - to search for an item");
        System.out.println("6- to quit");

        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    grocerylist.printgrocerylist();
                    break;
                case 2:
                   addgrocery();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeitem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }



        }




    public static void addgrocery(){
        System.out.println("Please enter a grocery item:");
        String blah = scanner.nextLine();
        grocerylist.addgrocery(blah);
    }


    public static void modifyitem(){
        System.out.println("Enter item number: ");
        int itemno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newitem = scanner.nextLine();
        grocerylist.modifygrocerylist(itemno - 1, newitem);
    }
    public static void removeitem(){
        System.out.println("Enter item number to remove:");
        int itemno = scanner.nextInt();
        scanner.nextLine();
        grocerylist.removegrocerylist(itemno - 1);

    }
    public static void searchItem(){
        System.out.println("Item to search: ");
        String searchitem = scanner.nextLine();
        if(grocerylist.finditem(searchitem) != null){
            System.out.println("Found " + searchitem + " in list.");

        }else{
            System.out.println("Not found");
        }
    }
}



