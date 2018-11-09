package Common;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JTextField;

public class ParkingArea extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingArea frame = new ParkingArea();
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
	public ParkingArea() {
		ArrayList<String> k = new ArrayList<String>();
		String select = "SELECT slot FROM Booking;";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
		    Statement st = con.createStatement();
		    Statement st1 = con.createStatement();
		    ResultSet rs = st.executeQuery(select);
		    ResultSet rs1 = st1.executeQuery(select);
		    while(rs1.next()) {
				 k.add(rs1.getString("slot"));
				  }
		    }catch(Exception e) {
				System.out.println(e);
			}
		k.add("5");
		for(String obj:k) {
			System.out.println(obj);
		}		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,20, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblNewLabel_8 = new JLabel("G1");
		
		JLabel lblNewLabel_9 = new JLabel("G2");
		
		JLabel lblNewLabel_10 = new JLabel("G3");
		
		JLabel lblNewLabel_11 = new JLabel("G4");
		
		JLabel lblNewLabel_12 = new JLabel("G5");
		
		JLabel lblNewLabel_13 = new JLabel("G6");
		
		JLabel lblNewLabel_14 = new JLabel("G7");
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel_24 = new JLabel("G9");
		
		JLabel lblNewLabel_25 = new JLabel("G10");
		
		JLabel lblG = new JLabel("G11");
		
		JLabel lblG_1 = new JLabel("G12");
		
		JLabel lblG_2 = new JLabel("G13");
		
		JLabel lblG_3 = new JLabel("G14");
		
		JLabel lblG_4 = new JLabel("G15");
		
		JLabel lblG_5 = new JLabel("G16");
		
		JLabel lblG_6 = new JLabel("G8");
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblG_7 = new JLabel("G17");
		
		JLabel lblG_8 = new JLabel("G18");
		
		JLabel lblG_9 = new JLabel("G19");
		
		JLabel lblG_10 = new JLabel("G20");
		
		JLabel lblG_11 = new JLabel("G21");
		
		JLabel lblG_12 = new JLabel("G22");
		
		JLabel lblG_13 = new JLabel("G23");
		
		JLabel lblG_14 = new JLabel("G24");
		
		JLabel lblG_15 = new JLabel("G25");
		
		JLabel lblG_16 = new JLabel("G26");
		
		JLabel lblNewLabel_15 = new JLabel("G27");
		
		JLabel lblG_17 = new JLabel("G28");
		
		JLabel lblG_18 = new JLabel("G29");
		
		JLabel lblG_19 = new JLabel("G30");
		
		JLabel lblG_20 = new JLabel("G31");
		
		JLabel lblG_21 = new JLabel("G32");
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JLabel lblG_22 = new JLabel("G33");
		
		JLabel lblG_23 = new JLabel("G34");
		
		JLabel lblG_24 = new JLabel("G35");
		
		JLabel lblG_25 = new JLabel("G36");
		
		JLabel lblG_26 = new JLabel("G37");
		
		JLabel lblG_27 = new JLabel("G38");
		
		JLabel lblG_28 = new JLabel("G39");
		
		JLabel lblG_29 = new JLabel("G40");
		
		JLabel lblG_30 = new JLabel("G41");
		
		JLabel lblG_31 = new JLabel("G42");
		
		JLabel lblG_32 = new JLabel("G43");
		
		JLabel lblG_33 = new JLabel("G44");
		
		JLabel lblG_34 = new JLabel("G45");
		
		JLabel lblG_35 = new JLabel("G46");
		
		JLabel lblG_36 = new JLabel("G47");
		
		JLabel lblG_37 = new JLabel("G48");
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		
		JLabel lblNewLabel_53 = new JLabel("G50");
		
		JLabel lblNewLabel_67 = new JLabel("G49");
		
		JLabel lblG_38 = new JLabel("G51");
		
		JLabel lblG_39 = new JLabel("G52");
		
		JLabel lblG_40 = new JLabel("G53");
		
		JLabel lblG_41 = new JLabel("G54");
		
		JLabel lblG_42 = new JLabel("G55");
		
		JLabel lblG_43 = new JLabel("G56");
		
		JLabel lblG_44 = new JLabel("G57");
		
		JLabel lblG_45 = new JLabel("G58");
		
		JLabel lblG_46 = new JLabel("G59");
		
		JLabel lblG_47 = new JLabel("G60");
		
		JLabel lblG_48 = new JLabel("G61");
		
		JLabel lblG_49 = new JLabel("G62");
		
		JLabel lblG_50 = new JLabel("G63");
		
		JLabel lblGl = new JLabel("G64");
		
		JPanel panel_7 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_8)
										.addComponent(lblNewLabel_24))
									.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_25)
										.addComponent(lblNewLabel_9))
									.addGap(35)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_10)
										.addComponent(lblG))
									.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_1)
										.addComponent(lblNewLabel_11))
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_2)
										.addComponent(lblNewLabel_12))
									.addGap(37)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_3)
										.addComponent(lblNewLabel_13))
									.addGap(31)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_4)
										.addComponent(lblNewLabel_14))
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_5)
										.addComponent(lblG_6))
									.addGap(36))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(25)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_15)
										.addComponent(lblG_7))
									.addGap(32)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_16)
										.addComponent(lblG_8))
									.addGap(43)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_9)
										.addComponent(lblNewLabel_15))
									.addGap(32)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_10)
										.addComponent(lblG_17))
									.addGap(35)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_11)
										.addComponent(lblG_18))
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_12)
										.addComponent(lblG_19))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_13)
										.addComponent(lblG_20))
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_14)
										.addComponent(lblG_21))
									.addGap(42))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_22)
										.addComponent(lblG_30))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_31)
										.addComponent(lblG_23))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_32)
										.addComponent(lblG_24))
									.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_25)
										.addComponent(lblG_33))
									.addGap(35)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_26)
										.addComponent(lblG_34))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_27)
										.addComponent(lblG_35))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblG_28)
										.addComponent(lblG_36))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblG_37)
										.addComponent(lblG_29))
									.addGap(34))
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addComponent(panel_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblG_44)
								.addComponent(lblNewLabel_67))
							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_53, Alignment.TRAILING)
								.addComponent(lblG_45, Alignment.TRAILING))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblG_38, Alignment.TRAILING)
								.addComponent(lblG_46, Alignment.TRAILING))
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblG_39, Alignment.TRAILING)
								.addComponent(lblG_47, Alignment.TRAILING))
							.addGap(35)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblG_40, Alignment.TRAILING)
								.addComponent(lblG_48, Alignment.TRAILING))
							.addGap(35)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblG_41, Alignment.TRAILING)
								.addComponent(lblG_49, Alignment.TRAILING))
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblG_42, Alignment.TRAILING)
								.addComponent(lblG_50, Alignment.TRAILING))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGl)
								.addComponent(lblG_43))
							.addGap(29))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(lblNewLabel_8)
						.addComponent(lblG_6)
						.addComponent(lblNewLabel_14)
						.addComponent(lblNewLabel_13)
						.addComponent(lblNewLabel_12)
						.addComponent(lblNewLabel_11)
						.addComponent(lblNewLabel_9))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblG_4)
						.addComponent(lblG_3)
						.addComponent(lblG_2)
						.addComponent(lblG_1)
						.addComponent(lblG)
						.addComponent(lblNewLabel_25)
						.addComponent(lblNewLabel_24)
						.addComponent(lblG_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblG_7)
						.addComponent(lblG_11)
						.addComponent(lblG_10)
						.addComponent(lblG_9)
						.addComponent(lblG_8)
						.addComponent(lblG_14)
						.addComponent(lblG_13)
						.addComponent(lblG_12))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblG_15)
						.addComponent(lblG_16)
						.addComponent(lblG_18)
						.addComponent(lblG_17)
						.addComponent(lblNewLabel_15)
						.addComponent(lblG_21)
						.addComponent(lblG_20)
						.addComponent(lblG_19))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblG_22)
						.addComponent(lblG_28)
						.addComponent(lblG_27)
						.addComponent(lblG_26)
						.addComponent(lblG_25)
						.addComponent(lblG_24)
						.addComponent(lblG_23)
						.addComponent(lblG_29))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblG_30)
						.addComponent(lblG_36)
						.addComponent(lblG_35)
						.addComponent(lblG_34)
						.addComponent(lblG_33)
						.addComponent(lblG_32)
						.addComponent(lblG_31, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblG_37))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblG_42)
							.addComponent(lblG_43))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblG_40)
							.addComponent(lblG_41)
							.addComponent(lblG_39)
							.addComponent(lblG_38)
							.addComponent(lblNewLabel_53)
							.addComponent(lblNewLabel_67)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblG_50)
							.addComponent(lblGl))
						.addComponent(lblG_49)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblG_48)
							.addComponent(lblG_47))
						.addComponent(lblG_46)
						.addComponent(lblG_45)
						.addComponent(lblG_44))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_74= new JLabel("");
		if(!k.contains("74")) {
		lblNewLabel_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_74.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
//				NewThread nt = new NewThread();
//				try {
//					nt.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				nt.start();
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(74);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
			lblNewLabel_74.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_74.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
      	panel_7.add(lblNewLabel_74);
		
		
		JLabel lblNewLabel_75= new JLabel("");
		if(!k.contains("75")) {
		lblNewLabel_75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_75.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(75);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_75.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_75.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_75);
		
		JLabel lblNewLabel_68= new JLabel("");
		if(!k.contains("68")) {
		lblNewLabel_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_68.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(68);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_68.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_68.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_68);
		
		JLabel lblNewLabel_69= new JLabel("");
		if(!k.contains("69")) {
		lblNewLabel_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_69.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(69);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_69.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_69.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_69);
		
		JLabel lblNewLabel_70= new JLabel("");
		if(!k.contains("70")) {
		lblNewLabel_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_70.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(70);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_70.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_70.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_70);
		
		JLabel lblNewLabel_71= new JLabel("");
		if(!k.contains("71")) {
		lblNewLabel_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_71.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(71);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_71.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_71.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_71);
		
		
		JLabel lblNewLabel_72= new JLabel("");
		if(!k.contains("72")) {
		lblNewLabel_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_72.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(72);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_72.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_72.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_72);
		
		
		JLabel lblNewLabel_73= new JLabel("");
		if(!k.contains("73")) {
		lblNewLabel_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_73.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(73);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_73.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_73.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_7.add(lblNewLabel_73);
		
		JLabel lblNewLabel_59 = new JLabel("");
		if(!k.contains("59")) {
		lblNewLabel_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_59.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(59);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_59.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_59.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_59);
		
		
		JLabel lblNewLabel_66= new JLabel("");
		if(!k.contains("66")) {
		lblNewLabel_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_66.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(66);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_66.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_66.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_66);
		
		JLabel lblNewLabel_60 = new JLabel("");
		if(!k.contains("60")) {
		lblNewLabel_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_60.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(60);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_60.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_60.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_60);

		JLabel lblNewLabel_61 = new JLabel("");
		if(!k.contains("61")) {
		lblNewLabel_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_61.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(61);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_61.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_61.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel("");
		if(!k.contains("62")) {
		lblNewLabel_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_62.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(62);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_62.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_62.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_62);
		
		JLabel lblNewLabel_63= new JLabel("");
		if(!k.contains("63")) {
		lblNewLabel_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_63.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(63);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_63.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_63.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_63);
		
		JLabel lblNewLabel_64= new JLabel("");
		if(!k.contains("64")) {
		lblNewLabel_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_64.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(64);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_64.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_64.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_64);
		
		JLabel lblNewLabel_65= new JLabel("");
		if(!k.contains("65")) {
		lblNewLabel_65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_65.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(65);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_65.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_65.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_6.add(lblNewLabel_65);

		
		JLabel lblNewLabel_58 = new JLabel("");
		if(!k.contains("58")) {
		lblNewLabel_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_58.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(58);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_58.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_58.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_58);
		
		JLabel lblNewLabel_52 = new JLabel("");
		if(!k.contains("52")) {
		lblNewLabel_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_52.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(52);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_52.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_52.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_52);
		
		
		JLabel lblNewLabel_51 = new JLabel("");
		if(!k.contains("51")) {
		lblNewLabel_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_51.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(51);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_51.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_51.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_51);
		
		JLabel lblNewLabel_47 = new JLabel("");
		if(!k.contains("47")) {
		lblNewLabel_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_47.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(47);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_47.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_47.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_47);
		
		
		JLabel lblNewLabel_57 = new JLabel("");
		if(!k.contains("57")) {
		lblNewLabel_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_57.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(57);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_57.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_57.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_57);
		
		JLabel lblNewLabel_56 = new JLabel("");
		if(!k.contains("56")) {
		lblNewLabel_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_56.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(56);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_56.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_56.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_56);
		
		JLabel lblNewLabel_55 = new JLabel("");
		if(!k.contains("55")) {
		lblNewLabel_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_55.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(55);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_55.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_55.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_55);
		
		JLabel lblNewLabel_54= new JLabel("");
		if(!k.contains("54")) {
		lblNewLabel_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_54.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(54);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_54.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/blackbike.png")));
		}else {
			lblNewLabel_54.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/bluebike.png")));
		}
		panel_5.add(lblNewLabel_54);
		
		
		JLabel lblNewLabel_50 = new JLabel("");
		if(!k.contains("50")) {
		lblNewLabel_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_50.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(50);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_50.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_50.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_50);
		
		JLabel lblNewLabel_49 = new JLabel("");
		if(!k.contains("49")) {
		lblNewLabel_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_49.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(49);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_49.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_49.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_49);
		
		JLabel lblNewLabel_48 = new JLabel("");
		if(!k.contains("48")) {
		lblNewLabel_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_48.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(48);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_48.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_48.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_48);
		
		JLabel lblNewLabel_46 = new JLabel("");
		if(!k.contains("46")) {
		lblNewLabel_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_46.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(46);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_46.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_46.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_46);
		
		JLabel lblNewLabel_45 = new JLabel("");
		if(!k.contains("45")) {
		lblNewLabel_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_45.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(45);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_45.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_45.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_45);
		
		JLabel lblNewLabel_44 = new JLabel("");
		if(!k.contains("44")) {
		lblNewLabel_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_44.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(44);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_44.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_44.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_44);
		
		JLabel lblNewLabel_43 = new JLabel("");
		if(!k.contains("43")) {
		lblNewLabel_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_43.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(43);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_43.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_43.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_43);
		
		JLabel lblNewLabel_42 = new JLabel("");
		if(!k.contains("42")) {
		lblNewLabel_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_42.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(42);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_42.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_42.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_4.add(lblNewLabel_42);
		
		JLabel lblNewLabel_41 = new JLabel("");
		if(!k.contains("41")) {
		lblNewLabel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_41.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(41);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_41.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_41.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_41);
		
		JLabel lblNewLabel_40 = new JLabel("");
		if(!k.contains("40")) {
		lblNewLabel_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_40.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(40);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_40.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_40.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_40);
		
		JLabel lblNewLabel_39 = new JLabel("");
		if(!k.contains("39")) {
		lblNewLabel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_39.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(39);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_39.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_39.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_39);
		
		JLabel lblNewLabel_38 = new JLabel("");
		if(!k.contains("38")) {
		lblNewLabel_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_38.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(38);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_38.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_38.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_38);
		
		JLabel lblNewLabel_37 = new JLabel("");
		if(!k.contains("37")) {
		lblNewLabel_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_37.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(37);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_37.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_37.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_37);
		
		JLabel lblNewLabel_36= new JLabel("");
		if(!k.contains("36")) {
		lblNewLabel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_36.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(36);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_36.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_36.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_36);
		
		
		JLabel lblNewLabel_35 = new JLabel("");
		if(!k.contains("35")) {
		lblNewLabel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_35.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(35);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_35.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_35.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_35);
		
		
		JLabel lblNewLabel_34 = new JLabel("");
		if(!k.contains("34")) {
		lblNewLabel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_34.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(34);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_34.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_34.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_3.add(lblNewLabel_34);
		
		JLabel lblNewLabel_31 = new JLabel("");
		if(!k.contains("31")) {
		lblNewLabel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_31.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(31);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_31.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_31.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_31);
		
		
		JLabel lblNewLabel_32 = new JLabel("");
		if(!k.contains("32")) {
		lblNewLabel_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_32.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(32);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_32.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_32.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_32);
		
		
		JLabel lblNewLabel_33 = new JLabel("");
		if(!k.contains("33")) {
		lblNewLabel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_33.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(33);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_33.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_33.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_33);
		
		
		JLabel lblNewLabel_30 = new JLabel("");
		if(!k.contains("30")) {
		lblNewLabel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_30.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(30);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_30.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_30.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_30);
		
		JLabel lblNewLabel_29 = new JLabel("");
		if(!k.contains("29")) {
		lblNewLabel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_29.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(29);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_29.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_29.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_29);
		
		JLabel lblNewLabel_28 = new JLabel("");
		if(!k.contains("28")) {
		lblNewLabel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_28.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(28);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_28.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_28.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_28);
		
		JLabel lblNewLabel_27 = new JLabel("");
		if(!k.contains("27")) {
		lblNewLabel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_27.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(27);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_27.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_27.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_27);
		
		JLabel lblNewLabel_26 = new JLabel("");
		if(!k.contains("26")) {
		lblNewLabel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_26.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(26);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_26.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_26.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_23 = new JLabel("");
		if(!k.contains("23")) {
		lblNewLabel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_23.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(23);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_23.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_23.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_22 = new JLabel("");
		if(!k.contains("22")) {
		lblNewLabel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_22.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(22);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_22.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_22.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_21 = new JLabel("");
		if(!k.contains("21")) {
		lblNewLabel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_21.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(21);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_21.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_21.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20 = new JLabel("");
		if(!k.contains("20")) {
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_20.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(20);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_20.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_20.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_19 = new JLabel("");
		if(!k.contains("19")) {
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_19.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(19);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_19.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_19.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18 = new JLabel("");
		if(!k.contains("18")) {
		lblNewLabel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_18.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(18);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_18.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_18.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_17 = new JLabel("");
		if(!k.contains("17")) {
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_17.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(17);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_17.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
		lblNewLabel_17.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_16 = new JLabel("");
		if(!k.contains("16")) {
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_16.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));	
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(16);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_16.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_16.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_7 = new JLabel("");
		if(!k.contains("7")) {
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_7.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(7);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_7.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		if(!k.contains("6")) {
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_6.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(6);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_6.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("");
		if(!k.contains("5")) {
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_5.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(5);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_5.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		if(!k.contains("4")) {
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_4.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(4);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_4.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
        panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		if(!k.contains("3")) {
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_3.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(3);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_3.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		if(!k.contains("2")) {
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_2.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(2);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_2.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		if(!k.contains("1")) {
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(1);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_1.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_0 = new JLabel("");
		if(!k.contains("")) {
		lblNewLabel_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_0.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
				Thread frame = new Thread(() -> {
					NewBooking n = new NewBooking(0);
					n.setVisible(true);
				    dispose();
				});
				
				frame.start();
			}
		});
		lblNewLabel_0.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinblack.png")));
		}else {
			lblNewLabel_0.setIcon(new ImageIcon(ParkingArea.class.getResource("/Resource/carinred.png")));
		}
		panel.add(lblNewLabel_0);

		contentPane.setLayout(gl_contentPane);
	}
}
