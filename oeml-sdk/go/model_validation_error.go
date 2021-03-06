/*
 * OEML - REST API
 *
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * API version: v1
 * Contact: support@coinapi.io
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// ValidationError struct for ValidationError
type ValidationError struct {
	Type string `json:"type,omitempty"`
	Title string `json:"title,omitempty"`
	Status float32 `json:"status,omitempty"`
	TraceId string `json:"traceId,omitempty"`
	Errors string `json:"errors,omitempty"`
}
