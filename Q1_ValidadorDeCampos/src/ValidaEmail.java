public class ValidaEmail implements EstrategiaValidacao {
    @Override
    public boolean validar(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.lastIndexOf('.');
        if (posA <= 0 || posPt <= posA) return false;
        return true;
    }
}
