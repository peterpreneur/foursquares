/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.peterpreneur.foursquares;

import java.util.Arrays;
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
        int colBoard = 6;
        int rowBoard = 6;
        int counter = 1;

        int[][] board = new int[colBoard][rowBoard];
        for (int i = 0; i < colBoard; i++) {
            Arrays.fill(board[i], counter + i);
        }

        // Printout board
        for (int i = 0; i < colBoard; i++) {
            for (int j = 0; j < rowBoard; j++) {
                System.out.print(board[i][j] + "_");
            }
            System.out.println();
        }

        // Play game
        // Determine winner
    }
}
