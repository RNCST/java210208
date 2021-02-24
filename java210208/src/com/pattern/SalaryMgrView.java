package com.pattern;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import book.ch5.SalaryMgr;

/*
 * 클래스 쪼개기를 하면서 생성자에 대한 활용 능력을 키워본다.
 * static을 사용하는 것은 반칙이다.(생성자 공부가 안된다.)
 * 뷰계층-업무처리계층-이벤트 처리 핸들러
 * 
 * 누가 누구를 인스턴스화 해야 하는가?
 * :A안에 B를 인스턴스화 해야하나? 아님 B안에 A를 인스턴스화 해야하나요?
 * 생성자의 파라미터 자리에는 무엇을 써야 할까요? -  생성자 오버로딩에 대해서는 알고 있는거니?
 * SalaryMgrView -this
 * SalaryMgrHandler
 * SalaryMgrLogic
 * 한개만, 두개가 , 세개 다 원하는지
 * 세 개의 클래스를 그림으로 표시한 뒤 화살표를 통해서 객체 주입관계를 완성하시오.
 */
public class SalaryMgrView {
   //선언부
   SalaryMgrHandler    smEvent     = null;
   SalaryMgrLogic      smLogic     = null;
   JFrame             jf_sal       = null;
   //DefaultTableModel(DataSet역할:data[][],header[])+JTable=> 테이블
   String             cols[]      = {"사원명","부서명"};
   String             data[][]    = new String[0][2]; 
   JTable             jtb_sal     = null;//화면, 양식, 폼을 그린다.
   DefaultTableModel    dtm_sal    = null;
   JScrollPane         jsp_sal     = null;
   JTableHeader       jth_sal     = null;
   JButton          jbtns[]       = null;
   JButton             jbtn        = null;
   String              jbtns_label[] = {"조회","입력","수정","삭제","종료"};
   JPanel              jp_north    = null;   
   //생성자
   public SalaryMgrView() {
      smEvent = new SalaryMgrHandler(this);
      smLogic = new SalaryMgrLogic(this);
      jf_sal    = new JFrame();//선언과 생성을 분리해 본다. - 차이 - 메모리 로딩(점유)
      //테이블안에 면에 데이터를 매칭하는데 필요한 클래스 선언(DataSet의 역할을 함-SELECT문 혹은 저장 프로시저와 연계할 클래스임-)
      //웹에서는 JSON의 역할을 수행하는 클래스임.
      dtm_sal   = new DefaultTableModel(data,cols);
      //테이블의 양식을 작성하는 클래스 생성임.
      jtb_sal = new JTable(dtm_sal);
      //JTable에 스크롤 바를 그려줄 속지 클래스 생성
      jsp_sal = new JScrollPane(jtb_sal);
      //메소드를 통해서 객체를 주입받을 수 있다.- 잘하는 사람, 같이 밥먹자
      //테이블의 헤더를 그려줄 클래스 생성
      jth_sal = jtb_sal.getTableHeader();
      //버튼 추가
      jp_north = new JPanel();
      jp_north.setLayout(new GridLayout(1,4,3,3));
      jbtns = new JButton[jbtns_label.length];
      for(int i=0;i<jbtns_label.length;i++) {
         jbtn = new JButton(jbtns_label[i]);
         jbtns[i] = jbtn;//버튼 객체 배열과 동기화 처리하기
         jp_north.add(jbtn);
         //이벤트소스와 이벤트 처리 핸들러 메소드 매칭
         jbtns[i].addActionListener(smEvent);//this는 현재 활성화된 객체 주소번지 SalaryMgr
      }
      initDisplay();
   }   
   //화면처리부
   public void initDisplay() {
      System.out.println("initDisplay호출 성공");
      jth_sal.setBackground(Color.GREEN);//API활용 능력 키워준다.
      //컬럼의 순서 바뀌지 않도록 설정하기
      //jth_sal.setReorderingAllowed(false);
      jf_sal.add("North",jp_north);
      jf_sal.add("Center",jsp_sal);
      jf_sal.setTitle("급여 명세서");
      jf_sal.setSize(400,300);
      jf_sal.setVisible(true);
   }
   //main
   public static void main(String[] args) {
      new SalaryMgrView();
   }   
}