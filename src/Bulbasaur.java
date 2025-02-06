public class Bulbasaur extends Pokemon implements Ievolvi, IattaccoSpeciale {

    public Bulbasaur() {
        super("Bulbasaur", "erba", 60, 25, 10, 0);
    }

    @Override
    public void eseguiMossaSpeciale(Pokemon avversario) {
        System.out.println(getNome() + " usa Foglielama");
        avversario.subisciDanno(getPuntiAttacco());
    }

    @Override
    public void evolvi() {
        if (getVittorie() == 3) {
            System.out.println("Il tuo Bubasaur si sta evolvendo!");
            setNome("Ivysaur");
            setPuntiSalute(80);
            setPuntiAttacco(35);
            setPuntiDifesa(25);
        }
        else System.out.println("Non puoi ancora evolvere Bubasaur");
        if (getVittorie() == 6) {
            System.out.println("Il tuo Ivysaur si sta evolvendo!");
            setNome("Venosaur");
            setPuntiSalute(120);
            setPuntiAttacco(45);
            setPuntiDifesa(40);
        } else
            System.out.println("Non puoi ancora evolvere Ivysaur");
    }

    @Override
    public void attacca(Pokemon avversario) {
        System.out.println(getNome() + " usa botta");
        int danno = 0;
        if (avversario.isStato() == false) {
            if (getPuntiAttacco() > avversario.getPuntiDifesa()) {
                danno = getPuntiAttacco() - avversario.getPuntiDifesa();
            }
            if (avversario.getTipo().equals("acqua")||avversario.getTipo().equals("terra")) {
                danno = (getPuntiAttacco() - avversario.getPuntiDifesa()) + 10;
            }
            avversario.subisciDanno(danno);
        } else
            System.out.println("Non vedi il pokemon avversario");
    }
}