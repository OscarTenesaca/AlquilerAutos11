package interGrafi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.CPersona;
import modelo.Persona;

import javax.swing.JMenuBar;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class Cliente extends JPanel {
	private JTextField txtid;
	private JTextField txtNombre;
	private JTextField txtBuscar;
	private JTable table;
	private ButtonGroup grupo;
	private ButtonGroup grupo2;

	/**
	 * Create the panel.
	 */
	CPersona cp;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtEdad;
	Persona p = new Persona();
	public Cliente() {
		setBackground(new Color(135, 206, 235));
		cp= new CPersona();
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(28,112, 68, 28);//(29, 105, 34, 14);
		add(lblNewLabel);
		
		txtid = new JTextField();
		txtid.setEnabled(false);
		txtid.setBounds(84, 116, 180, 20);
		add(txtid);
		txtid.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 24, 418, 34);
		add(panel);
		
		final JRadioButton radiobtnagregar = new JRadioButton("agregar");
		radiobtnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtid.enable(true);
				txtCedula.enable(true);
				txtNombre.enable(true);
				txtApellido.enable(true);
				txtEdad.enable(true);
			}
		});
		panel.add(radiobtnagregar);
		final JButton btnBuscar = new JButton("buscar");
		
		final JRadioButton rdbtnmodificar = new JRadioButton("modificar");
		rdbtnmodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtid.enable(true);
				txtBuscar.setEnabled(true);
				
				btnBuscar.setEnabled(true);
				// modificado aqui
				
			}
		});
		panel.add(rdbtnmodificar);
		

		
		
		final JRadioButton rdbtnEliminar = new JRadioButton("eliminar");
		rdbtnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBuscar.setEnabled(true);
				btnBuscar.setEnabled(true);
								
					
				
			}
		});
		panel.add(rdbtnEliminar);
		JRadioButton rdbtnlistar = new JRadioButton("listar");
		rdbtnlistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int i=0;
				for (Persona p : cp.getPersona()) {
					i++;
					table.setValueAt(p.getIdPersona(), i, 0);
					table.setValueAt(p.getCedula(), i, 1);
					table.setValueAt(p.getNombre(), i, 2);
					table.setValueAt(p.getApellido(), i, 3);
					table.setValueAt(p.getEdad(), i, 4);
					
				
					 
					
					
				}
				
				
				
			}
		});
		panel.add(rdbtnlistar);
		
		
		grupo = new ButtonGroup();
		grupo.add(radiobtnagregar);
		grupo.add(rdbtnlistar);
		grupo.add(rdbtnmodificar);
		grupo.add(rdbtnEliminar);
		
		////////////////////////////////////
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radiobtnagregar.isSelected()==true){
					Persona p= new Persona();
					p.setIdPersona(new Integer(txtid.getText()).intValue());
					p.setCedula(new Integer(txtCedula.getText()).intValue());
					p.setNombre(txtNombre.getText());
					p.setApellido(txtApellido.getText());
					p.setEdad(new Integer(txtEdad.getText()).intValue());
					txtid.setText("");
					txtCedula.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtEdad.setText("");
				
					cp.setPersona(p);
				}
				if(rdbtnmodificar.isSelected()==true){
					
					
				p.setIdPersona(new Integer(txtid.getText()).intValue());
				p.setCedula(new Integer(txtCedula.getText()).intValue());
				p.setNombre(txtNombre.getText());
				p.setApellido(txtApellido.getText());
				p.setEdad(new Integer(txtEdad.getText()).intValue());
				
				txtid.setText("");
				txtCedula.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtEdad.setText("");
				txtBuscar.setText("");
				
				cp.updatePersona(p);
				}
				if (rdbtnEliminar.isSelected()==true){
				System.out.println(cp.deletePersona(new Integer(txtBuscar.getText()).intValue())+"     eliminado");
				txtid.setText("");
				txtCedula.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtEdad.setText("");
				txtBuscar.setText("");

			}
				
				
			}
		});
		btnAceptar.setBounds(482, 368, 73, 23);
		add(btnAceptar);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(28, 162, 68, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setBounds(84, 159, 180, 20);
		add(txtNombre);
		txtNombre.setColumns(1);
		
		txtBuscar = new JTextField();
		txtBuscar.setEnabled(false);
		txtBuscar.setBounds(372, 116, 86, 20);
		add(txtBuscar);
		txtBuscar.setColumns(2);
		
		Object filas[][]= new Object[10][5];
		String columnas[] = new String[]{"id","cedula","nombre","apellido","edad"};
		table = new JTable(filas,columnas);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBounds(10, 246, 545, 111);
		table.setValueAt("Id", 0, 0);
		table.setValueAt("Cedula", 0, 1);
		table.setValueAt("Nombre", 0, 2);
		table.setValueAt("Apellido", 0, 3);
		table.setValueAt("Edad", 0, 4);
		add(table);
		
		JLabel lblApellido = new JLabel("apellido");
		lblApellido.setBounds(28, 187, 68, 14);
		add(lblApellido);
		///////////////////////////////
		
		
		//////////////////////////////
		txtApellido = new JTextField();
		txtApellido.setEnabled(false);
		txtApellido.setBounds(84, 181, 180, 20);
		add(txtApellido);
		txtApellido.setColumns(3);
		
		JLabel lblCedula = new JLabel("cedula");
		lblCedula.setBounds(28, 140, 68, 14);
		add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setEnabled(false);
		txtCedula.setBounds(84, 137, 180, 20);
		add(txtCedula);
		txtCedula.setColumns(4);
		
		
		
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setBounds(28, 212, 46, 14);
		add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setEnabled(false);
		txtEdad.setBounds(84, 209, 180, 20);
		add(txtEdad);
		txtEdad.setColumns(5);
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=(new Integer( txtBuscar.getText()).intValue());
				System.out.println(n);
				List<Persona> lista = cp.getPersona();
				Persona p= new Persona();
				for (Persona persona2 : lista) {
					if(n== persona2.getIdPersona()) {
						txtid.setText(persona2.getIdPersona()+"");
						txtCedula.setText(persona2.getCedula()+"");
						txtNombre.setText(persona2.getNombre());
						txtApellido.setText(persona2.getApellido());
						txtEdad.setText(persona2.getEdad()+"");
						
					
						
					}
					
					
				}
				
				
				System.out.println(p.getIdPersona());
				
				
				
				//cojan dato de txt id
				//instancia de la lista de clientes de la case de controlador
				//cC.listar da una lista y hay que rrecorer la lista
				//if id de txt == al id de los datos de la lista
				//cojes los datos de esa persona y agregan a las cajas de texto
				//luego hay que modificar
				//deben llamar al modelo y crear esa persona
				//instancia del Persona y la instancia es p
				//p.setnombre(txtnombre)
				//update(p)
			}
		});
		btnBuscar.setEnabled(false);
		btnBuscar.setBounds(466, 116, 89, 23);
		add(btnBuscar);
		
		JLabel lblModuloCliente = new JLabel("MODULO CLIENTE");
		lblModuloCliente.setForeground(new Color(255, 0, 102));
		lblModuloCliente.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 16));
		lblModuloCliente.setBounds(216, 70, 291, 34);
		add(lblModuloCliente);
		
		

	}
}
