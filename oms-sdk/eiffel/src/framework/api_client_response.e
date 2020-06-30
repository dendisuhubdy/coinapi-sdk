note
 description:"[
		OEML - REST API
 		Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
  		The version of the OpenAPI document: v1
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class
	API_CLIENT_RESPONSE

create
	make

feature {NONE} -- Initialization

	make (a_response: detachable HTTP_CLIENT_RESPONSE; a_error: detachable API_ERROR; a_custom_deserializer: detachable FUNCTION [TUPLE [STRING, STRING, TYPE [detachable ANY]], detachable ANY])
		do
			response := a_response
			error := a_error
			deserializer := a_custom_deserializer
		end

feature -- Access

	has_error: BOOLEAN
			-- has error?
		do
			Result := response = Void and then attached error
		end

	status: INTEGER
		do
			if attached response as l_response then
				Result := l_response.status
			end
		end

feature -- Data

	data (a_type: TYPE [detachable ANY]): detachable ANY
			-- Data representation of the HTTP Response
		do
			if
				attached response as l_response  and then
				attached deserializer as l_deserializer and then
				attached l_response.body as l_body and then
				attached l_response.header ("Content-Type") as l_content_type
			then
				Result := (create {API_DESERIALIZER}).deserializer (l_deserializer, l_content_type, l_body, a_type)
			end
		end

feature -- Error

	error: detachable API_ERROR
			-- Internal client error.

feature {NONE} -- Implementation

	response: detachable HTTP_CLIENT_RESPONSE
			-- Low level response returned by the API call.

	deserializer: detachable FUNCTION [TUPLE [STRING, STRING, TYPE [detachable ANY]], detachable ANY]
			-- function to map a response body with a given content type to the target
			-- in the domain model.

end