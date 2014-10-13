package co.a123.a123comun.entidades;

import java.io.Serializable;
import java.sql.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Historial implements Serializable{

	public static final String ID = "_id";
    public static final String DESCRIPCION = "descripcion";
    public static final String EVENTO = "evento";
    public static final String TIPO = "tipo";
    public static final String URL = "url";
    public static final String FECHA_HORA = "fechaHora";

	private static final long serialVersionUID = 1L;
	
	@DatabaseField(generatedId = true, columnName = ID)
	private long id;
	@DatabaseField(columnName = DESCRIPCION)
	private String descripcion;
	@DatabaseField(columnName = TIPO)
	private String tipo;
	@DatabaseField(columnName = URL)
	private String url;
	@DatabaseField(columnName = FECHA_HORA)
	private Date fechaHora;
	@DatabaseField(foreign = true, columnName = EVENTO)
    private Evento evento;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
}
