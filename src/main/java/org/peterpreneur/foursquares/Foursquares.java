/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.peterpreneur.foursquares;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Foursquares {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Foursquares!");

        // Initiate board
        int colBoard = 8;
        int rowBoard = 8;
        int maxvalue = colBoard * rowBoard;
        int digits = String.valueOf(maxvalue).length();
        String intFormat = "%" + digits + "d";
        int counter = 1;

        // Setup board
        int[][] initBoard = setupBoard(colBoard, rowBoard, counter);

        // Print board
        printBoard(colBoard, rowBoard, intFormat, initBoard);

        // Play game
        // Determine winner
    }

    private static int[][] setupBoard(int colBoard, int rowBoard, int counter) {
        int[][] board = new int[colBoard][rowBoard];
        for (int i = 0; i < colBoard; i++) {
            for (int j = 0; j < rowBoard; j++) {
                board[i][j] = counter++;
            }
        }
        return board;
    }

    private static void printBoard(int colBoard, int rowBoard, String intFormat, int[][] board) {
        for (int i = 0; i < colBoard; i++) {
            for (int j = 0; j < rowBoard; j++) {
                System.out.printf("| " + intFormat + " ", board[i][j]);

            }
            System.out.println("|");
        }

    }

}
