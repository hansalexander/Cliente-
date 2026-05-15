package Logica;

/**
 *
 * @author hansa
 */
import BaseDatos.BDPaquete;
import Clases.Paquete;
import java.sql.SQLException;

public class LogPaquete {

    BDPaquete objBDpaquete = new BDPaquete();

    public void InsertarPaquete(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        objBDpaquete.InsertarPaquete(objPaquete);
    }

}
