public class ErrorLogger extends LoggerDecorator {
    public ErrorLogger(Logger wrappee) {
        super(wrappee);
    }

    @Override
    public void log(String mensagem) {
        super.log("[ERROR] " + mensagem);
    }
}
