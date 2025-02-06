public class Diglett extends Pokemon implements Ievolvi, Ifossa {

    public Diglett() {
        super("Diglett", "terra", 60, 20, 20, 0);
    }

    @Override
    public void fossa() {
        if (isStato() == false) {
            System.out.println("Diglett usa fossa");
            setStato(true);
        }
    }

    @Override
    public void evolvi() {
        if (getVittorie() == 3) {
            System.out.println("Il tuo Diglett si sta evolvendo!");
            setNome("Dugtrio");
            setPuntiSalute(100);
            setPuntiAttacco(50);
            setPuntiDifesa(50);
        } else
            System.out.println("Non puoi ancora evolvere Diglett");
    }

    @Override
    public void attacca(Pokemon avversario) {
        System.out.println(getNome() + " usa botta");
        int danno = 0;
        if (avversario.isStato() == false) {
            if (getPuntiAttacco() > avversario.getPuntiDifesa()) {
                danno = getPuntiAttacco() - avversario.getPuntiDifesa();
            }
            if (avversario.getTipo().equals("elettro")) {
                danno = (getPuntiAttacco() - avversario.getPuntiDifesa()) + 10;
            }
            avversario.subisciDanno(danno);
        } else
            System.out.println("Non vedi il pokemon avversario");
    }
}