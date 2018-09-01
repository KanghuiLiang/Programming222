package week8;

import java.util.Scanner;

public class TestArray
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students in your class: ");
        int number = input.nextInt();

        System.out.println("Now enter the " + number + " students names");
        String[] nameList = new String[number];

        for (int i = 0; i < number; i++) {
            nameList[i] = input.next();
        }

        System.out.println("Next, enter the score of each student: ");
        int[] numGrades = new int[number];
        for (int i = 0; i < number; i++) {
            numGrades[i] = input.nextInt();
        }

     /*   for (int i = 0; i < number; i++) {
            int currentMax = numGrades[i];
            int currentMaxIndex = i;
            int currentNameIndex = i;

            for (int j = i + 1; j < number; j++) {
                if (currentMax < numGrades[j]) {
                    currentMax = numGrades[j];
                    currentMaxIndex = j; // index max
                    currentNameIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                numGrades[currentMaxIndex] = numGrades[i];
                numGrades[i] = currentMax;
            }

            if (currentNameIndex != i) {
                nameList[currentNameIndex] = String.valueOf(nameList[i]);
                // need nameList[i] to = the current index of the numGrades array HOW???
            }
        } */
         
        for (int i = 0; i < number; i++) {
            System.out.println(nameList[i] + " had a score of " + numGrades[i]);
        }
    }
}