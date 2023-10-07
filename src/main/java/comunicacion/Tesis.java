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
public class Tesis extends Escrito{

    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
        this.argumentos = argumentos;
    }
    
    
    
    public int palabrasTotales(int palabras){
        return this.getPaginas()*palabras*5;
    }
    
    public String interpretacion(){
        return this.interpretacion;
    }
    
    public String toString(){
        return this.getOrigen()
                + "\n" + this.getTitulo()
                + "\n" + this.getAutor()
                + "\n" + this.getPaginas()
                + "\n" + this.idea
                + "\n" + this.argumentos.length
                + "\n" + this.conclusion
                + "\n" + this.referencias;
    }
    
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
