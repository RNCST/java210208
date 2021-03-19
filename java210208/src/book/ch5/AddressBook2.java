package book.ch5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.util.DBConnectionMgr;
import com.vo.DeptVO;

import network.step1.TimeClient;
import network.step1.TimeServer;

public class AddressBook2 implements ActionListener{
   //선언부
   JFrame jf = null;
   TimeClient tc       = null;
   Thread th           = null;
   
   JMenuBar jbm        = new JMenuBar();
   JMenu    jm_file    = new JMenu("File");
   JMenu    jm_oracle  = new JMenu("DB연동");
   JMenuItem jmi_dbTest= new JMenuItem("오라클연결");
   JMenuItem jmi_sel   = new JMenuItem("상세조회");
   JMenuItem jmi_selALL= new JMenuItem("전체조회");
   JMenuItem jmi_ins   = new JMenuItem("입력");
   JMenuItem jmi_upd   = new JMenuItem("수정");
   JMenuItem jmi_del   = new JMenuItem("삭제");
   JLabel    jlb_time  = new JLabel("현재시간");
   AddressDialog2 aDia = new AddressDialog2();
   DeptVO dVO = null;
   static AddressBook2 aBook = null;
//   static AddressBook2 aBook = new AddressBook2();
   String cols[] = {"부서번호","부서명","지역"};
   String data[][] = new String[0][3];
   //데이터셋을 담을 수 있는 클래스 생성하기
   //첫번째 data,두번째 컬럼
   DefaultTableModel dtm_dept = new DefaultTableModel(data,cols);
   JTable            jtb_dept = new JTable(dtm_dept);
   JScrollPane       jsp_dept = new JScrollPane(jtb_dept);
   //생성자
   public AddressBook2() {
      //initDisplay();
   }
   //주소 목록 조회 - 새로고침 처리
   public void refresh() {
      System.out.println("refresh 호출 성공");
/////////////////////////////////////[[ 전체 조회   ]]////////////////////////////////////
      DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
/////////////////////////////////////[[ 조회결과를 처리  ]]////////////////////////////////////
      String sql = "SELECT deptno, dname, loc FROM dept";
      DeptVO dVOS[] = null;
      try {
         //연결통로확보 하기
         System.out.println("con before");
         con =dbMgr.getConnection();
         //오라클 서버에 select문을 전달할 전령 객체 생성
         System.out.println("pstmt before");
         pstmt = con.prepareStatement(sql);
         System.out.println("pstmt after");
         //오라클에 살고 있는 커서 조작  위해서 자바가 제공하는 객체 생성
         System.out.println("rs before");
         rs = pstmt.executeQuery();
         System.out.println("rs after");
         dVO = null;
         Vector<DeptVO> al = new Vector<DeptVO>();
         while(rs.next()) {
            dVO = new DeptVO();
            dVO.setDeptno(rs.getInt("deptno"));
            dVO.setDname(rs.getString("dname"));
            dVO.setLoc(rs.getString("loc"));
            al.add(dVO);
         }
         System.out.println("al.size():"+al.size());
         dVOS = new DeptVO[al.size()];
         //벡터에 담긴 정보를 꺼내서 객체 배열에 초기화 하기
         al.copyInto(dVOS);
         //주의 : 앞에 조회된 결과가 계속 남아있는상태에서 전체 조회를 누를때 마다 조회된 값이 자꾸만 쌓여갑니다.
         //이것을 삭제하고 나서 새로 붓도록 해보자.
         while(dtm_dept.getRowCount()>0) {
            dtm_dept.removeRow(0);
         }
         for(int i=0;i<dVOS.length;i++) {
            Vector oneRow = new Vector();
            oneRow.add(dVOS[i].getDeptno());
            oneRow.add(dVOS[i].getDname());
            oneRow.add(dVOS[i].getLoc());
            dtm_dept.addRow(oneRow);
         }
      } catch (SQLException se) {
         //부적합한 식별자 입니다.
         System.out.println("SQLException:"+se.getMessage());//좀 더 구체적인 예외처리 클래스 정보를 알 수 있다.
         
      }       
/////////////////////////////////////[[ 전체 조회   ]]////////////////////////////////////
   }
   //화면처리부
   public void initDisplay() {
	  tc = new TimeClient(jlb_time);
	  th = new TimeClient(jlb_time);
	  
	  
      jf = new JFrame();
      //이벤트 소스와 이벤트 핸들러 연결하기
      jmi_ins.addActionListener(this);
      jmi_sel.addActionListener(this);
      jmi_selALL.addActionListener(this);
      jmi_upd.addActionListener(this);
      jmi_del.addActionListener(this);
      jmi_dbTest.addActionListener(this);
      jm_file.add(jmi_selALL);
      jm_file.add(jmi_sel);
      jm_file.add(jmi_ins);
      jm_file.add(jmi_upd);
      jm_file.add(jmi_del);
      jm_oracle.add(jmi_dbTest);
      jbm.add(jm_file);
      jbm.add(jm_oracle);
      jf.setJMenuBar(jbm);
      jf.setTitle("주소록-Ver1.0");
      jf.add("Center",jsp_dept);
      jf.add("South",jlb_time);
      
      
      tc.start();
      //timser server -- > 
      
      
      
      jf.setSize(500, 400);
      jf.setVisible(true);
   }
   
   public static void main(String[] args) {
      aBook = new AddressBook2();
      aBook.initDisplay();
   }
   
   
   @Override
   public void actionPerformed(ActionEvent ae) {
      Object obj = ae.getSource();
      if(obj == jmi_selALL) {
    	  refresh();
      }      
      else if(obj == jmi_dbTest) {
         DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
         Connection con = dbMgr.getConnection();
         if(con !=null) {
            JOptionPane.showMessageDialog(jf, "오라클 서버 연결 성공!!!");
            return;
         }else {
            JOptionPane.showMessageDialog(jf, "오라클 서버 연결 실패!!!");
            return;
         }
      }
      else if(obj == jmi_ins) {
         /*
          * @param1은 AddressDialog에 출력되는 제목글자를 바꿔줄려구
          * @param2은 AddressBook에서 조회된 결과를 AddressDialog에서 재사용해야 할 경우 필요하다는데
          * @param3은 AddressDialog에서 입력이 성공하거나 수정에  성공하면 부모창을 새로고침 해주어야 한다고 담당자가 요청했습니다.
          * @param4은 AddressDialog 화면에서 사용자로 부터 입력받는 JTextField들에 대해 상태값을 반영해주어야 할 거 같아요.
          */
         aDia.set("입력", null, aBook, true);
         aDia.setVisible(true);
      }
      else if(obj == jmi_sel) {
         //한 건을 먼저 선택하세요. - deptno
         int index[] = jtb_dept.getSelectedRows();
         //테이블의 데이터를 선택하지 않은 경우
         if(index.length==0) {
            JOptionPane.showMessageDialog(jf, "조회할 데이터를 선택하세요","Error",JOptionPane.ERROR_MESSAGE);
            return;
         }
         //선택된 로우가 한 개 이상인 경우
         else if(index.length > 1) {
            JOptionPane.showMessageDialog(jf, "데이터를 한건만 선택하세요","Error",JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         
         //그 나머지
         else {
            Integer deptno = Integer.parseInt(dtm_dept.getValueAt(index[0], 0).toString());
   
            DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
   /////////////////////////////////////[[ 조회결과를 처리  ]]////////////////////////////////////
            String sql = "SELECT deptno, dname, loc FROM dept";
                   sql +=" WHERE deptno=?";
            DeptVO dVO = null;       
            try {
               //연결통로확보 하기
               System.out.println("con before");
               con =dbMgr.getConnection();
               //오라클 서버에 select문을 전달할 전령 객체 생성
               System.out.println("pstmt before");
               pstmt = con.prepareStatement(sql);
               //?자리에 값을 치환하기 - 사용자가 선택한 로우의 부서번호
               pstmt.setInt(1, deptno);
               System.out.println("pstmt after");
               //오라클에 살고 있는 커서 조작  위해서 자바가 제공하는 객체 생성
               System.out.println("rs before");
               rs = pstmt.executeQuery();
               if(rs.next()) {
                  JOptionPane.showMessageDialog(jf, "조회결과가 있을 때");
                  dVO = new DeptVO();
                  dVO.setDeptno(rs.getInt("deptno"));
                  dVO.setDname(rs.getString("dname"));
                  dVO.setLoc(rs.getString("loc"));
               }
               else {
                  dVO = new DeptVO();//NullPointerException  피해서 테스틀 할 수 있다.
               }
               //오라클 서버와 연동 하여 사용자가 선택한 한 개 로우만 가져온다.
               aDia.set("상세조회", dVO, aBook, false);
               aDia.setTitle("상세조회");
               aDia.setVisible(true);
            }catch(Exception e) {
               JOptionPane.showMessageDialog(jf, "Exception : "+e.toString());
            }
            
         }////////////////////////end of if
         
      }
      else if(obj == jmi_upd) {
         /////////////////////////////////////////////         
         //한 건을 먼저 선택하세요. - deptno
         int index[] = jtb_dept.getSelectedRows();
         //테이블의 데이터를 선택하지 않은 경우
         if(index.length==0) {
            JOptionPane.showMessageDialog(jf, "수정할 데이터를 선택하세요","Error",JOptionPane.ERROR_MESSAGE);
            return;
         }
         //선택된 로우가 한 개 이상인 경우
         else if(index.length > 1) {
            JOptionPane.showMessageDialog(jf, "수정은 한번에 한건에 대해서만 가능합니다.","Error",JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         
         //그 나머지
         else {
            Integer deptno = Integer.parseInt(dtm_dept.getValueAt(index[0], 0).toString());
   
            DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
   /////////////////////////////////////[[ 조회결과를 처리  ]]////////////////////////////////////
            String sql = "SELECT deptno, dname, loc FROM dept";
                   sql +=" WHERE deptno=?";
            DeptVO dVO = null;       
            try {
               //연결통로확보 하기
               System.out.println("con before");
               con =dbMgr.getConnection();
               //오라클 서버에 select문을 전달할 전령 객체 생성
               System.out.println("pstmt before");
               pstmt = con.prepareStatement(sql);
               //?자리에 값을 치환하기 - 사용자가 선택한 로우의 부서번호
               pstmt.setInt(1, deptno);
               System.out.println("pstmt after");
               //오라클에 살고 있는 커서 조작  위해서 자바가 제공하는 객체 생성
               System.out.println("rs before");
               rs = pstmt.executeQuery();
               if(rs.next()) {
                  JOptionPane.showMessageDialog(jf, "조회결과가 있을 때");
                  dVO = new DeptVO();
                  dVO.setDeptno(rs.getInt("deptno"));
                  dVO.setDname(rs.getString("dname"));
                  dVO.setLoc(rs.getString("loc"));
               }
               else {
                  dVO = new DeptVO();//NullPointerException  피해서 테스틀 할 수 있다.
               }
               //오라클 서버와 연동 하여 사용자가 선택한 한 개 로우만 가져온다.
               aDia.set("수정", dVO, aBook, true);
               aDia.setTitle("수정");
               aDia.setVisible(true);
            }catch(Exception e) {
               JOptionPane.showMessageDialog(jf, "Exception : "+e.toString());
            }
            
         }////////////////////////end of if         
         /////////////////////////////////////////////
         aDia.set("수정", dVO, aBook, true);
         aDia.setTitle("수정");
         aDia.setVisible(true);
      }
      else if(obj == jmi_del) {
         //삭제 처리는 화면 목록에서 직접 처리하기로 함.
      }
   }

}