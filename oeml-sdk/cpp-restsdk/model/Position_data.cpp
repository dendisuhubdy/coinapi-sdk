/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Position_data.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Position_data::Position_data()
{
    m_Symbol_id_exchange = utility::conversions::to_string_t("");
    m_Symbol_id_exchangeIsSet = false;
    m_Symbol_id_coinapi = utility::conversions::to_string_t("");
    m_Symbol_id_coinapiIsSet = false;
    m_Avg_entry_price = 0.0;
    m_Avg_entry_priceIsSet = false;
    m_Quantity = 0.0;
    m_QuantityIsSet = false;
    m_SideIsSet = false;
    m_Unrealized_pnl = 0.0;
    m_Unrealized_pnlIsSet = false;
    m_Leverage = 0.0;
    m_LeverageIsSet = false;
    m_Cross_margin = false;
    m_Cross_marginIsSet = false;
    m_Liquidation_price = 0.0;
    m_Liquidation_priceIsSet = false;
    m_Raw_dataIsSet = false;
}

Position_data::~Position_data()
{
}

void Position_data::validate()
{
    // TODO: implement validation
}

web::json::value Position_data::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Symbol_id_exchangeIsSet)
    {
        val[utility::conversions::to_string_t("symbol_id_exchange")] = ModelBase::toJson(m_Symbol_id_exchange);
    }
    if(m_Symbol_id_coinapiIsSet)
    {
        val[utility::conversions::to_string_t("symbol_id_coinapi")] = ModelBase::toJson(m_Symbol_id_coinapi);
    }
    if(m_Avg_entry_priceIsSet)
    {
        val[utility::conversions::to_string_t("avg_entry_price")] = ModelBase::toJson(m_Avg_entry_price);
    }
    if(m_QuantityIsSet)
    {
        val[utility::conversions::to_string_t("quantity")] = ModelBase::toJson(m_Quantity);
    }
    if(m_SideIsSet)
    {
        val[utility::conversions::to_string_t("side")] = ModelBase::toJson(m_Side);
    }
    if(m_Unrealized_pnlIsSet)
    {
        val[utility::conversions::to_string_t("unrealized_pnl")] = ModelBase::toJson(m_Unrealized_pnl);
    }
    if(m_LeverageIsSet)
    {
        val[utility::conversions::to_string_t("leverage")] = ModelBase::toJson(m_Leverage);
    }
    if(m_Cross_marginIsSet)
    {
        val[utility::conversions::to_string_t("cross_margin")] = ModelBase::toJson(m_Cross_margin);
    }
    if(m_Liquidation_priceIsSet)
    {
        val[utility::conversions::to_string_t("liquidation_price")] = ModelBase::toJson(m_Liquidation_price);
    }
    if(m_Raw_dataIsSet)
    {
        val[utility::conversions::to_string_t("raw_data")] = ModelBase::toJson(m_Raw_data);
    }

    return val;
}

bool Position_data::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("symbol_id_exchange")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("symbol_id_exchange"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_symbol_id_exchange;
            ok &= ModelBase::fromJson(fieldValue, refVal_symbol_id_exchange);
            setSymbolIdExchange(refVal_symbol_id_exchange);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("symbol_id_coinapi")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("symbol_id_coinapi"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_symbol_id_coinapi;
            ok &= ModelBase::fromJson(fieldValue, refVal_symbol_id_coinapi);
            setSymbolIdCoinapi(refVal_symbol_id_coinapi);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("avg_entry_price")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("avg_entry_price"));
        if(!fieldValue.is_null())
        {
            double refVal_avg_entry_price;
            ok &= ModelBase::fromJson(fieldValue, refVal_avg_entry_price);
            setAvgEntryPrice(refVal_avg_entry_price);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("quantity")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("quantity"));
        if(!fieldValue.is_null())
        {
            double refVal_quantity;
            ok &= ModelBase::fromJson(fieldValue, refVal_quantity);
            setQuantity(refVal_quantity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("side")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("side"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdSide> refVal_side;
            ok &= ModelBase::fromJson(fieldValue, refVal_side);
            setSide(refVal_side);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("unrealized_pnl")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("unrealized_pnl"));
        if(!fieldValue.is_null())
        {
            double refVal_unrealized_pnl;
            ok &= ModelBase::fromJson(fieldValue, refVal_unrealized_pnl);
            setUnrealizedPnl(refVal_unrealized_pnl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("leverage")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("leverage"));
        if(!fieldValue.is_null())
        {
            double refVal_leverage;
            ok &= ModelBase::fromJson(fieldValue, refVal_leverage);
            setLeverage(refVal_leverage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cross_margin")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("cross_margin"));
        if(!fieldValue.is_null())
        {
            bool refVal_cross_margin;
            ok &= ModelBase::fromJson(fieldValue, refVal_cross_margin);
            setCrossMargin(refVal_cross_margin);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("liquidation_price")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("liquidation_price"));
        if(!fieldValue.is_null())
        {
            double refVal_liquidation_price;
            ok &= ModelBase::fromJson(fieldValue, refVal_liquidation_price);
            setLiquidationPrice(refVal_liquidation_price);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("raw_data")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("raw_data"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_raw_data;
            ok &= ModelBase::fromJson(fieldValue, refVal_raw_data);
            setRawData(refVal_raw_data);
        }
    }
    return ok;
}

void Position_data::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Symbol_id_exchangeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol_id_exchange"), m_Symbol_id_exchange));
    }
    if(m_Symbol_id_coinapiIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("symbol_id_coinapi"), m_Symbol_id_coinapi));
    }
    if(m_Avg_entry_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("avg_entry_price"), m_Avg_entry_price));
    }
    if(m_QuantityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("quantity"), m_Quantity));
    }
    if(m_SideIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("side"), m_Side));
    }
    if(m_Unrealized_pnlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("unrealized_pnl"), m_Unrealized_pnl));
    }
    if(m_LeverageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("leverage"), m_Leverage));
    }
    if(m_Cross_marginIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("cross_margin"), m_Cross_margin));
    }
    if(m_Liquidation_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("liquidation_price"), m_Liquidation_price));
    }
    if(m_Raw_dataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("raw_data"), m_Raw_data));
    }
}

bool Position_data::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("symbol_id_exchange")))
    {
        utility::string_t refVal_symbol_id_exchange;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol_id_exchange")), refVal_symbol_id_exchange );
        setSymbolIdExchange(refVal_symbol_id_exchange);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("symbol_id_coinapi")))
    {
        utility::string_t refVal_symbol_id_coinapi;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("symbol_id_coinapi")), refVal_symbol_id_coinapi );
        setSymbolIdCoinapi(refVal_symbol_id_coinapi);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("avg_entry_price")))
    {
        double refVal_avg_entry_price;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("avg_entry_price")), refVal_avg_entry_price );
        setAvgEntryPrice(refVal_avg_entry_price);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("quantity")))
    {
        double refVal_quantity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("quantity")), refVal_quantity );
        setQuantity(refVal_quantity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("side")))
    {
        std::shared_ptr<OrdSide> refVal_side;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("side")), refVal_side );
        setSide(refVal_side);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("unrealized_pnl")))
    {
        double refVal_unrealized_pnl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("unrealized_pnl")), refVal_unrealized_pnl );
        setUnrealizedPnl(refVal_unrealized_pnl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("leverage")))
    {
        double refVal_leverage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("leverage")), refVal_leverage );
        setLeverage(refVal_leverage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cross_margin")))
    {
        bool refVal_cross_margin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("cross_margin")), refVal_cross_margin );
        setCrossMargin(refVal_cross_margin);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("liquidation_price")))
    {
        double refVal_liquidation_price;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("liquidation_price")), refVal_liquidation_price );
        setLiquidationPrice(refVal_liquidation_price);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("raw_data")))
    {
        std::shared_ptr<Object> refVal_raw_data;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("raw_data")), refVal_raw_data );
        setRawData(refVal_raw_data);
    }
    return ok;
}

utility::string_t Position_data::getSymbolIdExchange() const
{
    return m_Symbol_id_exchange;
}

void Position_data::setSymbolIdExchange(const utility::string_t& value)
{
    m_Symbol_id_exchange = value;
    m_Symbol_id_exchangeIsSet = true;
}

bool Position_data::symbolIdExchangeIsSet() const
{
    return m_Symbol_id_exchangeIsSet;
}

void Position_data::unsetSymbol_id_exchange()
{
    m_Symbol_id_exchangeIsSet = false;
}
utility::string_t Position_data::getSymbolIdCoinapi() const
{
    return m_Symbol_id_coinapi;
}

void Position_data::setSymbolIdCoinapi(const utility::string_t& value)
{
    m_Symbol_id_coinapi = value;
    m_Symbol_id_coinapiIsSet = true;
}

bool Position_data::symbolIdCoinapiIsSet() const
{
    return m_Symbol_id_coinapiIsSet;
}

void Position_data::unsetSymbol_id_coinapi()
{
    m_Symbol_id_coinapiIsSet = false;
}
double Position_data::getAvgEntryPrice() const
{
    return m_Avg_entry_price;
}

void Position_data::setAvgEntryPrice(double value)
{
    m_Avg_entry_price = value;
    m_Avg_entry_priceIsSet = true;
}

bool Position_data::avgEntryPriceIsSet() const
{
    return m_Avg_entry_priceIsSet;
}

void Position_data::unsetAvg_entry_price()
{
    m_Avg_entry_priceIsSet = false;
}
double Position_data::getQuantity() const
{
    return m_Quantity;
}

void Position_data::setQuantity(double value)
{
    m_Quantity = value;
    m_QuantityIsSet = true;
}

bool Position_data::quantityIsSet() const
{
    return m_QuantityIsSet;
}

void Position_data::unsetQuantity()
{
    m_QuantityIsSet = false;
}
std::shared_ptr<OrdSide> Position_data::getSide() const
{
    return m_Side;
}

void Position_data::setSide(const std::shared_ptr<OrdSide>& value)
{
    m_Side = value;
    m_SideIsSet = true;
}

bool Position_data::sideIsSet() const
{
    return m_SideIsSet;
}

void Position_data::unsetSide()
{
    m_SideIsSet = false;
}
double Position_data::getUnrealizedPnl() const
{
    return m_Unrealized_pnl;
}

void Position_data::setUnrealizedPnl(double value)
{
    m_Unrealized_pnl = value;
    m_Unrealized_pnlIsSet = true;
}

bool Position_data::unrealizedPnlIsSet() const
{
    return m_Unrealized_pnlIsSet;
}

void Position_data::unsetUnrealized_pnl()
{
    m_Unrealized_pnlIsSet = false;
}
double Position_data::getLeverage() const
{
    return m_Leverage;
}

void Position_data::setLeverage(double value)
{
    m_Leverage = value;
    m_LeverageIsSet = true;
}

bool Position_data::leverageIsSet() const
{
    return m_LeverageIsSet;
}

void Position_data::unsetLeverage()
{
    m_LeverageIsSet = false;
}
bool Position_data::isCrossMargin() const
{
    return m_Cross_margin;
}

void Position_data::setCrossMargin(bool value)
{
    m_Cross_margin = value;
    m_Cross_marginIsSet = true;
}

bool Position_data::crossMarginIsSet() const
{
    return m_Cross_marginIsSet;
}

void Position_data::unsetCross_margin()
{
    m_Cross_marginIsSet = false;
}
double Position_data::getLiquidationPrice() const
{
    return m_Liquidation_price;
}

void Position_data::setLiquidationPrice(double value)
{
    m_Liquidation_price = value;
    m_Liquidation_priceIsSet = true;
}

bool Position_data::liquidationPriceIsSet() const
{
    return m_Liquidation_priceIsSet;
}

void Position_data::unsetLiquidation_price()
{
    m_Liquidation_priceIsSet = false;
}
std::shared_ptr<Object> Position_data::getRawData() const
{
    return m_Raw_data;
}

void Position_data::setRawData(const std::shared_ptr<Object>& value)
{
    m_Raw_data = value;
    m_Raw_dataIsSet = true;
}

bool Position_data::rawDataIsSet() const
{
    return m_Raw_dataIsSet;
}

void Position_data::unsetRaw_data()
{
    m_Raw_dataIsSet = false;
}
}
}
}
}


