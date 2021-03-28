package com.company;
import java.util.ArrayList;
public class Grocerylist {

    private ArrayList<String> grocerylist = new ArrayList<>();

    public void addgrocery(String item){
        grocerylist.add(item);
    }

    public void printgrocerylist(){
        System.out.println("You have " + grocerylist.size() + " items in your list");
        for (int i = 0; i<grocerylist.size(); i++){
            System.out.println((i+1)+ ". " + grocerylist.get(i));
        }
    }
    public void modifygrocerylist (int position, String newitem){
        grocerylist.set(position, newitem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");

    }
    public void removegrocerylist (int position){
        String theitem = grocerylist.get(position);
        grocerylist.remove(position);
    }


    public String finditem (String searchitem){
        int position = grocerylist.indexOf(searchitem);
        if(position >= 0){
            return grocerylist.get(position);
        }else{
            return null;
        }

    }


    }

