package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
private Connection con;
public Connection Conectar() {
	try {
		con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/programadores","root","");
		JOptionPane.showMessageDialog(null,"Exito Al Conectar");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		JOptionPane.showMessageDialog(null,"Conectado Sin Exito"+e);
	}
	return con;
	
}
}
