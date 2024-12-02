package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Menu_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
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
	public Menu_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 519, 419);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mascota");
		menuBar.add(mnNewMenu);
		
		JMenu mnAcciones_1 = new JMenu("Acciones");
		mnNewMenu.add(mnAcciones_1);
		
		JMenuItem RegistrarMascota = new JMenuItem("Registrar");
		mnAcciones_1.add(RegistrarMascota);
		
		JMenuItem ConsultarMascota = new JMenuItem("Consultar");
		mnAcciones_1.add(ConsultarMascota);
		
		JMenuItem ActualizarMascota = new JMenuItem("Actualizar");
		mnAcciones_1.add(ActualizarMascota);
		
		JMenuItem DeshabilitarMascota = new JMenuItem("Deshabilitar");
		mnAcciones_1.add(DeshabilitarMascota);
		
		JMenu mnNewMenu_1 = new JMenu("Adoptar");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnAcciones = new JMenu("Acciones");
		mnNewMenu_1.add(mnAcciones);
		
		JMenuItem RegistrarAdoptar = new JMenuItem("Registrar");
		mnAcciones.add(RegistrarAdoptar);
		
		JMenuItem ConsultarAdoptar = new JMenuItem("Consultar");
		mnAcciones.add(ConsultarAdoptar);
		
		JMenuItem ActualizarAdopta = new JMenuItem("Actualizar");
		mnAcciones.add(ActualizarAdopta);
		
		JMenuItem DeshabiitarAdoptar = new JMenuItem("Deshabilitar");
		mnAcciones.add(DeshabiitarAdoptar);
		
		JMenu mnNewMenu_4 = new JMenu("Adopcion");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnAcciones_2 = new JMenu("Acciones");
		mnNewMenu_4.add(mnAcciones_2);
		
		JMenuItem RegistrarAdopcion = new JMenuItem("Registrar");
		mnAcciones_2.add(RegistrarAdopcion);
		
		JMenuItem ConsultarAdopcion = new JMenuItem("Consultar");
		mnAcciones_2.add(ConsultarAdopcion);
		
		JMenuItem ActualizarAdopcion = new JMenuItem("Actualizar");
		mnAcciones_2.add(ActualizarAdopcion);
		
		JMenuItem DeshabiitarAdopcion = new JMenuItem("Deshabilitar");
		mnAcciones_2.add(DeshabiitarAdopcion);
		
		JMenu mnNewMenu_3 = new JMenu("Empleado");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_5 = new JMenu("Acciones");
		mnNewMenu_3.add(mnNewMenu_5);
		
		JMenuItem RegistrarEmpleado = new JMenuItem("Registrar");
		mnNewMenu_5.add(RegistrarEmpleado);
		
		JMenuItem ConsultarEmpleado = new JMenuItem("Consultar");
		mnNewMenu_5.add(ConsultarEmpleado);
		
		JMenuItem ActualizarEmpleado = new JMenuItem("Actualizar");
		mnNewMenu_5.add(ActualizarEmpleado);
		
		JMenuItem DeshabiitarEmpleado = new JMenuItem("Deshabilitar");
		mnNewMenu_5.add(DeshabiitarEmpleado);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(10, 11, 483, 325);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Albergue De Mascotas");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_1.setBounds(115, 11, 237, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno.SC3PC06\\Downloads\\pngtree-enjoying-company-of-pets-concept-png-image_6579226.png"));
		lblNewLabel.setBounds(61, 47, 353, 261);
		panel.add(lblNewLabel);
	}
}
