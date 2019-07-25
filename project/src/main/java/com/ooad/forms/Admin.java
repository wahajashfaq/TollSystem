package com.ooad.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 5, 312, 181);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOLL BILL");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(0, 0, 312, 83);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("$ 10.0");
		label.setForeground(Color.GREEN);
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(0, 83, 312, 96);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 83, 312, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(5, 186, 312, 181);
		contentPane.add(panel_1);
		
		JLabel lblVehicleCount = new JLabel("VEHICLE COUNT");
		lblVehicleCount.setForeground(Color.RED);
		lblVehicleCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicleCount.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVehicleCount.setBackground(Color.WHITE);
		lblVehicleCount.setBounds(0, 0, 312, 83);
		panel_1.add(lblVehicleCount);
		
		JLabel label_2 = new JLabel("299");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(0, 83, 312, 96);
		panel_1.add(label_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 83, 312, 2);
		panel_1.add(separator_1);
	}

}
