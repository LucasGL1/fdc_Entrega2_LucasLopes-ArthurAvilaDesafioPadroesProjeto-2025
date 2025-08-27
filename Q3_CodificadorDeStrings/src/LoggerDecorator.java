public abstract class LoggerDecorator implements Logger {
    protected Logger wrappee;

    public LoggerDecorator(Logger wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void log(String mensagem) {
        wrappee.log(mensagem);
    }
}
