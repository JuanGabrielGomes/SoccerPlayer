package jogador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer player = new SoccerPlayer("João Dantas", "meiocampo",
                LocalDate.of(1990, 1, 1), "BRA", 1.85, 85);
        player.printInfo();
        System.out.println("Idade: " + player.calculateAge());
        System.out.println("Anos que faltam para se aposentar: " + player.AnosQueFaltam());
    }
}