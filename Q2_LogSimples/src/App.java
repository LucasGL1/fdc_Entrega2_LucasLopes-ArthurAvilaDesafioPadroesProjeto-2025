//OK


public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstancia();

        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        for (String m : log) {
            System.out.println(m);
        }

        LogSimples outroLog = LogSimples.getInstancia();
        outroLog.log("Mensagem adicionada de outro ponto do programa");

        System.out.println("\nLog completo:");
        for (String m : log) { 
            System.out.println(m);
        }
    }
}
