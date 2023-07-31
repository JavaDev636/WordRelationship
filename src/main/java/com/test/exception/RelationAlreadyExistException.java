package com.test.exception;

public class RelationAlreadyExistException extends RuntimeException{
public RelationAlreadyExistException() {
super("Relation between the words already existed");
}

public RelationAlreadyExistException(String msg) {
	super(msg);
}
}
