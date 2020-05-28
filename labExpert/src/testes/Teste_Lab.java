package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import labExpert.Aluno;
import labExpert.Controller;
import labExpert.Disciplina;
import labExpert.Professor;

public class Teste_Lab {

	Aluno a1,a2,a3;
	Professor p1,p2,p3;
	Disciplina d1,d2,d3;
	Controller c;
	 ArrayList<Aluno> alunos;
	 ArrayList<Professor> profes;
	@Before
	public void setUp() throws Exception {
		a1 = new Aluno("pedro", 1514);
		a2 = new Aluno("aline",264);
		a3 = new Aluno("josy",321);
		p1 = new Professor("carlos", 666);
		p2 = new Professor("rose",555);
		p3 = new Professor("laura",888);
		d1 = new Disciplina("IA","7:00/9:00");
		d2 = new Disciplina("MAP","11:00/13:00");
		d3 = new Disciplina("EDA","9:00/11:00");
		c = new Controller();
		profes = new ArrayList<Professor>();
		alunos = new ArrayList<Aluno>();
	}

	@Test
	public final void criarAluno() {
		assertNotNull(a1.getMatricula());
		assertNotNull(a1.getNome());
		assertEquals("pedro", a1.getNome());
		assertEquals(1514, a1.getMatricula());
		
		}
	@Test
	public final void criarProfessor(){
		assertNotNull(p1.getMatricula());
		assertNotNull(p1.getNome());
		assertEquals("carlos", p1.getNome());
		assertEquals(666, p1.getMatricula());
		
	}
	@Test
	public final void criarDisciplina(){
		assertNotNull(d1.getHorario());
		assertNotNull(d1.getNome());
		assertEquals("IA", d1.getNome());
		assertEquals("7:00/9:00", d1.getHorario());
	}
	/*@Test
	public final void salvarAluno(){
	
		alunos.add(a1);
		asserte();
		//assertTrue(true, alunos.contains(a1));
	}*/
}
