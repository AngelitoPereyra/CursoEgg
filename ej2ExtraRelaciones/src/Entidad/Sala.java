/*

 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Sala {
    private ArrayList<Espectador> listaIngreso;
    private String butacas[][] = new String [6][8];
    private boolean flag;

    public Sala(ArrayList<Espectador> listaIngreso, String[][] butacas, boolean flag) {
        this.listaIngreso = listaIngreso;
        this.butacas = butacas;
        this.flag = flag;
    }

    public Sala() {
    }

    public ArrayList<Espectador> getListaIngreso() {
        return listaIngreso;
    }

    public void setListaIngreso(ArrayList<Espectador> listaIngreso) {
        this.listaIngreso = listaIngreso;
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setNuevaSala(String[][] butacas) {
        this.butacas = butacas;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Sala{" + "listaIngreso=" + listaIngreso + ", butacas=" + butacas + ", flag=" + flag + '}';
    }

   
    
    public void NuevaSala(){
        String letra ="";
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <7; j++) {
                switch (j){
                    case 6:
                        letra = "A";
                        break;
                    case 5:
                        letra = "B";
                        break;
                    case 4:
                        letra = "C";
                        break;
                    case 3:
                        letra = "D";
                        break;
                    case 2:
                        letra = "E";
                        break;
                    case 1:
                        letra = "F";
                        break;
                }
                
                butacas[i][j]="|"+ i+letra + "|";
                System.out.print(butacas[i][j]);
            }
            System.out.println("");
        }
    }
    
}
