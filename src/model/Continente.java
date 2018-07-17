/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class Continente 
{
        private String nombre;
	private ArrayList<Integer> territorios;
	private int valor;
	Territorio t;
	
	
	Continente(String nm, ArrayList<Integer> t, int v){
		nombre = nm;
		valor = v;
		territorios = t;
	}
	
	public String getName(){
		return nombre;
	}
	
	public ArrayList<Integer> getTerritorios(){
		return territorios;
	}
	
	public int getValor(){
		return valor;
	}
	
	public boolean esTerritorioDe(Territorio t){
		return (territorios.contains(t.getId()));
	}
	
	/*public boolean esContinenteCapturado(Player p){
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		//ArrayList<Territorio> t2 = p.getOccupiedTerritories();
                
		for (int c = 0; c < t2.size(); c++)
			t1.add(t2.elementAt(c).getId());              
		for (int i = 0; i < territorios.size(); i++){
                    if(!t1.contains(territorios.elementAt(i)))
			return false;
		}//end for loop		
	return true; 
	}
*/
}
