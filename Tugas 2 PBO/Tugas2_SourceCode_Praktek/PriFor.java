//13020240047_Muh.Zulfikar Syamsul Bahri, Sabtu, 11-04-2026, 21.05

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

     /**
      * @param args
      */
     public static void main(String[] args) {
           // TODO Auto-generated method stub
           /* Kamus */
           int i, N;
           Scanner masukan = new Scanner (System.in);
           /* Program */
           /* Program */

           System.out.print ("Baca N, print 1 s/d N ");
           System.out.print ("N = ");

           N = masukan.nextInt();

           for (i = 1; i <= N; i++) {
           System.out.println (i); };
           System.out.println ("Akhir program \n");
     }
}
