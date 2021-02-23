package book.ch5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.google.gson.Gson;
import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgr implements ActionListener {
	// 선언부
	JFrame jf_sal = null; // 가장 바깥쪽 바탕 선언
	// DefaultTacleModel(DataSet역할을 수행하는 class)+ JTable=> 테이블의 형태를 제공.
	// DataSet역할(data[][],header[])
	String cols[] = { "Ename", "Dname" };
	String data[][] = new String[0][2]; // ........
	JTable jtb_sal = null; // 화면, 양식, 폼을 그린다.
	DefaultTableModel dtm_sal = null;
	JScrollPane jsp_sal = null;
	JTableHeader jth_sal = null;
	JButton jbtns[] = null;
	JButton jbtn = null;
	String jbtns_label[] = { "조회", "입력", "수정", "삭제", "종료" };
	JPanel jp_north = null;

	// 생성자
	public SalaryMgr() {
		jf_sal = new JFrame();// 선언과 생성을 분리해 본다. - 차이. 이 라인부터 메모리로딩이 일어난다 = 메모리에 자리를 점유하기 시작.
		// 테이블안 셀에 데이터를 매칭하는데 필요한 클래스 선언(DataSet의 역할을 함- SELECT문 혹은 저장 프로시저와 연계할 클래스임-)
		// 웹에서는 JSON의 역할을 수행하는 클래스임.
		dtm_sal = new DefaultTableModel(data, cols);
		jtb_sal = new JTable(dtm_sal); // 테이블의 양식을 작성하는 클래스
		jsp_sal = new JScrollPane(jtb_sal); // 테이블의 스크롤 바를 그려줄 속지 클래스 생성
		jth_sal = jtb_sal.getTableHeader(); // 테이블의 헤더를 그려줄 클래스 생성 메소드를 통해서 객체를 주입받을 수 있다.
		jp_north = new JPanel(); // 북쪽에 버튼 추가
		jp_north.setLayout(new GridLayout(1, 4, 5, 5)); // 3번째 4번쨰 뭐냐 >?!?!?!?!?!?!!?!??!!?!??!?!?!
		jbtns = new JButton[jbtns_label.length]; // jbtns_label 배열 길이만큼의 버튼 갯수 선언
		for (int i = 0; i < jbtns_label.length; i++) {
			jbtn = new JButton(jbtns_label[i]);
			jbtns[i] = jbtn; // 버튼 객체 배열과 동기화 처리하기
			jp_north.add(jbtn); // 이벤트소스와 이벤트 처리 핸들러 메소드 매칭

			jbtns[i].addActionListener(this); // this는 현재 활성화된 객체주소번지 SalaryMgr
		}
		initDisplay();
	}

	// 화면처리부
	public void initDisplay() {
		System.out.println("initDisplay호출 성공");
		jth_sal.setBackground(Color.white);
		jth_sal.setReorderingAllowed(false); // 컬럼의 순서가 바뀌지 않도록 설정하기.
		jf_sal.add("North", jp_north); // 5개 버튼정의후 north쪽에 배치
		jf_sal.add("Center", jsp_sal); // 속지를 center쪽에 배치
		jf_sal.setTitle("급여 명세서"); // 타이틀
		jf_sal.setSize(400, 300); // 가장 바탕의 칸 생성
		jf_sal.setVisible(true); // 프레임이 보이나?
	}

	// main
	public static void main(String[] args) {
		new SalaryMgr();
	}

	@Override // JRE 버전 1.8이상에서부터 작동 (패키지 버전 이클립스 버전 모두다 확인해야하며 GIT에서 풀할때도 확인해줘야함.)
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource(); // 버튼의 주소번지를 출력함
		String command = ae.getActionCommand(); // 버튼의 라벨값을 출력함
		if ("조회".equals(command)) {
			System.out.println("조회");
			EmpVO eVO = new EmpVO();
			eVO.setEname("이순신"); // Ename = getEname = 이순신
			DeptVO dVO = new DeptVO();
			dVO.setDname("개발 1팀"); // Dname = getDname = 개발 1팀
			eVO.setDVO(dVO);
			; // issue , // eVO.getDVO = dVO
			Vector oneRow = new Vector(); // java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다함. 연관있는 레코드를 한번에 밀어넣기 위해서 사용함.
			oneRow.addElement(eVO.getEname()); // eVO.getEname == Ename == 이순신
			oneRow.addElement(eVO.getDVO().getDname()); // eVO.getDVO().getDname == dVO.getDname == "개발 1팀"
			dtm_sal.addRow(oneRow);
			//
		}

		if ("입력".equals(command)) {
			System.out.println("입력");
			Vector oneRow = new Vector();
			oneRow.addElement(1111);
//			oneRow.addElement(2222);
			dtm_sal.addRow(oneRow);
		} else if ("수정".equals(command)) {
			EmpVO eVO = new EmpVO();
			eVO.setEname("이순신"); // Ename = getEname = 이순신
			DeptVO dVO = new DeptVO();
			dVO.setDname("개발 1팀"); // Dname = getDname = 개발 1팀
			eVO.setDVO(dVO);
			Vector oneRow = new Vector();
			oneRow.addElement("");
			oneRow.addElement("");
			dtm_sal.addRow(oneRow);
			for (int r = 0; r < 1; r++) {
				dtm_sal.setValueAt(eVO.getEname(), r, 0);
				dtm_sal.setValueAt(eVO.getDVO().getDname(), r, 1);
			}
			System.out.println("수정");
		} else if ("삭제".equals(command)) {
			System.out.println("삭제");
		} else if ("종료".equals(command)) { // if 종료버튼이 눌리면
			// if (jbtns[4]==obj) 인 경우에도 작동은 한다.
			System.exit(0); // 자바 가상머신과의 연결고리를 끊어줌 . 가비지 컬렉터에 의해 Candidate상태로 빠짐.
			System.gc(); // 쓰레기값을 청소해주세요. 호출하더라도 스레드에 의해 순서대로 처리됨. 즉시 처리안됨.
		}

	}
}
