package controller;

import model.Pedido;

public class DescontoPorTamanho implements IDesconto {
	
	@Override
	public double calculaDesconto(Pedido p) {
		double descTotal = 1.00;
		if (p.getTamanho() > 10) {
			descTotal = descTotal - 0.08;
		}
		return p.getValor() * descTotal;
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
		
		DescontoPorValor descPorValor = new DescontoPorValor();
		descPorValor.proximoDesconto(p);
	}
	

}
