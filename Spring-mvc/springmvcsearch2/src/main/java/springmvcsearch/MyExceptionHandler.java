package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

//	Handling the exception
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer exception has occured");
		return "null_page";
	}
	
	
	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public String exceptionHandlerArrayIndexOutBound(Model m) {
		m.addAttribute("msg", "ArrayIndex out of bound Exception");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandleGeneric(Model m) {
		m.addAttribute("msg", " Some Exception");
		return "null_page";
	}
}

