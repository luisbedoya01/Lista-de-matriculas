
package Entidades;

import javax.swing.*;


/**
 *
 * @author Luis Bedoya
 */
public class listaMatriculas {

    Estudiante first;
    Estudiante last;

    public listaMatriculas(){
        first = null;
        last = null;
    }

    public void menuPrincipal(){
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion a realizar:" + '\n' + "1. Ingresar estudiante" + '\n'
                    + "2. Consultar estudiante" + '\n' + "3. Eliminar estudiante " + '\n' + "4. Mostrar estudiantes" + '\n' +
                    "5. Salir"));

            switch (opcion) {
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    consultarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    mostrarEstudiantes();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Finalizando programa....");
                    System.exit(0);
                    break;
            }
        } while(opcion != 5);
    }

    public void ingresarEstudiante(){

        Estudiante estudianteNuevo = new Estudiante();

        JOptionPane.showMessageDialog(null, "Ingrese los datos para el estudiante");

        estudianteNuevo.setCedula(JOptionPane.showInputDialog("Cedula: "));
        estudianteNuevo.setNombres(JOptionPane.showInputDialog("Nombres: "));
        estudianteNuevo.setCorreo(JOptionPane.showInputDialog("Correo: "));
        estudianteNuevo.setTelefono(JOptionPane.showInputDialog("Teléfono: "));
        estudianteNuevo.setCodigoEstudiantil(JOptionPane.showInputDialog("Código estudiantil: "));
        estudianteNuevo.setPromedio(Float.parseFloat(JOptionPane.showInputDialog("Promedio: ")));

        float tarifaBase = 125;
        
        if(estudianteNuevo.getPromedio()>9.5){
            float descuento1 = (float)(tarifaBase * 0.3);
            estudianteNuevo.setMatricula(tarifaBase-descuento1);
        } else if(estudianteNuevo.getPromedio()>=9&&estudianteNuevo.getPromedio()<=9.5){
            float descuento2 = (float)(tarifaBase * 0.2);
                estudianteNuevo.setMatricula(tarifaBase - descuento2);
            } else{
                estudianteNuevo.setMatricula(tarifaBase);
            }


        JOptionPane.showMessageDialog(null, "Estudiante ha sido ingresado correctamente");

        if(first == null){
            first = estudianteNuevo;
            first.next = null;
            last = first;
        } else{
            last.next = estudianteNuevo;
            estudianteNuevo.next = null;
            last = estudianteNuevo;
        }
    }


    public void consultarEstudiante(){

        Estudiante actual = new Estudiante();
        actual = first;
        boolean finder = false;
        String estudianteBuscar = JOptionPane.showInputDialog("Ingrese la cédula del estudiante para consultar sus datos");

        if(first != null){
            while(actual != null && finder != true ){
                if(actual.getCedula().equals(estudianteBuscar)){
                    JOptionPane.showMessageDialog(null, "Estudiante encontrado: " + '\n' + actual);
                    finder = true;
                }
                actual = actual.next;
            }
            if(!finder){
                JOptionPane.showMessageDialog(null, "No existe estudiante con cédula: " + estudianteBuscar + " dentro de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay estudiantes para consultar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void eliminarEstudiante(){
        Estudiante actual = new Estudiante();
        actual = first;
        Estudiante previous = new Estudiante();
        previous = null;
        boolean finder = false;
        String estudianteBuscar = JOptionPane.showInputDialog("Ingrese la cédula del estudiante a eliminar");

        if(first != null){
            while(actual != null && finder != true){
                if(actual.getCedula().equals(estudianteBuscar)){
                    if(actual == first){
                        first = first.next;
                    } else if(actual == last){
                        previous.next = null;
                        last = previous;
                    } else{
                        previous.next = actual.next;
                    }
                    JOptionPane.showMessageDialog(null, "Se eliminó a: " + actual.getNombres() + " de la lista");
                    finder = true;
                }
                previous = actual;
                actual = actual.next;
            }
            if(!finder){
                JOptionPane.showMessageDialog(null, "No existe estudiante con cédula: " + estudianteBuscar + " dentro de la lista", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay estudiantes para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarEstudiantes(){
        Estudiante actual = new Estudiante();
        actual = first;

        if(first != null){
            while(actual!=null){

                JOptionPane.showMessageDialog(null, actual);
                actual = actual.next;
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay estudiantes para mostrar" , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}





