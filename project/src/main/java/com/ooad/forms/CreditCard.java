package com.ooad.forms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CreditCard extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtYousufBilal;
	private JTextField txtUniversitySt;
	private JTextField txtSomeonesomeonecom;
	private JTextField txtLar;

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
	public CreditCard() {
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
		
		JLabel lblTollPayment = new JLabel("CREDIT CARD");
		lblTollPayment.setBackground(Color.LIGHT_GRAY);
		lblTollPayment.setForeground(Color.BLUE);
		lblTollPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblTollPayment.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTollPayment.setBounds(194, 11, 438, 62);
		contentPane.add(lblTollPayment);
		
		JPanel panel = new JPanel();
		panel.setBounds(204, 94, 387, 45);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("creditcard1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		txtYousufBilal = new JTextField();
		txtYousufBilal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtYousufBilal.setHorizontalAlignment(SwingConstants.CENTER);
		txtYousufBilal.setText("123456789");
		panel.add(txtYousufBilal);
		txtYousufBilal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(204, 152, 387, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblAmountDue = new JLabel("creditcard2");
		lblAmountDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountDue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblAmountDue);
		
		txtUniversitySt = new JTextField();
		txtUniversitySt.setText("123456789");
		txtUniversitySt.setHorizontalAlignment(SwingConstants.CENTER);
		txtUniversitySt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUniversitySt.setColumns(10);
		panel_1.add(txtUniversitySt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(204, 210, 387, 45);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblDueDate = new JLabel("creditcard3");
		lblDueDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblDueDate);
		
		txtSomeonesomeonecom = new JTextField();
		txtSomeonesomeonecom.setText("123456789");
		txtSomeonesomeonecom.setHorizontalAlignment(SwingConstants.CENTER);
		txtSomeonesomeonecom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSomeonesomeonecom.setColumns(10);
		panel_2.add(txtSomeonesomeonecom);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(204, 268, 387, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblDriversLicense = new JLabel("creditcard4");
		lblDriversLicense.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriversLicense.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblDriversLicense);
		
		txtLar = new JTextField();
		txtLar.setText("123456789");
		txtLar.setHorizontalAlignment(SwingConstants.CENTER);
		txtLar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLar.setColumns(10);
		panel_3.add(txtLar);
		
		JButton btnNewButton = new JButton("update");
		btnNewButton.setBounds(330, 344, 156, 38);
		contentPane.add(btnNewButton);
		
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
