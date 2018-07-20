package controller;

import model.Continente;
import model.Jugador;
import model.Territorio;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import view.Observer;



public class JuegoCombate implements Subject
{
        //ESTADOS DEL JUEGO
        public static final int JUEGO_NUEVO = 0;
        public static final int TROPAS_INICIALES = 1;
        public static final int TURNOS = 2;
        public static final int TURNOS_PUNTOS = 3;
        public static final int REAGRUPAR = 4;
        public static final int TRADE_CARDS = 5;
        public static final int START_TURN = 6;
        public static final int ATAQUE = 7;
        public static final int ATACANDO = 8;
        public static final int FASE_DE_ATAQUE = 9;
        public static final int BATALLANDO = 10;
        public static final int CAPUTRANDO = 11;
        public static final int REFUERZO = 12;
        public static final int REFORZANDO = 13;
        public static final int FASE_REFORZADO = 14;
        
         public static final int GAME_OVER = 99;

	static public ArrayList<Territorio> territorios  = new ArrayList<Territorio>();
        static public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        static public ArrayList<Observer> observadores  = new ArrayList<Observer>();
        public Jugador curPlayer;
        public Jugador defender;
        
        public Jugador activo;
        private int estado;
        public Territorio aTerritorio;
        public Territorio dTerritorio;
        public int defNum = 0;
        public int attNum = 0;
        public int iter = 0;
        public boolean drawn;
       

    public boolean agregarJugador(String nm){
            int size = jugadores.size();
            if (size >= 4)
                return false;
            Jugador p = new Jugador(nm, size);
            jugadores.add(p);
                return true;
        }
    public boolean agregarTerritorios(int cantidad){
            int cl;
        
            for(int i=1 ; i<=cantidad; i++)
            {    
            cl=2;
       /*    try {
            FileReader fr = new FileReader("cantidadlimitrofes.txt");
            BufferedReader br = new BufferedReader(fr);
 
            int cl=nextInt();
            while(cl!= null)
 
            fr.close();
            }
            catch(Exception e) {
            System.out.println("Excepcion leyendo fichero "+ cl + ": " + e);
            }*/
            Territorio t = new Territorio(i,cl);
            territorios.add(t);
            t.setEjercito(i);
        }
        return true;
    }
    public void EstadoJuego()
    {
        for(int i=0;i<6;i++)
        {   
            estado=i;
            if(i==0)
            {
               JOptionPane.showMessageDialog(null,"Binvenido a Combate - Cada Jugador debera agregar 5 ejercitos"); 
            }
            
            
            
        
        }
        
        for(Jugador jug : jugadores)
            {
                activo=jug;
                JOptionPane.showMessageDialog(null,"Jugador "+jug.getNombre()+" tu turno");
                while(jug.getNumeroDeEjercitos()<=2)
                {
                    
                    //System.out.printf("faltan agregar territorios");;
                }
                
            }
    }

    public void Jugando(int idterritorio)
   {
        switch(estado) 
        {
	case 0:
	activo.añadirEjercitos();
        territorios.get(idterritorio).setEjercito(1);
        territorios.get(idterritorio).setJugador(activo);
        System.out.printf("ESTADO 0");//poner 10 fichas
        
       
	break;
	case 1:
		//ponen 5 fichas
	break;
	case 2:				
		//atacan
	break;
	case 3:
		//ponen fichas de acuerdo a sus territorios
	break;
	case 4:
		//chequear jugadores vivos
	break;		
	case 5:
		//calcule ejercitos para cada jugadores
	break;
        case 6:
        break; // estado de fin de 
	default:
		//no hacer nada
	break;
	}
    }   

    @Override
    public void registerObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observador : observadores)
        {
            observador.update(territorios);
        }
    }
}
