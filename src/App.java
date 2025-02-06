import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pokemon> allenatore1 = new ArrayList<>();
        List<Pokemon> allenatore2 = new ArrayList<>();
        List<Pokemon> allPokemon = new ArrayList<>();
        Pikachu p = new Pikachu();
        Bulbasaur b = new Bulbasaur();
        Squirtle s = new Squirtle();
        Charmander c = new Charmander();
        Diglett d = new Diglett();

        allPokemon.add(p);
        allPokemon.add(b);
        allPokemon.add(s);
        allPokemon.add(c);
        allPokemon.add(d);

        Scanner sc = new Scanner(System.in);

        System.out.println("Scegli 2 pokemon tra:  pikachu, charmander, bulbasaur, squirtle, diglett");
        allPokemon.stream().map(l -> l.getNome()).forEach(System.out::println);
        String poke = sc.nextLine();
        if(poke.equalsIgnoreCase(p.getNome())){

        }
        sc.close();
    }
}
