package Mundo;

public class Nota {

	
	private Curso curso;
	
	private Materia materia;
	
	private int periodo;
	
	private double valor;

	/**
	 * @param curso
	 * @param materia
	 * @param periodo
	 * @param valor
	 */
	public Nota(Curso curso, Materia materia, int periodo, double valor) {
		super();
		this.curso = curso;
		this.materia = materia;
		this.periodo = periodo;
		this.valor = valor;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
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
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
