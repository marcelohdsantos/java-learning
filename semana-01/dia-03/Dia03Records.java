// Definindo records fora da classe principal
record Cliente(String nome, String email, int idade) {
}

record OrdemServico(int id, String descricao, Cliente cliente, double valor) {
}

public class Dia03Records {
    public static void main(String[] args) {
        // 1 crie um Cliente
        Cliente cliente = new Cliente("Ana Silva", "ana.silva@email.com", 28);

        // 2 crie uma OrdemServiço vinculada ao cliente
        OrdemServico os = new OrdemServico(0, "Manutenção de equipamento", cliente, 150.0);

        // 3 imprima dos dados acessando os campos
        // usar Text Blocks para formatar a saída

        String saida = """
                === CLIENTE ===
                Nome: %s
                Email: %s
                Idade: %d

                === ORDEM DE SERVIÇO ===
                ID: %d
                Descrição: %s
                Cliente: %s
                Valor: %.2f
                """.formatted(
                cliente.nome(), cliente.email(), cliente.idade(),
                os.id(), os.descricao(), os.cliente().nome(), os.valor());
        System.out.println(saida);
    }
}
