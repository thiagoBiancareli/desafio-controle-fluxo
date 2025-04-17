public class ParametrosInvalidosException extends Exception {

  // Construtor sem argumentos (o que você está tentando usar)
  public ParametrosInvalidosException() {
    super("Parâmetros inválidos: o segundo número deve ser maior que o primeiro.");
  }
}