/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteCaja;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Gonzalo
 */
public class Caja implements Serializable{
    
    private File rutaImagen;

    public Caja(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
}
