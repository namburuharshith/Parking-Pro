package Common;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmViewDetails = new JMenuItem("SignOut");
		mntmViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sinup si = new Sinup();
				si.setVisible(true);
				dispose();
			}
		});
		mnFile.add(mntmViewDetails);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmFareDetails = new JMenuItem("Fare Details");
		mntmFareDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FareDetails fd = new FareDetails();
				fd.setVisible(true);
				dispose();
			}
		});
		mnOptions.add(mntmFareDetails);
		
		JMenuItem mntmViewCars = new JMenuItem("Customer On Desk");
		mntmViewCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Details d = new Details();
				d.setVisible(true);
			}
		});
		mnOptions.add(mntmViewCars);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHowToUse = new JMenuItem("How To Use");
		mnHelp.add(mntmHowToUse);
		
		JMenuItem mntmAvaliability = new JMenuItem("About");
		mnHelp.add(mntmAvaliability);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewBooking = new JButton("New Booking");
		btnNewBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ParkingArea p = new ParkingArea();
				p.setVisible(true);
				dispose();
			}
		});
		
		JButton btnGetFare = new JButton("Get Fare");
		btnGetFare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GetFare p = new GetFare();
				p.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton = new JButton("Avaliability");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ParkingArea p = new ParkingArea();
				p.setVisible(true);
				dispose();				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(163)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(btnGetFare, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(btnNewBooking, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addGap(168))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(73)
					.addComponent(btnNewBooking)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnGetFare)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
