public class ValidaInteiro implements EstrategiaValidacao {
    @Override
    public boolean validar(String valor) {
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
