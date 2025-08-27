//OK



public class App {
    public static void main(String[] args) {
        var validador = new Validador();

        String[] emails = {
            "bernardo.copstein@pucrs.br",
            "usuario.sem.arroba.com",
            "teste@dominio"
        };

        String[] inteiros = {
            "12345",
            "12a34",
            "000987"
        };

        String[] matriculas = {
            "231025008",
            "12340",
            "98765"
        };

        System.out.println("===== TESTE DE EMAILS =====");
        for (String email : emails) {
            boolean valido = validador.valida(Validador.Tipo.EMAIL, email);
            System.out.println(email + " -> " + (valido ? "VÁLIDO" : "INVÁLIDO"));
        }

        System.out.println("\n===== TESTE DE INTEIROS =====");
        for (String numero : inteiros) {
            boolean valido = validador.valida(Validador.Tipo.INTEIRO, numero);
            System.out.println(numero + " -> " + (valido ? "VÁLIDO" : "INVÁLIDO"));
        }

        System.out.println("\n===== TESTE DE MATRÍCULAS =====");
        for (String mat : matriculas) {
            boolean valido = validador.valida(Validador.Tipo.MATRICULA, mat);
            System.out.println(mat + " -> " + (valido ? "VÁLIDO" : "INVÁLIDO"));
        }
    }
}
