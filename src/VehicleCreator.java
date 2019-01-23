import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VehicleCreator {

	private JFrame frame;
	private JTextField txt_classname;
	private JTextField txt_vitem;
	private JTextField txt_vfuel;
	private JTextField txt_price;
	private JTextField txt_conditions;
	private JTextField txt_texture_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehicleCreator window = new VehicleCreator();
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
	public VehicleCreator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClassName = new JLabel("classname:");
		lblClassName.setBounds(10, 11, 77, 20);
		frame.getContentPane().add(lblClassName);
		
		txt_classname = new JTextField();
		txt_classname.setBounds(89, 11, 86, 20);
		frame.getContentPane().add(txt_classname);
		txt_classname.setColumns(10);
		
		JLabel lblKofferraumgre = new JLabel("Kofferraum gr\u00F6\u00DFe");
		lblKofferraumgre.setBounds(10, 45, 113, 20);
		frame.getContentPane().add(lblKofferraumgre);
		
		txt_vitem = new JTextField();
		txt_vitem.setBounds(133, 45, 86, 20);
		frame.getContentPane().add(txt_vitem);
		txt_vitem.setColumns(10);
		
		JLabel lblTanklasterGre = new JLabel("Tanklaster gr\u00F6\u00DFe");
		lblTanklasterGre.setBounds(10, 76, 86, 14);
		frame.getContentPane().add(lblTanklasterGre);
		
		txt_vfuel = new JTextField();
		txt_vfuel.setColumns(10);
		txt_vfuel.setBounds(133, 76, 86, 20);
		frame.getContentPane().add(txt_vfuel);
		
		JLabel lblPreis = new JLabel("Preis");
		lblPreis.setBounds(10, 101, 46, 14);
		frame.getContentPane().add(lblPreis);
		
		txt_price = new JTextField();
		txt_price.setBounds(89, 107, 86, 20);
		frame.getContentPane().add(txt_price);
		txt_price.setColumns(10);
		
		txt_conditions = new JTextField();
		txt_conditions.setBounds(89, 150, 86, 20);
		frame.getContentPane().add(txt_conditions);
		txt_conditions.setColumns(10);
		
		JLabel lblBedingung = new JLabel("Bedingung");
		lblBedingung.setBounds(10, 153, 69, 14);
		frame.getContentPane().add(lblBedingung);
		
		JLabel lblTextur = new JLabel("Textur:");
		lblTextur.setBounds(10, 198, 69, 14);
		frame.getContentPane().add(lblTextur);
		
		txt_texture_1 = new JTextField();
		txt_texture_1.setBounds(89, 195, 86, 20);
		frame.getContentPane().add(txt_texture_1);
		txt_texture_1.setColumns(10);
	}
}
