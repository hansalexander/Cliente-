
package Presentacion;

import Clases.Cliente;
import Clases.Direcciones;
import Logica.LogCliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author hansa
 */
public class A_Semana01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        LogCliente objLogCliente = new LogCliente();
        Cliente objCliente = new Cliente();
        InsertarCliente(objCliente,objLogCliente);
        //BuscarCliente(objCliente,objLogCliente);   
    }
    private static void InsertarCliente(Cliente objCliente, LogCliente objLogCliente) 
            throws ClassNotFoundException, SQLException {
        Direcciones objDireccion = new Direcciones();
        ArrayList<Direcciones> objArrayDirecciones = new ArrayList<Direcciones>();
        // ingresar datos del cliente
        objCliente = new Cliente();
        objCliente.setCedula("1101223349");
        objCliente.setNombre("Juan Perez");
        objCliente.setMail("djara");
        // ingresar datos de la direccion
        objDireccion.setCalle1("18 de noviembre");
        objDireccion.setCalle2("juan de salinas");
        objArrayDirecciones.add(objDireccion);
        objCliente.setDirecciones(objArrayDirecciones);
        
        if (objLogCliente.ValidarCedula(objCliente))
            System.out.println("Cliente agregado");
        else
            System.out.println("Error en la cedula");
    }
    private static void BuscarCliente(Cliente objCliente, LogCliente objLogCliente) throws SQLException, ClassNotFoundException {
        objCliente.setCedula("1101223345");
        objLogCliente.BuscarCliente(objCliente);
        if (objCliente.getNombre() != null)
            System.out.println(objCliente.toString());
        else
            System.err.println("cliente no existe");
    }
    
}
