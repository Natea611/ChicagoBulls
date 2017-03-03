package com.example;

public class MyClass {

    public static void main(String args[])
    {
        double teamPoints;
        double rebounds;

        //For ease of use
        String[] statLines = {"Games played", "Minutes Played", "Points", "3-point Percentage", "Rebounds" };

        //Only including players with over 20 games played and 20 minutes played
        double[]  JimmyButler = {54, 36.7, 24.0, 34.2, 6.3};
        double[] DwayneWade = {51, 30.4, 19.2, 33.1, 4.6};
        double[] RobinLopez = {60, 28.0, 10.0, 0, 6.7};
        double[] TajGibson = {55, 27.3, 11.6, 16.7, 6.9};
        double[] RajonRando = {51, 26.2, 6.9, 30.6, 5.1};
        double[] DougMcDermont = {44, 24.5, 10.2, 37.3, 3.0};
        double[] NikolaMirotic = {51, 22.8, 9.3, 30.9, 5.2};
        double[] MichaelCarterWilliams = {27, 21.7, 8.1, 20.0, 4.6};

        //Calculations
        //Points scored by team;

        teamPoints = JimmyButler[2] + DwayneWade[2] + RobinLopez[2] + TajGibson[2] + RajonRando[2] + DougMcDermont[2] + NikolaMirotic[2] + MichaelCarterWilliams[2] + 37.2;

        rebounds = (JimmyButler[4] + DougMcDermont[4] + DwayneWade[4]) / 3;

        System.out.println("The average amount of points per game for the bulls is " + teamPoints + " Points");
        System.out.println("The average amount of rebounds for the top 3% 3-point shooters is " + rebounds + " rebounds.");
        System.out.println("The better play for this year based on stats is Jimmy Butler.");

        System.out.println();
        System.out.println();

        System.out.println("Individual Player Stats For Dwayne Wade:");

        for (int i = 0; i < statLines.length; i++)
        {
            System.out.print(statLines[i] + "  " + DwayneWade[i] + "  |  ");

        }


    }

}
