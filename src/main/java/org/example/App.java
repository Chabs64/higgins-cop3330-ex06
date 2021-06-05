package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */


/*
Your computer knows what the current year is, which means you can incorporate that into your programs.
You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire.
 It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
 */


import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.decode;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your current age? ");
        String cAge = in.nextLine();
        int cAgenum =  decode(cAge);

        System.out.println("At what age would you like to retire? ");
        String rAge = in.nextLine();
        int rAgenum =  decode(rAge);

        StatmentAboutAge(cAgenum, rAgenum);

        StatmentAboutYears(cAgenum, rAgenum);

    }

    private static void StatmentAboutYears(int cAgenum, int rAgenum) {
        Date time = getInstance().getTime();
        int year = time.getYear()+1900; //IDK API DOCS DIDNT HELP AT ALL.
        System.out.println("It's " + year + " , so you can retire in " + (year + (rAgenum - cAgenum)) + "." );
    }

    private static void StatmentAboutAge(int cAgenum, int rAgenum) {
        System.out.println("You have " + (rAgenum - cAgenum) + " years left until you can retire.");
    }
}
