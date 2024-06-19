package je05_documentacao;

/**
 * Calculadora Simples
 * @author Rafael Cecyn
 * since v1.0
 */

public class Calculadora {
    /**
     *
     * @param dividendo Número que será dividendo
     * @param divisor Número que irá dividir o dividendo
     * @return O resultado da divisão entre o dividendo e o divisor
     * @author Rafael Cecyn
     * @exception java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     */

    Integer dividir(Integer dividendo, Integer divisor) {
        return dividendo / divisor;
    }
}
