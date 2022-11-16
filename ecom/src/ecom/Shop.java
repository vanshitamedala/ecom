package ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Shop {
	
	int i=0;
	int t=0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop window = new Shop();
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
	public Shop() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Documents\\559\\b1.JPG"));
		lblNewLabel.setBounds(38, 42, 175, 245);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Documents\\559\\b3.JPG"));
		lblNewLabel_1.setBounds(279, 42, 160, 245);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Documents\\559\\b2.JPG"));
		lblNewLabel_2.setBounds(482, 42, 160, 245);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel cart = new JLabel("Cart : 0");
		cart.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cart.setBounds(502, 7, 73, 32);
		frame.getContentPane().add(cart);
		
		JLabel p1 = new JLabel("Price : 500");
		p1.setBounds(85, 298, 73, 14);
		frame.getContentPane().add(p1);
		
		JLabel total = new JLabel("Total: 0");
		total.setFont(new Font("Tahoma", Font.BOLD, 14));
		total.setBounds(240, 17, 129, 14);
		frame.getContentPane().add(total);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"paperback", "pdf", "kindle version"}));
		c1.setBounds(69, 318, 89, 22);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				i++;
				cart.setText("Cart : "+i);
				t=t+500;
				total.setText("Total: "+t);
				String cv=(String) c1.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton,"selected: "+cv);
			}
		});

		JLabel p2 = new JLabel("Price : 400");
		p2.setBounds(331, 298, 70, 14);
		frame.getContentPane().add(p2);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"paperback", "pdf", "kindle version"}));
		c2.setBounds(312, 323, 106, 22);
		frame.getContentPane().add(c2);
		btnNewButton.setBounds(69, 351, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				cart.setText("Cart : "+i);
				t=t+400;
				total.setText("Total: "+t);
				String cv=(String) c2.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton_1,"selected: "+cv);
				
			}
		});

		
		JLabel p3 = new JLabel("Price : 450");
		p3.setBounds(542, 298, 68, 14);
		frame.getContentPane().add(p3);
		
		btnNewButton_1.setBounds(312, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"paperback", "pdf", "kindle version"}));
		c3.setBounds(520, 318, 90, 22);
		frame.getContentPane().add(c3);
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				cart.setText("Cart : "+i);
				t=t+450;
				total.setText("Total: "+t);
				String cv=(String) c3.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton_2,"selected: "+cv);
			}
		});
		btnNewButton_2.setBounds(521, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
