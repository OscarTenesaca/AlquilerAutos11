package interGrafi;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.CAlquiler;
import modelo.MAlquiler;
import modelo.Persona;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class Alquiler extends JPanel {
	private JTextField txtId;
	private JTextField txtEstado;
	private JTextField txtDias;
	private JTextField txtPrecio;
	private JTable table;
	CAlquiler ca;
	private JTextField txtBuscar;
	MAlquiler a =new MAlquiler();

	/**
	 * Create the panel.
	 */
	public Alquiler() {
		setBackground(new Color(255, 255, 153));
		ca = new CAlquiler();
		setLayout(null);
		
		final JRadioButton rdbtnAgregar = new JRadioButton("Agregar");
		rdbtnAgregar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtId.enable(true);
				txtEstado.enable(true);
				txtDias.enable(true);
				txtPrecio.enable(true);
				
			
			}
		});
		rdbtnAgregar.setBounds(17, 33, 88, 23);
		add(rdbtnAgregar);
		
		JRadioButton rdbtnListar = new JRadioButton("Listar");
		rdbtnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=1;
				for (MAlquiler ma : ca.getMAlquiler()) {
					i++;
					table.setValueAt(ma.getId(), i, 0);
					table.setValueAt(ma.getEstado(), i, 1);
					table.setValueAt(ma.getDias(), i, 2);
					table.setValueAt(ma.getPrecio(), i, 3);
					table.setValueAt(ma.getPreciot(), i, 4);
				
				}
			}
		});
		rdbtnListar.setBounds(118, 33, 74, 23);
		add(rdbtnListar);
		
		final JButton btnBuscar = new JButton("Buscar");
		final JRadioButton rdbtnModificar = new JRadioButton("Modificar");
		rdbtnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtId.enable(true);
				txtBuscar.setEnabled(true);
				
				btnBuscar.setEnabled(true);
				
			}
		});
		rdbtnModificar.setBounds(215, 33, 98, 23);
		add(rdbtnModificar);
		
		final JRadioButton rdbtnEliminar = new JRadioButton("Borrar");
		rdbtnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.enable(true);
				txtEstado.enable(true);
				txtDias.enable(true);
				txtPrecio.enable(true);
			}
		});
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdbtnEliminar);
		grupo.add(rdbtnModificar);
		grupo.add(rdbtnListar);
		grupo.add(rdbtnAgregar);
		
		rdbtnEliminar.setBounds(315, 33, 88, 23);
		add(rdbtnEliminar);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(17, 127, 81, 14);
		add(lblId);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(17, 152, 81, 14);
		add(lblEstado);
		
		JLabel lblDias = new JLabel("Dias:");
		lblDias.setBounds(17, 177, 81, 14);
		add(lblDias);
		
		JLabel lblMontoAPagar = new JLabel("Precio");
		lblMontoAPagar.setBounds(17, 202, 81, 14);
		add(lblMontoAPagar);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(113, 121, 134, 20);
		add(txtId);
		txtId.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setEnabled(false);
		txtEstado.setBounds(113, 149, 134, 20);
		add(txtEstado);
		txtEstado.setColumns(10);
		
		txtDias = new JTextField();
		txtDias.setEnabled(false);
		txtDias.setBounds(113, 177, 134, 20);
		add(txtDias);
		txtDias.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setBounds(113, 202, 134, 23);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAgregar.isSelected()==true){
					MAlquiler a =new MAlquiler();
					a.setId(new Integer(txtId.getText()).intValue());
					a.setEstado(txtEstado.getText());
					a.setDias(new Integer(txtDias.getText()).intValue());
					int n=(new Integer( txtDias.getText()).intValue());
					System.out.println(txtDias.getText());
					a.setPrecio(new Integer(txtPrecio.getText()).intValue());
					int n1=(new Integer( txtPrecio.getText()).intValue());
					a.setPrecio(new Integer(txtPrecio.getText()).intValue());
					
					a.setPreciot(new Integer(n*n1).intValue());
	
				
					
					txtId.setText("");
					txtEstado.setText("");
					txtDias.setText("");
					txtPrecio.setText("");
					

					ca.setMAlquiler(a);
				
				
				}
				if (rdbtnModificar.isSelected()==true){
					a.setId(new Integer(txtId.getText()).intValue());
					a.setEstado(txtEstado.getText());
					a.setDias(new Integer(txtDias.getText()).intValue());
					a.setPrecio(new Integer(txtPrecio.getText()).intValue());
					
					int n=(new Integer( txtDias.getText()).intValue());
					int n1=(new Integer( txtPrecio.getText()).intValue());
					a.setPreciot(new Integer(n*n1).intValue());
					
					txtId.setText("");
					txtEstado.setText("");
					txtDias.setText("");
					txtPrecio.setText("");
					txtBuscar.setText("");
					ca.updateMAlquiler(a);
					
				}
				if (rdbtnEliminar.isSelected()==true){

					System.out.println(ca.deleteMAlquiler(new Integer(txtBuscar.getText()).intValue())+"     eliminado");
					txtId.setText("");
					txtEstado.setText("");
					txtDias.setText("");
					txtPrecio.setText("");
					txtBuscar.setText("");
			}
			}
			
			
		});
		btnAceptar.setBounds(535, 376, 89, 23);
		add(btnAceptar);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 242, 650, 122);
		add(panel);
		panel.setLayout(null);
		
		Object filas[][]=new Object[10][6];
		String columnas[] = new  String []{"id", "estado","dias","precio","montoapagar"};
		table = new JTable(filas,columnas);
		table.setBounds(6, 6, 638, 124);
		table.setValueAt("IP", 0, 0);
		table.setValueAt("ESTADO", 0, 1);
		table.setValueAt("N. DIAS", 0, 2);
		table.setValueAt("PRECIO", 0, 3);
		table.setValueAt("MONTO A PAGAR", 0, 4);
		
		panel.add(table);
		
		JLabel lblBuscarPorId = new JLabel("Buscar");
		lblBuscarPorId.setBounds(346, 126, 88, 16);
		add(lblBuscarPorId);
		
		txtBuscar = new JTextField();
		txtBuscar.setEnabled(false);
		txtBuscar.setBounds(409, 120, 134, 28);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
	
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=(new Integer( txtBuscar.getText()).intValue());
				System.out.println(n);
				List<MAlquiler> lista = ca.getMAlquiler();
				MAlquiler a=new MAlquiler();
				for (MAlquiler alquiler2 : lista){
				if (n==alquiler2.getId()){
					
					txtId.setText(alquiler2.getId()+"");
					txtEstado.setText(alquiler2.getEstado()+"");
					txtDias.setText(alquiler2.getDias()+"");
					txtPrecio.setText(alquiler2.getPrecio()+"");
					
				}
				}
				
				
			}
		});
		btnBuscar.setBounds(555, 121, 117, 29);
		add(btnBuscar);
		
		JLabel lblNewLabel = new JLabel("MODULO FACTURA");
		lblNewLabel.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setBounds(161, 67, 338, 42);
		add(lblNewLabel);
		
		JLabel lblPrecioDeAlquiler = new JLabel("PRECIO DE ALQUILER DE VEHICULOS");
		lblPrecioDeAlquiler.setBounds(257, 209, 246, 16);
		add(lblPrecioDeAlquiler);
		
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(519, 203, 125, 20);
		add(comboBox);
	    comboBox.addItem("Moto $50");
	    comboBox.addItem("Bus $100");
	    comboBox.addItem("Carro $80");
	    comboBox.addItem("Camion $150");
	    
	    JComboBox comboBox_1 = new JComboBox();
	    comboBox_1.setBounds(257, 149, 134, 20);
	    add(comboBox_1);
		comboBox_1.addItem("Excelente");
		comboBox_1.addItem("Bueno");
		comboBox_1.addItem("A prueba");


		

	}
}
