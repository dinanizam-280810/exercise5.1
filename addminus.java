package chap7; 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class addminus {

	private JFrame frame;
	private JTextField textFieldadd;
	private JTextField textFieldminus;
	private JTextField textFieldanswer;
	private JButton buttonadd;
	private JButton buttonminus;
	private JLabel answerlabel;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addminus window = new addminus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public addminus() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldadd = new JTextField();
		textFieldadd.setForeground(new Color(148, 0, 211));
		textFieldadd.setBackground(Color.LIGHT_GRAY);
		textFieldadd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldadd.setBounds(51, 29, 103, 44);
		frame.getContentPane().add(textFieldadd);
		textFieldadd.setColumns(10);
		
		textFieldminus = new JTextField();
		textFieldminus.setForeground(new Color(153, 50, 204));
		textFieldminus.setBackground(Color.LIGHT_GRAY);
		textFieldminus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldminus.setBounds(252, 29, 103, 44);
		frame.getContentPane().add(textFieldminus);
		textFieldminus.setColumns(10);
		
		
		buttonadd.setForeground(Color.ORANGE);
		buttonadd.setBackground(Color.CYAN);
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldadd.getText());
					num2 = Integer.parseInt(textFieldminus.getText());
					ans = num1 + num2;
					textFieldanswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input! Please enter number only.");
				}
			}
			}
			
		);
		buttonadd.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonadd.setBounds(58, 110, 96, 46);
		frame.getContentPane().add(buttonadd);
		
		
		buttonminus.setForeground(Color.ORANGE);
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldadd.getText());
					num2 = Integer.parseInt(textFieldminus.getText());
					ans = num1 - num2;
					textFieldanswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input! Please enter number only.");
				}
			}
			
		});
		buttonminus.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonminus.setBounds(252, 110, 123, 46);
		frame.getContentPane().add(buttonminus);
		
		textFieldanswer = new JTextField();
		textFieldanswer.setBounds(198, 189, 96, 44);
		frame.getContentPane().add(textFieldanswer);
		textFieldanswer.setColumns(10);
		
		
		answerlabel.setForeground(new Color(139, 0, 0));
		answerlabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		answerlabel.setBounds(53, 189, 134, 44);
		frame.getContentPane().add(answerlabel);
	}
}
