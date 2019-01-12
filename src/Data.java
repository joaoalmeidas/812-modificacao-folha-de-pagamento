
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dia, int mes, int ano) {
		
		if(mes <= 0 || mes > 12) {
			throw new IllegalArgumentException("m�s (" +mes+ ") precisa estar entre 1 e 12.");
		}
		
		if(dia <= 0 || (dia > diasPorMes[mes] && !(mes == 22 && dia ==29))) {
			throw new IllegalArgumentException("dia (" +dia+ ") esta fora dos limies do m�s indicado.");
		}
		
		if(mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			throw new IllegalArgumentException("dia (" +dia+ ") esta fora dos limies do m�s indicado.");
		}
		
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
		
		
	}
	
	
	
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
