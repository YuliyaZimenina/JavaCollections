package com.zimenina.yuliya.array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yuliya Zimenina
 */

public class NumbersList<S> {
    //Static class variables
    /*
    The object of the scanner class is declared static
    in order to be able to call the object of the scanner
     class from any method of the class without re-creating
      the object.
     */
    static Scanner scanner = new Scanner(System.in);
    /*
    This variable will store numeric values that
     the user enters from the keyboard.
     */
    static ArrayList<Integer> numberList = new ArrayList<>();
    /*
    An object of this class reads data from the output stream.
     */
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //The variable to which the index of the list / array element is passed.
    static int index;
    static String element;

    //Class methods.
    //Method that populates the list with values from the keyboard.
    public void fillArrayList() throws IOException {
        System.out.println("Please, fill in the list with numerical values and press enter.");
        //Fill the list with values.
        //Using a loop "while".
        while (true) {
            element = reader.readLine();
            /*
           Using a conditional operator,
           we check if an empty string has been entered
            */
            if (element.isEmpty())
                break;
            //Call the method for checking the correctness of the input
            checkInputNum();
        }
        //Outputting the filled list to the console
        System.out.println("Your list: ");
        //Using a loop "for"
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
    }

    /*
    Method that displays the MENU to the console and
    implements interaction with the list processing methods
     */
    public void menu() {
        boolean t = true;
        /*
        To restart the MENU while the user
        is working with the list, use the loop "while".
         */
        while (t) {
            System.out.println("\n MENU: ");
            System.out.println("Press 1 - Add item to list.");
            System.out.println("Press 2 - Remove an item from the list.");
            System.out.println("Press 3 - Show list contents.");
            System.out.println("Press 4 - Finding a value in a list.");
            System.out.println("Press 5 - Replace value in list.");
            System.out.println("Press 0 - End the program.");

            //The variable to which the value of the user input is passed
            int input = scanner.nextInt();
            int index;

            /*
            Using the conditional comparison operator "switch" to select
             an action based on user input
             */
            switch (input) {
                case 1:
                    this.arrayListAdd(); // Calling a method to add an item to the list
                    break;
                case 2:
                    this.deleteElement(); //Calling a method to remove an item from a list
                    break;
                case 3:
                    this.showList(); //Calling the method for viewing a list of items
                    break;
                case 4:
                    this.searchElement(); //Calling the method for finding an item in a list
                    break;
                case 5:
                    this.changeElement(); //Calling the method to replace an item in a list
                    break;
                //Exit the program menu
                case 0:
                    System.out.println("You have finished working with the list.");
                    /*Pass the value false to a variable to terminate
                     the work with the loop.
                    */
                    t = false;
                    break;
            }
        }
    }

    //Method that implements adding an item to the list
    private static void arrayListAdd() {
        System.out.println("Please enter the number you" +
                " want to add to your list:");
        //Add an element by calling this method
        numberList.add(scanner.nextInt());
        System.out.println("Item added successfully!");
        System.out.println("Your list: ");
        //Outputting the updated list to the console
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
    }

    //Method for removing an item from a list
    private static void deleteElement() {
        System.out.println("Please enter the index of the item" +
                " you want to remove from the list:");
        index = scanner.nextInt();
        /*
        Checking the correctness of the input using
        a conditional operator.
        User-entered index must be in the range of
         indexes of the list
         */
        if (index > numberList.size()) {
            /*
            A loop that restarts input of a value until
             a value in a given range is obtained
            */
            while (true) {
                if (index > numberList.size()) {
                    System.err.println("ATTENTION! " +
                            "You are out of the list!");
                    System.out.println("Please enter a valid value.");
                    index = scanner.nextInt();
                } else {
                    //Calling a method that removes an element
                    numberList.remove(index);
                }
            }
        } else {
            numberList.remove(index);
        }
        System.out.println("Item deleted successfully!");
        System.out.println("Your list: ");
        //Outputting the updated list to the console.
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
    }

    //Method for displaying the list to the console.
    private static void showList() {
        System.out.println("Your list contains the following items: ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
    }

    //Method that implements the search for an item in the list.
    private static void searchElement() {
        System.out.println("Please enter the value you want to find: ");
        //To implement the search, we use the conditional operator.
        // list.contains method - ArrayList method to find an element.
        if (false == numberList.contains(scanner.nextInt())) {
            System.out.println("This value is not in the list.");
        } else {
            System.out.println("This value is in the list.");
        }
    }

    //A method that implements the replacement of an item in a list
    private static void changeElement() {
        //Loop that lists items before making a change
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
        System.out.println("\nPlease enter the index of the list" +
                " item you want to replace: ");
        index = scanner.nextInt();
        /* A conditional operator that determines the entry
         of the entered value into the range of values of the list
         */
        if (index > numberList.size()) {
            // Loop that restarts the input of the value
            while (true) {
                if (index > numberList.size()) {
                    System.err.println("ATTENTION! " +
                            "You are out of the list!");
                    System.out.println("Please enter a valid value.");
                    index = scanner.nextInt();
                } else {
                    System.out.println("Replaced list item with index " + index);
                    break;
                }
            }
        } else {
            System.out.println("Replaced list item with index " + index);
        }
        System.out.println("Please enter a new value for the item: ");
        //The variable to which the new value of the list item is passed
        Integer value = (Integer) scanner.nextInt();
        //A method that changes the previous parameters to the new given values in the list
        numberList.set(index, value);
        System.out.println("Modified list: ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + ", ");
        }
    }

    //Method that checks if user input is correct
    private static void checkInputNum() throws IOException{
        /*
        A conditional operator that checks if only numbers are
         entered in a string.
         To define a condition, we use a regular expression.
         */
        if (element.matches("[0-9]+")){
            /*
            Conditional operator that checks the length of
            the input (must not exceed 10 characters)
             */
            if (element.length() > 10){
                /*
                A loop that re-checks a condition when
                 an invalid value is entered
                 */
                while (true) {
                    //Conditional check operator
                    if (element.length() > 10){
                        System.err.println("You have exceeded the " +
                                "allowed number of characters");
                        System.out.println("Please enter a valid value: ");
                        element = reader.readLine();
                    }else {
                        //Adding an item to the list
                        numberList.add(Integer.parseInt(element));
                        break;
                    }
                }
            }else {

            }
            //Adding an item to the list
            numberList.add(Integer.parseInt(element));

            //Condition if the user entered not a number, but a symbol
        } else if (element.matches("[0-9]+") == false){
            /*
            A loop that allows you to re-check the condition when
             you enter an incorrect value.
             */
            while (true){
                if (element.matches("[0-9]+") == false) {
                    System.err.println("You have entered a character! ");
                    System.out.println("Please enter a valid value: ");
                    element = reader.readLine();
                }else {
                    //Adding an item to the list
                    numberList.add(Integer.parseInt(element));
                    break;
                }
            }
        }else {
            System.err.println("ATTENTION! You didn't enter a number!");
            System.out.println("Please enter a number with no more than 10 characters");
            element = reader.readLine();
        }
    }
}
