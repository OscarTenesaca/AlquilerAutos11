package interGrafi;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.CAutomovil;
import modelo.Automovil;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;

public class Carros extends JPanel {
	private JTextField textbuscar;
	private JTextField txtId;
	private JTextField txtPlaca;
	private JTextField txtTipo;
	private JTextField txtMarca;
	private JTextField txtAno;
	CAutomovil ca;
	private JTable table;
	private ButtonGroup grupo;
	Automovil au= new Automovil();
	private JTextField txtColor;
	private JTextField txtModelo;
	/**
	 * Create the panel.
	 */
	public Carros() {
		setBackground(new Color(0, 204, 255));
		
		ca= new CAutomovil();
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 163, 61, 14);
		add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(139, 160, 134, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 204, 255));
		panel.setBounds(40, 11, 418, 34);
		add(panel);
		
		
		final JRadioButton rdbtnAgregar = new JRadioButton("Agregar ");
		rdbtnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.enable(true);
				txtPlaca.enable(true);
				txtTipo.enable(true);
				txtMarca.enable(true);
				txtAno.enable(true);
				txtModelo.enable(true);
				txtColor.enable(true);
				
				
			}
		});
		
		//rdbtnAgregar.setBounds(21, 26, 97, 23);
		panel.add(rdbtnAgregar);
		
		final JButton btnBuscar = new JButton("Buscar");
		
		final JRadioButton rdbtnModificar = new JRadioButton("Modificar");
		rdbtnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textbuscar.setEnabled(true);
				btnBuscar.setEnabled(true);
				
				
			}
		});
		
		
		//rdbtnModificar.setBounds(130, 26, 109, 23);
		panel.add(rdbtnModificar);
		
		JRadioButton rdbtnListar = new JRadioButton("Listar");
		rdbtnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				for (Automovil a : ca.getAutomovil()) {
					i++;
					table.setValueAt(a.getIdA(),i,0);
					table.setValueAt(a.getPlaca(), i, 1);
					table.setValueAt(a.getTipo(), i, 2);
					table.setValueAt(a.getModelo(), i, 3);
					table.setValueAt(a.getColor(), i, 4);
					table.setValueAt(a.getMarca(),i,5);
					table.setValueAt(a.getAno(), i, 6);
					
				
				}
			}
		});
	//	rdbtnListar.setBounds(251, 26, 80, 23);
		panel.add(rdbtnListar);
		
		final JRadioButton rdbtnBorrar = new JRadioButton("Borrar");
		rdbtnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		rdbtnBorrar.setBounds(364, 26, 74, 23);
		panel.add(rdbtnBorrar);
		grupo =  new ButtonGroup();
		grupo.add(rdbtnBorrar);
		grupo.add(rdbtnListar);
		grupo.add(rdbtnModificar);
		grupo.add(rdbtnAgregar);
		
		
		
		JLabel lblBuscarPorId = new JLabel("Buscar por Id");
		lblBuscarPorId.setBounds(321, 163, 95, 14);
		add(lblBuscarPorId);
		
		textbuscar = new JTextField();
		textbuscar.setBounds(428, 160, 136, 20);
		add(textbuscar);
		textbuscar.setColumns(10);
		
		
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 188, 61, 14);
		add(lblPlaca);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Auto");
		lblNewLabel_1.setBounds(10, 213, 108, 14);
		add(lblNewLabel_1);
		
		JLabel lblModeloDeA = new JLabel("Marca de Auto");
		lblModeloDeA.setBounds(10, 376, 108, 14);
		add(lblModeloDeA);
		

		JLabel lblModeloDeAuto = new JLabel("Modelo de Auto");
		lblModeloDeAuto.setBounds(10, 238, 108, 16);
		add(lblModeloDeAuto);
		
		JLabel lblColorDeAuto = new JLabel("Color de Auto");
		lblColorDeAuto.setBounds(10, 349, 108, 16);
		add(lblColorDeAuto);
		
		
		JLabel lblAo = new JLabel("Ano");
		lblAo.setBounds(10, 401, 61, 14);
		add(lblAo);
		
		
		
		txtPlaca = new JTextField();
		txtPlaca.setEnabled(false);
		txtPlaca.setBounds(139, 185, 134, 20);
		add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setEnabled(false);
		txtTipo.setBounds(139, 210, 134, 20);
		add(txtTipo);
		txtTipo.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setEnabled(false);
		txtMarca.setBounds(139, 373, 134, 20);
		add(txtMarca);
		txtMarca.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setEnabled(false);
		txtColor.setBounds(139, 347, 134, 20);
		add(txtColor);
		txtColor.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setEnabled(false);
		txtModelo.setBounds(139, 236, 134, 20);
		add(txtModelo);
		txtModelo.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setEnabled(false);
		txtAno.setBounds(139, 395, 134, 20);
		add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnAgregar.isSelected()==true){
					Automovil au= new Automovil();
					au.setIdA(new Integer(txtId.getText()).intValue());
					au.setPlaca(txtPlaca.getText());
					au.setTipo(txtTipo.getText());
					au.setMarca(txtMarca.getText());
					au.setModelo(txtModelo.getText());
					au.setColor(txtColor.getText());
				au.setAno(new Integer(txtAno.getText()).intValue());
				
				
				txtId.setText("");
				txtPlaca.setText("");
				txtTipo.setText("");
				txtMarca.setText("");
				txtModelo.setText("");
				txtColor.setText("");
				txtAno.setText("");
				
				ca.setAutomovil(au);	
				}
				
				if(rdbtnModificar.isSelected()==true){
				au.setIdA(new Integer(txtId.getText()).intValue());
				au.setPlaca(txtPlaca.getText());
				au.setTipo(txtTipo.getText());
				au.setModelo(txtModelo.getText());
				au.setColor(txtColor.getText());
				au.setMarca(txtMarca.getText());
				au.setAno(new Integer(txtAno.getText()).intValue());
				
				txtId.setText("");
				txtPlaca.setText("");
				txtTipo.setText("");
				txtMarca.setText("");
				txtModelo.setText("");
				txtColor.setText("");
				txtAno.setText("");
				textbuscar.setText("");
				
				ca.updateAutomovil(au);
				
				
				}
				
				if(rdbtnBorrar.isSelected()==true){
					System.out.println(ca.deleteAutommovil(new Integer(textbuscar.getText()).intValue())+" eliminado");
					txtId.setText("");
					txtPlaca.setText("");
					txtTipo.setText("");
					txtMarca.setText("");
					txtModelo.setText("");
					txtColor.setText("");
					txtAno.setText("");
					textbuscar.setText("");
					
					
				}
				
			}
		});
		btnAceptar.setBounds(614, 398, 89, 23);
		add(btnAceptar);
		
		Object filas[][]= new Object[10][7];
		String columnas[] = new String[]{"id","placa","tipo de auto","modelo de auto","color","marca de auto","anio"};
		table = new JTable(filas,columnas);
		table.setBounds(10, 426, 682, 143);
		table.setValueAt("IP", 0, 0);
		table.setValueAt("PLACA", 0, 1);
		table.setValueAt("TIPO DE AUTO", 0, 2);
		table.setValueAt("MODELO DE AUTO", 0, 3);
		table.setValueAt("COLOR DE AUTO", 0, 4);
		table.setValueAt("MARCA DE AUTO", 0, 5);
		table.setValueAt("ANIO", 0, 6);
		
		add(table);
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int n=(new Integer( textbuscar.getText()).intValue());
			List<Automovil> lista = ca.getAutomovil();
			Automovil a=new Automovil();
			for (Automovil automovil2 : lista ) {
				if (n==automovil2.getIdA()){
					txtId.setText(automovil2.getIdA()+"");
					txtPlaca.setText(automovil2.getPlaca());
					txtTipo.setText(automovil2.getTipo());
					txtModelo.setText(automovil2.getModelo());
					txtColor.setText(automovil2.getColor());
					txtMarca.setText(automovil2.getMarca());
					txtAno.setText(automovil2.getAno()+"");
				}
				
			}
				
			}
		});
		btnBuscar.setEnabled(false);
		btnBuscar.setBounds(566, 157, 117, 29);
		add(btnBuscar);
		
		JLabel lblNewLabel_2 = new JLabel("MODULO DE VEHICULOS");
		lblNewLabel_2.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(153, 72, 399, 38);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(303, 236, 113, 20);
		add(comboBox);
		comboBox.addItem("Aveo Family");
        comboBox.addItem("Chevrolet Grand Vitara");
        comboBox.addItem("Audi Lx");
        comboBox.addItem("BMW Convertible");
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(303, 210, 113, 20);
        add(comboBox_1);
        comboBox_1.addItem("Bus");
        comboBox_1.addItem("Motocicleta");
        comboBox_1.addItem("Automovil");
        comboBox_1.addItem("Camion");
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(303, 347, 113, 20);
        add(comboBox_2);
        comboBox_2.addItem("Verde");
        comboBox_2.addItem("Gris");
        comboBox_2.addItem("Azul");
        comboBox_2.addItem("Blanco");
        
        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setBounds(303, 373, 113, 20);
        add(comboBox_3);
        comboBox_3.addItem("Chevrolet");
        comboBox_3.addItem("Mercedes Benz");
        comboBox_3.addItem("Audi");
        comboBox_3.addItem("BMW");
        
        JLabel lblTiposDeAutos = new JLabel("Elija el tipo de Auto de acuerdo a sus requerimientos");
        lblTiposDeAutos.setBounds(441, 213, 261, 14);
        add(lblTiposDeAutos);
        
        JLabel lblColoresDisponibles = new JLabel("Colores Disponibles");
        lblColoresDisponibles.setBounds(457, 340, 168, 14);
        add(lblColoresDisponibles);
        
        JLabel lblElijaLaMarca = new JLabel("Elija la marca del vehiculo elejido");
        lblElijaLaMarca.setBounds(441, 365, 220, 14);
        add(lblElijaLaMarca);
        
        JComboBox comboBox_4 = new JComboBox();
        comboBox_4.setBounds(303, 259, 113, 20);
        add(comboBox_4);
        comboBox_4.addItem("Suzuki Vistrom");
        comboBox_4.addItem("Honda Tornado");
        comboBox_4.addItem("Tundra Raptor");
        comboBox_4.addItem("Pegasso");
        JComboBox comboBox_5 = new JComboBox();
        comboBox_5.setBounds(303, 279, 113, 20);
        add(comboBox_5);
        comboBox_5.addItem("Chevrolet Hr");
        comboBox_5.addItem("Chevrolet Nkr");
        comboBox_5.addItem("Hino serie s");
        comboBox_5.addItem("Hino serie g");
        JComboBox comboBox_6 = new JComboBox();
        comboBox_6.setBounds(303, 299, 113, 20);
        add(comboBox_6);
        comboBox_6.addItem("Atlas");
        comboBox_6.addItem("Mitsubishi Plane");
        comboBox_6.addItem("Hyundai THY");
        comboBox_6.addItem("Tadano TTR");
        
        JLabel lblF = new JLabel("Para Autos");
        lblF.setBounds(457, 237, 75, 18);
        add(lblF);
        
        JLabel lblParaMotos = new JLabel("Para Motos");
        lblParaMotos.setBounds(457, 262, 69, 14);
        add(lblParaMotos);
        
        JLabel lblParaCamiones = new JLabel("Para camiones");
        lblParaCamiones.setBounds(454, 282, 98, 14);
        add(lblParaCamiones);
        
        JLabel lblParaBuses = new JLabel("Para Buses");
        lblParaBuses.setBounds(457, 302, 75, 14);
        add(lblParaBuses);
        
        JLabel lblN = new JLabel("Escoja de acuerdo al tipo de vehiculo elejido anteriormente");
        lblN.setBounds(562, 234, 333, 71);
        add(lblN);
    
       
		
	
		
		
		

			
	}
}
