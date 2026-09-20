import src.main.Calculadora;

public class CalculadoraTest {

    private static int testesExecutados = 0;
    private static int testesAprovados = 0;
    private static int testesFalhos = 0;

    public static void main(String[] args) {

        testar("Soma: 2 + 3 = 5",
                Calculadora.somar(2, 3) == 5);

        testar("Subtração: 10 - 4 = 6",
                Calculadora.subtrair(10, 4) == 6);

        testar("Multiplicação: 5 × 4 = 20",
                Calculadora.multiplicar(5, 4) == 20);

        testar("Divisão: 10 / 2 = 5",
                Calculadora.dividir(10, 2) == 5);

        testar("Divisão: 7 / 2 = 3.5",
                Calculadora.dividir(7, 2) == 3.5);

        testarDivisaoPorZero();

        exibirResultado();

        if (testesFalhos > 0) {
            System.exit(1);
        }
    }

    private static void testar(String nome, boolean resultado) {

        testesExecutados++;

        if (resultado) {
            testesAprovados++;
            System.out.println("✓ PASSOU: " + nome);
        } else {
            testesFalhos++;
            System.out.println("✗ FALHOU: " + nome);
        }
    }

    private static void testarDivisaoPorZero() {

        testesExecutados++;

        try {
            Calculadora.dividir(10, 0);

            testesFalhos++;
            System.out.println(
                    "✗ FALHOU: Divisão por zero deveria gerar uma exceção"
            );

        } catch (IllegalArgumentException e) {

            testesAprovados++;
            System.out.println(
                    "✓ PASSOU: Divisão por zero gerou um erro"
            );
        }
    }

    private static void exibirResultado() {

        System.out.println();
        System.out.println("================================");
        System.out.println("RESULTADO DOS TESTES");
        System.out.println("================================");
        System.out.println("Testes executados: " + testesExecutados);
        System.out.println("Testes aprovados:  " + testesAprovados);
        System.out.println("Testes falhos:     " + testesFalhos);
        System.out.println("================================");
    }
}