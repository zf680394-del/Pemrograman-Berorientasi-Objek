//13020240047_Muh.Zulfikar Syamsul Bahri, Rabu, 01-04-2026, 15.10

/* Contoh pengoperasian variabel bertype dasar */

public class Oprator {

  public static void main (String[] args) {
        // TODO Auto-generated method stub
           /* Kamus */
                boolean Booll, Bool2, TF;
                int i, j, hsl;
                float x, y, res;
           /* algoritma */
                System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");

                      Booll = true; Bool2 = false;
                      TF = Booll && Bool2; /* Boolean AND */
                      TF = Booll || Bool2; /*Boolean OR */
                      TF = ! Booll;        /* NOT */
                      TF = Booll ^Bool2;   /* XOR */
                      /* operasi numerik */
                      i = 5; j = 2;
                      hsl = i + j; 
                      hsl = i - j;
                      hsl = i / j; 
                      hsl = i * j;
                      hsl = i /j; /* pembagian bulat */
                      hsl = i % j; /* sisa modulo */

                      /* operasi numerik */ 
                      x = 5; y = 5;
                      res = x + y;
                      res = x - y;
                      res = x / y;
                      res = x * y;
                      /* operasi relasional numerik */
                      TF = (i == j);
                      TF = (i != j);
                      TF = (i < j);
                      TF = (i > j);
	              TF = (i <= j);
                      TF = (i >= j);
                      /* operasi relasional numerik */
                      TF = (x != y);
                      TF = (x < y); 
                      TF = (x > y);
                      TF = (x <= y);
                      TF = (x >= y);
  }
}
