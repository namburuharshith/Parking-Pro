package Common;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FareDetails extends JFrame {

	private JPanel contentPane;
    public HashMap<String,Integer> a= new HashMap<String,Integer>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FareDetails frame = new FareDetails();
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
	public FareDetails() {
		setTitle("FARE DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		a.put("NormalBike",30);
		a.put("NormalCar", 50);
		a.put("MemberBike", 20);
		a.put("MemberCar", 35);
		a.put("Insurance", 5);
		JLabel lblNormal = new JLabel("Normal");
		
		JLabel lblBike = new JLabel("Bike");
		
		JLabel label = new JLabel(":");
		
		JLabel label_1 = new JLabel("-");
		
		JLabel nb = new JLabel("New label");
		
		JLabel lblCar = new JLabel("Car");
		
		JLabel label_2 = new JLabel("-");
		
		JLabel nc = new JLabel("New label");
		
		JLabel lblMembership = new JLabel("MemberShip");
		
		JLabel label_3 = new JLabel(":");
		
		JLabel lblBike_1 = new JLabel("Bike");
		
		JLabel label_4 = new JLabel("-");
		
		JLabel mb = new JLabel("New label");
		
		JLabel lblCar_1 = new JLabel("Car");
		
		JLabel label_5 = new JLabel("-");
		
		JLabel mc = new JLabel("New label");
		
		JLabel lblInsurance = new JLabel("Insurance");
		
		JLabel label_6 = new JLabel("-");
		
		JLabel ins = new JLabel("New label");
		
		nb.setText(a.get("NormalBike").toString());
		nc.setText(a.get("NormalCar").toString());
		mb.setText(a.get("MemberBike").toString());
		mc.setText(a.get("MemberCar").toString());
		ins.setText(a.get("Insurance").toString());
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblInsurance)
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblBike)
										.addComponent(lblCar)
										.addComponent(lblBike_1)
										.addComponent(lblCar_1))
									.addGap(41)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label_1)
										.addComponent(label_2)
										.addComponent(label_4)
										.addComponent(label_5)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(73)
									.addComponent(label_6)))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(ins)
								.addComponent(mc)
								.addComponent(mb)
								.addComponent(nc)
								.addComponent(nb)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMembership)
							.addGap(18)
							.addComponent(label_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNormal)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label)))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNormal)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBike)
						.addComponent(label_1)
						.addComponent(nb))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCar)
						.addComponent(label_2)
						.addComponent(nc))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMembership)
						.addComponent(label_3))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBike_1)
						.addComponent(label_4)
						.addComponent(mb))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCar_1)
						.addComponent(label_5)
						.addComponent(mc))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(ins)
						.addComponent(lblInsurance))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
