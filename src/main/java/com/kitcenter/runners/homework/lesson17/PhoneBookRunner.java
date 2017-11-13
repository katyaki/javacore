package com.kitcenter.runners.homework.lesson17;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.LinkedList;
import java.util.Scanner;

public class PhoneBookRunner {

    static LinkedList<Category> categories = new LinkedList<>();

    static Category selectedCategory;
    static int selectedIndex = -1;

    public static void addCategory(String title){
        categories.add(new Category(title));
    }

    public static void selectCategory(String title){
        selectedCategory = null;
        for (Category category: categories) {
            if (category.getTitle().equals(title)){
                selectedCategory = category;
                break;
            }
        }
    }

    public static void selectRecord(int index){
        if(selectedCategory == null) {
            selectedIndex = -1;
            return;
        }

        if ((index>=0) && index < selectedCategory.getPhoneBookRecords().size()) {
            selectedIndex = index;
        }
    }

    public static void changeRecordName(String newValue){
        if(selectedCategory == null){
            return;
        }
        if (selectedIndex < 0) {
            return;
        }
        selectedCategory.getPhoneBookRecords().get(selectedIndex).setName(newValue);
    }


    public static void changeRecordPhone(String newValue){
        if(selectedCategory == null){
            return;
        }
        if (selectedIndex < 0) {
            return;
        }
        selectedCategory.getPhoneBookRecords().get(selectedIndex).setPhoneNumber(newValue);
    }

    public static void listCategories(){
        for (Category category: categories) {
            System.out.println(category.getTitle());
        }
    }

    public static void listPhoneBook(){
        if(selectedCategory == null) {
            return;
        }

        for(int i = 0; i<selectedCategory.getPhoneBookRecords().size(); i++){
            PhoneBookRecord record = selectedCategory.getPhoneBookRecords().get(i);
            System.out.println(Integer.toString(i) + " " + record.getName() + " " + record.getPhoneNumber());
        }
    }


    public static void parseCommand(String command){
        Scanner scanner = new Scanner(System.in);
        switch (command){

            case "categories" :
                listCategories();
                break;
            case "records" :
                listPhoneBook();
                break;
            case "sc" : //select category
                System.out.println("Please enter category name");
                String catName = scanner.next();
                selectCategory(catName);
                break;
            case "sr" : //select record
                selectRecord(scanner.nextInt());
                break;
            case "cn" : //change name
                changeRecordName(scanner.next());
                break;
            case "cp" : //change phone
                changeRecordPhone(scanner.next());
                break;
            case "addc" : //add category
                addCategory(scanner.next());
                break;
            default:
                System.out.println("unexpected command");
                break;
        }
    }



    public static void main(String[] args) {

        String command = "";
        Scanner scanner = new Scanner(System.in);


        Category category = new Category("a");
        category.getPhoneBookRecords().add(new PhoneBookRecord("Anton","12345"));
        category.getPhoneBookRecords().add(new PhoneBookRecord("Arkadiy", "54321"));
        categories.add(category);
        category = new Category("b");
        category.getPhoneBookRecords().add(new PhoneBookRecord("Boris","12345"));
        category.getPhoneBookRecords().add(new PhoneBookRecord("Burry", "54321"));
        categories.add(category);

        while (true) {

            command = scanner.next();

            if (command.equals("exit")) {
                break;
            }

            parseCommand(command);

        }

    }

}
