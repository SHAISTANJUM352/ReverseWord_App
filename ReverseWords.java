import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseWords extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWords frame = new ReverseWords();
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
	public ReverseWords() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REVERSE  WORDS OF SENTENCE");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(68, 25, 323, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER A SENTENCE");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1.setBounds(131, 84, 260, 24);
		contentPane.add(lblNewLabel_1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBackground(new Color(211, 211, 211));
		ta1.setForeground(new Color(0, 0, 0));
		ta1.setFont(new Font("Cambria", Font.BOLD, 20));
		ta1.setBounds(104, 119, 287, 33);
		contentPane.add(ta1);
		
		JLabel lblNewLabel_1_1 = new JLabel("REVERSED SENTENCE");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(131, 249, 271, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBackground(new Color(211, 211, 211));
		ta2.setForeground(new Color(0, 0, 0));
		ta2.setFont(new Font("Cambria", Font.BOLD, 20));
		ta2.setBounds(104, 284, 290, 33);
		contentPane.add(ta2);
		
		JButton btnNewButton = new JButton("CLICK HERE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to reverse the words
				String data=ta1.getText();
				String[] words=data.split(" ");
				String revStr="";
				for(int i=0; i<words.length; i++) {
					String word=words[i];
					String revWord="";
					for(int j=word.length()-1;j>=0;j--) {
						revWord=revWord+word.charAt(j);
					}
					revStr=revStr + revWord + " ";
				}				
				ta2.setText(revStr);
			}
		});
		btnNewButton.setForeground(new Color(178, 34, 34));
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 20));
		btnNewButton.setBounds(104, 185, 287, 33);
		contentPane.add(btnNewButton);
	}

}
