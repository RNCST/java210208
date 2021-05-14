package practice.thread;

import java.util.Map;

public class ThreadP02_Deamon_time extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장하였습니다.");
    }
    public static void main(String[] args) {
    	ThreadP02_Deamon_time autoSaveDaemonThread = new ThreadP02_Deamon_time();
        autoSaveDaemonThread.setDaemon(true);
        autoSaveDaemonThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료합니다.");
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

            save();
        }
    }
    
}


