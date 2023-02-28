package com.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CruiseShip
{
    // View all options
    static void DisplayOptions(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n********* Menu *********\n");
        System.out.println("A :  Add Customer.");
        System.out.println("V :  View All Cabins.");
        System.out.println("E :  Display Empty Cabins.");
        System.out.println("D :  Delete Customer From Cabin.");
        System.out.println("F :  Find Cabin From Customer Name.");
        System.out.println("S :  Store Program Data Into File.");
        System.out.println("L :  Load Program Data From File.");
        System.out.println("O :  View Passengers Ordered Alphabetically By Name.");
        System.out.println("T :  Total Expenses.");


        OptionMatch(cabin, WaitingList);
    }

    //Getting User Inputs for option
    static void OptionMatch(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {

        Scanner UserInput = new Scanner(System.in);
        System.out.print("\nEnter Your Letter : ");
        String letter = UserInput.nextLine();
        switch (letter) {
            case "A" -> AddingCustomersToCruiseShips(cabin, WaitingList);
            case "V" -> ViewAllCabins(cabin, WaitingList);
            case "E" -> {
                DisplayEmptyCabins(cabin);
                DisplayOptions(cabin, WaitingList);
            }
            case "D" -> DeleteCustomerFromCabin(cabin, WaitingList);
            case "F" -> FindCabinFromCustomerName(cabin, WaitingList);
            case "S" -> StoreProgramData(cabin, WaitingList);
            case "L" -> LoadProgramData(cabin, WaitingList);
            case "O" -> ViewPassengersOrderedAlphabeticallyByName(cabin, WaitingList);
            case "T" -> Total_Customer_Expenses(cabin, WaitingList);
            default -> {
                System.out.println("\nInvalid Option....\nTry Again");
                DisplayOptions(cabin, WaitingList);
            }
        }
    }

    // Option V : View All Cabins
    static void ViewAllCabins(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** View All Cabins ********\n");
        System.out.println("\n----------- Cabin No 1 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin1()[i][0] + " " + cabin[0].getCabin1()[i][1]);
        }

        System.out.println("\n----------- Cabin No 2 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin2()[i][0] + " " + cabin[0].getCabin2()[i][1]);
        }

        System.out.println("\n----------- Cabin No 3 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin3()[i][0] + " " + cabin[0].getCabin3()[i][1]);
        }

        System.out.println("\n----------- Cabin No 4 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin4()[i][0] + " " + cabin[0].getCabin4()[i][1]);
        }

        System.out.println("\n----------- Cabin No 5 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin5()[i][0] + " " + cabin[0].getCabin5()[i][1]);
        }

        System.out.println("\n----------- Cabin No 6 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin6()[i][0] + " " + cabin[0].getCabin6()[i][1]);
        }

        System.out.println("\n----------- Cabin No 7 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin7()[i][0] + " " + cabin[0].getCabin7()[i][1]);
        }

        System.out.println("\n----------- Cabin No 8 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin8()[i][0] + " " + cabin[0].getCabin8()[i][1]);
        }

        System.out.println("\n----------- Cabin No 9 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin9()[i][0] + " " + cabin[0].getCabin9()[i][1]);
        }

        System.out.println("\n----------- Cabin No 10 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin10()[i][0] + " " + cabin[0].getCabin10()[i][1]);
        }

        System.out.println("\n----------- Cabin No 11 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin11()[i][0] + " " + cabin[0].getCabin11()[i][1]);
        }

        System.out.println("\n----------- Cabin No 12 -----------\n");
        for(int i = 0; i<3; i++){
            System.out.println("Full Name : " + cabin[0].getCabin12()[i][0] + " " + cabin[0].getCabin12()[i][1]);
        }
        DisplayOptions(cabin, WaitingList);
    }

    // Option S : Storing Cabin Data
    static void StoreProgramData(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        try {
            FileWriter myWriter = new FileWriter("src\\com\\task3\\CustomerData.txt");

            for(int i = 0; i<3; i++){

                //---------------- Cabin 01 ----------------

                myWriter.write(cabin[0].getCabin1()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin1()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin1()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 02 ----------------

                myWriter.write(cabin[0].getCabin2()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin2()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin2()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 03 ----------------

                myWriter.write(cabin[0].getCabin3()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin3()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin3()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 04 ----------------

                myWriter.write(cabin[0].getCabin4()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin4()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin4()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 05 ----------------

                myWriter.write(cabin[0].getCabin5()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin5()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin5()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 06 ----------------

                myWriter.write(cabin[0].getCabin6()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin6()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin6()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 07 ----------------

                myWriter.write(cabin[0].getCabin7()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin7()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin7()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 08 ----------------

                myWriter.write(cabin[0].getCabin8()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin8()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin8()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 09 ----------------

                myWriter.write(cabin[0].getCabin9()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin9()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin9()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 10 ----------------

                myWriter.write(cabin[0].getCabin10()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin10()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin10()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 11 ----------------

                myWriter.write(cabin[0].getCabin11()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin11()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin11()[i][2]);
                myWriter.write("\n");

                //---------------- Cabin 12 ----------------

                myWriter.write(cabin[0].getCabin12()[i][0]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin12()[i][1]);
                myWriter.write("\n");
                myWriter.write(cabin[0].getCabin12()[i][2]);
                myWriter.write("\n");
            }

            myWriter.close();
            SaveWaiting(WaitingList);
            DisplayOptions(cabin, WaitingList);
        } catch (IOException e) {
            System.out.println("\nAn error occurred.\n");
            DisplayOptions(cabin, WaitingList);
        }
    }

    // Option S : Storing Waiting List
    static void SaveWaiting(ArrayList<ArrayList<String>> WaitingList)
    {
        try{
            FileWriter myWriter = new FileWriter("src\\com\\Task3\\waitingList.txt");

            for (ArrayList<String> item : WaitingList){
                myWriter.write(item.get(0));
                myWriter.write("\n");
                myWriter.write(item.get(1));
                myWriter.write("\n");
                myWriter.write(item.get(2));
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("\n##################### Saved #####################\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Option L : Loading Customer Data
    static void LoadProgramData(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** Loading ********\n");

        try {
            File myObj = new File("src\\com\\task3\\CustomerData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                for(int i = 0; i<3; i++){

                    //---------------- Cabin 01 ----------------

                    cabin[0].getCabin1()[i][0] = myReader.nextLine();
                    cabin[0].getCabin1()[i][1] = myReader.nextLine();
                    cabin[0].getCabin1()[i][2] = myReader.nextLine();

                    //---------------- Cabin 02 ----------------

                    cabin[0].getCabin2()[i][0] = myReader.nextLine();
                    cabin[0].getCabin2()[i][1] = myReader.nextLine();
                    cabin[0].getCabin2()[i][2] = myReader.nextLine();

                    //---------------- Cabin 03 ----------------

                    cabin[0].getCabin3()[i][0] = myReader.nextLine();
                    cabin[0].getCabin3()[i][1] = myReader.nextLine();
                    cabin[0].getCabin3()[i][2] = myReader.nextLine();

                    //---------------- Cabin 04 ----------------

                    cabin[0].getCabin4()[i][0] = myReader.nextLine();
                    cabin[0].getCabin4()[i][1] = myReader.nextLine();
                    cabin[0].getCabin4()[i][2] = myReader.nextLine();

                    //---------------- Cabin 05 ----------------

                    cabin[0].getCabin5()[i][0] = myReader.nextLine();
                    cabin[0].getCabin5()[i][1] = myReader.nextLine();
                    cabin[0].getCabin5()[i][2] = myReader.nextLine();

                    //---------------- Cabin 06 ----------------

                    cabin[0].getCabin6()[i][0] = myReader.nextLine();
                    cabin[0].getCabin6()[i][1] = myReader.nextLine();
                    cabin[0].getCabin6()[i][2] = myReader.nextLine();

                    //---------------- Cabin 07 ----------------

                    cabin[0].getCabin7()[i][0] = myReader.nextLine();
                    cabin[0].getCabin7()[i][1] = myReader.nextLine();
                    cabin[0].getCabin7()[i][2] = myReader.nextLine();

                    //---------------- Cabin 08 ----------------

                    cabin[0].getCabin8()[i][0] = myReader.nextLine();
                    cabin[0].getCabin8()[i][1] = myReader.nextLine();
                    cabin[0].getCabin8()[i][2] = myReader.nextLine();

                    //---------------- Cabin 09 ----------------

                    cabin[0].getCabin9()[i][0] = myReader.nextLine();
                    cabin[0].getCabin9()[i][1] = myReader.nextLine();
                    cabin[0].getCabin9()[i][2] = myReader.nextLine();

                    //---------------- Cabin 10 ----------------

                    cabin[0].getCabin10()[i][0] = myReader.nextLine();
                    cabin[0].getCabin10()[i][1] = myReader.nextLine();
                    cabin[0].getCabin10()[i][2] = myReader.nextLine();

                    //---------------- Cabin 11 ----------------

                    cabin[0].getCabin11()[i][0] = myReader.nextLine();
                    cabin[0].getCabin11()[i][1] = myReader.nextLine();
                    cabin[0].getCabin11()[i][2] = myReader.nextLine();

                    //---------------- Cabin 12 ----------------

                    cabin[0].getCabin12()[i][0] = myReader.nextLine();
                    cabin[0].getCabin12()[i][1] = myReader.nextLine();
                    cabin[0].getCabin12()[i][2] = myReader.nextLine();
                }
            }
            myReader.close();
            LoadWaiting(WaitingList);
            DisplayOptions(cabin, WaitingList);
        } catch (Exception e) {
            System.out.println("\nAn error occurred.\n");
            DisplayOptions(cabin, WaitingList);
        }
    }

    // Option L : Loading Waiting List
    static void LoadWaiting(ArrayList<ArrayList<String>> WaitingList)
    {

        try{
            File myObj = new File("src\\com\\Task3\\waitingList.txt");

            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                ArrayList<String> pas = new ArrayList<>();
                pas.add(myReader.nextLine());
                pas.add(myReader.nextLine());
                pas.add(myReader.nextLine());
                WaitingList.add(pas);
            }

            myReader.close();
            System.out.println("\n##################### Loaded #####################\n");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }

    // View Passengers Ordered Alphabetically By Name
    static void ViewPassengersOrderedAlphabeticallyByName(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** Ordered List Of Passengers ********\n");

        String[] ordered = new String[36];
        int count = 0;

        for(int i = 0; i<3; i++){

            //---------------- Cabin 01 ----------------

            if (cabin[0].getCabin1()[i][0].equals("Empty"))
            {
                ordered[count] = "not boarded";
            }
            else
            {
                ordered[count] = cabin[0].getCabin1()[i][0] + " " + cabin[0].getCabin1()[i][1];
            }

            //---------------- Cabin 02 ----------------

            if (cabin[0].getCabin2()[i][0].equals("Empty"))
            {
                ordered[count + 1] = "not boarded";
            }
            else
            {
                ordered[count + 1] = cabin[0].getCabin2()[i][0] + " " + cabin[0].getCabin2()[i][1];
            }

            //---------------- Cabin 03 ----------------

            if (cabin[0].getCabin3()[i][0].equals("Empty"))
            {
                ordered[count + 2] = "not boarded";
            }
            else
            {
                ordered[count + 2] = cabin[0].getCabin3()[i][0] + " " + cabin[0].getCabin3()[i][1];
            }

            //---------------- Cabin 04 ----------------

            if (cabin[0].getCabin4()[i][0].equals("Empty"))
            {
                ordered[count + 3] = "not boarded";
            }
            else
            {
                ordered[count + 3] = cabin[0].getCabin4()[i][0] + " " + cabin[0].getCabin4()[i][1];
            }

            //---------------- Cabin 05 ----------------

            if (cabin[0].getCabin5()[i][0].equals("Empty"))
            {
                ordered[count + 4] = "not boarded";
            }
            else
            {
                ordered[count + 4] = cabin[0].getCabin5()[i][0] + " " + cabin[0].getCabin5()[i][1];
            }

            //---------------- Cabin 06 ----------------

            if (cabin[0].getCabin6()[i][0].equals("Empty"))
            {
                ordered[count + 5] = "not boarded";
            }
            else
            {
                ordered[count + 5] = cabin[0].getCabin6()[i][0] + " " + cabin[0].getCabin6()[i][1];
            }

            //---------------- Cabin 07 ----------------

            if (cabin[0].getCabin7()[i][0].equals("Empty"))
            {
                ordered[count + 6] = "not boarded";
            }
            else
            {
                ordered[count + 6] = cabin[0].getCabin7()[i][0] + " " + cabin[0].getCabin7()[i][1];
            }

            //---------------- Cabin 08 ----------------

            if (cabin[0].getCabin8()[i][0].equals("Empty"))
            {
                ordered[count + 7] = "not boarded";
            }
            else
            {
                ordered[count + 7] = cabin[0].getCabin8()[i][0] + " " + cabin[0].getCabin8()[i][1];
            }

            //---------------- Cabin 09 ----------------

            if (cabin[0].getCabin9()[i][0].equals("Empty"))
            {
                ordered[count + 8] = "not boarded";
            }
            else
            {
                ordered[count + 8] = cabin[0].getCabin9()[i][0] + " " + cabin[0].getCabin9()[i][1];
            }

            //---------------- Cabin 10 ----------------

            if (cabin[0].getCabin10()[i][0].equals("Empty"))
            {
                ordered[count + 9] = "not boarded";
            }
            else
            {
                ordered[count + 9] = cabin[0].getCabin10()[i][0] + " " + cabin[0].getCabin10()[i][1];
            }

            //---------------- Cabin 11 ----------------

            if (cabin[0].getCabin11()[i][0].equals("Empty"))
            {
                ordered[count + 10] = "not boarded";
            }
            else
            {
                ordered[count + 10] = cabin[0].getCabin11()[i][0] + " " + cabin[0].getCabin11()[i][1];
            }

            //---------------- Cabin 12 ----------------

            if (cabin[0].getCabin12()[i][0].equals("Empty"))
            {
                ordered[count + 11] = "not boarded";
            }
            else
            {
                ordered[count + 11] = cabin[0].getCabin12()[i][0] + " " + cabin[0].getCabin12()[i][1];
            }

            count = count + 12;
        }

        Arrays.sort(ordered);
        boolean b = true;
        for(String item : ordered)
        {
            if (!(item.equals("not boarded")))
            {
                b = false;
                System.out.println(item);
            }
        }
        if (b)
        {
            System.out.println("\nAll Cabins Are Empty\n");
        }
        DisplayOptions(cabin, WaitingList);
    }

    // Option D : Delete Customers
    static void DeleteCustomerFromCabin(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** Delete Customer ********\n");
        boolean ans = WaitingList.isEmpty();
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Customer Full Name : ");
        String fullName = UserInput.nextLine();

        for(int i = 0; i<3; i++)
        {
            if((cabin[0].getCabin1()[i][0] + " " + cabin[0].getCabin1()[i][1]).equals(fullName))
            {
                if (ans)
                {
                    cabin[0].getCabin1()[i][0] = "Empty";
                    cabin[0].getCabin1()[i][1] = "Empty";
                    cabin[0].getCabin1()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin1()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin1()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin1()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin2()[i][0] + " " + cabin[0].getCabin2()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin2()[i][0] = "Empty";
                    cabin[0].getCabin2()[i][1] = "Empty";
                    cabin[0].getCabin2()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin2()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin2()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin2()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin3()[i][0] + " " + cabin[0].getCabin3()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin3()[i][0] = "Empty";
                    cabin[0].getCabin3()[i][1] = "Empty";
                    cabin[0].getCabin3()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin3()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin3()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin3()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin4()[i][0] + " " + cabin[0].getCabin4()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin4()[i][0] = "Empty";
                    cabin[0].getCabin4()[i][1] = "Empty";
                    cabin[0].getCabin4()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin4()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin4()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin4()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin5()[i][0] + " " + cabin[0].getCabin5()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin5()[i][0] = "Empty";
                    cabin[0].getCabin5()[i][1] = "Empty";
                    cabin[0].getCabin5()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin5()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin5()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin5()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin6()[i][0] + " " + cabin[0].getCabin6()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin6()[i][0] = "Empty";
                    cabin[0].getCabin6()[i][1] = "Empty";
                    cabin[0].getCabin6()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin6()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin6()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin6()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin7()[i][0] + " " + cabin[0].getCabin7()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin7()[i][0] = "Empty";
                    cabin[0].getCabin7()[i][1] = "Empty";
                    cabin[0].getCabin7()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin7()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin7()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin7()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin8()[i][0] + " " + cabin[0].getCabin8()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin8()[i][0] = "Empty";
                    cabin[0].getCabin8()[i][1] = "Empty";
                    cabin[0].getCabin8()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin8()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin8()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin8()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin9()[i][0] + " " + cabin[0].getCabin9()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin9()[i][0] = "Empty";
                    cabin[0].getCabin9()[i][1] = "Empty";
                    cabin[0].getCabin9()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin9()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin9()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin9()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin10()[i][0] + " " + cabin[0].getCabin10()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin10()[i][0] = "Empty";
                    cabin[0].getCabin10()[i][1] = "Empty";
                    cabin[0].getCabin10()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin10()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin10()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin10()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin11()[i][0] + " " + cabin[0].getCabin11()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin11()[i][0] = "Empty";
                    cabin[0].getCabin11()[i][1] = "Empty";
                    cabin[0].getCabin11()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin11()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin11()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin11()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if((cabin[0].getCabin12()[i][0] + " " + cabin[0].getCabin12()[i][1]).equals(fullName)){
                if (ans)
                {
                    cabin[0].getCabin12()[i][0] = "Empty";
                    cabin[0].getCabin12()[i][1] = "Empty";
                    cabin[0].getCabin12()[i][2] = "Empty";
                }
                else
                {
                    cabin[0].getCabin12()[i][0] = WaitingList.get(0).get(0);
                    cabin[0].getCabin12()[i][1] = WaitingList.get(0).get(1);
                    cabin[0].getCabin12()[i][2] = WaitingList.get(0).get(2);
                    WaitingList.remove(0);
                }
                break;
            }

            else if(i == 2){
                System.out.print("\nCan't Find Customer...\nDo You Want To Find Another Customer (Y/N) ? : ");
                String YN = UserInput.nextLine();
                if (YN.equals("Y") || YN.equals("y"))
                {
                    DeleteCustomerFromCabin(cabin, WaitingList);
                }
                else if (YN.equals("N") || YN.equals("n"))
                {
                    DisplayOptions(cabin, WaitingList);
                }
                else
                {
                    System.out.println("\nInvalid Input\nTherefore The Program Will be Displayed The Menu ");
                    DisplayOptions(cabin, WaitingList);
                }
            }
        }
        DisplayOptions(cabin, WaitingList);
    }

    // Option S : Show Empty Cabins and Passenger Number
    static void DisplayEmptyCabins(Cabin[] cabin)
    {
        System.out.println("\n******** Empty Cabins ********\n");

        int emptyCab = 0;
        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin1()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 01");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin2()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 02");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin3()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 03");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin4()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 04");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin5()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 05");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin6()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 06");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin7()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 07");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin8()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 08");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin9()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 09");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin10()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 10");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin11()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 11");
            emptyCab = 0;
        }

        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin12()[i][0].equals("Empty")){
                emptyCab++;
            }
        }

        if (emptyCab != 0)
        {
            System.out.println(emptyCab + " Seats Are Available In Cabin 12");
        }
    }

    // Option F : Find Cabin From Customer Name
    static void FindCabinFromCustomerName(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** Find Cabin From Customer Name ********\n");

        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Customer Full Name : ");
        String FullName = UserInput.nextLine();

        for(int i = 0; i<3; i++){
            if((cabin[0].getCabin1()[i][0] + " " + cabin[0].getCabin1()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 01 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin2()[i][0] + " " + cabin[0].getCabin2()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 02 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin3()[i][0] + " " + cabin[0].getCabin3()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 03 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin4()[i][0] + " " + cabin[0].getCabin4()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 04 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin5()[i][0] + " " + cabin[0].getCabin5()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 05 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin6()[i][0] + " " + cabin[0].getCabin6()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 06 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin7()[i][0] + " " + cabin[0].getCabin7()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 07 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin8()[i][0] + " " + cabin[0].getCabin8()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 08 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin9()[i][0] + " " + cabin[0].getCabin9()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 09 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin10()[i][0] + " " + cabin[0].getCabin10()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 10 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin11()[i][0] + " " + cabin[0].getCabin11()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 11 and Passenger Number is : " + (i+1));
                break;
            }

            else if((cabin[0].getCabin12()[i][0] + " " + cabin[0].getCabin12()[i][1]).equals(FullName)){
                System.out.println("\nThe Passenger in Cabin 12 and Passenger Number is : " + (i+1));
                break;
            }

            else if(i == 2)
            {
                System.out.print("\nCan't Find Customer...\nDo You Want To Find Another Customer (Y/N) ? : ");
                String YN = UserInput.nextLine();
                if (YN.equals("Y") || YN.equals("y"))
                {
                    FindCabinFromCustomerName(cabin, WaitingList);
                }
                else if (YN.equals("N") || YN.equals("n"))
                {
                    DisplayOptions(cabin, WaitingList);
                }
                else
                {
                    System.out.println("\nInvalid Input\nTherefore The Program Will be Displayed The Menu ");
                    DisplayOptions(cabin, WaitingList);
                }
            }
        }
    }

    // Option T : Total Customer Expenses
    static void Total_Customer_Expenses(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        System.out.println("\n******** Total Customer Expenses ********\n");

        int TotalCost = 0;

        for(int i = 0; i<3; i++){
            if(!(cabin[0].getCabin1()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin1()[i][0] + " " + cabin[0].getCabin1()[i][1] + "  :  " + cabin[0].getCabin1()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin1()[i][2]);
            }

            if(!(cabin[0].getCabin2()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin2()[i][0] + " " + cabin[0].getCabin2()[i][1] + "  :  " + cabin[0].getCabin2()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin2()[i][2]);
            }

            if(!(cabin[0].getCabin3()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin3()[i][0] + " " + cabin[0].getCabin3()[i][1] + "  :  " + cabin[0].getCabin3()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin3()[i][2]);
            }

            if(!(cabin[0].getCabin4()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin4()[i][0] + " " + cabin[0].getCabin4()[i][1] + "  :  " + cabin[0].getCabin4()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin4()[i][2]);
            }

            if(!(cabin[0].getCabin5()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin5()[i][0] + " " + cabin[0].getCabin5()[i][1] + "  :  " + cabin[0].getCabin5()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin5()[i][2]);
            }

            if(!(cabin[0].getCabin6()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin6()[i][0] + " " + cabin[0].getCabin6()[i][1] + "  :  " + cabin[0].getCabin6()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin6()[i][2]);
            }

            if(!(cabin[0].getCabin7()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin7()[i][0] + " " + cabin[0].getCabin7()[i][1] + "  :  " + cabin[0].getCabin7()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin7()[i][2]);
            }

            if(!(cabin[0].getCabin8()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin8()[i][0] + " " + cabin[0].getCabin8()[i][1] + "  :  " + cabin[0].getCabin8()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin8()[i][2]);
            }

            if(!(cabin[0].getCabin9()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin9()[i][0] + " " + cabin[0].getCabin9()[i][1] + "  :  " + cabin[0].getCabin9()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin9()[i][2]);
            }

            if(!(cabin[0].getCabin10()[i][2].equals("Empty")))
            {
                System.out.println(cabin[0].getCabin10()[i][0] + " " + cabin[0].getCabin10()[i][1] + "  :  " + cabin[0].getCabin10()[i][2]);
                int t = Integer.parseInt(cabin[0].getCabin10()[i][2]);
                TotalCost += t;
            }

            if(!(cabin[0].getCabin11()[i][2].equals("Empty"))){
                System.out.println(cabin[0].getCabin11()[i][0] + " " + cabin[0].getCabin11()[i][1] + "  :  " + cabin[0].getCabin11()[i][2]);
                int t = Integer.parseInt(cabin[0].getCabin11()[i][2]);
                TotalCost += t;
            }

            if(!(cabin[0].getCabin12()[i][2].equals("Empty"))){
                System.out.println(cabin[0].getCabin12()[i][0] + " " + cabin[0].getCabin12()[i][1] + "  :  " + cabin[0].getCabin12()[i][2]);
                TotalCost += Integer.parseInt(cabin[0].getCabin12()[i][2]);
            }
        }

        System.out.println("\nTotal Customer Expenses is : " + TotalCost);
        DisplayOptions(cabin, WaitingList);
    }

    // Option A : Add Customers To The Cabin
    static void AddingCustomersToCruiseShips(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList)
    {
        try{
            System.out.println("\n********** Add Customer **********\n");

            Scanner UserInput = new Scanner(System.in);
            System.out.print("Enter Number Of Customers : ");
            int c = UserInput.nextInt();
            int fs = CheckingFreeSeats(cabin);
            if (fs >= c)
            {
                int count = 0;
                CheckCabin(cabin, count, c, WaitingList, true, fs);
            }

            else
            {
                AddingCustomersToCruiseShipsElsePart(cabin, c, WaitingList, fs);
            }
        }
        catch (Exception e)
        {
            System.out.println("\nSomething Went Wrong...\nPlease reenter..\n");
            AddingCustomersToCruiseShips(cabin, WaitingList);
        }
    }

    // AddingCustomersToCruiseShips else part
    static void AddingCustomersToCruiseShipsElsePart(Cabin[] cabin, int c, ArrayList<ArrayList<String>> WaitingList, int fs)
    {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("\nYour Input was Out Of Range..\nTotal of Available Seats : " + fs);

        System.out.print("\nDo You Want to Add This Passengers to Waiting List ? (Y/N) : ");
        String YN = UserInput.nextLine();
        if (YN.equals("Y") || YN.equals("y"))
        {
            AddWaiting(WaitingList, c);
            DisplayOptions(cabin, WaitingList);
        }
        else if (YN.equals("N") || YN.equals("n"))
        {
            AddingCustomersToCruiseShips(cabin, WaitingList);
        }
        else
        {
            System.out.println("\nInvalid Input\nTherefore The First " + fs + " Passengers are Adding Cabins And Last " + (c - fs) + " Passengers Adding to Waiting List\n");

            int count = 0;
            CheckCabin(cabin, count, c, WaitingList, false, fs);
            DisplayOptions(cabin, WaitingList);
        }
    }

    // Adding Extra Passengers to Waiting List
    static void AddingExtraPassengersToWaitingList(Cabin[] cabin, ArrayList<ArrayList<String>> WaitingList, int count)
    {
        System.out.println("\nAdding to waiting..\n");
        AddWaiting(WaitingList, count);
        DisplayOptions(cabin, WaitingList);
    }

    //Checking Total of Free Cabins
    static int CheckingFreeSeats(Cabin[] cabin)
    {
        int FreeSeats = 0;
        for(int i = 0; i<3; i++){
            if(cabin[0].getCabin1()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin2()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin3()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin4()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin5()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin6()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin7()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin8()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin9()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin10()[i][0].equals("Empty")){
                FreeSeats++;

            }
            if(cabin[0].getCabin11()[i][0].equals("Empty")){
                FreeSeats++;
            }

            if(cabin[0].getCabin12()[i][0].equals("Empty")){
                FreeSeats++;
            }
        }
        return FreeSeats;
    }

    //Checking Cabin Before Add Customers To The Cabin
    static void CheckCabin(Cabin[] cabin, int count, int c, ArrayList<ArrayList<String>> WaitingList, boolean v, int fs)
    {
        try
        {
            if (c <= fs)
            {
                if(count == c)
                {
                    if (v)
                    {
                        DisplayOptions(cabin, WaitingList);
                    }
                }
            }
            else
            {
                if(count == fs)
                {
                    if (v)
                    {
                        DisplayOptions(cabin, WaitingList);
                    }
                    else
                    {
                        AddingExtraPassengersToWaitingList(cabin, WaitingList, (c - fs));
                    }
                }
            }

            Scanner UserInput = new Scanner(System.in);

            System.out.print("\nEnter Cabin Number : ");
            int CabinNumber = UserInput.nextInt();

            int b = 0;

            if (CabinNumber == 1)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin1()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 2)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin2()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 3)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin3()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 4)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin4()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 5)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin5()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 6)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin6()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 7)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin7()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 8)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin8()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 9)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin9()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 10)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin10()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 11)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin11()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }

            if (CabinNumber == 12)
            {
                for(int i = 0; i<3; i++)
                {
                    if(cabin[0].getCabin12()[i][0].equals("Empty"))
                    {
                        b = 1;
                        AddCustomer(cabin, CabinNumber, i);
                        count++;
                        CheckCabin(cabin, count, c, WaitingList, v, fs);
                    }
                }
            }
            if (b == 0){
                System.out.println("\nCabin Number " + CabinNumber + " is Full\n");
                DisplayEmptyCabins(cabin);
                CheckCabin(cabin, count, c, WaitingList, v, fs);
            }
        }
        catch (Exception e){
            System.out.println("Invalid cabin number...\nPlease reenter..\n");
            CheckCabin(cabin, count, c, WaitingList, v, fs);
        }
    }

    //Adding Customers After Checking Cabin
    static void AddCustomer(Cabin[] cabin, int CabinNumber, int PassengerNumber)
    {
        try{
            Scanner UserInput = new Scanner(System.in);

            System.out.print("\nEnter first name : ");
            String firstname = UserInput.nextLine();

            System.out.print("Enter surname : ");
            String surname = UserInput.nextLine();

            System.out.print("Enter Expenses : ");
            int Expenses = UserInput.nextInt();
            String expenses = Integer.toString(Expenses);

            if(CabinNumber == 1){
                cabin[0].getCabin1()[PassengerNumber][0] = firstname;
                cabin[0].getCabin1()[PassengerNumber][1] = surname;
                cabin[0].getCabin1()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 2){
                cabin[0].getCabin2()[PassengerNumber][0] = firstname;
                cabin[0].getCabin2()[PassengerNumber][1] = surname;
                cabin[0].getCabin2()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 3){
                cabin[0].getCabin3()[PassengerNumber][0] = firstname;
                cabin[0].getCabin3()[PassengerNumber][1] = surname;
                cabin[0].getCabin3()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 4){
                cabin[0].getCabin4()[PassengerNumber][0] = firstname;
                cabin[0].getCabin4()[PassengerNumber][1] = surname;
                cabin[0].getCabin4()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 5){
                cabin[0].getCabin5()[PassengerNumber][0] = firstname;
                cabin[0].getCabin5()[PassengerNumber][1] = surname;
                cabin[0].getCabin5()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 6){
                cabin[0].getCabin6()[PassengerNumber][0] = firstname;
                cabin[0].getCabin6()[PassengerNumber][1] = surname;
                cabin[0].getCabin6()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 7){
                cabin[0].getCabin7()[PassengerNumber][0] = firstname;
                cabin[0].getCabin7()[PassengerNumber][1] = surname;
                cabin[0].getCabin7()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 8){
                cabin[0].getCabin8()[PassengerNumber][0] = firstname;
                cabin[0].getCabin8()[PassengerNumber][1] = surname;
                cabin[0].getCabin8()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 9){
                cabin[0].getCabin9()[PassengerNumber][0] = firstname;
                cabin[0].getCabin9()[PassengerNumber][1] = surname;
                cabin[0].getCabin9()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 10){
                cabin[0].getCabin10()[PassengerNumber][0] = firstname;
                cabin[0].getCabin10()[PassengerNumber][1] = surname;
                cabin[0].getCabin10()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 11){
                cabin[0].getCabin11()[PassengerNumber][0] = firstname;
                cabin[0].getCabin11()[PassengerNumber][1] = surname;
                cabin[0].getCabin11()[PassengerNumber][2] = expenses;
            }

            else if(CabinNumber == 12){
                cabin[0].getCabin12()[PassengerNumber][0] = firstname;
                cabin[0].getCabin12()[PassengerNumber][1] = surname;
                cabin[0].getCabin12()[PassengerNumber][2] = expenses;
            }

            System.out.println("\nCustomer Successfully Added in Cabin Number " + CabinNumber + " and Passenger " + (PassengerNumber + 1) + "\n");
        }
        catch (Exception e){
            System.out.println("\nInvalid Data Type for Expenses..\nPlease Reenter Customer Details\n");
            AddCustomer(cabin, CabinNumber, PassengerNumber);
        }
    }

    //Adding Customers to Waiting List
    static void AddWaiting(ArrayList<ArrayList<String>> WaitingList, int count)
    {
        for (int i = 0; i < count; i++){
            try{
                Scanner UserInput = new Scanner(System.in);

                System.out.print("\nEnter First Name : ");
                String fn = UserInput.nextLine();

                System.out.print("Enter Surname : ");
                String sn = UserInput.nextLine();

                System.out.print("Enter Expenses : ");
                int Expenses = UserInput.nextInt();
                String ex = Integer.toString(Expenses);

                ArrayList<String> PassengerDetails = new ArrayList<>();
                PassengerDetails.add(fn);
                PassengerDetails.add(sn);
                PassengerDetails.add(ex);

                WaitingList.add(PassengerDetails);

                System.out.println("\nSuccessfully Added For Waiting List\n");
            }
            catch (Exception e){
                System.out.println("\nSomething Went Wrong..\nPlease Try Again\n");
                AddWaiting(WaitingList, count);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<ArrayList<String>> WaitingList = new ArrayList<>();
        Passengers[] Passenger = new Passengers[12];
        Cabin[] cabin = new Cabin[1];

        Passenger[0] = new Passengers("Empty","Empty","Empty");

        String[][] cabin1passengers = new String[3][3];
        cabin1passengers[0][0] = Passenger[0].getFirstname();
        cabin1passengers[0][1] = Passenger[0].getSurname();
        cabin1passengers[0][2] = Passenger[0].getExpenses();

        cabin1passengers[1][0] = Passenger[0].getFirstname();
        cabin1passengers[1][1] = Passenger[0].getSurname();
        cabin1passengers[1][2] = Passenger[0].getExpenses();

        cabin1passengers[2][0] = Passenger[0].getFirstname();
        cabin1passengers[2][1] = Passenger[0].getSurname();
        cabin1passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin2passengers = new String[3][3];
        cabin2passengers[0][0] = Passenger[0].getFirstname();
        cabin2passengers[0][1] = Passenger[0].getSurname();
        cabin2passengers[0][2] = Passenger[0].getExpenses();

        cabin2passengers[1][0] = Passenger[0].getFirstname();
        cabin2passengers[1][1] = Passenger[0].getSurname();
        cabin2passengers[1][2] = Passenger[0].getExpenses();

        cabin2passengers[2][0] = Passenger[0].getFirstname();
        cabin2passengers[2][1] = Passenger[0].getSurname();
        cabin2passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin3passengers = new String[3][3];
        cabin3passengers[0][0] = Passenger[0].getFirstname();
        cabin3passengers[0][1] = Passenger[0].getSurname();
        cabin3passengers[0][2] = Passenger[0].getExpenses();

        cabin3passengers[1][0] = Passenger[0].getFirstname();
        cabin3passengers[1][1] = Passenger[0].getSurname();
        cabin3passengers[1][2] = Passenger[0].getExpenses();

        cabin3passengers[2][0] = Passenger[0].getFirstname();
        cabin3passengers[2][1] = Passenger[0].getSurname();
        cabin3passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin4passengers = new String[3][3];
        cabin4passengers[0][0] = Passenger[0].getFirstname();
        cabin4passengers[0][1] = Passenger[0].getSurname();
        cabin4passengers[0][2] = Passenger[0].getExpenses();

        cabin4passengers[1][0] = Passenger[0].getFirstname();
        cabin4passengers[1][1] = Passenger[0].getSurname();
        cabin4passengers[1][2] = Passenger[0].getExpenses();

        cabin4passengers[2][0] = Passenger[0].getFirstname();
        cabin4passengers[2][1] = Passenger[0].getSurname();
        cabin4passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin5passengers = new String[3][3];
        cabin5passengers[0][0] = Passenger[0].getFirstname();
        cabin5passengers[0][1] = Passenger[0].getSurname();
        cabin5passengers[0][2] = Passenger[0].getExpenses();

        cabin5passengers[1][0] = Passenger[0].getFirstname();
        cabin5passengers[1][1] = Passenger[0].getSurname();
        cabin5passengers[1][2] = Passenger[0].getExpenses();

        cabin5passengers[2][0] = Passenger[0].getFirstname();
        cabin5passengers[2][1] = Passenger[0].getSurname();
        cabin5passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin6passengers = new String[3][3];
        cabin6passengers[0][0] = Passenger[0].getFirstname();
        cabin6passengers[0][1] = Passenger[0].getSurname();
        cabin6passengers[0][2] = Passenger[0].getExpenses();

        cabin6passengers[1][0] = Passenger[0].getFirstname();
        cabin6passengers[1][1] = Passenger[0].getSurname();
        cabin6passengers[1][2] = Passenger[0].getExpenses();

        cabin6passengers[2][0] = Passenger[0].getFirstname();
        cabin6passengers[2][1] = Passenger[0].getSurname();
        cabin6passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin7passengers = new String[3][3];
        cabin7passengers[0][0] = Passenger[0].getFirstname();
        cabin7passengers[0][1] = Passenger[0].getSurname();
        cabin7passengers[0][2] = Passenger[0].getExpenses();

        cabin7passengers[1][0] = Passenger[0].getFirstname();
        cabin7passengers[1][1] = Passenger[0].getSurname();
        cabin7passengers[1][2] = Passenger[0].getExpenses();

        cabin7passengers[2][0] = Passenger[0].getFirstname();
        cabin7passengers[2][1] = Passenger[0].getSurname();
        cabin7passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin8passengers = new String[3][3];
        cabin8passengers[0][0] = Passenger[0].getFirstname();
        cabin8passengers[0][1] = Passenger[0].getSurname();
        cabin8passengers[0][2] = Passenger[0].getExpenses();

        cabin8passengers[1][0] = Passenger[0].getFirstname();
        cabin8passengers[1][1] = Passenger[0].getSurname();
        cabin8passengers[1][2] = Passenger[0].getExpenses();

        cabin8passengers[2][0] = Passenger[0].getFirstname();
        cabin8passengers[2][1] = Passenger[0].getSurname();
        cabin8passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin9passengers = new String[3][3];
        cabin9passengers[0][0] = Passenger[0].getFirstname();
        cabin9passengers[0][1] = Passenger[0].getSurname();
        cabin9passengers[0][2] = Passenger[0].getExpenses();

        cabin9passengers[1][0] = Passenger[0].getFirstname();
        cabin9passengers[1][1] = Passenger[0].getSurname();
        cabin9passengers[1][2] = Passenger[0].getExpenses();

        cabin9passengers[2][0] = Passenger[0].getFirstname();
        cabin9passengers[2][1] = Passenger[0].getSurname();
        cabin9passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin10passengers = new String[3][3];
        cabin10passengers[0][0] = Passenger[0].getFirstname();
        cabin10passengers[0][1] = Passenger[0].getSurname();
        cabin10passengers[0][2] = Passenger[0].getExpenses();

        cabin10passengers[1][0] = Passenger[0].getFirstname();
        cabin10passengers[1][1] = Passenger[0].getSurname();
        cabin10passengers[1][2] = Passenger[0].getExpenses();

        cabin10passengers[2][0] = Passenger[0].getFirstname();
        cabin10passengers[2][1] = Passenger[0].getSurname();
        cabin10passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin11passengers = new String[3][3];
        cabin11passengers[0][0] = Passenger[0].getFirstname();
        cabin11passengers[0][1] = Passenger[0].getSurname();
        cabin11passengers[0][2] = Passenger[0].getExpenses();

        cabin11passengers[1][0] = Passenger[0].getFirstname();
        cabin11passengers[1][1] = Passenger[0].getSurname();
        cabin11passengers[1][2] = Passenger[0].getExpenses();

        cabin11passengers[2][0] = Passenger[0].getFirstname();
        cabin11passengers[2][1] = Passenger[0].getSurname();
        cabin11passengers[2][2] = Passenger[0].getExpenses();

        String[][] cabin12passengers = new String[3][3];
        cabin12passengers[0][0] = Passenger[0].getFirstname();
        cabin12passengers[0][1] = Passenger[0].getSurname();
        cabin12passengers[0][2] = Passenger[0].getExpenses();

        cabin12passengers[1][0] = Passenger[0].getFirstname();
        cabin12passengers[1][1] = Passenger[0].getSurname();
        cabin12passengers[1][2] = Passenger[0].getExpenses();

        cabin12passengers[2][0] = Passenger[0].getFirstname();
        cabin12passengers[2][1] = Passenger[0].getSurname();
        cabin12passengers[2][2] = Passenger[0].getExpenses();

        cabin[0] = new Cabin(cabin1passengers, cabin2passengers, cabin3passengers, cabin4passengers, cabin5passengers, cabin6passengers, cabin7passengers, cabin8passengers, cabin9passengers, cabin10passengers, cabin11passengers, cabin12passengers);

        DisplayOptions(cabin, WaitingList);
    }
}
