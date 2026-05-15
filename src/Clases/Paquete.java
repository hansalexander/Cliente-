
package Clases;

/**
 *
 * @author hansa
 */
public class Paquete {
    private int idPaq;
    private String Descripcion;
    private Float Peso;
    private String Dimension;
    private int Estado;

    public Paquete() {
    }
    

    public Paquete(int idPaq, String Descripcion, Float Peso, String Dimension, int Estado) {
        this.idPaq = idPaq;
        this.Descripcion = Descripcion;
        this.Peso = Peso;
        this.Dimension = Dimension;
        this.Estado = Estado;
    }

    public Paquete(int idPaq, String Descripcion, Float Peso, String Dimension, int Estado, Cliente cliente) {
        this.idPaq = idPaq;
        this.Descripcion = Descripcion;
        this.Peso = Peso;
        this.Dimension = Dimension;
        this.Estado = Estado;
        this.cliente = cliente;
    }
    private Cliente cliente;

    public int getIdPaq() {
        return idPaq;
    }

    public void setIdPaq(int idPaq) {
        this.idPaq = idPaq;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaq=" + idPaq + ", Descripcion=" + Descripcion + ", Peso=" 
                + Peso + ", Dimension=" + Dimension + ", Estado=" + Estado + ", cliente=" + cliente + '}';
    }
          
}
