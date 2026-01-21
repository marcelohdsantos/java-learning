import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

record Cliente(String nome, String email, String cidade) {
}

public class Dia04Colecoes {
    public static void main(String[] args) {
        // 1. criar uma lista de clientes
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Ana", "ana@email.com", "São Paulo"));
        clientes.add(new Cliente("Bruno", "bruno@email.com", "Rio de Janeiro"));
        clientes.add(new Cliente("Carlos", "carlos@email.com", "São Paulo"));
        clientes.add(new Cliente("Diana", "diana@email.com", "Belo Horizonte"));

        // 2. Um Set para listar cidades únicas (Sem repetições)
        Set<String> cidades = new HashSet<>();
        for (Cliente c : clientes) {
            cidades.add(c.cidade());
        }

        // 3. Use um Map para agrupar clientes por cidade
        Map<String, List<Cliente>> clientesPorCidade = new HashMap<>();

        // popular o Map (chave=cidade, valor=lista de clientes)
        for (Cliente c : clientes) {
            String cidade = c.cidade();
            // Se a cidade não existe no map, cria uma lista vazia
            if (!clientesPorCidade.containsKey(cidade)) {
                clientesPorCidade.put(cidade, new ArrayList<>());
            }

            // Depois adiciona o cliente na lista
            clientesPorCidade.get(cidade).add(c);
        }

        // 4. Imprima:
        // - Total de clientes
        System.out.println("Total de clientes: " + clientes.size());
        // - Cidades únicas
        System.out.println("Cidades únicas: " + cidades);
        // - Clientes de São Paulo
        System.out.println("Clientes de São Paulo:");
        List<Cliente> clientesSP = clientesPorCidade.get("São Paulo");

        if (clientesSP != null) {
            for (Cliente c : clientesSP) {
                System.out.println("- " + c.nome() + " (" + c.email() + ")");
            }
        } else {
            System.out.println("Nenhum cliente em São Paulo.");
        }

    }
}
