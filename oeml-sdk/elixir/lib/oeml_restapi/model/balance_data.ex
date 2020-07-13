# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OEML-RESTAPI.Model.BalanceData do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"asset_id_exchange",
    :"asset_id_coinapi",
    :"balance",
    :"available",
    :"locked",
    :"last_updated_by",
    :"rate_usd"
  ]

  @type t :: %__MODULE__{
    :"asset_id_exchange" => String.t | nil,
    :"asset_id_coinapi" => String.t | nil,
    :"balance" => float() | nil,
    :"available" => float() | nil,
    :"locked" => float() | nil,
    :"last_updated_by" => String.t | nil,
    :"rate_usd" => float() | nil
  }
end

defimpl Poison.Decoder, for: OEML-RESTAPI.Model.BalanceData do
  def decode(value, _options) do
    value
  end
end

