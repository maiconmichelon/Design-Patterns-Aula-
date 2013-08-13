package observer;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		final Cotacao cotacao1 = new Cotacao("Dólar", 0f);
		final Cotacao cotacao2 = new Cotacao("Real", 0f);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random r = new Random();
				while(true){
					cotacao1.setValor(r.nextFloat());
					cotacao2.setValor(r.nextFloat());
					try{
						Thread.sleep(5000);
					}catch(Exception e){
					}
				}
			}
		}).start();
		
		Painel1 p1 = new Painel1();
		p1.setVisible(true);
		cotacao1.addObserver(p1);
		cotacao2.addObserver(p1);
		
		Painel2 p2 = new Painel2();
		p2.setVisible(true);
		cotacao1.addObserver(p2);
		cotacao2.addObserver(p2);
	}
	
}
