
package Logica;

import BaseDatos.BDCliente;
import BaseDatos.BDDirecciones;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author hansa
 */
public class LogCliente {
    BDCliente objBDCliente = new BDCliente();
    BDDirecciones objBDDirecciones = new BDDirecciones();
    public boolean ValidarCedula(Cliente objCliente) 
            throws ClassNotFoundException, SQLException {
        // proceso para validar la cedula 10 digitos
        // el último digito se obtiene de aplicar algoritmo a los anteriores
        
        if (objCliente.getCedula().length() == 10){
            //insertar el cliente en la base
            objBDCliente.InsertarCliente(objCliente);
            // encontrar el id del cliente insertado
            // colocarlo en el objeto cliente
            BuscarCliente(objCliente);
            //insertar la direccion del cliente
            objBDDirecciones.InsertarDireccion(objCliente);
            return true;
        }
        else
            return false;
    }
    
    public void BuscarCliente(Cliente objCliente) 
            // llenar el objeto si se encuntran datos
            throws SQLException, ClassNotFoundException {
        ResultSet rs = objBDCliente.BuscarClientexCedula(objCliente);
        while (rs.next()){
                objCliente.setIdClie(rs.getInt(1));
                objCliente.setNombre(rs.getString(3)); // se setea el id al objeto cliente

        }
        rs.close();
        
    }
    
}
