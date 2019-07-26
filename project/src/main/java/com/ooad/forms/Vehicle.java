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

public class Vehicle extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField txtTol;
	private JTextField txtAudi;
	private JTextField txtA;
	private JTextField txtLar;
	private JTextField txtCreditCard;

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
	public Vehicle() {
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
		
		JLabel lblTollPayment = new JLabel("Vehicle Info");
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
		
		JLabel lblNewLabel = new JLabel("Toll number");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		txtTol = new JTextField();
		txtTol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTol.setHorizontalAlignment(SwingConstants.CENTER);
		txtTol.setEditable(false);
		txtTol.setText("tol957");
		panel.add(txtTol);
		txtTol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(204, 152, 387, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblAmountDue = new JLabel("Vehicle make");
		lblAmountDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountDue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblAmountDue);
		
		txtAudi = new JTextField();
		txtAudi.setText("AUDI");
		txtAudi.setHorizontalAlignment(SwingConstants.CENTER);
		txtAudi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAudi.setEditable(false);
		txtAudi.setColumns(10);
		panel_1.add(txtAudi);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(204, 210, 387, 45);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblDueDate = new JLabel("Vehicle model");
		lblDueDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblDueDate);
		
		txtA = new JTextField();
		txtA.setText("A6");
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setEditable(false);
		txtA.setColumns(10);
		panel_2.add(txtA);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(204, 268, 387, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblDriversLicense = new JLabel("Vehicle type");
		lblDriversLicense.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriversLicense.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblDriversLicense);
		
		txtLar = new JTextField();
		txtLar.setText("car");
		txtLar.setHorizontalAlignment(SwingConstants.CENTER);
		txtLar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLar.setEditable(false);
		txtLar.setColumns(10);
		panel_3.add(txtLar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(204, 326, 387, 45);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblPaymentMethod = new JLabel("Vehicle reg");
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentMethod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblPaymentMethod);
		
		txtCreditCard = new JTextField();
		txtCreditCard.setText("1782");
		txtCreditCard.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreditCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCreditCard.setEditable(false);
		txtCreditCard.setColumns(10);
		panel_4.add(txtCreditCard);
		
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
