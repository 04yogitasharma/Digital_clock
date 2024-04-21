package com.practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
//import javax.xml.crypto.Data;

public class MyWindow extends JFrame {
	
	private JLabel heading;
	private JLabel clockLabel;
	private Font font=new Font("",Font.BOLD,30);
	
	MyWindow(){
		setTitle("My clock");
		setSize(600,400);
		setLocation(500,200);
		this.creteGUI();
		this.startClock();
		setVisible(true);
	}
	
	public void creteGUI() {
		heading=new JLabel("My Clock");
		clockLabel=new JLabel("clock");
		heading.setFont(font);
		clockLabel.setFont(font);
		clockLabel.setBackground(Color.CYAN);
		
		
		
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
		clockLabel.setForeground(Color.CYAN);
		
	}
	
	public void startClock() {
		Timer timer=new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dateTime=new Date().toString();
				
				clockLabel.setText(dateTime);
			}
		});
		
		timer.start();
	}
}
