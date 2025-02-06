public class Charmander extends Pokemon implements Ievolvi, IattaccoSpeciale, Ivola {

    public Charmander() {
        super("Charmander", "fuoco", 60, 30, 10, 0);
    }

    @Override
    public void eseguiMossaSpeciale(Pokemon avversario) {
        System.out.println(getNome() + " usa Lanciafiamme");
        avversario.subisciDanno(getPuntiAttacco());
    }
    
    @Override
    public void vola() {
        if (getNome().equals("Charizard") && isStato() == false) {
            System.out.println("Charizard usa volo");
            setStato(true);
        }
    }

    @Override
    public void evolvi() {
        if (getVittorie() == 3) {
            System.out.println("Il tuo Charmander si sta evolvendo!");
            setNome("Charmaleon");
            setPuntiSalute(80);
            setPuntiAttacco(35);
            setPuntiDifesa(25);
        }
        else System.out.println("Non puoi ancora evolvere Charmander");
        if (getVittorie() == 6) {
            System.out.println("Il tuo Charmaleon si sta evolvendo!");
            setNome("Charizard");
            setPuntiSalute(120);
            setPuntiAttacco(45);
            setPuntiDifesa(40);
        } else
            System.out.println("Non puoi ancora evolvere Charmaleon");
    }

    @Override
    public void attacca(Pokemon avversario) {
        System.out.println(getNome() + " usa botta");
        int danno = 0;
        if (getPuntiAttacco() > avversario.getPuntiDifesa()) {
            danno = getPuntiAttacco() - avversario.getPuntiDifesa();
        }
        if (avversario.getTipo().equals("erba")) {
            danno = (getPuntiAttacco() - avversario.getPuntiDifesa()) + 10;
        }
        avversario.subisciDanno(danno);
    }
}