package io.mosip.resident.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This DTO class defines the errorcodes and errormessages during exception handling.
 * 
 * @author Kamesh Shekhar Prasad
 * @since 1.0.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ExceptionJSONInfoDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3999014525078508265L;

	/**
	 * Error Code
	 */
	private String errorCode;
	
	/**
	 * Error Message
	 */
	private String message;

}
