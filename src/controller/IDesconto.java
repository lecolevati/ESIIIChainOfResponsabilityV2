package controller;

import model.Pedido;

public interface IDesconto {

	public double calculaDesconto(Pedido p);
	public void proximoDesconto(Pedido p);
	
//	Exercicio processo seletivo pontuação acrescida: 
//	Ensino Médio Escola pública (3 anos)
//	Ensino Superior Público Completo (Enum Completo, Incompleto)
//	Tempo de registro entidade de classe (Multiplicar pelo tempo)
//	Tempo de experiência na área (Multiplicar pelo tempo)
	
}
