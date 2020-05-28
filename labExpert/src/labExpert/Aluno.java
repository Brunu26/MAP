package labExpert;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private int matricula;
	private ArrayList<Disciplina> dis = new ArrayList<Disciplina>();
	
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.dis = new ArrayList<Disciplina>();
		
	}

	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	


/**
 * adicionar disciplina ao aluno
 * @param disc
 */
	public void addDisciplina(Disciplina disc){
		this.dis.add(disc);
		
	}

	// d. Quais as disciplinas de um aluno?/ e.qual o horario de um aluno?
	/**
	 * Método para verificar as disciplinas e horarios do aluno
	 */
	public void listarDisc(){
		System.out.println("\nO aluno(a): "+ getNome()+", está matriculado nas seguintes disciplinas: ");
		for(Disciplina d: dis){
			System.out.println("\n"+ d.getNome()+"\nHorario: " + d.getHorario());
		}
	}
	
	
	
	
}
