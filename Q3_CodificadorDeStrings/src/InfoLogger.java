public class InfoLogger extends LoggerDecorator {
    public InfoLogger(Logger wrappee) {
        super(wrappee);
    }

    @Override
    public void log(String mensagem) {
        super.log("[INFO] " + mensagem);
    }
}
