package unitconverterdisplayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import currencyconverter.CurrencyDisplay;
import speedconverter.SpeedDisplay;


public class UnitConverterMenu extends JFrame {
	
	private JPanel jpanel;
	private JButton currencyBtn,speedBtn;
	private JLabel title; 
	private static boolean speedBtnOnclick = false;
	private static boolean currencyBtnOnClick = false;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConverterMenu frame = new UnitConverterMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UnitConverterMenu() {
		setResizable(false);
		setTitle("Unit Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(80, 50, 550, 350);
		setLocationRelativeTo(null);
		jpanel = new JPanel();
		jpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jpanel);
		jpanel.setLayout(null);
		jpanel.setVisible(true);

		title = new JLabel("Unit Converter");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		title.setBounds(180, 25, 175, 30);
		jpanel.add(title);
		
		currencyBtn = new JButton("Currency");
		currencyBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		currencyBtn.setFocusable(false);
		currencyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currencyBtnOnClick = ConverterDisplayerActivator.CurencyChecker();
				if (currencyBtnOnClick == true) {
					CurrencyDisplay currencyDisplay = new CurrencyDisplay();
					currencyDisplay.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Currency Service is not Started",
							"Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		currencyBtn.setBounds(50, 150, 200, 60);
		jpanel.add(currencyBtn);
		
		speedBtn = new JButton("Speed");
		speedBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		speedBtn.setFocusable(false);
		speedBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				speedBtnOnclick = ConverterDisplayerActivator.SpeedChecker();
				if (speedBtnOnclick == true) {
					SpeedDisplay SpeedDisplay = new SpeedDisplay();
					SpeedDisplay.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Speed Service is not Started",
							"Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		speedBtn.setBounds(280, 150, 200, 60);
		jpanel.add(speedBtn);
		

		

	}
	
}