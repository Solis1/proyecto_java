package src.clases;

public class Cajero extends Empleado {

    String numCaja;

    public Cajero() {

        this.setNombre("Jessica Mondragon");
        this.setDireccion("Cuarta 100 Col. Sur");
        this.setTelefono("6149876543");
        this.setTurno("Vespertino");
        this.setSueldo("1500");
        this.setNumCaja("Caja 2");

    }

    public String getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }

}
