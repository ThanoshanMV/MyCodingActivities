import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // t => number of total rows
    int t = scan.nextInt();
    // System.out.println(t);

    int[] seatsInARow = new int[t];
    int[] studentsInARow = new int[t];

    // x => total seats in the current row
    // y => total students sitting in the current row
    int x, y; 
    int firstBackRowIndex = t/2; 
    for (int i = 0; i < t; i++) {
        x = scan.nextInt();
        y = scan.nextInt();
        seatsInARow[i] = x;
        studentsInARow[i] = y;
    }

    // closing Scanner after the use
    scan.close();

    int currentBackRowStudents, currentFrontRowStudents, currentFrontRowTotalSeats;

    int count = 0; 

    // visit all backrows
    for (int i = firstBackRowIndex; i < t; i++) {
        // get current backrow's num. of students
        currentBackRowStudents = studentsInARow[i];

        // visit all front rows 
        for (int j = 0; j < firstBackRowIndex; j++) {
            // get current frontrow's num. of students
            currentFrontRowStudents = studentsInARow[j];

            // get current frontrow's total seats
            currentFrontRowTotalSeats = seatsInARow[j];

            if (currentFrontRowStudents + currentBackRowStudents <= currentFrontRowTotalSeats) {
                studentsInARow[j] = currentFrontRowTotalSeats;
                count++;
                break;
            }
        }
    } 
    // Print output to STDOUT
    System.out.println(count);
}
}
