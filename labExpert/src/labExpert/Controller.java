package labExpert;

import java.util.ArrayList;

public class Controller {

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Professor> profes = new ArrayList<Professor>();
	
/**
 * add um aluno na lista de alunos
 * @param aluno
 */
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
/**
 * add um aluno a uma dada disciplina e qtd+1
 * @param a
 * @param d
 */
	public void addAlunoDisc(Aluno a, Disciplina d) {
		a.addDisciplina(d);
		d.setQuantAlunos(d.getQuantAlunos() + 1);
	}
/**
 * add um professor na lista de professores
 * @param professor
 */
	public void addProf(Professor professor) {
		profes.add(professor);
	}
/**
 * add um professor a uma dada disciplina
 * @param p
 * @param d
 */
	public void addProfDisc(Professor p, Disciplina d) {
		p.addDisciplina(d);

	}
//c.quais os alunos de uma disciplina
	/**
	 * Método que lista os alunos de uma dada Disciplina
	 * 
	 * @param d
	 */
	public void alunosDaDisciplina(Disciplina d) {
		System.out.println("\nA Disciplina: "+d.getNome()+ " possui os seguintes alunos: ");
		for (Aluno a : alunos) {
			System.out.println(a.getNome());
		}
	}
//d.quais as disciplinas de um aluno?/e.qual o horario do aluno?
	/**
	 * método que retorna as diciplinas e o horario de um aluno
	 * @param a
	 */
	public void discAluno(Aluno a) {
		a.listarDisc();
	}
//a.quais as diciplinas que o professor ministra?/b.qual o horario do professor?
	/**
	 * método que retorna as diciplinas e os horarios de um professor
	 * @param p
	 */
	public void discProfessor(Professor p) {
		p.listarDisc();
	}
	
//f.qtd de alunos de uma disciplina
	/**
	 * Método para verificar a quantidade de alunos de uma disciplina
	 * @param d
	 */
	public void qtdAlunos(Disciplina d) {
		System.out.println("\nA Disciplina: "+d.getNome()+" Possui: "+
		alunos.size()+" alunos");

	}
}
