public abstract class Pokemon {
    private String nome;
    private String tipo;
    private int puntiSalute;
    private int puntiAttacco;
    private int puntiDifesa;
    private int vittorie;
    private boolean stato;

    public Pokemon(String nome, String tipo, int puntiSalute, int puntiAttacco, int puntiDifesa, int vittorie) {
        this.nome = nome;
        this.tipo = tipo;
        this.puntiSalute = puntiSalute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.vittorie = vittorie;
        this.stato = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntiSalute() {
        return puntiSalute;
    }

    public void setPuntiSalute(int puntiSalute) {
        this.puntiSalute = puntiSalute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public abstract void attacca(Pokemon avversario);

    public void subisciDanno(int danno) {

        setPuntiSalute(puntiSalute - danno);
    }

    public String visualizzaStato() {
        return "Nome: " + nome
                + ", \ntipo: " + tipo
                + ", \npuntiSalute: " + puntiSalute
                + ", \npuntiAttacco: " + puntiAttacco
                + ", \npuntiDifesa: " + puntiDifesa
                + ", \nvittorie: " + vittorie;
    }
}