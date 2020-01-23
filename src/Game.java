package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class Game {

    /**
     * Solves Sudoku puzzles
     * @author Louis Alvarez
     * @param args file path to an unsolved sudoku .txt
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filePath = "C:\\Users\\louis\\Desktop\\sudoku1.txt";//args[0];

        Sudoku sudoku1 = new Sudoku(filePath);

        sudoku1.toString(); // prints the puzzle without a solution
        System.out.println();

        sudoku1.solve();

        sudoku1.toString();
    }
}
