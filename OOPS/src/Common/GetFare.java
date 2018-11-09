package Common;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.util.Locale;
import java.util.Timer;
import lu.tudor.santec.jtimechooser.JTimeChooser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.time.format.DateTimeFormatter;

public class GetFare extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
    private JTimeChooser timeChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetFare frame = new GetFare();
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
	public GetFare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEnterSlotNumber = new JLabel("Enter Slot Number ");
		
		JLabel label = new JLabel(":");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCheckOut = new JLabel("Check Out Time");
		
		JLabel label_1 = new JLabel(":");
		
		 timeChooser = new JTimeChooser();
		
		JButton btnNewButton = new JButton("FARE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String time = timeChooser.getFormatedTime().toString();
				try {
					sub();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(292, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(73))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCheckOut)
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterSlotNumber)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(timeChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(73)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterSlotNumber)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(lblCheckOut))
							.addGap(23)
							.addComponent(btnNewButton))
						.addComponent(timeChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void sub() throws ParseException {
		String slot = textField.getText();
		String time = timeChooser.getFormatedTime();
		String n = "";
		String reg = "";
		String in = "";
		Integer fr;
		int cost = 0,ins = 0;
		long diff;
		String mem = "";
		String rd = "";
		String insur = "";
		String select = "SELECT name,reg,time,membership,ride,insurance FROM Booking WHERE slot ='"+slot+"';";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(select);
			if(rs.next()) {
			   n = rs.getString("name");	
			   reg = rs.getString("reg");
			   in = rs.getString("time");
			   mem = rs.getString("membership");
			   rd = rs.getString("ride");
			   insur = rs.getString("insurance");
			   System.out.println(n+"    "+reg+"  "+in);
			}
		    }catch(Exception e) {
				System.out.println(e);
			}
		FareDetails fd = new FareDetails();
		if(rd.equals("Bike") && mem.equals("NO")) {
			cost = fd.a.get("NormalBike");
		}else if(rd.equals("Car") && mem.equals("NO")) {
			cost = fd.a.get("NormalCar");
		}else if(rd.equals("Bike") && mem.equals("YES")) {
			cost = fd.a.get("MemberBike");
		}else if(rd.equals("Car") && mem.equals("YES")) {
			cost = fd.a.get("MemberCar");
		}
		if(insur == "Yes") {
		ins = fd.a.get("Insurance");
		}
		 String time1 = in;
		 String time2 = time;
		 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		 Date date1 = (Date) format.parse(time1);
		 Date date2 = (Date) format.parse(time2);
		 long difference = date2.getTime() - date1.getTime();
		 diff= difference/(1000*60*60);
		 if(diff == 0) {
		 fr = (int) (cost+ins);
		 }else {
			 fr = (int) (diff*(cost+ins));
		 }
		Bill f = new Bill(n,reg,in,time,fr.toString());
		dispose();
		f.setVisible(true);
	}
}
