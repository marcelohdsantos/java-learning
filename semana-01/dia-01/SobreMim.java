public class SobreMim {
    public static void main(String[] args) {
        String nome = "Marcelo";
        String profissao = "Desenvolvedor Fullstack";
        String linguagens = "Javascript, Python e agora Java";
        int anosExp = 3;

        String saida = """
                Nome: %s
                Profissão: %s
                Linguagens: %s
                Anos de Experiências: %d
                """.formatted(nome, profissao, linguagens, anosExp);
        System.out.println(saida);
    }
}