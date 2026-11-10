package br.edu.ifpe.oxefood.exception;

public class EmpresaException extends RuntimeException  {
        public static final String MSG_PREFIXO_TELEFONE = "Não é permitido que sejam inserido empresa com um telefone que não tenha o prefixo 81";

public EmpresaException(String msg) {
super(String.format(msg));
}
}