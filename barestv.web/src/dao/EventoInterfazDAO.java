package dao;



import java.util.ArrayList;

import beans.*;

public interface EventoInterfazDAO {
	//Obtener varios
	public ArrayList<Evento> getAll(String establecimiento) throws Exception;
	
	//Obtener uno
	public Evento get(String establecimiento,String tituloEvento) throws Exception;
	
	//A�adir un evento
	public boolean add(String establecimiento, Evento e) throws Exception;

	public boolean remove(String titulo, String user) throws Exception;

	public boolean edit(String usuario, Evento e) throws Exception;

	public boolean removeAll(String nickbar)throws Exception;

	public ArrayList<Evento> getAllAll()throws Exception;

	public boolean destacar(String titulo, String bar) throws Exception;

	public boolean nodestacar(String titulo, String bar) throws Exception;
}
