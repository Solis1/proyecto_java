package src.clases;

public class Articulo<E> {

    private E nombre;
    private E codigo;
    private E precio;
    private E existencia;

    public E getNombre() {
        return nombre;
    }

    public void setNombre(E nombre) {
        this.nombre = nombre;
    }

    public E getCodigo() {
        return codigo;
    }

    public void setCodigo(E codigo) {
        this.codigo = codigo;
    }

    public E getPrecio() {
        return precio;
    }

    public void setPrecio(E precio) {
        this.precio = precio;
    }

    public E getExistencia() {
        return existencia;
    }

    public void setExistencia(E existencia) {
        this.existencia = existencia;
    }

}
