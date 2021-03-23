package com.onj;														
														
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;														
														
public class myc extends JFrame implements ActionListener{														
	private JTextField jtf_result = null;													
	private JButton jbt_one = null;													
	private JButton jbt_two = null;													
	private JButton jbt_plus = null;													
	private JButton jbt_equals = null; 													
	private JButton jbt_clear = null; 		
	private JPanel jp_pad = null;	
	
	String v1 = "";													
	String v2 = "";													
	String op = "";													
	public myc(){													
	initDisplay();											
	}													
//	public myc(JTextField jtf_result, JButton jbt_one, JButton jbt_two, JButton jbt_plus, JButton jbt_equals, JButton jbt_clear){													
//		this.jtf_result = jtf_result;												
//		this.jbt_one = jbt_one;												
//		this.jbt_two = jbt_two;												
//		this.jbt_plus = jbt_plus;												
//		this.jbt_equals = jbt_equals;												
//		this.jbt_clear = jbt_clear;												
//	}		
	public void initDisplay()	
	{	
		jtf_result = new JTextField();
		jtf_result.setHorizontalAlignment(JTextField.RIGHT);
		jbt_one = new JButton("1");
		jbt_two = new JButton("2");
		jbt_plus = new JButton("+");
		jbt_equals = new JButton("=");
		jbt_clear = new JButton("C");
        
		jtf_result.addActionListener(this);
		jbt_one.addActionListener(this);
		jbt_two.addActionListener(this);
		jbt_plus.addActionListener(this);
		jbt_equals.addActionListener(this);
		jbt_clear.addActionListener(this);
		jp_pad = new JPanel(new GridLayout(1,5,2,2));
		jp_pad.add(jbt_one);
		jp_pad.add(jbt_two);
		jp_pad.add(jbt_plus);
		jp_pad.add(jbt_equals);
		jp_pad.add(jbt_clear);
		this.getContentPane().add("North",jtf_result);
		this.getContentPane().add("Center",jp_pad);
		this.setTitle("전자계산기");
		this.setSize(300,150);
		this.setVisible(true);
	}	
	public static String calcurate(String sValue1, String sValue2, String sOp)										
	{										
		double v1 = Double.parseDouble(sValue1);									
		double v2 = Double.parseDouble(sValue2);									
		
		System.out.println("sValue1 : "+sValue1+" : sValue2 : "+sValue2 + "==> "+sOp);									
		if(sOp.equals("+")){									
			return ""+(v1+v2);								
		}									
		else{									
			return "error";								
		}									
	}	
	public static void main(String[] args) {	
		new myc();
	}	
		
	@Override													
	public void actionPerformed(ActionEvent ae) {													
		Object obj = ae.getSource();												
														
		if(obj == jbt_one){												
			jtf_result.setText(jtf_result.getText()+"1");											
		}if(obj == jbt_two){												
			jtf_result.setText(jtf_result.getText()+"2");											
		}if(obj == jbt_plus){												
			v1 = jtf_result.getText();											
			System.out.println("v1 : "+v1);											
			op = "+";									
			jtf_result.setText("");											
		}if(obj == jbt_equals){												
			v2 = jtf_result.getText();											
			System.out.println("v1:"+v1 +"-> v2 : "+v2+" op : "+op);
			System.out.println(v1);
			System.out.println(v2);
			String result = calcurate(v1,v2,op);											
			jtf_result.setText(result);											
		}if(obj == jbt_clear){												
			jtf_result.setText("");											
		}												
	}		
														
}														
														
														
														
														
