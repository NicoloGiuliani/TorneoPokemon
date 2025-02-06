public class Pikachu extends Pokemon implements Ievolvi, IattaccoSpeciale {

    public Pikachu() {
        super("Pikachu", "elettro", 60, 20, 20, 0);
    }

    @Override
    public void eseguiMossaSpeciale(Pokemon avversario) {
        System.out.println(getNome() + " usa Fulmine");
        avversario.subisciDanno(getPuntiAttacco());
    }

    @Override
    public void evolvi() {
        if (getVittorie() == 3) {
            System.out.println("Il tuo Pikachu si sta evolvendo!");
            setNome("Raichu");
            setPuntiSalute(120);
            setPuntiAttacco(60);
            setPuntiDifesa(45);
        } else
            System.out.println("Non puoi ancora evolvere Pikachu");
    }

    @Override
    public void attacca(Pokemon avversario) {
        System.out.println(getNome() + " usa botta");
        int danno = 0;
        if (avversario.isStato() == false) {
            if (getPuntiAttacco() > avversario.getPuntiDifesa()) {
                danno = getPuntiAttacco() - avversario.getPuntiDifesa();
            }
            if (avversario.getTipo().equals("acqua")) {
                danno = (getPuntiAttacco() - avversario.getPuntiDifesa()) + 10;
            }
            avversario.subisciDanno(danno);
        } else
            System.out.println("Non vedi il pokemon avversario");
    }
}