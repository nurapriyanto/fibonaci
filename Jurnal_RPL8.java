
package jurnal_rpl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Jurnal_RPL8 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        Scanner scan = new Scanner(System.in);
//        System.out.println("masukan anggka");
//        
//        int cont = 0;
//        int set = 1;
//        
//        System.out.println(set);
//        if (int x=1; x<cont; x++){
//            
    BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int banyakBilangan = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.println("Bilangan Fibonacci");
        System.out.print("Masukkan banyak bilangan = ");
        try {
            input = dataInput.readLine();
            banyakBilangan = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("Error !!");
        }
        System.out.print("Bilangan Fibonacci = " + a + " " + b + " ");
        for (i = 0; i < banyakBilangan - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }}
    