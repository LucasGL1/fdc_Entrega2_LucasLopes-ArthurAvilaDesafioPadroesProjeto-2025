public class ValidaMatricula implements EstrategiaValidacao {
    @Override
    public boolean validar(String valor) {
        ValidaInteiro validaInteiro = new ValidaInteiro();
        if (!validaInteiro.validar(valor)) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < valor.length() - 1; i++) {
            soma += Character.getNumericValue(valor.charAt(i));
        }

        int verificador = soma % 10;
        return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
    }
}
