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

package org.openapitools.client.model;

import java.math.BigDecimal;
import org.openapitools.client.model.OrdSide;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PositionData {
  
  @SerializedName("symbol_id_exchange")
  private String symbolIdExchange = null;
  @SerializedName("symbol_id_coinapi")
  private String symbolIdCoinapi = null;
  @SerializedName("avg_entry_price")
  private BigDecimal avgEntryPrice = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("side")
  private OrdSide side = null;
  @SerializedName("unrealized_pnl")
  private BigDecimal unrealizedPnl = null;
  @SerializedName("leverage")
  private BigDecimal leverage = null;
  @SerializedName("cross_margin")
  private Boolean crossMargin = null;
  @SerializedName("liquidation_price")
  private BigDecimal liquidationPrice = null;
  @SerializedName("raw_data")
  private Object rawData = null;

  /**
   * Exchange symbol.
   **/
  @ApiModelProperty(value = "Exchange symbol.")
  public String getSymbolIdExchange() {
    return symbolIdExchange;
  }
  public void setSymbolIdExchange(String symbolIdExchange) {
    this.symbolIdExchange = symbolIdExchange;
  }

  /**
   * CoinAPI symbol.
   **/
  @ApiModelProperty(value = "CoinAPI symbol.")
  public String getSymbolIdCoinapi() {
    return symbolIdCoinapi;
  }
  public void setSymbolIdCoinapi(String symbolIdCoinapi) {
    this.symbolIdCoinapi = symbolIdCoinapi;
  }

  /**
   * Calculated average price of all fills on this position.
   **/
  @ApiModelProperty(value = "Calculated average price of all fills on this position.")
  public BigDecimal getAvgEntryPrice() {
    return avgEntryPrice;
  }
  public void setAvgEntryPrice(BigDecimal avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  /**
   * The current position quantity.
   **/
  @ApiModelProperty(value = "The current position quantity.")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrdSide getSide() {
    return side;
  }
  public void setSide(OrdSide side) {
    this.side = side;
  }

  /**
   * Unrealised profit or loss (PNL) of this position.
   **/
  @ApiModelProperty(value = "Unrealised profit or loss (PNL) of this position.")
  public BigDecimal getUnrealizedPnl() {
    return unrealizedPnl;
  }
  public void setUnrealizedPnl(BigDecimal unrealizedPnl) {
    this.unrealizedPnl = unrealizedPnl;
  }

  /**
   * Leverage for this position reported by the exchange.
   **/
  @ApiModelProperty(value = "Leverage for this position reported by the exchange.")
  public BigDecimal getLeverage() {
    return leverage;
  }
  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }

  /**
   * Is cross margin mode enable for this position?
   **/
  @ApiModelProperty(value = "Is cross margin mode enable for this position?")
  public Boolean getCrossMargin() {
    return crossMargin;
  }
  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }

  /**
   * Liquidation price. If mark price will reach this value, the position will be liquidated.
   **/
  @ApiModelProperty(value = "Liquidation price. If mark price will reach this value, the position will be liquidated.")
  public BigDecimal getLiquidationPrice() {
    return liquidationPrice;
  }
  public void setLiquidationPrice(BigDecimal liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getRawData() {
    return rawData;
  }
  public void setRawData(Object rawData) {
    this.rawData = rawData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionData positionData = (PositionData) o;
    return (this.symbolIdExchange == null ? positionData.symbolIdExchange == null : this.symbolIdExchange.equals(positionData.symbolIdExchange)) &&
        (this.symbolIdCoinapi == null ? positionData.symbolIdCoinapi == null : this.symbolIdCoinapi.equals(positionData.symbolIdCoinapi)) &&
        (this.avgEntryPrice == null ? positionData.avgEntryPrice == null : this.avgEntryPrice.equals(positionData.avgEntryPrice)) &&
        (this.quantity == null ? positionData.quantity == null : this.quantity.equals(positionData.quantity)) &&
        (this.side == null ? positionData.side == null : this.side.equals(positionData.side)) &&
        (this.unrealizedPnl == null ? positionData.unrealizedPnl == null : this.unrealizedPnl.equals(positionData.unrealizedPnl)) &&
        (this.leverage == null ? positionData.leverage == null : this.leverage.equals(positionData.leverage)) &&
        (this.crossMargin == null ? positionData.crossMargin == null : this.crossMargin.equals(positionData.crossMargin)) &&
        (this.liquidationPrice == null ? positionData.liquidationPrice == null : this.liquidationPrice.equals(positionData.liquidationPrice)) &&
        (this.rawData == null ? positionData.rawData == null : this.rawData.equals(positionData.rawData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.symbolIdExchange == null ? 0: this.symbolIdExchange.hashCode());
    result = 31 * result + (this.symbolIdCoinapi == null ? 0: this.symbolIdCoinapi.hashCode());
    result = 31 * result + (this.avgEntryPrice == null ? 0: this.avgEntryPrice.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.unrealizedPnl == null ? 0: this.unrealizedPnl.hashCode());
    result = 31 * result + (this.leverage == null ? 0: this.leverage.hashCode());
    result = 31 * result + (this.crossMargin == null ? 0: this.crossMargin.hashCode());
    result = 31 * result + (this.liquidationPrice == null ? 0: this.liquidationPrice.hashCode());
    result = 31 * result + (this.rawData == null ? 0: this.rawData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionData {\n");
    
    sb.append("  symbolIdExchange: ").append(symbolIdExchange).append("\n");
    sb.append("  symbolIdCoinapi: ").append(symbolIdCoinapi).append("\n");
    sb.append("  avgEntryPrice: ").append(avgEntryPrice).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  unrealizedPnl: ").append(unrealizedPnl).append("\n");
    sb.append("  leverage: ").append(leverage).append("\n");
    sb.append("  crossMargin: ").append(crossMargin).append("\n");
    sb.append("  liquidationPrice: ").append(liquidationPrice).append("\n");
    sb.append("  rawData: ").append(rawData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
