//ok

public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new Codificador();

        Logger logger = new ConsoleLogger();

        Logger infoLogger = new InfoLogger(logger);
        Logger warningLogger = new WarningLogger(logger);
        Logger errorLogger = new ErrorLogger(logger);

        String aux = "Desafio Padrões de Projeto";

        infoLogger.log("Texto original: " + aux);

        aux = cod.codifica(Codificador.Tipo.SIMPLES, aux);
        infoLogger.log("Codificado (simples): " + aux);

        aux = cod.deCodifica(Codificador.Tipo.SIMPLES, aux);
        warningLogger.log("Decodificado (simples): " + aux);

        aux = cod.codifica(Codificador.Tipo.DESLOCA, aux);
        errorLogger.log("Codificado (desloca): " + aux);

        aux = cod.deCodifica(Codificador.Tipo.DESLOCA, aux);
        infoLogger.log("Decodificado (desloca): " + aux);
    }
}
