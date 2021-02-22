package book.ch4;

import java.util.Scanner;

public class frStar {
   Scanner sc = new Scanner(System.in);

   void forA() {
      int y = sc.nextInt();
      for (int i = 0; i < y; i++) {
         for (int z = 0; z <= i; z++) {
            System.out.print("*");
         }
         System.out.println(" ");
      }
   }

   void forB() {
      int y = sc.nextInt();
      for (int i = 0; i < y; i++) {
         for (int i2 = i + 1; i2 < y; i2++) {
            System.out.print(" ");
         }

         for (int z = 0; z <= i; z++) {
            System.out.print("*");
         }
         System.out.println(" ");
      }

   }

   void forC() {
      int y = sc.nextInt()-1;
      {
         for (int i = 0; i < y; i++) {
            System.out.print(" ");

         }
         System.out.println("*");
         for (int i = 0; i < y; i++) {
            for (int i2 = i + 1; i2 < y; i2++) {
               System.out.print(" ");
            }
            System.out.print("*");
            for (int z = 0; z <= i; z++) {
               System.out.print("*");
            }

            for (int z = 0; z <= i; z++) {
               System.out.print("*");
            }

            for (int i2 = i + 1; i2 < y; i2++) {
               System.out.print(" ");
            }
            System.out.println(" ");
         }
      }
   }

   void forD() {
      int y = (sc.nextInt() - 1);
      {
         for (int i = 0; i < y; i++) {
            System.out.print(" ");

         }
         System.out.println("*");
         for (int i = 0; i < y; i++) {
            for (int i2 = i + 1; i2 < y; i2++) {
               System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
               System.out.print("*");
            }

            System.out.print("*");
            for (int z = 0; z <= i; z++) {
               System.out.print("*");
            }

            for (int i2 = i + 1; i2 < y; i2++) {
               System.out.print(" ");
            }
            System.out.println(" ");
         }
      }
      for (int i = 0; i < y - 1; i++) {

         for (int i2 = i + 1; i2 != 0; i2--) {
            System.out.print(" ");
         }
         for (int z = y - i - 1; z != 0; z--) {
            System.out.print("*");
         }
         System.out.print("*");
         for (int z = y - i- 1; z != 0; z--) {
            System.out.print("*");
         }
         for (int i2 = i + 1; i2 != 0; i2--) {
            System.out.print(" ");
         }
         System.out.println(" ");
      }

      for (int i = 0; i < y; i++) {
         System.out.print(" ");

      }
      System.out.println("*");
   }

   public static void main(String[] args) {
      frStar f = new frStar();
      f.forA(); // 별
      f.forB(); // 역별
      f.forC(); // 피라미드
      f.forD(); // 모래시계
   }

}