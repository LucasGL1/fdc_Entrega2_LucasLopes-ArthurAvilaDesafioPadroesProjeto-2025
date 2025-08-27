public class WarningLogger extends LoggerDecorator {
    public WarningLogger(Logger wrappee) {
        super(wrappee);
    }

    @Override
    public void log(String mensagem) {
        super.log("[WARNING] " + mensagem);
    }
}
