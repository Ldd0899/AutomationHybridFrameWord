package exceptions;

public class InvalidBrowserException extends RuntimeException {
public InvalidBrowserException() {
	super ("Invalid browser exception... make sure use edge , chrome/firefox");
}
}
