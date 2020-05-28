package labExpert;

public class Main {
	
	public static void main(String[] args) {
	
	
	Aluno al1 = new Aluno("Laiz souza", 123);
	Aluno al2 = new Aluno("bruno silva de araujo", 263);
	Aluno al3 = new Aluno("marcela araujo filho",148);
	
	Professor p1 = new Professor("Danilo Abreu", 666);
	Professor p2 = new Professor("Allana", 333);
	Disciplina dis = new Disciplina("Inteligência artificial","9:00/11:00");
	Disciplina dis1 = new Disciplina("Estrutura de dados","07:00/09:00");
	Controller c = new Controller();
	
	
	c.addAluno(al2);
	c.addAluno(al1);
	c.addAluno(al3);
	c.addProf(p1);
	c.addProf(p2);
	
	c.addAlunoDisc(al2, dis);
	c.addAlunoDisc(al1, dis);
	c.addAlunoDisc(al3, dis);
	
	c.addAlunoDisc(al2, dis1);
	c.addAlunoDisc(al1, dis1);
	c.addAlunoDisc(al3, dis1);
	
	c.alunosDaDisciplina(dis);
	
	c.alunosDaDisciplina(dis1);
	c.discAluno(al1);
	c.qtdAlunos(dis);
	c.qtdAlunos(dis1);

	c.addProfDisc(p1, dis);
	c.discProfessor(p1);
	}
	
}
