package Common;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import lu.tudor.santec.jtimechooser.JTimeChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class NewBooking extends JFrame {

	private JPanel contentPane;
	private JTextField cus_nm;
	private JTextField rd_num;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField id;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private static int slot;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBooking frame = new NewBooking(slot);
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
	public NewBooking(int slot) {
		this.slot = slot;
		System.out.println(slot);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New Booking", null, panel, null);
		
		JLabel label = new JLabel("Customer Name");
		
		JLabel label_1 = new JLabel(":");
		
		cus_nm = new JTextField();
		cus_nm.setColumns(10);
		
		JLabel lblRegNumber = new JLabel("Reg Number");
		
		JLabel label_3 = new JLabel(":");
		
		rd_num = new JTextField();
		rd_num.setColumns(10);
		
		JLabel lblCheckIn = new JLabel("Check In");
		
		JLabel label_4 = new JLabel(":");
		
		JLabel lblCategory = new JLabel("Parked On");
		
		JLabel label_5 = new JLabel(":");
		
		JLabel lblParkedOn = new JLabel("Category");
		
		JLabel label_6 = new JLabel(":");
		
		JLabel lblInsurance = new JLabel("Insurance");
		
		JLabel label_7 = new JLabel(":");
		
		JTimeChooser timeChooser = new JTimeChooser();
		
		JDateChooser dateChooser = new JDateChooser();
		
		JRadioButton rdbtnBike = new JRadioButton("Bike");
		buttonGroup.add(rdbtnBike);
		
		JRadioButton rdbtnCar = new JRadioButton("Car");
		buttonGroup.add(rdbtnCar);
		
		JToggleButton tglbtnYes = new JToggleButton("Yes");
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c = cus_nm.getText().toString();
				String r = rd_num.getText().toString();
				String d = dateChooser.getDate().toString();
				String time = timeChooser.getFormatedTime().toString();
				String rd ;
				if(rdbtnBike.isSelected()) {
					rd = "Bike";
				}else {
					rd = "Car";
				}String tg;
				if(tglbtnYes.isSelected()) {
					tg = "Yes";
				}else {
					tg = "No";
				}
				if(c.isEmpty() || r.isEmpty() || d.isEmpty() || time.isEmpty() || rd .isEmpty()) {
					
				}else {
				NewBookingData nd = new NewBookingData();
				nd.insert(c, r,d,rd,tg,time,slot);
				JOptionPane.showMessageDialog(null,"Booking Confirmed");
				}
			}
		});
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Staff");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cus_nm.setText("Staff");
				rd_num.setText("Staff");
			    tglbtnYes.enable(false);
			}
		});
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmClearall = new JMenuItem("ClearAll");
		mntmClearall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    rd_num.setText("");
				cus_nm.setText("");
			}
		});
		popupMenu.add(mntmClearall);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("CancelBooking");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		popupMenu.add(mntmNewMenuItem_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(66)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRegNumber, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCheckIn)
						.addComponent(lblCategory)
						.addComponent(lblParkedOn)
						.addComponent(lblInsurance))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tglbtnYes, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnBike)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnCar))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(timeChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cus_nm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rd_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(306, Short.MAX_VALUE)
					.addComponent(btnBook)
					.addGap(30))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_1)
						.addComponent(cus_nm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRegNumber)
						.addComponent(label_3)
						.addComponent(rd_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCheckIn)
							.addComponent(label_4))
						.addComponent(timeChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCategory)
							.addComponent(label_5))
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblParkedOn)
						.addComponent(label_6)
						.addComponent(rdbtnBike)
						.addComponent(rdbtnCar))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInsurance)
						.addComponent(label_7)
						.addComponent(tglbtnYes))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBook)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Membership", null, panel_1, null);
		
		JLabel lblId = new JLabel("ID");
		
		JLabel lblCheckIn_1 = new JLabel("Check In");
		
		JLabel lblParkedOn_1 = new JLabel("Category");
		
		JLabel label_8 = new JLabel(":");
		
		JLabel label_9 = new JLabel(":");
		
		JLabel label_10 = new JLabel(":");
		
		id = new JTextField();
		id.setColumns(10);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		
		JRadioButton rdbtnBike_1 = new JRadioButton("Bike");
		buttonGroup_1.add(rdbtnBike_1);
		
		JRadioButton rdbtnCar_1 = new JRadioButton("Car");
		buttonGroup_1.add(rdbtnCar_1);
		
		JLabel lblParkedOn_2 = new JLabel("Parked On");
		
		JTimeChooser timeChooser_1 = new JTimeChooser();
		
		JButton btnBook_1 = new JButton("BOOK");
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c = id.getText().toString();
			    String dt = dateChooser_1.getDate().toString();
			    String rb ;
			    String time = timeChooser_1.getFormatedTime().toString();
			    if(rdbtnBike_1.isSelected()) {
			    	rb = "Bike";
			    }else {
			    	rb = "Car";
			    }
                if(c.isEmpty() || dt.isEmpty()) {
                	
                }else {
                	NewBookingData d = new NewBookingData();
                	d.member(c,dt,rb,time,slot);
                	JOptionPane.showMessageDialog(null,"Booking Confirmed");
                }
			}
		});
		
		JLabel label_11 = new JLabel(":");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(111)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblId)
							.addGap(48))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblParkedOn_1)
								.addComponent(lblCheckIn_1))
							.addGap(9))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblParkedOn_2)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnBook_1)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(label_10)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(timeChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(rdbtnBike_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnCar_1))
								.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(label_10)
						.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(timeChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_9)
							.addComponent(lblCheckIn_1)))
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(rdbtnBike_1)
						.addComponent(rdbtnCar_1)
						.addComponent(lblParkedOn_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_11)
							.addComponent(lblParkedOn_2)))
					.addGap(43)
					.addComponent(btnBook_1)
					.addGap(52))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
