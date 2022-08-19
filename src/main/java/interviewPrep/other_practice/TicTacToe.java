package interviewPrep.other_practice;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
    }

        public static void printGameBoard(char[][] gameBoard) {
            for (char[] row : gameBoard) {
                for (char column : row) {
                    System.out.print(column);
                }
                System.out.println();
            }
        }

}
