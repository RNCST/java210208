package com.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryMgrHandler implements ActionListener {
   SalaryMgrView smView = null;
   public SalaryMgrHandler(SalaryMgrView smView) {
      this.smView = smView;
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      Object obj = ae.getSource();//버튼의 주소번지를 출력함 예)@abcd1234
      String command = ae.getActionCommand();//버튼의 라벨값을 출력함
      //너 종료 버튼 누른거야? 네
      //if("종료".equals(command)) {
      if(smView.jbtns[4]==obj) {
         System.out.println("종료버튼 이벤트 감지됨.");
         //자바 가상머신과의 연결고리 끊어줌. -가비지 컬렉터에 의해서 Candidate상태로 빠짐
         System.exit(0);
         //System.gc();//쓰레기값 청소 해주세요. 호출하더라도 스레드에 의해 순서대로 처리됨. 즉시 처리안됨.
      }
      else if("조회".equals(command)) {
         System.out.println("조회버튼 이벤트 감지됨.");
         smView.smLogic.getEmpDetail(7566);
      }
      
   }

}