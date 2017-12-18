import java.util.Scanner;

public class Spel1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char nr1 = ' ', nr2 = ' ', nr3 = ' ', nr4 = ' ', nr5 = ' ', nr6 = ' ', nr7 = ' ', nr8 = ' ', nr9 = ' ';
        int val1, val2, val3, val4, val5, val6, val7, val8, val9;

        System.out.println("A Babz Produczion");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println( "1|2|3" + "\n-----\n" + "4|5|6" + "\n-----\n" + "7|8|9\nVälj en ruta.");

        val1 = scan.nextInt();
        if(val1 == 1){
            nr1 = 'X';
        }
        if(val1 == 2){
            nr2 = 'X';
        }
        if(val1 == 3){
            nr3 = 'X';
        }
        if(val1 == 4){
            nr4 = 'X';
        }
        if(val1 == 5){
            nr5 = 'X';
        }
        if(val1 == 6){
            nr6 = 'X';
        }
        if(val1 == 7){
            nr7 = 'X';
        }
        if(val1 == 8){
            nr8 = 'X';
        }
        if(val1 == 9){
            nr9 = 'X';
        }
        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        val2 = scan.nextInt();
        while(val2 == val1) {
            System.out.println("Ruta upptagen, välj igen");
            val2 = scan.nextInt();
        }
        if(val2 == 1){
            nr1 = 'O';
        }
        if(val2 == 2){
            nr2 = 'O';
        }
        if(val2 == 3){
            nr3 = 'O';
        }
        if(val2 == 4){
            nr4 = 'O';
        }
        if(val2 == 5){
            nr5 = 'O';
        }
        if(val2 == 6){
            nr6 = 'O';
        }
        if(val2 == 7){
            nr7 = 'O';
        }
        if(val2 == 8){
            nr8 = 'O';
        }
        if(val2 == 9){
            nr9 = 'O';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        val3 = scan.nextInt();
        while(val3 == val1 || val2 == val3) {
            System.out.println("Ruta upptagen, välj igen");
            val3 = scan.nextInt();
        }
        if(val3 == 1){
            nr1 = 'X';
        }
        if(val3 == 2){
            nr2 = 'X';
        }
        if(val3 == 3){
            nr3 = 'X';
        }
        if(val3 == 4){
            nr4 = 'X';
        }
        if(val3 == 5){
            nr5 = 'X';
        }
        if(val3 == 6){
            nr6 = 'X';
        }
        if(val3 == 7){
            nr7 = 'X';
        }
        if(val3 == 8){
            nr8 = 'X';
        }
        if(val3 == 9){
            nr9 = 'X';
        }
        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        val4 = scan.nextInt();
        while(val4 == val1 || val4 == val2 || val4 == val3) {
            System.out.println("Ruta upptagen, välj igen");
            val4 = scan.nextInt();
        }
        if(val4 == 1){
            nr1 = 'O';
        }
        if(val4 == 2){
            nr2 = 'O';
        }
        if(val4 == 3){
            nr3 = 'O';
        }
        if(val4 == 4){
            nr4 = 'O';
        }
        if(val4 == 5){
            nr5 = 'O';
        }
        if(val4 == 6){
            nr6 = 'O';
        }
        if(val4 == 7){
            nr7 = 'O';
        }
        if(val4 == 8){
            nr8 = 'O';
        }
        if(val4 == 9){
            nr9 = 'O';
        }
        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        val5 = scan.nextInt();
        while(val5 == val1 || val5 == val2 || val5 == val3 || val5 == val4) {
            System.out.println("Ruta upptagen, välj igen");
            val5 = scan.nextInt();
        }
        if(val5 == 1){
            nr1 = 'X';
        }
        if(val5 == 2){
            nr2 = 'X';
        }
        if(val5 == 3){
            nr3 = 'X';
        }
        if(val5 == 4){
            nr4 = 'X';
        }
        if(val5 == 5){
            nr5 = 'X';
        }
        if(val5 == 6){
            nr6 = 'X';
        }
        if(val5 == 7){
            nr7 = 'X';
        }
        if(val5 == 8){
            nr8 = 'X';
        }
        if(val5 == 9){
            nr9 = 'X';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        if(nr1 == 'X' && nr2 == 'X' && nr3 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr4 == 'X' && nr5 == 'X' && nr6 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr7 == 'X' && nr8 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr4 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr2 == 'X' && nr5 == 'X' && nr8 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr6 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr5 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr5 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        }


        if(nr1 == 'O' && nr2 == 'O' && nr3 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr4 == 'O' && nr5 == 'O' && nr6 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr7 == 'O' && nr8 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr4 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr2 == 'O' && nr5 == 'O' && nr8 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr6 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr5 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr5 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        }

        val6 = scan.nextInt();
        while(val6 == val1 || val6 == val2 || val6 == val3 || val6 == val4 || val6 == val5) {
            System.out.println("Ruta upptagen, välj igen");
            val6 = scan.nextInt();
        }
        if(val6 == 1){
            nr1 = 'O';
        }
        if(val6 == 2){
            nr2 = 'O';
        }
        if(val6 == 3){
            nr3 = 'O';
        }
        if(val6 == 4){
            nr4 = 'O';
        }
        if(val6 == 5){
            nr5 = 'O';
        }
        if(val6 == 6){
            nr6 = 'O';
        }
        if(val6 == 7){
            nr7 = 'O';
        }
        if(val6 == 8){
            nr8 = 'O';
        }
        if(val6 == 9){
            nr9 = 'O';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        if(nr1 == 'X' && nr2 == 'X' && nr3 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr4 == 'X' && nr5 == 'X' && nr6 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr7 == 'X' && nr8 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr4 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr2 == 'X' && nr5 == 'X' && nr8 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr6 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr5 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr5 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        }


        if(nr1 == 'O' && nr2 == 'O' && nr3 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr4 == 'O' && nr5 == 'O' && nr6 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr7 == 'O' && nr8 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr4 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr2 == 'O' && nr5 == 'O' && nr8 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr6 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr5 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr5 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        }

        val7 = scan.nextInt();
        while(val7 == val1 || val7 == val2 || val7 == val3 || val7 == val4 || val7 == val5 || val7 == val6) {
            System.out.println("Ruta upptagen, välj igen");
            val7 = scan.nextInt();
        }
        if(val7 == 1){
            nr1 = 'X';
        }
        if(val7 == 2){
            nr2 = 'X';
        }
        if(val7 == 3){
            nr3 = 'X';
        }
        if(val7 == 4){
            nr4 = 'X';
        }
        if(val7 == 5){
            nr5 = 'X';
        }
        if(val7 == 6){
            nr6 = 'X';
        }
        if(val7 == 7){
            nr7 = 'X';
        }
        if(val7 == 8){
            nr8 = 'X';
        }
        if(val7 == 9){
            nr9 = 'X';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        if(nr1 == 'X' && nr2 == 'X' && nr3 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr4 == 'X' && nr5 == 'X' && nr6 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr7 == 'X' && nr8 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr4 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr2 == 'X' && nr5 == 'X' && nr8 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr6 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr5 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr5 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        }


        if(nr1 == 'O' && nr2 == 'O' && nr3 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr4 == 'O' && nr5 == 'O' && nr6 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr7 == 'O' && nr8 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr4 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr2 == 'O' && nr5 == 'O' && nr8 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr6 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr5 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr5 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        }

        val8 = scan.nextInt();
        while(val8 == val1 || val8 == val2 || val8 == val3 || val8 == val4 || val8 == val5 || val8 == val6 || val8 == val7) {
            System.out.println("Ruta upptagen, välj igen");
            val6 = scan.nextInt();
        }
        if(val8 == 1){
            nr1 = 'O';
        }
        if(val8 == 2){
            nr2 = 'O';
        }
        if(val8 == 3){
            nr3 = 'O';
        }
        if(val8 == 4){
            nr4 = 'O';
        }
        if(val8 == 5){
            nr5 = 'O';
        }
        if(val8 == 6){
            nr6 = 'O';
        }
        if(val8 == 7){
            nr7 = 'O';
        }
        if(val8 == 8){
            nr8 = 'O';
        }
        if(val8 == 9){
            nr9 = 'O';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        if(nr1 == 'X' && nr2 == 'X' && nr3 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr4 == 'X' && nr5 == 'X' && nr6 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr7 == 'X' && nr8 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr4 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr2 == 'X' && nr5 == 'X' && nr8 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr6 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr5 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr5 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        }


        if(nr1 == 'O' && nr2 == 'O' && nr3 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr4 == 'O' && nr5 == 'O' && nr6 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr7 == 'O' && nr8 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr4 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr2 == 'O' && nr5 == 'O' && nr8 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr6 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr5 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr5 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        }

        val9 = scan.nextInt();
        while(val9 == val1 || val9 == val2 || val9 == val3 || val9 == val4 || val9 == val5 || val9 == val6 || val9 == val7 || val9 == val8) {
            System.out.println("Ruta upptagen, välj igen");
            val9 = scan.nextInt();
        }
        if(val9 == 1){
            nr1 = 'X';
        }
        if(val9 == 2){
            nr2 = 'X';
        }
        if(val9 == 3){
            nr3 = 'X';
        }
        if(val9 == 4){
            nr4 = 'X';
        }
        if(val9 == 5){
            nr5 = 'X';
        }
        if(val9 == 6){
            nr6 = 'X';
        }
        if(val9 == 7){
            nr7 = 'X';
        }
        if(val9 == 8){
            nr8 = 'X';
        }
        if(val9 == 9){
            nr9 = 'X';
        }

        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);

        if(nr1 == 'X' && nr2 == 'X' && nr3 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr4 == 'X' && nr5 == 'X' && nr6 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr7 == 'X' && nr8 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr4 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr2 == 'X' && nr5 == 'X' && nr8 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr6 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr1 == 'X' && nr5 == 'X' && nr9 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        } if(nr3 == 'X' && nr5 == 'X' && nr7 == 'X'){
            System.out.println("Player 1 Wins");
            System.exit(1);
        }


        if(nr1 == 'O' && nr2 == 'O' && nr3 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr4 == 'O' && nr5 == 'O' && nr6 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr7 == 'O' && nr8 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr4 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr2 == 'O' && nr5 == 'O' && nr8 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr6 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr1 == 'O' && nr5 == 'O' && nr9 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        } if(nr3 == 'O' && nr5 == 'O' && nr7 == 'O'){
            System.out.println("Player 2 Wins");
            System.exit(1);
        }

        System.out.println("Det blev lika!");

    }

}