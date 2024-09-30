package regras;

import java.util.ArrayList;
import java.util.List;

public final class RegrasXadrez {
    public static List<String> obterRegras() {
        List<String> regrasXadrez = new ArrayList<>();

        regrasXadrez.add("\n1. O jogo é jogado entre dois jogadores, um com peças brancas e outro com peças pretas.\n");
        regrasXadrez.add(
                "2. O objetivo é dar xeque-mate ao rei do oponente, o que significa que ele não pode escapar do ataque.\n");
        regrasXadrez.add(
                "3. Cada tipo de peça tem seu próprio movimento: o peão se move para frente, mas captura na diagonal; o cavalo se move em 'L'; a torre se move em linha reta; o bispo se move em diagonal; a rainha se move em qualquer direção e o rei se move uma casa em qualquer direção.\n");
        regrasXadrez.add("4. Os peões podem se mover duas casas para frente em seu primeiro movimento.\n");
        regrasXadrez
                .add("5. Um peão que atinge a oitava linha pode ser promovido a qualquer outra peça, exceto um rei.\n");
        regrasXadrez.add(
                "6. O xeque é uma situação em que o rei está sob ataque, e o jogador deve mover o rei para uma posição segura.\n");
        regrasXadrez.add("7. Um jogador não pode mover suas peças para uma casa ocupada por suas próprias peças.\n");
        regrasXadrez.add(
                "8. A partida termina em xeque-mate, quando um rei está em xeque e não pode escapar, ou em empate (empate por insuficiência de material, repetição de movimentos, etc.).\n");
        regrasXadrez.add(
                "9. O roque é um movimento especial onde o rei e a torre se movem simultaneamente sob certas condições.\n");
        regrasXadrez.add("10. O jogo pode ser encerrado por acordo mútuo entre os jogadores.\n");

        return regrasXadrez;
    }
}
