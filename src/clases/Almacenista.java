package src.clases;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Almacenista extends Empleado{
    
    
    
    public Almacenista() {
        
        
            this.setNombre("Carlos Armendariz");
            this.setDireccion("Äv. Estocolmo 2109 Col. Centro");
            this.setTelefono("6142413567");
            this.setTurno("Matutino");
            this.setSueldo("1800");
            this.setNumAlmacen("Almacen 2");
            
       
    }
    String numAlmacen;

    public String getNumAlmacen() {
        return numAlmacen;
    }

    public void setNumAlmacen(String numAlmacen) {
        this.numAlmacen = numAlmacen;
    }

    
}
