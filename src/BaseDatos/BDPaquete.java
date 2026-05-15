package BaseDatos;

/**
 *
 * @author hansa
 */
import Clases.Paquete;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDPaquete {

    Conexiones BLcon = new Conexiones();

    public int InsertarPaquete(Paquete objPaquete)
            throws ClassNotFoundException, SQLException {
        String Sentencia = "insert into paquetes (idPaq,Descripcion,peso,Dimension,estado,idClie)"
                + "values (?,?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, 1440); // esto no seberia colcar
        ps.setString(2, objPaquete.getDescripcion());
        ps.setFloat(3, objPaquete.getPeso());
        ps.setString(4, objPaquete.getDimension());
        ps.setInt(5, objPaquete.getEstado());
        ps.setInt(6, objPaquete.getCliente().getIdClie());
        return ps.executeUpdate();
    }
}
