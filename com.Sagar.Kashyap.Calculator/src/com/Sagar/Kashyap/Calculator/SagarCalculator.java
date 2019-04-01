package com.Sagar.Kashyap.Calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SagarCalculator extends JFrame implements ActionListener{
	public static final long serialVersionUID=1L;
	static JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,ba,bs,bm,bd,beq,bc,bH,bme;
	public static JTextField jtf,jtf1;
	static String s0,s1,s2;
	
	SagarCalculator(){
		s0=s1=s2="";
		JFrame jfrm=new JFrame("iSAGAR CALCULATOR");
		JPanel jp= new JPanel();
		
		jp.setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		jtf=new JTextField();
		jtf.setEditable(false);
		jtf1=new JTextField();
		jtf1.setEditable(false);
		
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b0=new JButton("0");
		ba=new JButton("+");
		bs=new JButton("-");
		bm=new JButton("*");
		bd=new JButton("/");
		bc=new JButton("C");
		beq=new JButton("=");
		bdot=new  JButton(".");
		bH=new JButton("H");
		bme=new JButton("iSagar");
		
		bme.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jtf1.setText("UNDER CONSTRUCTION");
				
			}
		});
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		bH.addActionListener(this);
		b0.addActionListener(this);
		bdot.addActionListener(this);
		bc.addActionListener(this);
		beq.addActionListener(this);
		
		
		jtf.setPreferredSize(new Dimension(550,40));
		jtf1.setPreferredSize(new Dimension(550,40));
		b7.setPreferredSize(new Dimension(150,50));
		b8.setPreferredSize(new Dimension(150,50));
		b9.setPreferredSize(new Dimension(150,50));
		b4.setPreferredSize(new Dimension(150,50));
		b5.setPreferredSize(new Dimension(150,50));
		b6.setPreferredSize(new Dimension(150,50));
		b1.setPreferredSize(new Dimension(150,50));
		b2.setPreferredSize(new Dimension(150,50));
		b3.setPreferredSize(new Dimension(150,50));
		b0.setPreferredSize(new Dimension(150,50));
		bdot.setPreferredSize(new Dimension(150,50));
		ba.setPreferredSize(new Dimension(85,50));
		bs.setPreferredSize(new Dimension(85,50));
		bm.setPreferredSize(new Dimension(85,50));
		bd.setPreferredSize(new Dimension(85,50));
		bd.setPreferredSize(new Dimension(85,50));
		bH.setPreferredSize(new Dimension(72,50));
		bc.setPreferredSize(new Dimension(72,50));
		beq.setPreferredSize(new Dimension(415,50));
		bme.setPreferredSize(new Dimension(130,50));
		
		jp.add(jtf);
		jp.add(jtf1);
		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(ba);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(bs);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.add(bm);
		jp.add(bH);
		jp.add(bc);
		jp.add(b0);
		jp.add(bdot);
		jp.add(bd);
		jp.add(beq);
		jp.add(bme);
		
		
		jfrm.setSize(600, 430);
		jfrm.setResizable(false);
		jfrm.setFocusable(true);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.add(jp);
		jfrm.setVisible(true);
		
	}
	
	

	
	public void actionPerformed(ActionEvent ae) {
		String s=ae.getActionCommand();
		try {
			if((s.charAt(0)>='0' && s.charAt(0)<='9')|| s.charAt(0)=='.') {
				if(!s1.equals(""))
					s2=s2+s;
				else {
					s0=s0+s;
				}
				jtf.setText(s0+s1+s2);
			}
			else if(s.charAt(0)=='C') {
				s0=s1=s2="";
			jtf.setText(s0+s1+s2);
			}
			else if(s.charAt(0)=='=') {
				double sum;
				if(s1.equals("+"))
					sum=(Double.parseDouble(s0)+Double.parseDouble(s2));
				else if(s1.equals("-"))
					sum=(Double.parseDouble(s0)-Double.parseDouble(s2));
				else if(s1.equals("*"))
					sum=(Double.parseDouble(s0)*Double.parseDouble(s2));
				else 
					sum=(Double.parseDouble(s0)/Double.parseDouble(s2));
				jtf.setText(s0+s1+s2+"="+sum);
				s0=Double.toString(sum);
				s1=s2="";
				
			}
			else {
				if(s1.equals("")||s2.equals(""))
					s1=s;
				else {
					double sum;
					if(s1.equals("+"))
						sum=(Double.parseDouble(s0)+Double.parseDouble(s2));
					else if(s1.equals("-"))
						sum=(Double.parseDouble(s0)-Double.parseDouble(s2));
					else if(s1.equals("*"))
						sum=(Double.parseDouble(s0)*Double.parseDouble(s2));
					else 
						sum=(Double.parseDouble(s0)/Double.parseDouble(s2));
					
					s0=Double.toString(sum);
					s1=s;
					s2="";
				}
				jtf.setText(s0+s1+s2);
			}
			
		}catch(Exception e2){
			System.err.println(e2.getMessage());
		}
		
		
	}
		public static void main(String[] args) {
			SagarCalculator obj=new SagarCalculator();
			
		}

}
