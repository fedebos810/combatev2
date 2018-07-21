package model;

import java.awt.List;
import java.util.ArrayList;


public class Jugador {
	
	private String nombre;
	private int indice;
        private ArrayList<Territorio> territoriosOcupados;
	private int ejercitos;

	
	public Jugador(String nm, int i) 
        {
		nombre = nm;
		indice = i;
		territoriosOcupados = new ArrayList<Territorio>();
                
	}
	
	public int getIndiceJugador(){
		return indice;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getNumeroDeEjercitos(){
		return ejercitos;
	}
   
    public ArrayList<Territorio> getTerritoriosOcupados(){
		return territoriosOcupados;
	}

	public int numeroDeTerritorios(){
		return territoriosOcupados.size();
	}
	
	public void territorioOcupado(Territorio t){
		territoriosOcupados.add(t);
	}
	
	public void territorioPerdido(Territorio t){
		territoriosOcupados.remove(t);
		territoriosOcupados.trimToSize();
	}

        public void añadirEjercitos(){
            ejercitos++;
        }
        
        public void ejercitoPerdido(){
            ejercitos--;
        }
	
	
}
