public class Squirtle extends Pokemon implements Ievolvi, Icorazzato {

    public Squirtle() {
        super("Squirtle", "acqua", 60, 15, 25, 0);
    }

    @Override
    public void attivaCorazza() {
        if (getPuntiDifesa() == 30) {
            System.out.println("La corazza è già attiva");
        } else {
            System.out.println(getNome() + " attiva corazza");
            setPuntiAttacco(getPuntiAttacco()-5);
            setPuntiDifesa(getPuntiDifesa()+5);
        }
    }

    @Override
    public void disattivaCorazza() {
        if (getPuntiDifesa() == 25) {
            System.out.println("La corazza non è attiva");
        } else {
            System.out.println(getNome() + " disattiva corazza");
            setPuntiAttacco(getPuntiAttacco()+5);
            setPuntiDifesa(getPuntiDifesa()-5);
        }
    }

    @Override
    public void evolvi() {
        if (getVittorie() == 3) {
            System.out.println("Il tuo Squirtle si sta evolvendo!");
            setNome("Wartortle");
            setPuntiSalute(80);
            setPuntiAttacco(30);
            setPuntiDifesa(30);
        } else
            System.out.println("Non puoi ancora evolvere Squirtle");
        if (getVittorie() == 6) {
            System.out.println("Il tuo Wartortle si sta evolvendo!");
            setNome("Blastoise");
            setPuntiSalute(120);
            setPuntiAttacco(45);
            setPuntiDifesa(45);
        } else
            System.out.println("Non puoi ancora evolvere Wartortle");
    }

    @Override
    public void attacca(Pokemon avversario) {
        System.out.println(getNome() + " usa botta");
        int danno = 0;
        if (avversario.isStato() == false) {
            if (getPuntiAttacco() > avversario.getPuntiDifesa()) {
                danno = getPuntiAttacco() - avversario.getPuntiDifesa();
            }
            if (avversario.getTipo().equals("fuoco")) {
                danno = (getPuntiAttacco() - avversario.getPuntiDifesa()) + 10;
            }
            avversario.subisciDanno(danno);
        } else
            System.out.println("Non vedi il pokemon avversario");
    }
}