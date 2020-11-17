import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Oberfläche
{

	private JFrame frame;
	private JList listAuswahl;
	private JLabel lblNewLabel;
	private JTextField textFieldKname;
	private JButton btnBestellen;
	private JButton btnHinzufuegen;
	private JButton btnEntfernen;
	private JList listWarenkorb;
	private JLabel lblNewLabel_1;
	private JLabel lblangebotnichtwichtig;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Oberfläche window = new Oberfläche();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Oberfläche()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.disabledForeground"));
		frame.setForeground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\Java\\bomb.png"));
		frame.setBounds(100, 100, 732, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getListAuswahl());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTextFieldKname());
		frame.getContentPane().add(getBtnBestellen());
		frame.getContentPane().add(getBtnHinzufuegen());
		frame.getContentPane().add(getBtnEntfernen());
		frame.getContentPane().add(getListWarenkorb());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblangebotnichtwichtig());
		frame.getContentPane().add(getBtnNewButton());
	}
	private JList getListAuswahl() {
		if (listAuswahl == null) {
			listAuswahl = new JList();
			listAuswahl.setFont(new Font("Agency FB", Font.PLAIN, 11));
			listAuswahl.setToolTipText("");
			listAuswahl.setForeground(new Color(127, 255, 0));
			listAuswahl.setBackground(new Color(0, 0, 0));
			listAuswahl.setBounds(30, 146, 277, 174);
		}
		return listAuswahl;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kundenname");
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(29, 331, 134, 31);
		}
		return lblNewLabel;
	}
	private JTextField getTextFieldKname() {
		if (textFieldKname == null) {
			textFieldKname = new JTextField();
			textFieldKname.setForeground(new Color(0, 255, 0));
			textFieldKname.setBackground(new Color(0, 0, 0));
			textFieldKname.setFont(new Font("Tahoma", Font.BOLD, 20));
			textFieldKname.setBounds(172, 331, 134, 29);
			textFieldKname.setColumns(10);
		}
		return textFieldKname;
	}
	private JButton getBtnBestellen() {
		if (btnBestellen == null) {
			btnBestellen = new JButton("Bestellen");
			btnBestellen.setForeground(new Color(0, 255, 0));
			btnBestellen.setFont(new Font("Agency FB", Font.BOLD, 15));
			btnBestellen.setBackground(new Color(0, 0, 0));
			btnBestellen.setBounds(396, 331, 272, 31);
		}
		return btnBestellen;
	}
	private JButton getBtnHinzufuegen() {
		if (btnHinzufuegen == null) {
			btnHinzufuegen = new JButton(">");
			btnHinzufuegen.setBackground(new Color(0, 0, 0));
			btnHinzufuegen.setForeground(new Color(0, 255, 0));
			btnHinzufuegen.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnHinzufuegen.setBounds(317, 165, 63, 23);
		}
		return btnHinzufuegen;
	}
	private JButton getBtnEntfernen() {
		if (btnEntfernen == null) {
			btnEntfernen = new JButton("<");
			btnEntfernen.setForeground(new Color(0, 255, 127));
			btnEntfernen.setBackground(new Color(0, 0, 0));
			btnEntfernen.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnEntfernen.setBounds(317, 248, 63, 23);
		}
		return btnEntfernen;
	}
	private JList getListWarenkorb() {
		if (listWarenkorb == null) {
			listWarenkorb = new JList();
			listWarenkorb.setForeground(new Color(127, 255, 0));
			listWarenkorb.setFont(new Font("Agency FB", Font.PLAIN, 11));
			listWarenkorb.setBackground(new Color(0, 0, 0));
			listWarenkorb.setBounds(396, 146, 272, 174);
		}
		return listWarenkorb;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Warenkorb");
			lblNewLabel_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(396, 104, 250, 31);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblangebotnichtwichtig() {
		if (lblangebotnichtwichtig == null) {
			lblangebotnichtwichtig = new JLabel("Angebot");
			lblangebotnichtwichtig.setForeground(new Color(0, 0, 0));
			lblangebotnichtwichtig.setFont(new Font("Stencil", Font.PLAIN, 25));
			lblangebotnichtwichtig.setBounds(30, 104, 250, 31);
		}
		return lblangebotnichtwichtig;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon("H:\\Java\\Download.png"));
			btnNewButton.setBounds(0, -3, 182, 96);
		}
		return btnNewButton;
	}
}
