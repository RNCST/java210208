package practice.thread;

import java.util.Map;

public class ThreadP01_Deamon_Nomal {
   public static void main(String[] args) {
      Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
      for (Thread thread : allStackTraces.keySet()) {
         String thisThreadName = thread.getName();
         System.out.println("thisThreadName = " + thisThreadName + (thread.isDaemon() ? "(데몬)" : "(주)"));
         ThreadGroup thisThreadGroup = thread.getThreadGroup();
         System.out.println("thisThreadGroup = " + thisThreadGroup);
         String thisThreadGroupName = thisThreadGroup.getName();
         System.out.println("thisThreadGroupName = " + thisThreadGroupName);
         System.out.println();
      }
   }
}