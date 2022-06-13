package controller;

import model.Pedido;

public interface IDesconto {

	public double calculaDesconto(Pedido p);
	public void proximoDesconto(Pedido p);
	
//	Exercicio processo seletivo pontua��o acrescida: 
//	Ensino M�dio Escola p�blica (3 anos)
//	Ensino Superior P�blico Completo (Enum Completo, Incompleto)
//	Tempo de registro entidade de classe (Multiplicar pelo tempo)
//	Tempo de experi�ncia na �rea (Multiplicar pelo tempo)
	
}
