package regras;

import java.util.ArrayList;
import java.util.List;

public final class RegrasDamas {
    public static List<String> obterRegras() {
        List<String> regrasDamas = new ArrayList<>();

        regrasDamas.add("\n1. O jogo é jogado entre dois jogadores, um com peças brancas e outro com peças pretas.\n");
        regrasDamas.add("2. O objetivo é capturar todas as peças do oponente ou bloquear todos os seus movimentos.\n");
        regrasDamas.add("3. As peças se movem apenas para frente nas casas escuras do tabuleiro.\n");
        regrasDamas.add(
                "4. Para capturar uma peça do oponente, você deve saltar sobre ela, movendo-se para a casa imediatamente além dela, que deve estar desocupada.\n");
        regrasDamas.add(
                "5. Quando uma peça atinge a última linha do lado do oponente, ela é promovida a 'Dama' e pode se mover para frente e para trás em diagonal.\n");
        regrasDamas.add(
                "6. As Damas podem capturar peças em qualquer direção, saltando sobre elas, assim como as peças normais.\n");
        regrasDamas.add(
                "7. Se um jogador tiver uma captura disponível, deve realizá-la. Se houver mais de uma captura possível, o jogador pode escolher qual fazer.\n");
        regrasDamas
                .add("8. O jogo termina quando um jogador não tem mais peças ou não pode fazer um movimento legal.\n");
        regrasDamas.add(
                "9. O empate pode ser declarado se ambos os jogadores concordarem ou se ocorrerem 40 movimentos sem captura ou movimento de Dama.\n");
        regrasDamas.add("10. As peças não podem se mover para uma casa ocupada por outra peça do mesmo jogador.\n");

        return regrasDamas;
    }
}
