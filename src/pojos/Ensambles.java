package pojos;

public class Ensambles {
    // Atributos
    int id_compu;
    String fabricante;
    String modelo;
    int precio;
    int existencia;
    String ram;
    String almacenamiento;
    String gama;
    
    // Constructor vacío.

    public Ensambles() {
    }
    
    // Constructor que pasa argumentos.

    public Ensambles(int id_compu, String fabricante, String modelo, int precio, int existencia, String ram, String almacenamiento, String gama) {
        this.id_compu = id_compu;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.existencia = existencia;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.gama = gama;
    }
    
    // Métodos get y set.

    public int getId_compu() {
        return id_compu;
    }

    public void setId_compu(int id_compu) {
        this.id_compu = id_compu;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }
    
}
