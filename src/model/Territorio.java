
package model;

import model.Jugador;
import java.lang.reflect.Array;


public class Territorio 
{   
    
	protected int id;
        private int x;
        private int y;
	private String nombre;
	private Jugador jugador;
	private int ejercitos;
	private int continente;//todavia no lo usamos
	private int[] limitrofes;//id de los paises limitrofes
        
	public Territorio(int i,int cl){
		id = i;
		//nombre = nm;
		//continente = c;
		ejercitos = 0; //empieza vacio
		limitrofes = new int[cl];//cantidad de paises limitrofes
                jugador = new Jugador(null,-1);
	}
	
	public void setJugador(Jugador p){
		jugador = p;
	}

        public void setLimitrofe(int[] a){
            limitrofes = a;
        }
	
	public void setEjercito(int a){
		ejercitos = a;
	}
	
	public int getId(){
		return id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Jugador getJugador(){
		return jugador;
	}
	
	public int getEjercitos(){
		return ejercitos;
	}
	
	public int[] getLimitrofes(){
		return limitrofes;
	}
        
}

