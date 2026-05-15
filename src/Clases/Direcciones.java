
package Clases;

/**
 *
 * @author hansa
 */
public class Direcciones {
    private int idDir;
    private String Calle1;
    private String Calle2;
    private int Actual;

    public Direcciones() {
    }

    public Direcciones(int idDir, String Calle1, String Calle2, int Actual) {
        this.idDir = idDir;
        this.Calle1 = Calle1;
        this.Calle2 = Calle2;
        this.Actual = Actual;
    }

    public int getIdDir() {
        return idDir;
    }

    public String getCalle1() {
        return Calle1;
    }

    public String getCalle2() {
        return Calle2;
    }

    public int getActual() {
        return Actual;
    }

    public void setIdDir(int idDir) {
        this.idDir = idDir;
    }

    public void setCalle1(String Calle1) {
        this.Calle1 = Calle1;
    }

    public void setCalle2(String Calle2) {
        this.Calle2 = Calle2;
    }

    public void setActual(int Actual) {
        this.Actual = Actual;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "idDir=" + idDir + ", Calle1=" + Calle1 + ", Calle2=" + Calle2 + ", Actual=" + Actual + '}';
    }
    
    
    
    
}
