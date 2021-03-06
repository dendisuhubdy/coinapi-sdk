{-
   OEML - REST API
   This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       

   The version of the OpenAPI document: v1
   Contact: support@coinapi.io

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.OrderCancelAllRequest exposing (OrderCancelAllRequest, decoder, encode, encodeWithTag, toString)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Cancel all orders request object.
-}
type alias OrderCancelAllRequest =
    { exchangeId : String
    }


decoder : Decoder OrderCancelAllRequest
decoder =
    Decode.succeed OrderCancelAllRequest
        |> required "exchange_id" Decode.string



encode : OrderCancelAllRequest -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> OrderCancelAllRequest -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : OrderCancelAllRequest -> List (String, Encode.Value)
encodePairs model =
    [ ( "exchange_id", Encode.string model.exchangeId )
    ]



toString : OrderCancelAllRequest -> String
toString =
    Encode.encode 0 << encode




