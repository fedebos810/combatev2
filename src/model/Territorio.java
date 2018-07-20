
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
	private int continente;
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
/*	
	public void setContinent(int c) {
		continent = c;
	}

	public int getContinent() {
		return continente;
	}

	public boolean isAdjacent(Territory t){
		return adjacents.contains(t.getId());
	}

        public boolean isOccupied(){
            if (player.getPlayerIndex() == -1)
                return false;
            return true;
        }
	
	public void addArmies(int n){
		armies+=n;
	}

      /*  public boolean territoryChained(Territory a,Territory next){
           if(player != a.getPlayer())
               return false;
            if(a.getPlayer() != next.getPlayer())
                return false;
            else{
               for(int i = 0;i < adjacents.size();i++){
                    if(a.isAdjacent(RiskGame.territories.elementAt(adjacents.elementAt(i))))
                            System.out.println(i+" is adjacent");

               }

            }

                return false;

            }

        public void addArmy(){
            armies++;
        }
	
	public void looseArmy(){
		armies--;
	}

        public void looseArmies(int a){
            armies -= a;
        }

        public void printAdjacents(){
            for(int i = 0; i < adjacents.size(); i++){
               System.out.println("Print" + adjacents.elementAt(i));
            }


        }
 */   
}

