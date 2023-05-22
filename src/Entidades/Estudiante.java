
package Entidades;

/**
 *
 * @author Luis Bedoya
 */
public class Estudiante {

    private String cedula;
    private String nombres;
    private String correo;
    private String telefono;
    private String codigoEstudiantil;
    private float promedio;
    private float matricula;

    Estudiante next;

    public Estudiante(){
        cedula = " ";
        nombres = " ";
        correo = " ";
        telefono = " ";
        codigoEstudiantil = " ";
        promedio = 0;
        matricula = 0;
        next = null;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getCedula(){
        return cedula;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getNombres(){
        return nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getMatricula() {
        return matricula;
    }

    public void setMatricula(float matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Datos del estudiante:" + '\n' 
                +  "Cédula: " + cedula +  '\n' +  "Nombres y Apellidos: "  +  nombres + '\n' + "Correo: " + correo + '\n' +
                "Teléfono: "  + telefono + '\n' +"Código estudiantil: "  + codigoEstudiantil + '\n' +
                "Promedio: " + promedio + '\n' + "Valor de matrícula: " + matricula ;
    }

    
    

    

}
