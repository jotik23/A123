package co.a123.a123comun.entidades;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class InfoAdicional implements Serializable{

	public static final String ID = "_id";
    public static final String EVENTO = "evento";
    
	private static final long serialVersionUID = 1L;
	
	@DatabaseField(generatedId = true, columnName = ID)
	private long id;
	@DatabaseField(foreign = true, columnName = EVENTO)
    private Evento evento;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
}
