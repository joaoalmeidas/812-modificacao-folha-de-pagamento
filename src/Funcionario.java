

public abstract class Funcionario implements Pagamento{
	
	private final String nome;
	private final String sobrenome;
	private final String cpf;
	private final Data dataDeNascimento;
	
	public Funcionario(String nome, String sobrenome, String cpf, Data dataDeNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}


	public String getCpf() {
		return cpf;
	}
	
	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}

	@Override
	public String toString() {
		return String.format("\nDados do funcionário:\nNome: %s %s\nCPF:%s\n",
				getNome(), getSobrenome(), getCpf());
	}
	
	public abstract double calculaGanhos();
}
