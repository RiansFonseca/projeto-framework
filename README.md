# Padrão de Projeto: Decorator

## Intenção

Dinamicamente, agregar responsabilidades adicionais a um objeto. Os Decorators fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades. No contexto de um framework para jogos de tabuleiro, o padrão Decorator será utilizado para adicionar "Visual Addons" às peças do jogo. Isso permitirá que diferentes elementos visuais, como cores, efeitos e skins, sejam aplicados a cada peça de forma modular e independente. Por exemplo, a coroa da rainha pode ser vermelha, a crina do cavalo pode ser verde, e o movimento do peão pode ter um efeito visual específico.

## Estrutura do Padrão

A estrutura do padrão Decorator é composta pelos seguintes elementos:

- **Componente**: Define a interface ou classe abstrata que será decorada.
- **Concrete Component**: Implementa a interface do componente.
- **Decorator**: Classe abstrata que mantém uma referência ao componente e implementa a interface do componente.
- **Concrete Decorators**: Implementações específicas do decorador que adicionam funcionalidades.

## Exemplo em Código

- **Classe PecaDecorator**
@import "src\java\decorators\PecaDecorator.java"
- **Classe AdornosVermelhosDecorator**
@import "src\java\decorators\AdornosVermelhosDecorator.java"
- **Classe MovimentoComBrilhoVerdeDecorator**
@import "src\java\decorators\MovimentoComBrilhoVerdeDecorator.java"
- **Classe JogoXadrezBuilder**
@import "src\java\builders\JogoXadrezBuilder.java"


## Participantes
- **Peca**: Representa a peça do jogo.
- **PecaDecorator**: Classe base para todos os decoradores de peças.
- **AdornosVermelhosDecorator**: Decorador que adiciona adornos vermelhos à peça.
- **MovimentoComBrilhoVerdeDecorator**: Decorador que adiciona um efeito de brilho verde à peça.
- **JogoXadrezBuilder**: Builder que utiliza os decoradores para criar um jogo de xadrez.


# Padrão de Projeto: Proxy

## Intenção

O padrão Proxy tem como objetivo fornecer um substituto ou ponto de controle para acessar um objeto. Em vez de interagir diretamente com o objeto real, o Proxy atua como um intermediário, permitindo que certas verificações ou operações sejam realizadas antes de delegar a chamada ao objeto real. No contexto de um framework para jogos de tabuleiro, o padrão Proxy será utilizado para gerenciar o acesso ao **TabuleiroReal**, garantindo que certas validações, como verificar se um movimento é permitido ou se uma casa está vazia, sejam feitas antes de permitir que o jogo prossiga.

## Estrutura do Padrão

A estrutura do padrão Proxy é composta pelos seguintes elementos:

- **Subject (Interface)**: Define a interface comum usada tanto pelo Proxy quanto pelo objeto real.
- **RealSubject**: A implementação concreta do objeto real que será acessado através do proxy.
- **Proxy**: Controla o acesso ao RealSubject, adicionando verificações ou controles adicionais antes de delegar as chamadas.

## Exemplo em Código

- **Interface Tabuleiro (Subject)**
@import "src\java\proxy\Tabuleiro.java"
- **Classe TabuleiroReal (RealSubject)**
@import "src\java\proxy\TabuleiroReal.java"
- **Classe TabuleiroProxy**
@import "src\java\proxy\TabuleiroProxy.java"
- **Classe Jogo**
@import "src\java\model\Jogo.java"

## Participantes

- **Tabuleiro (Interface Subject)**: Define a interface usada por **TabuleiroReal** e **TabuleiroProxy**. Essa interface permite que ambos sejam tratados de forma intercambiável.
  
- **TabuleiroReal (RealSubject)**: A implementação concreta do tabuleiro, responsável por armazenar as peças e realizar movimentos sem realizar verificações adicionais. O **TabuleiroReal** é onde a lógica principal de movimentação das peças está localizada, porém, ele não realiza nenhuma validação por conta própria.
  
- **TabuleiroProxy (Proxy)**: Implementa a interface **Tabuleiro** e age como intermediário entre o jogo e o **TabuleiroReal**. Ele realiza verificações, como verificar se a casa de origem tem uma peça ou se a casa de destino está ocupada, antes de delegar a operação ao **TabuleiroReal**.

- **Jogo**: O contexto em que o Proxy é utilizado para gerenciar o tabuleiro. Ao invés de interagir diretamente com o **TabuleiroReal**, o **Jogo** interage com o **TabuleiroProxy**, que se encarrega de fazer as validações necessárias.


# Padrão de Projeto: Facade

## Intenção

O padrão Facade fornece uma interface simplificada para um conjunto de interfaces em um subsistema, tornando o subsistema mais fácil de usar. O objetivo é desacoplar o cliente do sistema complexo, fornecendo uma interface única que reúne funcionalidades e reduz a quantidade de chamadas diretas ao sistema. No contexto de um framework para jogos de tabuleiro, o padrão Facade será utilizado para gerenciar a criação e o término de jogos, como Xadrez e Damas, encapsulando a lógica necessária em uma única classe, permitindo que o cliente interaja de forma simples e direta.

## Estrutura do Padrão

A estrutura do padrão Facade é composta pelos seguintes elementos:

- **Facade**: Classe que fornece uma interface simplificada para o cliente, orquestrando as chamadas para as fábricas e outras classes necessárias.
- **Subsistemas**: Conjunto de classes que realizam a lógica do sistema, que o Facade encapsula.

## Exemplo em Código

- **Classe JogoFacade**
@import "src\java\facade\JogoFacade.java"

- **Classe DamasFactory**
@import "src\java\factory\JogoDamasFactory.java"

- **Classe XadrezFactory**
@import "src\java\factory\JogoXadrezFactory.java"

- **Classe Cliente**
@import "src\java\cliente\Cliente.java"

## Participantes

- **JogoFacade**: Classe que fornece métodos para iniciar e terminar partidas de Xadrez e Damas, encapsulando a lógica necessária para interagir com as fábricas e o logger.
- **JogoLogger**: Classe responsável por registrar eventos do jogo, como o início e o término de partidas.
- **JogoDamasFactory**: Fábrica responsável por criar jogos de Damas, delegando a criação a um construtor específico.
- **JogoXadrezFactory**: Fábrica responsável por criar jogos de Xadrez, delegando a criação a um construtor específico.
- **Cliente**: Classe que utiliza o Facade para iniciar um jogo e controlar o tempo de partida, sem precisar interagir diretamente com as fábricas ou a lógica do jogo.

# Padrão de Projeto: Adapter

## Intenção

O padrão Adapter tem o objetivo de permitir que interfaces incompatíveis trabalhem juntas, sem a necessidade de alterar suas implementações originais. Ele atua como uma ponte entre duas interfaces, adaptando uma classe existente para que ela possa ser usada em um contexto diferente. No caso de um framework de jogos de tabuleiro, o Adapter pode ser utilizado para transformar a estrutura interna de um jogo em um formato específico, como JSON, para exportação ou integração com outras aplicações.

## Estrutura do Padrão

A estrutura do padrão Adapter é composta pelos seguintes elementos:

- **Target Interface**: Define a interface que o cliente espera utilizar.
- **Adapter**: Implementa a interface alvo e faz a adaptação entre o cliente e a classe existente.
- **Adaptee**: A classe existente que precisa ser adaptada para a nova interface.
- **Cliente**: Classe que interage com a interface alvo, sem se preocupar com as mudanças feitas pelo Adapter.

## Exemplo em Código

**Target Interface (Interface Alvo)**

```java
public interface JogoAdapter {
    String convert(); // Método para converter o objeto Jogo para outro formato
}
```
```java
**Adapter - Implementa a interface JogoAdapter e adapta a classe Jogo para JSON**
public class JogoJsonAdapter implements JogoAdapter {
    private Jogo jogo;

    public JogoJsonAdapter(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public String convert() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        return gson.toJson(jogo.toString());
    }
}
```


**Adaptee - Classe que representa o Jogo com peças, tabuleiro e regras**
```java
public class Jogo {
    private List<Peca> pecas; // Lista de peças do jogo
    private TabuleiroProxy tabuleiro; // Usando a interface Tabuleiro
    private List<String> regras; // Regras do jogo

    // **Construtor**
    public Jogo() {
        this.pecas = new ArrayList<>(); // Inicializa a lista de peças
        this.regras = new ArrayList<>(); // Inicializa a lista de regras
    }

    // **Métodos de acesso (Getters e Setters)**
    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public TabuleiroProxy getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(TabuleiroProxy tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public List<String> getRegras() {
        return regras;
    }

    public void setRegras(List<String> regras) {
        this.regras = regras;
    }

    // **Método para adicionar uma peça**
    public void adicionarPeca(Peca peca) {
        this.pecas.add(peca);
    }

    // **Método para adicionar uma regra**
    public void adicionarRegra(String regra) {
        this.regras.add(regra);
    }

    @Override
    public String toString() {
        // Formatação das peças
        String pecasString = String.join(" ", pecas.stream().map(Peca::toString).toArray(String[]::new));
        // Formatação das regras
        String regrasString = String.join("\n ", regras);

        return "\nPECAS: \n " + pecasString
                + "\nREGRAS: \n " + regrasString
                + "\nTABULEIRO: \n " + tabuleiro;
    }
}
```

**Client**
```java
public class JogoFacade {
    private JogoXadrezFactory xadrezFactory;
    private JogoDamasFactory damasFactory;
    private JogoLogger jogoLogger;
    private Jogo jogo; // Mantenha a referência ao objeto Jogo

    public JogoFacade() {
        this.xadrezFactory = new JogoXadrezFactory();
        this.damasFactory = new JogoDamasFactory();
        this.jogoLogger = new JogoLogger();
        this.jogo = null; // Inicialize o jogo como nulo
    }

    // **Método para iniciar uma partida de Xadrez**
    public void iniciarPartidaXadrez() {
        this.jogo = xadrezFactory.criarJogo(); // Crie o jogo e mantenha a referência
        jogoLogger.getJogoString(jogo);
        jogoLogger.iniciarPartidaXadrez();
    }

    // **Método para iniciar uma partida de Damas**
    public void iniciarPartidaDamas() {
        this.jogo = damasFactory.criarJogo(); // Crie o jogo e mantenha a referência
        jogoLogger.getJogoString(jogo);
        jogoLogger.iniciarPartidaDamas();
    }

    // **Método para terminar a partida de Xadrez**
    public void terminarPartidaXadrez() {
        jogoLogger.terminarPartidaXadrez();
    }

    // **Método para terminar a partida de Damas**
    public void terminarPartidaDamas() {
        jogoLogger.terminarPartidaDamas();
    }

    // **Método para obter o jogo em formato JSON**
    public String obterJogo() {
        JogoJsonAdapter adapter = new JogoJsonAdapter(jogo);
        return adapter.convert();
    }
}
```

## Participantes

**JogoFacade**: Classe que fornece métodos para iniciar e terminar partidas de Xadrez e Damas, encapsulando a lógica necessária para interagir com as fábricas e o logger.

**JogoLogger**: Classe responsável por registrar eventos do jogo, como o início e o término de partidas.

**JogoDamasFactory**: Fábrica responsável por criar jogos de Damas, delegando a criação a um construtor específico.

**JogoXadrezFactory**: Fábrica responsável por criar jogos de Xadrez, delegando a criação a um construtor específico.

**Cliente**: Classe que utiliza o Facade para iniciar um jogo e controlar o tempo de partida, sem precisar interagir diretamente com as fábricas ou a lógica do jogo.