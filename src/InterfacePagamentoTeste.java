
public class InterfacePagamentoTeste {

	public static void main(String[] args) {
		
		Pagamento[] pagamentos = new Pagamento[4];
		
		pagamentos[0] = new Fatura("01234", "banco", 2, 75.3);
		pagamentos[1] = new Fatura("56789", "pneu", 5, 43.3);
		pagamentos[2] = new FuncionarioAssalariado("João", "Almeida", "12546566812", 2124);
		pagamentos[3] = new FuncionarioAssalariado("Maria", "Almeida", "12524566812", 2000);
		
		System.out.println("Pagamentos das faturas e dos funcionários processados polimorficamente.");
		
		for(Pagamento pagamentoAtual: pagamentos) {
			
			System.out.printf("%n%s %n%s: $%,.2f%n", pagamentoAtual.toString(), "valor a pagar", pagamentoAtual.calculaQuantiaPagamento());
			
		}

	}

}
