
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Random r = new Random();
        List<Pokemon> allenatore1 = new ArrayList<>();
        List<Pokemon> allenatore2 = new ArrayList<>();
        List<Pokemon> allPokemon = new ArrayList<>();
        Pikachu p = new Pikachu();
        Bulbasaur b = new Bulbasaur();
        Squirtle s = new Squirtle();
        Charmander c = new Charmander();
        Diglett d = new Diglett();
        String poke;

        allPokemon.add(p);
        allPokemon.add(b);
        allPokemon.add(s);
        allPokemon.add(c);
        allPokemon.add(d);

        Scanner sc = new Scanner(System.in);
        while (allenatore1.size() < 2) {
            System.out.println("Scegli 2 pokemon tra:");
            allPokemon.stream().map(l -> l.getNome()).forEach(System.out::println);
            poke = sc.nextLine();
            if (poke.equalsIgnoreCase(p.getNome())) {
                allenatore1.add(new Pikachu());
            }else
            if (poke.equalsIgnoreCase(s.getNome())) {
                allenatore1.add(new Squirtle());
            }else
            if (poke.equalsIgnoreCase(b.getNome())) {
                allenatore1.add(new Bulbasaur());
            }else
            if (poke.equalsIgnoreCase(c.getNome())) {
                allenatore1.add(new Charmander());
            }else
            if (poke.equalsIgnoreCase(d.getNome())) {
                allenatore1.add(new Diglett());
            }else{
                System.out.println("Hai inserito un nome errato");
            }
        }
        int rand=r.nextInt(allPokemon.size())+1;
        int rand2=r.nextInt(allPokemon.size())+1;
        allenatore2.add(allPokemon.get(rand));
        allenatore2.add(allPokemon.get(rand2));

        System.out.println("Azioni possibili: ");
        allenatore1.get(1).

        sc.close();
    }
}
