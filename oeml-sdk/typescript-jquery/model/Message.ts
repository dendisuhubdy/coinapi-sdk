/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as models from './models';

export interface Message {
    /**
     * Type of message.
     */
    type?: string;

    severity?: models.Severity;

    /**
     * If the message related to exchange, then the identifier of the exchange will be provided.
     */
    exchange_id?: string;

    /**
     * Message text.
     */
    message?: string;

}
