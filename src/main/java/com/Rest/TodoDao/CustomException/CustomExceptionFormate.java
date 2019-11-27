package com.Rest.TodoDao.CustomException;

import java.util.Date;

import org.aspectj.weaver.bcel.ExceptionRange;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.lang.Nullable;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Rest.Beans.CustomiseException;
@ControllerAdvice
@RestController
public class CustomExceptionFormate extends ResponseEntityExceptionHandler {
	@ExceptionHandler(
		Exception.class
	)
public final ResponseEntity<Object> handleingException(Exception ex, WebRequest request)  {
		CustomiseException custException= new CustomiseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(custException,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(
			SearchingForInAppropriateDataExecption.class
		)
	public final ResponseEntity<Object> handleingExceptionForDataNotFound(Exception ex, WebRequest request)  {
			CustomiseException custException= new CustomiseException(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity(custException,HttpStatus.BAD_REQUEST);
		}
}
