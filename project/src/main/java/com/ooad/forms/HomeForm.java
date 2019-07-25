package com.ooad.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;

public class HomeForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtSr;
	private JTextField txtSr1;
	private JTextField txtDate;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JPanel panel_5;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeForm frame = new HomeForm();
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
	public HomeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 182, 38);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 47, 182, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(0, 94, 182, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(0, 143, 182, 38);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(0, 191, 182, 38);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(0, 242, 182, 38);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(0, 293, 182, 38);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(0, 344, 182, 38);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(0, 395, 182, 38);
		contentPane.add(button_7);
		
		JLabel lblTollPayment = new JLabel("TOLL HISTORY");
		lblTollPayment.setBackground(Color.LIGHT_GRAY);
		lblTollPayment.setForeground(Color.BLUE);
		lblTollPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblTollPayment.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTollPayment.setBounds(194, 11, 438, 62);
		contentPane.add(lblTollPayment);
		
		JPanel panel = new JPanel();
		panel.setBounds(194, 74, 426, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtSr = new JTextField();
		txtSr.setHorizontalAlignment(SwingConstants.CENTER);
		txtSr.setBounds(0, 0, 52, 45);
		panel.add(txtSr);
		txtSr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtSr.setText("Sr");
		txtSr.setColumns(10);
		txtSr1 = new JTextField();
		txtSr1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSr1.setBounds(52, 0, 131, 45);
		panel.add(txtSr1);
		txtSr1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtSr1.setText("Amount");
		
		txtDate = new JTextField();
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setBounds(182, 0, 131, 45);
		panel.add(txtDate);
		txtDate.setText("Car Reg");
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(314, 0, 112, 45);
		panel.add(textField);
		textField.setText("Date");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(194, 118, 426, 45);
		contentPane.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setText("1.");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 0, 52, 45);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setText("$2");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setBounds(52, 0, 131, 45);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setText("1782");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(182, 0, 131, 45);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setForeground(Color.BLACK);
		textField_4.setText("10/09/2019");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setBounds(314, 0, 112, 45);
		panel_1.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(194, 162, 426, 45);
		contentPane.add(panel_2);
		
		textField_5 = new JTextField();
		textField_5.setText("2.");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(0, 0, 52, 45);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("$2");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(52, 0, 131, 45);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("1782");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(182, 0, 131, 45);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("10/09/2019");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setBounds(314, 0, 112, 45);
		panel_2.add(textField_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(194, 206, 426, 45);
		contentPane.add(panel_3);
		
		textField_9 = new JTextField();
		textField_9.setText("3.");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_9.setColumns(10);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(0, 0, 52, 45);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("$2");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setBounds(52, 0, 131, 45);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("1782");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_11.setBackground(Color.LIGHT_GRAY);
		textField_11.setBounds(182, 0, 131, 45);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("10/09/2019");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.BLACK);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_12.setBackground(Color.LIGHT_GRAY);
		textField_12.setBounds(314, 0, 112, 45);
		panel_3.add(textField_12);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(194, 252, 426, 45);
		contentPane.add(panel_4);
		
		textField_13 = new JTextField();
		textField_13.setText("4.");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_13.setColumns(10);
		textField_13.setBackground(Color.LIGHT_GRAY);
		textField_13.setBounds(0, 0, 52, 45);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("$2");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_14.setBackground(Color.LIGHT_GRAY);
		textField_14.setBounds(52, 0, 131, 45);
		panel_4.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("1782");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_15.setBackground(Color.LIGHT_GRAY);
		textField_15.setBounds(182, 0, 131, 45);
		panel_4.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("10/09/2019");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(Color.BLACK);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_16.setBackground(Color.LIGHT_GRAY);
		textField_16.setBounds(314, 0, 112, 45);
		panel_4.add(textField_16);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(194, 293, 426, 45);
		contentPane.add(panel_5);
		
		textField_17 = new JTextField();
		textField_17.setText("5.");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_17.setColumns(10);
		textField_17.setBackground(Color.LIGHT_GRAY);
		textField_17.setBounds(0, 0, 52, 45);
		panel_5.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("$2");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_18.setBackground(Color.LIGHT_GRAY);
		textField_18.setBounds(52, 0, 131, 45);
		panel_5.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("1782");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_19.setBackground(Color.LIGHT_GRAY);
		textField_19.setBounds(182, 0, 131, 45);
		panel_5.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("10/09/2019");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setForeground(Color.BLACK);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_20.setBackground(Color.LIGHT_GRAY);
		textField_20.setBounds(314, 0, 112, 45);
		panel_5.add(textField_20);
	}
}
