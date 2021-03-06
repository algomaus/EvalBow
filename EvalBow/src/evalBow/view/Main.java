package evalBow.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;

import evalBow.control.Controller;
import evalBow.model.Category;
import evalBow.model.StartNumber;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public static Controller controller = new Controller();
	private JButton btnShowlist;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSchtzeHinzufgen = new JButton("Schütze hinzufügen");
		btnSchtzeHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addArcher();
			}
		});
		btnSchtzeHinzufgen.setBounds(356, 40, 175, 25);
		frame.getContentPane().add(btnSchtzeHinzufgen);
		textField = new JTextField();
		textField.setBounds(47, 43, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(47, 23, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblVerein = new JLabel("Vere‌in");
		lblVerein.setBounds(47, 86, 70, 15);
		frame.getContentPane().add(lblVerein);
		
		textField_1 = new JTextField();
		textField_1.setBounds(47, 100, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnShowlist = new JButton("ShowList");
		btnShowlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowList.main(null);
			}
		});
		btnShowlist.setBounds(295, 121, 117, 25);
		frame.getContentPane().add(btnShowlist);
	}
	
	private void addArcher() {
		String name = textField.getText();
		String club = textField_1.getText();
		Category category = new Category("Test");
		StartNumber startNumber = new StartNumber();
		if (controller.addArcher(name, club, category, startNumber)) {
			System.out.println("Success");
		};
	}
}
