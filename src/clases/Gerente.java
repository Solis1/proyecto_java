package src.clases;

public class Gerente extends Empleado {

    String Sucursal;

    public Gerente() {

        this.setNombre("Francisco Avila");
        this.setDireccion("16 de Sep. 541 Col. Revolucion");
        this.setTelefono("6141432546");
        this.setTurno("Completo");
        this.setSueldo("2500");
        this.setSucursal("Sucursal 2");

    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

}
