package classes;

public class Convertor {

public static double conversao(double dolares, double valor){
    double resultado = dolares * valor;
    return resultado + IOF(resultado);
}
public static double IOF(double resultado) {
    return resultado * 0.06;
}

}



