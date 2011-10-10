package evalBow.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTable;

public class ShowList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowList frame = new ShowList();
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
	public ShowList() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		String[] titles = new String[]{ "A", "B", "C", "D" };
		final DefaultTableModel model = new DefaultTableModel( titles, 0 );
		String[] rowData = new String[]{"bla", "blubb", "foo", "bar"};
		model.addRow(rowData);
		
		table = new JTable(model);
		contentPane.add(table, BorderLayout.CENTER);
		
		fillList();
	}
	
	private void fillList() {
		
	}

}
