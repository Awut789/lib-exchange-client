/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderBookEntry {
  
  @SerializedName("px")
  private Double px = null;
  @SerializedName("qty")
  private Double qty = null;
  @SerializedName("num")
  private Long num = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPx() {
    return px;
  }
  public void setPx(Double px) {
    this.px = px;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getQty() {
    return qty;
  }
  public void setQty(Double qty) {
    this.qty = qty;
  }

  /**
   * Either the quantity of orders on this price level for L2, or the individual order id for L3
   **/
  @ApiModelProperty(value = "Either the quantity of orders on this price level for L2, or the individual order id for L3")
  public Long getNum() {
    return num;
  }
  public void setNum(Long num) {
    this.num = num;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBookEntry orderBookEntry = (OrderBookEntry) o;
    return (this.px == null ? orderBookEntry.px == null : this.px.equals(orderBookEntry.px)) &&
        (this.qty == null ? orderBookEntry.qty == null : this.qty.equals(orderBookEntry.qty)) &&
        (this.num == null ? orderBookEntry.num == null : this.num.equals(orderBookEntry.num));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.px == null ? 0: this.px.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.num == null ? 0: this.num.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBookEntry {\n");
    
    sb.append("  px: ").append(px).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  num: ").append(num).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}