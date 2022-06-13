package view;

import java.time.LocalDate;

import controller.DescontoPorTamanho;
import controller.IDesconto;
import model.Pedido;

public class Principal {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.setId(1);
		p.setTamanho(1);
		p.setValor(2000.00);
		p.setDia(LocalDate.now().minusDays(1));
		
		IDesconto desc = new DescontoPorTamanho();
		desc.proximoDesconto(p);
		
		System.out.println(p);
		
	}

}
