package Common;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Bill extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill("Name","Registeration number","In Time","Out Time","Fare");
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
	public Bill(String n,String reg,String in,String out,String f) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("            SURAKSHA PARKING");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		
		JLabel label = new JLabel(":");
		
		JLabel name = new JLabel("New label");
		
		JLabel lblRideNumber = new JLabel("Ride Number");
		
		JLabel label_1 = new JLabel(":");
		
		JLabel reg_num = new JLabel("New label");
		
		JLabel lblCheckIn = new JLabel("Check In");
		
		JLabel label_2 = new JLabel(":");
		
		JLabel In = new JLabel("New label");
		
		JLabel lblCheckOut = new JLabel("Check Out");
		
		JLabel label_3 = new JLabel(":");
		
		JLabel Out = new JLabel("New label");
		
		JLabel lblFare = new JLabel("Fare");
		
		JLabel label_4 = new JLabel(":");
		
		JLabel fare = new JLabel("New label");
		
		JButton btnCancel = new JButton("Cancel");
		
		JButton btnPrint = new JButton("Print");
		
		name.setText(n);
		reg_num.setText(reg);
		In.setText(in);
		Out.setText(out);
		fare.setText(f);
		
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String select = "DELETE FROM Booking WHERE name='"+n+"';";
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
				    Statement st = con.createStatement();
				    int count = st.executeUpdate(select);
			  Home h = new Home();
			  h.setVisible(true);
			  dispose();
				}catch(Exception e) {
					
				}
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home h = new Home();
				h.setVisible(true);
			    dispose();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCustomerName)
								.addComponent(lblRideNumber)
								.addComponent(lblCheckIn)
								.addComponent(lblCheckOut)
								.addComponent(lblFare))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4)
									.addGap(18)
									.addComponent(fare))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_3)
									.addGap(18)
									.addComponent(Out))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_2)
									.addGap(18)
									.addComponent(In))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label)
									.addGap(18)
									.addComponent(name))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_1)
									.addGap(18)
									.addComponent(reg_num)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(257, Short.MAX_VALUE)
					.addComponent(btnPrint)
					.addGap(18)
					.addComponent(btnCancel)
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomerName)
						.addComponent(label)
						.addComponent(name))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRideNumber)
						.addComponent(label_1)
						.addComponent(reg_num))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCheckIn)
						.addComponent(label_2)
						.addComponent(In))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCheckOut)
						.addComponent(label_3)
						.addComponent(Out))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFare)
						.addComponent(label_4)
						.addComponent(fare))
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPrint)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
