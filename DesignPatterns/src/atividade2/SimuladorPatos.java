package atividade2;


public class SimuladorPatos {

public static void main(String[] args) {
        
        SimuladorPatos simulador = new SimuladorPatos();
        
        AbstractPatoFactory patoFactory = new ContadorPatoFactory();
        //AbstractPatoFactory patoFactory = new PatoFactory();
        
        simulador.simular(patoFactory);
        
    }
    
    public void simular(AbstractPatoFactory patoFactory){
        
        Pato patoSelvagem = patoFactory.criaPatoSelvagem();
        Pato patoCabecaVermelha = patoFactory.criaPatoCabecaVermelha();
        Pato patoApito = patoFactory.criaApitoChamadoPato();
        Pato patoBorracha = patoFactory.criaPatoBorracha();
        
        Peru peru = new Peru();
        Pato peruPato = new PeruAdapter(peru);
        
        Bando bandoDePatos = new Bando();
        bandoDePatos.add(patoSelvagem);
        bandoDePatos.add(patoCabecaVermelha);
        bandoDePatos.add(patoApito);
        bandoDePatos.add(patoBorracha);
        
        bandoDePatos.add(peruPato);
        
        Bando patosSelvagens = new Bando();
        Pato patosSelvagem1 = patoFactory.criaPatoSelvagem();
        Pato patosSelvagem2 = patoFactory.criaPatoSelvagem();
        Pato patosSelvagem3 = patoFactory.criaPatoSelvagem();
        Pato patosSelvagem4 = patoFactory.criaPatoSelvagem();
        
        patosSelvagens.add(patosSelvagem1);
        patosSelvagens.add(patosSelvagem2);
        patosSelvagens.add(patosSelvagem3);
        patosSelvagens.add(patosSelvagem4);
        
        bandoDePatos.add(patosSelvagens);
                
        PatoEcologista patoEcologista = new PatoEcologista();
        bandoDePatos.registrarObservador(patoEcologista);
        
        simular(bandoDePatos);
        
        System.out.println("" + ContadorPatos.getQuacks() + " patos fizeram quack!!");
        
    }
    
    public void simular(Pato pato){
        pato.quack();
    }
	
}
