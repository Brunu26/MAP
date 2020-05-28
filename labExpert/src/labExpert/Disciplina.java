package labExpert;

public class Disciplina {

	private String nome;
	private String horario;
	private int quantAlunos = 0;
	
	public Disciplina(String nome, String horario) {
		super();
		this.nome = nome;
		this.horario = horario;
	}

	
	public String getNome() {
		return nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	

}
