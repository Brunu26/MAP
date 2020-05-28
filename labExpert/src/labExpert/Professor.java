package labExpert;

import java.util.ArrayList;

public class Professor {

	private String nome;
	private int matricula;
	private ArrayList<Disciplina> dis = new ArrayList<Disciplina>();

	public Professor(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.dis = new ArrayList<Disciplina>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMat(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * adicionar disciplina ao professor
	 * 
	 * @param disc
	 */
	public void addDisciplina(Disciplina disc) {
		this.dis.add(disc);

	}

	// a. Quais as disciplinas de um Professor?/ b.qual o horario de um professor?
	/**
	 * Método para verificar as disciplinas e horarios do aluno
	 */
	public void listarDisc() {
		System.out.println("\nO Professor(a): " + getNome() + ", está ministrando as seguintes disciplinas: ");
		for (Disciplina d : dis) {
			System.out.println("\n" + d.getNome() + "\nHorario: " + d.getHorario());
		}
	}

}
