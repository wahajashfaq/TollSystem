package com.ooad.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class Transaction extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtSr;
	private JTextField txtDate;
	private JTextField txtDateTime;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField txtn;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPanel panel_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPanel panel_4;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	
	JButton btnAccount = new JButton("Account Summary");
	JButton btnPersonalInfo = new JButton("Personal info");
	JButton btnCreditCardManagement = new JButton("Credit Card Management");
	JButton btnVehicles = new JButton("Vehicles");
	JButton btnActiveTollTag = new JButton("Active Toll Tag");
	JButton btnNewTagApply = new JButton("New Tag Apply");
	JButton btnMakePyment = new JButton("Make Pyment");
	JButton btnViewTransactions = new JButton("View Transactions");
	JButton btnViewStatements = new JButton("View Statements");



	/**
	 * Create the frame.
	 */
	public Transaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAccount.setBounds(0, 0, 182, 38);
		contentPane.add(btnAccount);
		
		btnPersonalInfo.setBounds(0, 47, 182, 38);
		contentPane.add(btnPersonalInfo);
		
		btnCreditCardManagement.setBounds(0, 94, 182, 38);
		contentPane.add(btnCreditCardManagement);
		
		btnVehicles.setBounds(0, 143, 182, 38);
		contentPane.add(btnVehicles);
		
		btnActiveTollTag.setBounds(0, 191, 182, 38);
		contentPane.add(btnActiveTollTag);
		
		btnNewTagApply.setBounds(0, 242, 182, 38);
		contentPane.add(btnNewTagApply);
		
		btnMakePyment.setBounds(0, 293, 182, 38);
		contentPane.add(btnMakePyment);
		
		btnViewTransactions.setBounds(0, 344, 182, 38);
		contentPane.add(btnViewTransactions);
		
		btnViewStatements.setBounds(0, 395, 182, 38);
		contentPane.add(btnViewStatements);
		
		JLabel lblTollPayment = new JLabel("TRANSACTIONS");
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
		txtSr.setEditable(false);
		txtSr.setHorizontalAlignment(SwingConstants.CENTER);
		txtSr.setBounds(0, 0, 52, 45);
		panel.add(txtSr);
		txtSr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtSr.setText("Sr");
		txtSr.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setEditable(false);
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setBounds(53, 0, 194, 45);
		panel.add(txtDate);
		txtDate.setText("Car Reg");
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		txtDateTime = new JTextField();
		txtDateTime.setEditable(false);
		txtDateTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateTime.setBounds(246, 0, 180, 45);
		panel.add(txtDateTime);
		txtDateTime.setText("Date Time");
		txtDateTime.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(194, 118, 426, 45);
		contentPane.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setText("1.");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 0, 52, 45);
		panel_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setText("1782");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(52, -1, 194, 45);
		panel_1.add(textField_3);
		
		txtn = new JTextField();
		txtn.setEditable(false);
		txtn.setBackground(Color.LIGHT_GRAY);
		txtn.setForeground(Color.BLACK);
		txtn.setText("10/01/2019 11:20");
		txtn.setHorizontalAlignment(SwingConstants.CENTER);
		txtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtn.setBounds(246, 0, 180, 45);
		panel_1.add(txtn);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(194, 162, 426, 45);
		contentPane.add(panel_2);
		
		textField = new JTextField();
		textField.setText("2.");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(0, 0, 52, 45);
		panel_2.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setText("1782");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setEditable(false);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(52, -1, 194, 45);
		panel_2.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setText("14/01/2019 18:20");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setEditable(false);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(246, 0, 180, 45);
		panel_2.add(textField_4);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(194, 208, 426, 45);
		contentPane.add(panel_3);
		
		textField_5 = new JTextField();
		textField_5.setText("3.");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(0, 0, 52, 45);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("1782");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setEditable(false);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(52, -1, 194, 45);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("22/02/2019 01:55");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setEditable(false);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(246, 0, 180, 45);
		panel_3.add(textField_7);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(194, 254, 426, 45);
		contentPane.add(panel_4);
		
		textField_8 = new JTextField();
		textField_8.setText("4.");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setBounds(0, 0, 52, 45);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("1782");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setEditable(false);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(52, -1, 194, 45);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("28/02/2019 23:41");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.BLACK);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setEditable(false);
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setBounds(246, 0, 180, 45);
		panel_4.add(textField_10);
		
		btnAccount.addActionListener(this);
		btnPersonalInfo.addActionListener(this);
		btnCreditCardManagement.addActionListener(this);
		btnVehicles.addActionListener(this);
		btnActiveTollTag.addActionListener(this);
		btnNewTagApply.addActionListener(this);
		btnMakePyment.addActionListener(this);
		btnViewTransactions.addActionListener(this);
		btnViewStatements.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton button = (JButton) arg0.getSource();
		if(button==btnAccount) {
			Account account = new Account();
			account.setVisible(true);
			this.dispose();
		}
		else if(button==btnPersonalInfo) {
			Personal personal = new Personal();
			personal.setVisible(true);
			this.dispose();
		}
		else if(button==btnCreditCardManagement) {
			CreditCard card = new CreditCard();
			card.setVisible(true);
			this.dispose();
		}
		else if(button==btnVehicles) {
			Vehicle vehicle = new Vehicle();
			vehicle.setVisible(true);
			this.dispose();
		}
		else if(button==btnActiveTollTag) {
			ActiveTollTag active = new ActiveTollTag();
			active.setVisible(true);
			this.dispose();
		}
		else if(button==btnNewTagApply) {
			NewTagApply tag = new NewTagApply();
			tag.setVisible(true);
			this.dispose();
		}
		else if(button==btnMakePyment) {
			MakePayment make = new MakePayment();
			make.setVisible(true);
			this.dispose();
		}
		else if(button==btnViewTransactions) {
			Transaction t = new Transaction();
			t.setVisible(true);
			this.dispose();
		}
		else if(button==btnViewStatements) {
			Stament s = new Stament();
			s.setVisible(true);
			this.dispose();
		}
	}

}
