/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author Daniel Noriega
 */
public class Maestro extends Persona{
    private long dpi;
    private int carnet;
    private int total;
    private String cursos[] = new String[total];
    
    public Maestro(){
        
    }
    
    public Maestro(String nombre, String apellido, int edad, String[] cursos){
        super();
        this.dpi = dpi;
        this.carnet = carnet;
        this.cursos = cursos;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void mostrarInfo(){
        System.out.println("Datos del Maestro");
        System.out.println("Nombre completo: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carnet: " + this.carnet);
        System.out.println("DPI: " + this.dpi);
        System.out.print("Cursos: ");
        for(String c:cursos){
            System.out.print(c + ", ");
        }
    }
}
