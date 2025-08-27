public class App {
    public static void main(String[] args) {
        IDado d6 = new DadoHistorico(new Dado(6));
        IDado d20 = new DadoHistorico(new Dado(20));

        d6.rolar();
        d6.rolar();
        d6.rolar();
        d20.rolar();

        System.out.println("Último valor D6: " + d6.getValor());
        System.out.println("Histórico D6: " + ((DadoHistorico) d6).getHistorico());

        System.out.println("Último valor D20: " + d20.getValor());
        System.out.println("Histórico D20: " + ((DadoHistorico) d20).getHistorico());
    }
}
