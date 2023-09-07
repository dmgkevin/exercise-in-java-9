package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg); //rapassando para o construtor da super classe
	}
}
