package controller;

import model.Pedido;

public class DescontoPorDia implements IDesconto {

	@Override
	public double calculaDesconto(Pedido p) {
		double descTotal = 1.00;
		if (p.getDia().getDayOfWeek().getValue() == 1) {
			descTotal = descTotal - 0.05;
		}
		return p.getValor() * descTotal;	
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
	}

}
