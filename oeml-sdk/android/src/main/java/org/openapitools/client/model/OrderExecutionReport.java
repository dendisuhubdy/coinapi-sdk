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
import java.util.*;
import java.util.Date;
import org.openapitools.client.model.OrdSide;
import org.openapitools.client.model.OrdStatus;
import org.openapitools.client.model.OrdType;
import org.openapitools.client.model.OrderExecutionReportAllOf;
import org.openapitools.client.model.OrderNewSingleRequest;
import org.openapitools.client.model.TimeInForce;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The order execution report object.
 **/
@ApiModel(description = "The order execution report object.")
public class OrderExecutionReport {
  
  @SerializedName("exchange_id")
  private String exchangeId = null;
  @SerializedName("client_order_id")
  private String clientOrderId = null;
  @SerializedName("symbol_id_exchange")
  private String symbolIdExchange = null;
  @SerializedName("symbol_id_coinapi")
  private String symbolIdCoinapi = null;
  @SerializedName("amount_order")
  private BigDecimal amountOrder = null;
  @SerializedName("price")
  private BigDecimal price = null;
  @SerializedName("side")
  private OrdSide side = null;
  @SerializedName("order_type")
  private OrdType orderType = null;
  @SerializedName("time_in_force")
  private TimeInForce timeInForce = null;
  @SerializedName("expire_time")
  private Date expireTime = null;
  public enum List&lt;ExecInstEnum&gt; {
     MAKER_OR_CANCEL,  AUCTION_ONLY,  INDICATION_OF_INTEREST, 
  };
  @SerializedName("exec_inst")
  private List<ExecInstEnum> execInst = null;
  @SerializedName("client_order_id_format_exchange")
  private String clientOrderIdFormatExchange = null;
  @SerializedName("exchange_order_id")
  private String exchangeOrderId = null;
  @SerializedName("amount_open")
  private BigDecimal amountOpen = null;
  @SerializedName("amount_filled")
  private BigDecimal amountFilled = null;
  @SerializedName("status")
  private OrdStatus status = null;
  @SerializedName("time_order")
  private List<List<String>> timeOrder = null;
  @SerializedName("error_message")
  private String errorMessage = null;

  /**
   * Exchange identifier.
   **/
  @ApiModelProperty(required = true, value = "Exchange identifier.")
  public String getExchangeId() {
    return exchangeId;
  }
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * The unique identifier of the order assigned by the client.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the order assigned by the client.")
  public String getClientOrderId() {
    return clientOrderId;
  }
  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  /**
   * Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
   **/
  @ApiModelProperty(value = "Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.")
  public String getSymbolIdExchange() {
    return symbolIdExchange;
  }
  public void setSymbolIdExchange(String symbolIdExchange) {
    this.symbolIdExchange = symbolIdExchange;
  }

  /**
   * CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
   **/
  @ApiModelProperty(value = "CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.")
  public String getSymbolIdCoinapi() {
    return symbolIdCoinapi;
  }
  public void setSymbolIdCoinapi(String symbolIdCoinapi) {
    this.symbolIdCoinapi = symbolIdCoinapi;
  }

  /**
   * Order quantity.
   **/
  @ApiModelProperty(required = true, value = "Order quantity.")
  public BigDecimal getAmountOrder() {
    return amountOrder;
  }
  public void setAmountOrder(BigDecimal amountOrder) {
    this.amountOrder = amountOrder;
  }

  /**
   * Order price.
   **/
  @ApiModelProperty(required = true, value = "Order price.")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrdSide getSide() {
    return side;
  }
  public void setSide(OrdSide side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrdType getOrderType() {
    return orderType;
  }
  public void setOrderType(OrdType orderType) {
    this.orderType = orderType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeInForce getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   * Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.
   **/
  @ApiModelProperty(value = "Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.")
  public Date getExpireTime() {
    return expireTime;
  }
  public void setExpireTime(Date expireTime) {
    this.expireTime = expireTime;
  }

  /**
   * Order execution instructions are documented in the separate section: <a href=\"#oeml-order-params-exec\">OEML / Starter Guide / Order parameters / Execution instructions</a> 
   **/
  @ApiModelProperty(value = "Order execution instructions are documented in the separate section: <a href=\"#oeml-order-params-exec\">OEML / Starter Guide / Order parameters / Execution instructions</a> ")
  public List<ExecInstEnum> getExecInst() {
    return execInst;
  }
  public void setExecInst(List<ExecInstEnum> execInst) {
    this.execInst = execInst;
  }

  /**
   * The unique identifier of the order assigned by the client converted to the exchange order tag format for the purpose of tracking it.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the order assigned by the client converted to the exchange order tag format for the purpose of tracking it.")
  public String getClientOrderIdFormatExchange() {
    return clientOrderIdFormatExchange;
  }
  public void setClientOrderIdFormatExchange(String clientOrderIdFormatExchange) {
    this.clientOrderIdFormatExchange = clientOrderIdFormatExchange;
  }

  /**
   * The unique identifier of the order assigned by the exchange.
   **/
  @ApiModelProperty(value = "The unique identifier of the order assigned by the exchange.")
  public String getExchangeOrderId() {
    return exchangeOrderId;
  }
  public void setExchangeOrderId(String exchangeOrderId) {
    this.exchangeOrderId = exchangeOrderId;
  }

  /**
   * Amount open.
   **/
  @ApiModelProperty(required = true, value = "Amount open.")
  public BigDecimal getAmountOpen() {
    return amountOpen;
  }
  public void setAmountOpen(BigDecimal amountOpen) {
    this.amountOpen = amountOpen;
  }

  /**
   * Amount filled.
   **/
  @ApiModelProperty(required = true, value = "Amount filled.")
  public BigDecimal getAmountFilled() {
    return amountFilled;
  }
  public void setAmountFilled(BigDecimal amountFilled) {
    this.amountFilled = amountFilled;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrdStatus getStatus() {
    return status;
  }
  public void setStatus(OrdStatus status) {
    this.status = status;
  }

  /**
   * Timestamped history of order status changes.
   **/
  @ApiModelProperty(required = true, value = "Timestamped history of order status changes.")
  public List<List<String>> getTimeOrder() {
    return timeOrder;
  }
  public void setTimeOrder(List<List<String>> timeOrder) {
    this.timeOrder = timeOrder;
  }

  /**
   * Error message
   **/
  @ApiModelProperty(value = "Error message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExecutionReport orderExecutionReport = (OrderExecutionReport) o;
    return (this.exchangeId == null ? orderExecutionReport.exchangeId == null : this.exchangeId.equals(orderExecutionReport.exchangeId)) &&
        (this.clientOrderId == null ? orderExecutionReport.clientOrderId == null : this.clientOrderId.equals(orderExecutionReport.clientOrderId)) &&
        (this.symbolIdExchange == null ? orderExecutionReport.symbolIdExchange == null : this.symbolIdExchange.equals(orderExecutionReport.symbolIdExchange)) &&
        (this.symbolIdCoinapi == null ? orderExecutionReport.symbolIdCoinapi == null : this.symbolIdCoinapi.equals(orderExecutionReport.symbolIdCoinapi)) &&
        (this.amountOrder == null ? orderExecutionReport.amountOrder == null : this.amountOrder.equals(orderExecutionReport.amountOrder)) &&
        (this.price == null ? orderExecutionReport.price == null : this.price.equals(orderExecutionReport.price)) &&
        (this.side == null ? orderExecutionReport.side == null : this.side.equals(orderExecutionReport.side)) &&
        (this.orderType == null ? orderExecutionReport.orderType == null : this.orderType.equals(orderExecutionReport.orderType)) &&
        (this.timeInForce == null ? orderExecutionReport.timeInForce == null : this.timeInForce.equals(orderExecutionReport.timeInForce)) &&
        (this.expireTime == null ? orderExecutionReport.expireTime == null : this.expireTime.equals(orderExecutionReport.expireTime)) &&
        (this.execInst == null ? orderExecutionReport.execInst == null : this.execInst.equals(orderExecutionReport.execInst)) &&
        (this.clientOrderIdFormatExchange == null ? orderExecutionReport.clientOrderIdFormatExchange == null : this.clientOrderIdFormatExchange.equals(orderExecutionReport.clientOrderIdFormatExchange)) &&
        (this.exchangeOrderId == null ? orderExecutionReport.exchangeOrderId == null : this.exchangeOrderId.equals(orderExecutionReport.exchangeOrderId)) &&
        (this.amountOpen == null ? orderExecutionReport.amountOpen == null : this.amountOpen.equals(orderExecutionReport.amountOpen)) &&
        (this.amountFilled == null ? orderExecutionReport.amountFilled == null : this.amountFilled.equals(orderExecutionReport.amountFilled)) &&
        (this.status == null ? orderExecutionReport.status == null : this.status.equals(orderExecutionReport.status)) &&
        (this.timeOrder == null ? orderExecutionReport.timeOrder == null : this.timeOrder.equals(orderExecutionReport.timeOrder)) &&
        (this.errorMessage == null ? orderExecutionReport.errorMessage == null : this.errorMessage.equals(orderExecutionReport.errorMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.exchangeId == null ? 0: this.exchangeId.hashCode());
    result = 31 * result + (this.clientOrderId == null ? 0: this.clientOrderId.hashCode());
    result = 31 * result + (this.symbolIdExchange == null ? 0: this.symbolIdExchange.hashCode());
    result = 31 * result + (this.symbolIdCoinapi == null ? 0: this.symbolIdCoinapi.hashCode());
    result = 31 * result + (this.amountOrder == null ? 0: this.amountOrder.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.orderType == null ? 0: this.orderType.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.expireTime == null ? 0: this.expireTime.hashCode());
    result = 31 * result + (this.execInst == null ? 0: this.execInst.hashCode());
    result = 31 * result + (this.clientOrderIdFormatExchange == null ? 0: this.clientOrderIdFormatExchange.hashCode());
    result = 31 * result + (this.exchangeOrderId == null ? 0: this.exchangeOrderId.hashCode());
    result = 31 * result + (this.amountOpen == null ? 0: this.amountOpen.hashCode());
    result = 31 * result + (this.amountFilled == null ? 0: this.amountFilled.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.timeOrder == null ? 0: this.timeOrder.hashCode());
    result = 31 * result + (this.errorMessage == null ? 0: this.errorMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExecutionReport {\n");
    
    sb.append("  exchangeId: ").append(exchangeId).append("\n");
    sb.append("  clientOrderId: ").append(clientOrderId).append("\n");
    sb.append("  symbolIdExchange: ").append(symbolIdExchange).append("\n");
    sb.append("  symbolIdCoinapi: ").append(symbolIdCoinapi).append("\n");
    sb.append("  amountOrder: ").append(amountOrder).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  orderType: ").append(orderType).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  expireTime: ").append(expireTime).append("\n");
    sb.append("  execInst: ").append(execInst).append("\n");
    sb.append("  clientOrderIdFormatExchange: ").append(clientOrderIdFormatExchange).append("\n");
    sb.append("  exchangeOrderId: ").append(exchangeOrderId).append("\n");
    sb.append("  amountOpen: ").append(amountOpen).append("\n");
    sb.append("  amountFilled: ").append(amountFilled).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  timeOrder: ").append(timeOrder).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
