package com.globant.akn;

public class KeyPair {

	public enum Key {
		
		/*
		 *    Date    |	Version	|           Description
		 * ---------------------------------------------------------------------
		 * 2012-12-11 |	 v0.1	| First draft
		 * 2012-12-14 |	 v0.2	| Rename all keys and re-organize them in alphabet order
		 * 2013-01-22 |  v0.3   | Add specific keys for translation service
		 * 
		 */
		
		// A: (101-)
		ADSK_API,							// The API invoked. (Folders/Files/Comments etc)
											// ---------------------------------------------------------------------
		ADSK_DEST_CONSUMER_ID, 				// Target consumer specified by the requesting consumer. For example, 
											// translation service making a call to storage service with "my" target 
											// consumer would be reported with "my" as the destination consumer ID.
											// ---------------------------------------------------------------------
		ADSK_EXEC_TIME,						// Time taken to process the request, in milliseconds.
											// ---------------------------------------------------------------------
		ADSK_ID,							// Autodesk user identity key. Required if used by the service.
											// ---------------------------------------------------------------------
		ADSK_ID_TYPE,						// 
											// ---------------------------------------------------------------------
		ADSK_OB_EXEC_TIMES,					// Optional JSON tree that can store key value pairs for additional 
											// execution times for outbound requests made from this application
											// - like OAuth, API etc
											// ---------------------------------------------------------------------
		ADSK_RECORD_SRC,					// The identifier for the service that is recording the log data.
    										// This can be a consumer ID or name. This would be helpful in
    										// identifying the source of logs in cases where logs from different
    										// applications are merged together.
											// ---------------------------------------------------------------------
		ADSK_REQ_DATE, 						// Request date logged by the application. Use ISO 8601 standard 
											// date format and recommended time zone is UTC.
											// ---------------------------------------------------------------------
		ADSK_SERVER_NAME,					// Name of the receiving server.
											// ---------------------------------------------------------------------
		ADSK_SRC_CONSUMER_ID, 				// Requesting consumer. Using the above example, translation service 
        									// making a call to storage service with "my" target consumer would 
        									// report "translation" as the source consumer ID.
											// ---------------------------------------------------------------------
		ADSK_STATUS,						// Application specific response status, ideal for error codes.
											// ---------------------------------------------------------------------
		ADSK_USER_TOKEN, 					// UserToken generated by identity service for an authenticated user.
		                            		// This can be used to link the session data from multiple services.
											// ---------------------------------------------------------------------
		ADSK_USER_TOKEN_TYPE,  				// 
											// ---------------------------------------------------------------------
		AP_LOG_ERROR,						// Error flag for the imcomplete logs which may misses some required fields
											// ---------------------------------------------------------------------
		ADSK_REQ_ID,						// The request ID. It's the job ID for translation
											// ---------------------------------------------------------------------
		
		
		// B: (201-)
		BASE_ADSK_ID,
		BASE_USER_TOKEN_TYPE,
		BYTES_OUTPUT,		 
		
		// C: (301-)
		CATEGORY,
		// D: (401-)
		
		// E: (501-)
		EQUIV_ADSK_ID,
		EQUIV_ADSK_ID_TYPE,
		EQUIV_USER_TOKEN,
		EQUIV_USER_TOKEN_TYPE,
		
		// F: (601-)
		
		// G: (701-)
		
		// H: (801-)
		HTTP_METHOD,						// The HTTP method used by the request. (GET, POST, PUT, DELETE etc)
											// ---------------------------------------------------------------------
		HTTP_REMOTE_IP,						// Network address of the client sending the request to the server.
											// ---------------------------------------------------------------------
		HTTP_REQ_HEADERS,					// Captures all the headers beginning with "x-ads" string. Use nested 
											// JSON format to list multiple headers, as multiple headers are expected 
											// in some cases. 
											// ---------------------------------------------------------------------
		HTTP_REQ_URL,						// Part of request's URL from the protocol name up to the query string.
											// ---------------------------------------------------------------------
		HTTP_STATUS,						// HTTP response code. Should not include non-standard APP-specific codes. 
											// Use an APP-specific field for those codes.
											// ---------------------------------------------------------------------
		HTTP_USER_AGENT,					// User agent originating the request.
											// ---------------------------------------------------------------------
		HTTP_X_FORWARDED_FOR,				// Optional field to store the values of X-Forwarded-For HTTP header
											// ---------------------------------------------------------------------
		
		// I: (901-)
		INSTANCE_TYPE,
		
		// J: (1001-)
		
		// K: (1101-)
		
		// L: (1201-)
		
		// M: (1301-)
		MODULE,
		
		// N: (1401-)
		
		// O: (1501-)
		OPERATION,
		ORIGINATING_IP_ADDRESS,
		ORIGINATING_PRODUCT_ID,
		
		// P: (1601-)
		
		// Q: (1701-)
		
		// R: (1801-)
		
		// S: (1901-)
		STOR_DEST_FILE_ID,		// For move operation this field is populated with destination file ID.
											// ---------------------------------------------------------------------
		STOR_DEST_FOLDER_ID,		// For move operation this field is populated with destination folder ID.
											// ---------------------------------------------------------------------
		STOR_ERROR_DETAILS,		// Descriptive error message in case of error.
											// ---------------------------------------------------------------------
		STOR_FILE_ID,		// Storage id for the file object. This is generated by storage service.
											// ---------------------------------------------------------------------
		STOR_FILE_MIME_TYPE,		// Mime-type of the file being uploaded.
											// ---------------------------------------------------------------------
		STOR_FILE_SIZE,		// File size.
											// ---------------------------------------------------------------------
		STOR_FOLDER_ID,		// Storage id for the folder object, generated by storage service.
											// ---------------------------------------------------------------------
		STOR_INT_OR_EXT,		// Certain events are logged for extended analytics, that may not be 
											// counted a direct customer requests. Such requests are marked as "internal".
											// ---------------------------------------------------------------------
		STOR_OPER_DETAIL,		// Operation details. For example, "Single", "List" that are used in 
											// categorizing the operations.
											// ---------------------------------------------------------------------
		STOR_RESP_FROM,		// Field to indicate whether storage information was retrieved from cache or DB.
											// ---------------------------------------------------------------------
		STOR_RESP_ITEMS,		// Total number of files in a folder for all "folder/list" operations.
		
		// T: (2001-)
		TRANS_JOB_TYPE,    	// Translation job type. For instance, "dwg2dwf", "dwf2tpf", "tpf2ffy" and etc. 
										   	// ---------------------------------------------------------------------
		TRANS_PARENT_ID,    	// Proxy job ID if the current job is requested from a proxy worker. 
											// ---------------------------------------------------------------------		
		TRANS_HOST_NAME ,    	// EC2 instance ID the translation worker is running on. 
											// ---------------------------------------------------------------------
		TRANS_USER_NAME,    	// Name of the job requester. It willb the service name if the job is requested from a service. 
											// ---------------------------------------------------------------------
		TRANS_IN_FILE_URL,    	// Input file URL for the current job. 
											// ---------------------------------------------------------------------
		TRANS_IN_FILE_NAME,    	// Input file name for the current job. 
											// ---------------------------------------------------------------------
		TRANS_IN_FILE_TYPE,    	// Input file type for the current job, e.g. "2D", "3D" or "2D & 3D". 
											// ---------------------------------------------------------------------
		TRANS_IN_FILE_SIZE,    	// Input file size in bytes, including references. 
											// ---------------------------------------------------------------------
		TRANS_OUT_FILE_NUM,    	// Total number of output files. 
											// ---------------------------------------------------------------------
		TRANS_OUT_FILE_SIZE,    	// otal aggregated file size in bytes, e.g. the size of .zip file. 
											// ---------------------------------------------------------------------
		TRANS_TIME_STAMP,    	// Time stamp for the current log. 
											// ---------------------------------------------------------------------
		TRANS_DOWNLOAD_TIME,    	// Time taken to download input file(s), in milliseconds 
											// ---------------------------------------------------------------------
		TRANS_EXEC_TIME ,    	// Time taken to translate file(s) within translation engine, in milliseconds 
											// ---------------------------------------------------------------------
		TRANS_UPLOAD_TIME,    	// Time taken to package & upload result files(s), in milliseconds 
											// ---------------------------------------------------------------------
		TRANS_JOB_STATE ,    	// The current state of the job. For instance, "n%", "busy" or "in progress". It will be the same with adskStatus if the job is finished.   
											// ---------------------------------------------------------------------
		TRANS_STATE_DETAIL ,    	// Descriptive message for the log, e.g. the reason of failed translation job. 
		
		// U: (2101-)
		
		// V: (2201-)
		
		// W: (2301-)
		
		// X: (2401-)
		
		// Y: (2501-)
		
		// Z: (2601-)
		;
		
//		private int code;
//		
//		private Key(int code) {
//			
//			this.code = code;
//		}
//		
//		public int getCode() {
//			
//			return code;
//		}
		
	}
	
	private Key key;
	private String value;
	
	/**
	 * Creates KeyPair instance with specified Key and value
	 * @param key key with which the specified value is to be associated. Only the keys defined in enumeration Key can be used.
	 * @param value value to be associated with the specified key
	 */
	public KeyPair(Key key, String value) {
		
		this.setKey(key);
		this.setValue(value);
	}
	
	/**
	 * Sets the Key of KeyPair instance with which the specified value is to be associated
	 * @param key key with which the specified value is to be associated. Only the keys defined in enumeration Key can be used.
	 */
	public void setKey(Key key) {
		
		this.key = key;
	}
	
	/**
	 * Returns the key with which the specified value is to be associated.
	 * @return the key with which the specified value is to be associated.
	 */
	public Key getKey() {
		
		return key;
	}
	
	/**
	 * Sets the value of KeyPair instance to be associated with the specified key
	 * @param value value to be associated with the specified KeyPair instance
	 */
	public void setValue(String value) {
		
		this.value = value;
	}
	
	/**
	 * Returns the value of the KeyPair instance to be associated with the specified key
	 * @return the value of the KeyPair instance to be associated with the specified key
	 */
	public String getValue() {
		
		return value;
	}
}
