package Interface.Entreprise_Version1_0;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane; 

public class ConfigurationPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConfigurationPane() {
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 639, 506);
		add(tabbedPane);
		
		JTabbedPane ReservationPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Reserver", null, ReservationPane, null);
		
		JTabbedPane ModifierPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Changer profil", null, ModifierPane, null);
		
		JPanel panel = new JPanel();
		ModifierPane.addTab("New tab", null, panel, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Mes reservation", null, tabbedPane_1, null);
		 
	}
}
