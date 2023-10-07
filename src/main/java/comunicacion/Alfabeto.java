/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
        this.letras = letras;
    }

    public int cantidadLetras(){
        return this.letras.length;
    }
    
    public String interpretacion(){
        return this.interpretacion;
    }
    
    public String toString(){
        String imp = "";
        for (String i: letras){
            if (letras[letras.length-1] == i){
                imp = imp+i;
            }else{
                imp = imp+i+", ";
            }
            
        }
        return imp;
    }
    
    public String[] getLetras(){
        return this.letras;
    }
    
    public void AddLetras(String letra){
        this.letras[letras.length-1] = letra;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
