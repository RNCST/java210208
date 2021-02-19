package practice.p01;

import java.util.Random;

public class P0219N02_solve {
   //선언부
   int nums[] = null;
   //배열의 초기화
   void initArray(int size) {
      Random r = new Random();
      nums = new int[size];
      for(int x=0;x<size;x++) {
         nums[x] = r.nextInt(50);
      }
   }
   //배열 출력하기
   int maxInArray(int size) {
      int i, imax = nums[0];
      for(i=1;i<size;i++) {
         if(nums[i] > imax) {
            imax = nums[i];
         }/////////end of if
      }/////////////end of for
      return imax;
   }
   //최대값 구하기
   void printArray(int size) {
      System.out.print("배열 : ");
      if(nums!=null) {//너 널아니지?
         for(int x=0;x<nums.length;x++) {
            System.out.printf("%3d", nums[x]);
         }////////////end of for
         System.out.println();
      }////////////////end of if      
   }
   //main
   public static void main(String[] args) {
	   P0219N02_solve qa = new P0219N02_solve ();
      int size = 10;
      for(int a=0;a<5;a++) {
         qa.initArray(size);
         qa.printArray(size);
         int max = qa.maxInArray(size);
         System.out.println("최대값 : "+max);      
         System.out.println("===============================================");
      }
   }

}