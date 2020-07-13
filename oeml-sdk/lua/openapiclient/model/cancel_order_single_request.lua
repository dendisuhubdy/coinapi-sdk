--[[
  OEML - REST API
 
  This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 
  The version of the OpenAPI document: v1
  
  Generated by: https://openapi-generator.tech
]]

-- cancel_order_single_request class
local cancel_order_single_request = {}
local cancel_order_single_request_mt = {
	__name = "cancel_order_single_request";
	__index = cancel_order_single_request;
}

local function cast_cancel_order_single_request(t)
	return setmetatable(t, cancel_order_single_request_mt)
end

local function new_cancel_order_single_request(exchange_id, exchange_order_id, client_order_id)
	return cast_cancel_order_single_request({
		["exchange_id"] = exchange_id;
		["exchange_order_id"] = exchange_order_id;
		["client_order_id"] = client_order_id;
	})
end

return {
	cast = cast_cancel_order_single_request;
	new = new_cancel_order_single_request;
}