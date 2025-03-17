import models.Board;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Board board = new Board("6,0,0;8,0,5;5,0,6;1,0,7;7,0,8;1,1,1;2,1,2;7,2,2;6,2,3;1,2,5;8,2,6;2,2,7;4,2,8;5,3,0;9,3,3;2,3,4;6,3,6;3,3,8;2,4,0;6,4,1;3,4,5;4,4,7;3,5,2;5,5,5;2,5,6;1,6,0;4,6,3;8,6,4;7,6,6;6,6,7;2,6,8;9,7,0;6,7,2;5,7,4;3,7,6;2,8,1;1,8,4;5,8,7");

        do {
            System.out.println("------------------SUDOKU-----------------");
            board.printBoard();
            System.out.println("1 - Add | 2 - Remove | 3- Complete");
            System.out.print("Option:");
            int menuOption = scanner.nextInt();
            System.out.println("-----------------------------------------");

            switch (menuOption) {
                case 1:
                    addNumberToBoard(board);
                    break;
                case 2:
                    removeNumberFromBoard(board);
                    break;
                case 3:
                    board.verifyResult();
                    break;
            }
            System.out.println("\n\n\n");
        }while (board.getStatus().equals("IN_GAME"));

        if(board.getStatus().equals("COMPLETED")) {
            System.out.println("Congratulations! You correct completed the game!");
        } else {
            System.out.println("Oh no! You've completed the board, but something's wrong!");
        }
    }

    private static void addNumberToBoard(Board board){
        System.out.print("Value:");
        int value = scanner.nextInt();

        System.out.print("X Coordinate:");
        int xCoordinate = scanner.nextInt();

        System.out.print("Y Coordinate:");
        int yCoordinate = scanner.nextInt();

        board.getSpaces().get(xCoordinate).get(yCoordinate).setValue(value);
    }

    private static void removeNumberFromBoard(Board board){
        System.out.print("X Coordinate:");
        int xCoordinate = scanner.nextInt();

        System.out.print("Y Coordinate:");
        int yCoordinate = scanner.nextInt();

        board.getSpaces().get(xCoordinate).get(yCoordinate).setValue(0);
    }

}
