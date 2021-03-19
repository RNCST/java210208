package ch5.singleton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewApp1_1{
   //setSize하기 전에 인스턴스화를 하였다.
   JFrame jf =new JFrame();
   JFrame jf2 =null;
   JButton jbtn = new JButton("전송");
   public void initDisplay() {
      jf2 = new JFrame();
      //디폴트 생성자는 제공해주지만 파라미터를 갖는 생성자는 제공되지 않습니다.
      EventHandler eh = new EventHandler(this);
      jbtn.addActionListener(eh);
      jf2.add("North",jbtn);
      jf2.setSize(300, 200);
      jf2.setVisible(true);
   }
   public static void main(String[] args) {
      ViewApp1_1 va = new ViewApp1_1();
        va.initDisplay();
   }
}