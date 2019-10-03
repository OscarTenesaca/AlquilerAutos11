package interGrafi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 912, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 51));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 28, 127, 507);
		contentPane.add(panel);
		
		JButton btnMenuClientes = new JButton("Menu Clientes");
		
		panel.add(btnMenuClientes);
		
		JButton btnMenuCarros = new JButton("Menu Carros");
		panel.add(btnMenuCarros);
		
		JButton btnMenuAlquiler = new JButton("Menu Alquiler");
		panel.add(btnMenuAlquiler);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(150, 6, 726, 573);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("               BIENVENIDOS");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setIcon(new ImageIcon("/Users/oscartenesaca/Documents/pensamiento/freesoft.jpeg"));
		lblNewLabel.setBounds(147, 11, 726, 524);
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 6, 132, 22);
		contentPane.add(menuBar);
		
		JMenu mnPropiedades = new JMenu("Edicion");
		menuBar.add(mnPropiedades);
		
	
		
		JMenu mnSalir=new JMenu(" Salir");
		menuBar.add(mnSalir);
		
		JMenuItem mndesacer = new JMenuItem("Deshacer CTRL Z");
		mnPropiedades.add(mndesacer);
		
		JMenuItem mnreacer = new JMenuItem("rehacer SHIFT+CTRL+ Z");
		mnPropiedades.add(mnreacer);
		
		
		JMenuItem mntmNuevoCtrlN = new JMenuItem("Nuevo CTRL N");
		mnPropiedades.add(mntmNuevoCtrlN);
		

		JMenuItem mnAyuda=new JMenuItem(" Ayuda");
		mnPropiedades.add(mnAyuda);
		
		JMenuItem itemSalir = new JMenuItem("CTRL Q");
		mnSalir.add(itemSalir);
		
		
		btnMenuClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.removeAll();
				Cliente cC= new Cliente();											
				panel_1.add(cC);
				panel_1.updateUI();
				
			}
		});
		
		btnMenuCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				Carros aA = new Carros();
				panel_1.add(aA);
				panel_1.updateUI();
			}
		});
		
		btnMenuAlquiler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.removeAll();
				Alquiler bB = new Alquiler ();
				panel_1.add(bB);
				panel_1.updateUI();
			}
		});
	
	}
}
