package Controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Mascota;

public class DataMascota {
	private Conexion cn=new Conexion();
	private Connection con;
	private PreparedStatement ps;
	public boolean Guardar(Mascota ma) {
		boolean guarda=false;
		String sql="insert into programa3 values(?,?,?)";
		con=cn.Conectar();
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1,ma.getIdMascota());
			ps.setString(2,ma.getNombre());
			ps.setString(3, ma.getRaza());
			ps.setInt(4, ma.getEdad());
			int guar=ps.executeUpdate();
			if(guar>0) {
				guarda=true;
				JOptionPane.showMessageDialog(null,"Guardado con Exito");
			}else {
				JOptionPane.showMessageDialog(null,"Guardado sin Exito");
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Guardado con Error");
		}
		
		return false;
		
	}
}
