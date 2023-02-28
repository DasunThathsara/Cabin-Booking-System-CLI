package com.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CruiseShip
{

    //Getting User Inputs and Check
    static void OptionMatch(String[] cruiseShips)
    {

        Scanner UserInput = new Scanner(System.in);
        System.out.print("\nEnter Option : ");
        String letter = UserInput.nextLine();
        switch (letter) {
            case "A" -> AddingCustomersToCruiseShips(cruiseShips);
            case "V" -> ViewAllCabins(cruiseShips);
            case "E" -> DisplayEmptyCabins(cruiseShips);
            case "D" -> DeleteCustomerFromCabin(cruiseShips);
            case "F" -> FindCabinFromCustomerName(cruiseShips);
            case "S" -> StoreProgramData(cruiseShips);
            case "L" -> LoadProgramData(cruiseShips);
            case "O" -> ViewPassengersOrderedAlphabeticallyByName(cruiseShips);
            default -> {
                System.out.println("\nInvalid Option....\nTry Again");
                OptionMatch(cruiseShips);
            }
        }
    }

    //Adding Customers to cruiseShips -> Checking Cabin -> Adding Customer
    static void AddCustomer(String[] cruiseShips, int cn)
    {
        try{
            Scanner UserInput = new Scanner(System.in);

            System.out.print("Enter first name : ");
            String firstname = UserInput.nextLine();

            cruiseShips[cn - 1] = firstname;
        }catch (Exception e){
            System.out.println("\nSomething Went Wrong..Try Again\n");
            AddCustomer(cruiseShips, cn);
        }

    }

    //Adding Customers to cruiseShips -> Checking Cabin
    static void CheckCabin(String[] cruiseShips, int count, int c)
    {
        try{
            if(count == c){
                DisplayOptions(cruiseShips);
            }
            Scanner UserInput = new Scanner(System.in);
            System.out.print("Enter Cabin Number : ");
            int cn = UserInput.nextInt();
            if(cruiseShips[cn-1].equals("Empty")){
                AddCustomer(cruiseShips, cn);
                count++;
            }
            else{
                System.out.println("Sorry.. Already booked\n\navailable cabins...\n");
                int x = 0;
                for (String cruiseShip : cruiseShips){
                    x++;
                    if(cruiseShip.equals("Empty")){
                        System.out.println("Cabin No : " + x);
                    }
                }
            }
            CheckCabin(cruiseShips, count, c);
        }
        catch (Exception e){
            System.out.println("Invalid cabin number...\nPlease reenter..\n");
            CheckCabin(cruiseShips, count, c);
        }
    }

    //Adding Customers to cruiseShips
    static void AddingCustomersToCruiseShips(String[] cruiseShips)
    {
        try{
            System.out.println("\n------Add Customer------\n");

            Scanner UserInput = new Scanner(System.in);
            System.out.print("Enter Number Of Customers : ");
            int c = UserInput.nextInt();
            int count = 0;
            CheckCabin(cruiseShips, count, c);
        }
        catch (Exception e){
            System.out.println("Invalid input...\nPlease reenter..\n");
            AddingCustomersToCruiseShips(cruiseShips);
        }
    }

    //View All Cabins
    static void ViewAllCabins(String[] cruiseShips)
    {
        System.out.println("\n------View All Cabins------\n");
        int count = 1;
        for (String cruiseShip : cruiseShips){
            System.out.println("\nCabin No : " + count);
            System.out.println(cruiseShip);
            count++;
        }
        DisplayOptions(cruiseShips);
    }

    // Show Empty Cabins and Passenger Number
    static void DisplayEmptyCabins(String[] cruiseShips)
    {
        System.out.println("\n------Display Empty Cabins------\n");
        int count = 0;
        for (String cruiseShip : cruiseShips){
            count++;
            if(cruiseShip.equals("Empty")){
                System.out.println("Cabin No : " + count);
            }
        }
        DisplayOptions(cruiseShips);
    }

    // Delete Customer From Cabin
    static void DeleteCustomerFromCabin(String[] cruiseShips)
    {
        System.out.println("\n------Delete Customer From Cabin------\n");
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Cabin Number : ");
        int c = UserInput.nextInt();
        cruiseShips[c - 1] = "Empty";
        DisplayOptions(cruiseShips);
    }

    //Find Cabin From Customer Full Name
    static void FindCabinFromCustomerName(String[] cruiseShips)
    {
        System.out.println("\n------Find Cabin From Customer Name------\n");
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        String name = UserInput.nextLine();
        int count = 1;
        boolean result = true;
        for (String cruiseShip : cruiseShips){
            if(cruiseShip.equals(name)){
                System.out.println("\nCabin No : " + count);
                System.out.println("Name : " + cruiseShip);
                result = false;
                break;
            }
            count++;
        }
        if (result){
            System.out.println("Don't Match\nTry Again...\n");
            FindCabinFromCustomerName(cruiseShips);
        }
        DisplayOptions(cruiseShips);
    }

    // Storing Cabin Data
    static void StoreProgramData(String[] cruiseShips)
    {
        System.out.println("\n------Store Program Data Into File------\n");

        try {
            FileWriter myWriter = new FileWriter("src\\com\\Task1\\data.txt");

            for (String cruiseShip : cruiseShips){
                myWriter.write(cruiseShip);
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            DisplayOptions(cruiseShips);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            DisplayOptions(cruiseShips);
        }
    }

    // Loading Customer Data
    static void LoadProgramData(String[] cruiseShips)
    {
        System.out.println("\n------Load Program Data From File------\n");
        try {
            File myObj = new File("src\\com\\Task1\\data.txt");
            Scanner myReader = new Scanner(myObj);
            int count = 0;
            while (myReader.hasNextLine()) {
                cruiseShips[count] = myReader.nextLine();
                count++;
            }
            System.out.println("Successfully Loaded.");
            myReader.close();
            DisplayOptions(cruiseShips);
        }
        catch (Exception e) {
            System.out.println("Successfully Loaded.");
            DisplayOptions(cruiseShips);
        }
    }

    // View Passengers Ordered Alphabetically By Name
    static void ViewPassengersOrderedAlphabeticallyByName(String[] cruiseShips)
    {
        System.out.println("\n------View Passengers Ordered Alphabetically By Name------\n");
        String[] arr = new String[12];
        int count = 0;
        for (String cruiseShip : cruiseShips){
            if (cruiseShip.equals("Empty")){
                arr[count] = "not boarded";
            }
            else{
                arr[count] = cruiseShip;
            }
            count++;
        }
        Arrays.sort(arr);
        for(String name : arr){
            System.out.println(name);
        }
        DisplayOptions(cruiseShips);
    }

    // View all options
    static void DisplayOptions(String[] cruiseShips)
    {

        System.out.println("\n---------------------- Options ----------------------\n");
        System.out.println("A :  Add Customer.");
        System.out.println("V :  View All Cabins.");
        System.out.println("E :  Display Empty Cabins.");
        System.out.println("D :  Delete Customer From Cabin.");
        System.out.println("F :  Find Cabin From Customer Name.");
        System.out.println("S :  Store Program Data Into File.");
        System.out.println("L :  Load Program Data From File.");
        System.out.println("O :  View Passengers Ordered Alphabetically By Name.");

        OptionMatch(cruiseShips);
    }

    public static void main(String[] arg)
    {

        String[] cruiseShips = new String[12];

        cruiseShips[0] = "Empty";
        cruiseShips[1] = "Empty";
        cruiseShips[2] = "Empty";
        cruiseShips[3] = "Empty";
        cruiseShips[4] = "Empty";
        cruiseShips[5] = "Empty";
        cruiseShips[6] = "Empty";
        cruiseShips[7] = "Empty";
        cruiseShips[8] = "Empty";
        cruiseShips[9] = "Empty";
        cruiseShips[10] = "Empty";
        cruiseShips[11] = "Empty";

        DisplayOptions(cruiseShips);
    }
}
