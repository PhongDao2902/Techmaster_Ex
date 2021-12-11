package Exercises;

import java.util.ArrayList;

public class Team {
    public static void main(String[] args) {
        String[] names = {"Manchester United", "Real Madrid", "Barcelona", "Liverpool", "Bayern Munich"};
        String[] stadiums = {"Old Traford", "Santiago Bernabéu", "Camp Nou", "Anfield", "Allianz Arena"};
        String[] coaches = {"Ole Gunnar Solskjær", "Carlo Ancelotti", "Xavi", "Jürgen Klopp", "Julian Nagelsmann"};
        Integer[] established_year = {1878, 1902, 1899, 1892, 1900};
        ArrayList<ArrayList<String>> players = new ArrayList<ArrayList<String>>();

        ArrayList<String> Manchester_United = new ArrayList<String>();

        Manchester_United.add("David de Gea");
        Manchester_United.add("Dean Henderson");
        Manchester_United.add("Tom Heaton");
        Manchester_United.add("Lee Grant");
        Manchester_United.add("Matej Kovar");
        Manchester_United.add("Victor Lindelöf");
        Manchester_United.add("Eric Bailly");
        Manchester_United.add("Phil Jones");
        Manchester_United.add("Harry Maguire");
        Manchester_United.add("Luke Shaw");
        Manchester_United.add("Alex Telles");
        Manchester_United.add("Aaron Wan-Bissaka");
        Manchester_United.add("Diogo Dalot");
        Manchester_United.add("Teden Mengi");
        Manchester_United.add("Raphaël Varane");
        Manchester_United.add("Paul Pogba");
        Manchester_United.add("Fred");
        Manchester_United.add("Bruno Fernandes");
        Manchester_United.add("Nemanja Matic");
        Manchester_United.add("Donny van de Beek");
        Manchester_United.add("Scott McTominay");
        Manchester_United.add("Hannibal Mejbri");
        Manchester_United.add("Jesse Lingard");
        Manchester_United.add("Juan Mata");
        Manchester_United.add("Facundo Pellistri");
        Manchester_United.add("Edinson Cavani");
        Manchester_United.add("Anthony Martial");
        Manchester_United.add("Marcus Rashford");
        Manchester_United.add("Mason Greenwood");
        Manchester_United.add("Amad Diallo");
        Manchester_United.add("Anthony Elanga");
        Manchester_United.add("Shola Shoretire");
        Manchester_United.add("Jadon Sancho");
        Manchester_United.add("Cristiano Ronaldo");

        ArrayList<String> Real_Madrid = new ArrayList<String>();
        
        Real_Madrid.add("Altube");
        Real_Madrid.add("Thibaut Courtois");
        Real_Madrid.add("Lucas Cañizares");
        Real_Madrid.add("Luis López");
        Real_Madrid.add("Andriy Lunin");
        Real_Madrid.add("Chust");
        Real_Madrid.add("Dani Carvajal");
        Real_Madrid.add("Eder Militão");
        Real_Madrid.add("Marcelo");
        Real_Madrid.add("Ferland Mendy");
        Real_Madrid.add("Miguel Gutiérrez");
        Real_Madrid.add("Nacho");
        Real_Madrid.add("Odriozola");
        Real_Madrid.add("Pablo Ramó");
        Real_Madrid.add("Santos");
        Real_Madrid.add("Sergio Ramo");
        Real_Madrid.add("Raphaël Varane");
        Real_Madrid.add("Arribas");
        Real_Madrid.add("Blanco");
        Real_Madrid.add("Casemiro");
        Real_Madrid.add("Isco");
        Real_Madrid.add("Toni");
        Real_Madrid.add("Marco Asensio");
        Real_Madrid.add("Marvin Spain");
        Real_Madrid.add("Luka Modrić");
        Real_Madrid.add("Federico Valverde");
        Real_Madrid.add("Karim Benzema");
        Real_Madrid.add("Eden Hazard");
        Real_Madrid.add("Hugo Duro");
        Real_Madrid.add("Lucas Vázquez");
        Real_Madrid.add("Mariano");
        Real_Madrid.add("Óscar Aranda");
        Real_Madrid.add("Rodrygo");
        Real_Madrid.add("Vinícius Júnior");

        ArrayList<String> Barcelona = new ArrayList<String>();

        Barcelona.add("Arnau Tenas");
        Barcelona.add("Iñaki Peña");
        Barcelona.add("Neto");
        Barcelona.add("Marc-André ter Stegen");
        Barcelona.add("Ronald Araújo");
        Barcelona.add("Sergiño Dest");
        Barcelona.add("Jordi Alba");
        Barcelona.add("Junior Firpo");
        Barcelona.add("Clément Lenglet");
        Barcelona.add("Óscar Mingueza");
        Barcelona.add("Piqué");
        Barcelona.add("Santiago Ramos Mingo");
        Barcelona.add("Sergi Roberto");
        Barcelona.add("Samuel Umtiti");
        Barcelona.add("Álex Collado");
        Barcelona.add("Busquets");
        Barcelona.add("Coutinho");
        Barcelona.add("Frenkie de Jong");
        Barcelona.add("Ilaix Moriba");
        Barcelona.add("Matheus Fernandes");
        Barcelona.add("Matheus Fernandes");
        Barcelona.add("Miralem Pjanić");
        Barcelona.add("Riqui Puig");
        Barcelona.add("Martin Braithwaite");
        Barcelona.add("Konrad de la Fuente");
        Barcelona.add("Ousmane Dembélé");
        Barcelona.add("Ansu Fati");
        Barcelona.add("Antoine Griezmann");
        Barcelona.add("Lionel Messi");
        Barcelona.add("Trincão");

        ArrayList<String> Liverpool = new ArrayList<String>();

        Liverpool.add("Adrián");
        Liverpool.add("Alisson");
        Liverpool.add("Liam Hughes");
        Liverpool.add("Loris Karius");
        Liverpool.add("Caoimhin Kelleher");
        Liverpool.add("Marcelo");
        Liverpool.add("Trent Alexander-Arnold");
        Liverpool.add("Joe Gomez");
        Liverpool.add("Ibrahima Konaté");
        Liverpool.add("Joel Matip");
        Liverpool.add("Nathaniel Phillips");
        Liverpool.add("Andrew Robertson");
        Liverpool.add("Kostas Tsimikas");
        Liverpool.add("Virgil van Dijk");
        Liverpool.add("Neco Williams");
        Liverpool.add("Owen Beck");
        Liverpool.add("Harvey Blair");
        Liverpool.add("Conor Bradley");
        Liverpool.add("Elijah Dixon-Bonner");
        Liverpool.add("Fabinho");
        Liverpool.add("Jordan Henderson");
        Liverpool.add("Curtis Jones");
        Liverpool.add("Naby Keïta");
        Liverpool.add("James Milner");
        Liverpool.add("Takumi Minamino");
        Liverpool.add("Tyler Morton");
        Liverpool.add("Alex Oxlade-Chamberlain");
        Liverpool.add("Thiago");
        Liverpool.add("James Balagizi");
        Liverpool.add("Diogo Jota");
        Liverpool.add("Harvey Elliott");
        Liverpool.add("Kaide Gordon");
        Liverpool.add("Sadio Mané");
        Liverpool.add("Divock Origi");
        Liverpool.add("Roberto Firmino");
        Liverpool.add("Mo Salah");
        
        ArrayList<String> Bayern_Munich = new ArrayList<String>();

        Bayern_Munich.add("Manuel Neuer");
        Bayern_Munich.add("Sven Ulreich");
        Bayern_Munich.add("Christian Früchtl");
        Bayern_Munich.add("Dayot Upamecano");
        Bayern_Munich.add("Omar Richards");
        Bayern_Munich.add("Niklas Süle");
        Bayern_Munich.add("Benjamin Pavard");
        Bayern_Munich.add("Alphonso Davies");
        Bayern_Munich.add("Bouna Sarr");
        Bayern_Munich.add("Lucas Hernández");
        Bayern_Munich.add("Tanguy Nianzou");
        Bayern_Munich.add("Josip Stanisic");
        Bayern_Munich.add("Joshua Kimmich");
        Bayern_Munich.add("Leon Goretzka");
        Bayern_Munich.add("Michaël Cuisance");
        Bayern_Munich.add("Marcel Sabitzer");
        Bayern_Munich.add("Marc Roca");
        Bayern_Munich.add("Corentin Tolisso");
        Bayern_Munich.add("Taylor Booth");
        Bayern_Munich.add("Jamal Musiala");
        Bayern_Munich.add("Serge Gnabry");
        Bayern_Munich.add("Robert Lewandowski");
        Bayern_Munich.add("Leroy Sané");
        Bayern_Munich.add("Kingsley Coman");
        Bayern_Munich.add("Eric Maxim Choupo-Moting");
        Bayern_Munich.add("Thomas Müller");
        Bayern_Munich.add("Malik Tillman");

        players.add(Manchester_United);
        players.add(Real_Madrid);
        players.add(Barcelona);
        players.add(Liverpool);
        players.add(Bayern_Munich);

        for(int i = 0; i <= 5; i++){
            System.out.println(names[i]);
            System.out.println(stadiums[i]);
            System.out.println(coaches[i]);
            System.out.println(established_year[i]);
            System.out.println(players.get(i));
        }
        
    }

}
