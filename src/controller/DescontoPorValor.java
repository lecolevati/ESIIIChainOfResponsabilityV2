package controller;

import model.Pedido;

public class DescontoPorValor implements IDesconto {

	@Override
	public double calculaDesconto(Pedido p) {
		double descTotal = 1.00;
		if (p.getValor() > 1000.00) {
			descTotal = descTotal - 0.1;
		}
		return p.getValor() * descTotal;
	}

	@Override
	public void proximoDesconto(Pedido p) {
		p.setValor(calculaDesconto(p));
		
		DescontoPorDia descPorDia = new DescontoPorDia();
		descPorDia.proximoDesconto(p);		
	}

}
