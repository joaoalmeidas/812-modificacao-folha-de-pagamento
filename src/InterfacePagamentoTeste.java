import java.util.Calendar;

public class InterfacePagamentoTeste {

	public static void main(String[] args) {
		
		Pagamento[] pagamentos = new Pagamento[4];
		
		pagamentos[0] = new FuncionarioAssalariado("David", "Beckham", "12546546512", new Data(21, 1, 1993), 12654);
		pagamentos[1] = new FuncionarioAssalariado("Eric", "Cantona", "125545466812", new Data(1, 8, 1993), 54654);
		pagamentos[2] = new FuncionarioAssalariado("João", "Almeida", "12546566812", new Data(1, 2, 1993), 2124);
		pagamentos[3] = new FuncionarioAssalariado("Maria", "Almeida", "12524566812", new Data(1, 1, 1995), 2000);
		
		System.out.println("Pagamentos das faturas e dos funcionários processados polimorficamente.");
		
		
		for(Pagamento pagamentoAtual: pagamentos) {
			
			FuncionarioAssalariado func = (FuncionarioAssalariado) pagamentoAtual;
			
			
			if(func.getDataDeNascimento().getMes() - 1 == Calendar.getInstance().get((Calendar.MONTH))) {
				
				func.setSalarioSemanal(func.getSalarioSemanal() + 500);
				
			}
			
			System.out.printf("%n%s %n%s: $%,.2f%n", pagamentoAtual.toString(), "valor a pagar", pagamentoAtual.calculaQuantiaPagamento());
			
		}

	}

}
