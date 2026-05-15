
package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hansa
 */
public class BDDirecciones {

    Conexiones BLcon = new Conexiones();
    public int InsertarDireccion(Cliente objCliente) 
            throws ClassNotFoundException, SQLException  {
        String Sentencia = "insert into direcciones (calle1,calle2,idClie)"
               + "values (?,?,?)" ;
       PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
       ps.setString(1,objCliente.getDirecciones().get(0).getCalle1());
       ps.setString(2,objCliente.getDirecciones().get(0).getCalle2());
       ps.setInt(3,objCliente.getIdClie());
       return ps.executeUpdate();
    }
}
