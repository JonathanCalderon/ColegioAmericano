package Mundo;

public class Logro {

	
	private int periodo;
	
	private int calificacion;
	
	private String descripcion;

	/**
	 * @param periodo
	 * @param descripcion
	 */
	public Logro(int periodo, String descripcion) {
		super();
		this.periodo = periodo;
		this.descripcion = descripcion;
	}

	/**
	 * @return the periodo
	 */
	public int getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the calificacion
	 */
	public int getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
