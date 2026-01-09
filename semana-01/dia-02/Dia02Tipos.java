public class Dia02Tipos {
    public static void main(String[] args) {
        // variáveis primitivas
        int idade = 28;
        double salario = 2500.50;
        boolean workaholico = true;
        char inicial = 'M';

        // decraração os equivalentes Wrapper
        Integer idadeObj = 28;
        Double salarioObj = 5500.50;
        Boolean workaholicoObj = true;
        Character inicialObj = 'M';

        // Teste autoboxing/unboxing
        Integer x = 100; // autoboxing
        int y = x; // unboxing

        // criar uma saída formatada

        String saida = """
                === PRIMITIVOS ===
                Idade: %d
                Salário: %.2f
                Workahólico: %s
                Inicial: %s
                
                === WRAPPERS ===
                Idade (obj): %d
                Salário (obj): %.2f
                Workahólico (obj): %s
                Inicial (obj): %s
                
                === AUTOBOXING/UNBOXING ===
                x (Integer): %d
                y (int): %d
                """.formatted(idade, salario, workaholico, inicial, idadeObj, salarioObj,
                workaholicoObj, inicialObj, x, y);
        System.out.println(saida);
    }
}