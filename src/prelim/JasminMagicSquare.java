/**
 * NAME: JASMIN, RAMON EMMIEL P.
 * CLASS CODE: CS 122 9301
 * DATE: FEBRUARY 14, 2023
 *
 * MAGIC SQUARE
 * */

package prelim;

import java.lang.*;
import java.io.*;

public class JasminMagicSquare {

    public static void main(String[] args) throws Exception {
        run();
    }

    /**
     * Initializes a two-dimensional array by putting 0 to every
     * cell of the array.
     * For row 0 to the last row of the two-dimensional array
     * For column 0 to last column of each row
     * let array[row][column] = 0
     **/
    public static void initializeArray(int[][] a){
        for (int row=0; row < a.length; row++){
            for (int col=0; col< a[row].length; col++)
                a[row][col] = 0;
        }
    }

    /**
     *Generates and returns a two-dimensional array that corresponds
     * to a magic square with a given size, where size is assumed to be
     * an odd integer.
     *
     *Input: size = desired size of the magic square
     *Ouput: two-dimensional array(i.e. size by size) representing the
     *magic square
     *
     *Processes:
     *1. Instantiate the two dimensional array called magicSquare
     *2. Initialize magicSquare such that every cell is filled with 0 by
     * giving magicSquare to the method for initializing a two-dimensional
     * array.
     *3. Let the number to be placed in the magicSquare be element and
     * let element be 1.
     *4. Let row be 0 (start from row 0)
     *5. Let col be the middle column of the row (size/2)
     *6. put element in the magicSquare at the current row and col
     *7. while element is less than size * size
     * Let element = element + 1
     * Let row = row -1 ( i.e. Move one cell up diagonally)
     * Let col = col + 1
     * If row <0 and col > size-1, go the the cell below the corner cell
     * row = row+2;
     * col = col-1
     * If row < 0, go to the last valid row
     * row = size -1
     * If col > size, go to the first column
     * col = 0
     * If magicSquare[row][col] is not 0 (there is already an element),
     * go the cell below
     * row = row +2
     * col = col-1
     * Put element in the cell indexed row and col
     *
     **/
    public static int[][] generateMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        initializeArray(magicSquare);

        int element = 1;
        int row = 0;
        int col = size / 2;

        magicSquare[row][col] = element;

        while (element < (size*size)){

            element = element + 1;
            row = row - 1;
            col = col + 1;

            if (row < 0 && col > (size -1)){
                row = row + 2;
                col = col - 1;
            }

            if (row < 0){
                row = size -1;
            }

            if (col > size - 1){
                col = 0;
            }

            if (magicSquare[row][col] != 0){
                row = row + 2;
                col = col - 1;
            }

            magicSquare[row][col] = element;
        }

        return magicSquare;
    }

    /**
     *1. Accept the desired size of the magic square
     *2. If the size entered is an even number, give a message saying the size
     * must be an odd number and repeat from step 1.
     *3. If the size is less than 3 or the size is greater than 13, give a message
     * saying the size must be an odd number from 3 to 13 and repeat from step 1
     *4. Pass the size to the method that generates a magic square so that
     * a magic square with the desired size is generated and pass the magic
     * square to the method that displays the magic square.
     */
    public static void run() throws Exception {
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        int size = 0;

        do {
            System.out.println("Magic Square Generator");
            System.out.print("Enter the desired size of the magic square: ");
            size = Integer.parseInt(kbd.readLine());
            if (size % 2 == 0)
                System.out.println("The size must be an odd number.");
            else if (size < 3 || size > 15)
                System.out.println("The magic square may have an invalid size, it may be too big or too small");
            else {
                System.out.println(size + " by " + size + " magic square");
                display(generateMagicSquare(size));

            }
        }while ((size % 2 == 0) || size < 3 || size > 15) ;
    }

    /**
     *Displays each element of a two dimensional on a space with
     * uniform width.
     *Given: Two-dimensional array
     * For row =0 to last valid row of the given two-dimensional array
     * For column = 0 to last valid column of a row
     * Print the element at the current row and column on a fixed width space
     * Print the enter character
     **/
    public static void display(int[][] array){
        for (int r=0; r < array.length; r++){
            for (int c = 0; c < array[r].length; c++){
                System.out.printf("%6d", array[r][c]);
            }
            System.out.println();
        }
    }
}
