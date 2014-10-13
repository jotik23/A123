package co.a123.a123comun.entidades;

import java.io.Serializable;
import java.sql.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Evento implements Serializable{

	public static final String ID = "_id";
    public static final String FECHA_INI = "fechaIni";
    public static final String FECHA_FIN = "fechaFin";
    public static final String LONGITUD = "longitud";
    public static final String LATITUD = "latitud";
    
	private static final long serialVersionUID = 1L;
	
	@DatabaseField(generatedId = true, columnName = ID)
	private long id;
	@DatabaseField(columnName = FECHA_INI)
	private Date fechaIni;
	@DatabaseField(columnName = FECHA_FIN)
	private Date fechaFin;
	@DatabaseField(columnName = LONGITUD)
	private String longitud;
	@DatabaseField(columnName = LATITUD)
	private String latitud;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
