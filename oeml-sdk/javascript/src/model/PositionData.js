/**
 * OEML - REST API
 * Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PositionData model module.
 * @module model/PositionData
 * @version v1
 */
class PositionData {
    /**
     * Constructs a new <code>PositionData</code>.
     * @alias module:model/PositionData
     */
    constructor() { 
        
        PositionData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PositionData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PositionData} obj Optional instance to populate.
     * @return {module:model/PositionData} The populated <code>PositionData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PositionData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('symbol_exchange')) {
                obj['symbol_exchange'] = ApiClient.convertToType(data['symbol_exchange'], 'String');
            }
            if (data.hasOwnProperty('symbol_coinapi')) {
                obj['symbol_coinapi'] = ApiClient.convertToType(data['symbol_coinapi'], 'String');
            }
            if (data.hasOwnProperty('avg_entry_price')) {
                obj['avg_entry_price'] = ApiClient.convertToType(data['avg_entry_price'], 'Number');
            }
            if (data.hasOwnProperty('quantity')) {
                obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
            }
            if (data.hasOwnProperty('is_buy')) {
                obj['is_buy'] = ApiClient.convertToType(data['is_buy'], 'Boolean');
            }
            if (data.hasOwnProperty('unrealised_pn_l')) {
                obj['unrealised_pn_l'] = ApiClient.convertToType(data['unrealised_pn_l'], 'Number');
            }
            if (data.hasOwnProperty('leverage')) {
                obj['leverage'] = ApiClient.convertToType(data['leverage'], 'Number');
            }
            if (data.hasOwnProperty('cross_margin')) {
                obj['cross_margin'] = ApiClient.convertToType(data['cross_margin'], 'Boolean');
            }
            if (data.hasOwnProperty('liquidation_price')) {
                obj['liquidation_price'] = ApiClient.convertToType(data['liquidation_price'], 'Number');
            }
            if (data.hasOwnProperty('raw_data')) {
                obj['raw_data'] = ApiClient.convertToType(data['raw_data'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Unique position ID
 * @member {String} id
 */
PositionData.prototype['id'] = undefined;

/**
 * The contract for this position.
 * @member {String} symbol_exchange
 */
PositionData.prototype['symbol_exchange'] = undefined;

/**
 * The coinapi contract for this position.
 * @member {String} symbol_coinapi
 */
PositionData.prototype['symbol_coinapi'] = undefined;

/**
 * @member {Number} avg_entry_price
 */
PositionData.prototype['avg_entry_price'] = undefined;

/**
 * The current position amount in contracts.
 * @member {Number} quantity
 */
PositionData.prototype['quantity'] = undefined;

/**
 * @member {Boolean} is_buy
 */
PositionData.prototype['is_buy'] = undefined;

/**
 * Unrealised PNL is all the unrealised profit or loss coming from your portfolio's open positions.
 * @member {Number} unrealised_pn_l
 */
PositionData.prototype['unrealised_pn_l'] = undefined;

/**
 * 1 / initMarginReq.
 * @member {Number} leverage
 */
PositionData.prototype['leverage'] = undefined;

/**
 * True/false depending on whether you set cross margin on this position.
 * @member {Boolean} cross_margin
 */
PositionData.prototype['cross_margin'] = undefined;

/**
 * Once markPrice reaches this price, this position will be liquidated.
 * @member {Number} liquidation_price
 */
PositionData.prototype['liquidation_price'] = undefined;

/**
 * @member {String} raw_data
 */
PositionData.prototype['raw_data'] = undefined;






export default PositionData;
