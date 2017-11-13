import java.util.Scanner;

public class Spel1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char nr1 = ' ', nr2 = ' ', nr3 = ' ', nr4 = ' ', nr5 = ' ', nr6 = ' ', nr7 = ' ', nr8 = ' ', nr9 = ' ';
        int val;

        val = scan.nextInt();
        if(val == 1){
            nr1 = 'X';
        }

    }
}

class board{
    public static void main(int nr1,int nr2,int nr3,int nr4,int nr5,int nr6,int nr7,int nr8,int nr9){
        System.out.println(nr1 + "|" + nr2 + "|" + nr3 + "\n-----\n" + nr4 + "|" + nr5 + "|" + nr6 + "\n-----\n" + nr7 + "|" + nr8 + "|" + nr9);
    }
}