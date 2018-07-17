package model;

import java.awt.List;
import java.util.ArrayList;


public class Jugador {
	
	private String nombre;
	private int indice;
        private ArrayList<Territorio> territoriosOcupados;
	//Cards might be here
	//private Vector<Tarjeta> tarjetas;
	private int ejercitos;
	//private int territoriesCaptured; //Same as occupiedTerritories.size()

	
	public Jugador(String nm, int i) 
        {
		nombre = nm;
		indice = i;
		territoriosOcupados = new ArrayList<Territorio>();
                //tarjetas = new Vector<Tarjeta>();
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
	
/*	public Vector getTarjetas(){
		return tarjetasPoseidas;
	} */

   
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
/*
        public void setTarjeta(Tarjeta c){
            tarjetas.add(c);
        }

        public Vector<Tarjeta> getTarjeta(){
            return tarjetas;
        }
*/	
	public void addArmies(int a){
		ejercitos += a;
	}

        public void añadirEjercitos(){
            ejercitos++;
        }

        public void ejercitosPerdidos(int a){
            ejercitos -= a;
        }
        
        public void ejercitoPerdido(){
            ejercitos--;
        }
	
	
}
