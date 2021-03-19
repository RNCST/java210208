package com.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BaseBallGameEvent implements ActionListener {
	// ActionListener === 인터페이스.
	// ActionListener인 나는 버튼을 눌렀을 때 일어날 일에 대해서 알 수가 없다.
	BaseBallGameView  gv = null;
	BaseBallGameLogic gl = null;

	public BaseBallGameEvent(BaseBallGameView gv) {
		this.gv = gv;
	}
	public BaseBallGameEvent(BaseBallGameView gv, BaseBallGameLogic gl) {
		this.gv = gv;
		this.gl = gl;
	} // 두개짜리를 해야 안터짐!!!  왜인지는 모름...
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// 라벨값으로 처리하고 싶으면
		String label = e.getActionCommand(); // 새게임,지우기
		System.out.println("event label:" + label);
		if (obj == gv.jtf_input) {
			String input = gv.jtf_input.getText().trim();

			// 만일 숫자가 아닌 값이 있을 때도 고려해야 한다.
			try {
				Integer.parseInt(input);// 356
			} catch (NumberFormatException nfe) {
				gv.jop.showMessageDialog(gv.jf, "숫자만 입력하세요", "Error", JOptionPane.ERROR_MESSAGE);
				gv.jtf_input.setText("");
				gv.jtf_input.requestFocus();
				return;
			}

			if (input.length() != 3) {
				return;
			} else {
				gv.jta_display.append(++gl.cnt + "." + gv.jtf_input.getText() + ":" + gl.call(input) + "\n");
				gv.jtf_input.setText("");
			}
		} else if ("지우기".equals(label)) {
			gv.jta_display.setText("");
			gv.jtf_input.requestFocus();
		} else if ("종료".equals(label)) {
			System.exit(0);// 자바 가상머신과의 연결고리를 끊는다.
		} else if (obj == gv.jmi_dap) {
			gv.jta_display.append("정답은 " + gl.com[0] + gl.com[1] + gl.com[2] + "\n");
			gl.nanSu();
		} else if (obj == gv.jbtns[1]) {
			gv.jta_display.append("정답은 " + gl.com[0] + gl.com[1] + gl.com[2] + "\n");
			gl.nanSu();
		}
		// 새게임
		else if (obj == gv.jbtns[0]) {
			gl.cnt = 0;
			gl.nanSu();
			gv.jta_display.setText("");
			gv.jtf_input.setText("");
			gv.jtf_input.requestFocus();
		}

	}
}
