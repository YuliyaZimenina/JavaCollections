package com.zimenina.yuliya.array_list;

import java.io.IOException;

/**
 * @author Yuliya Zimenina
 */

/*
The task:
1) The user enters a set of numbers from the keyboard.
The resulting numbers must be saved to the list.
Then you need to show the menu,
in which to offer the user a set of items:
1. Add an item to the list.
2. Remove an item from the list.
3. Show the contents of the list.
4. Check if the value is in the list.
5. Replace the value in the list.
Depending on the user's choice,
action, after which the menu is displayed again.

 */

public class StartNumbersList {
    public static void main(String[] args)throws IOException {

        NumbersList numbersList = new NumbersList();
        numbersList.fillArrayList();
        numbersList.menu();

    }
}
