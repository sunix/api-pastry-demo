/*
 * API Pastry
 * API definition of API Pastry sample app
 *
 * OpenAPI spec version: 1.0.0
 * Contact: laurent.broudoux@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.lbroudoux.pastries;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * The root of the Pastry type&#x27;s schema.
 */@ApiModel(description = "The root of the Pastry type's schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2019-03-19T17:32:39.186+01:00[Europe/Paris]")
public class Pastry implements Serializable {

  private static final long serialVersionUID = 1L;

  
  @JsonProperty("name")
  private String name = null;
  
  
  @JsonProperty("description")
  private String description = null;
  
  
  @JsonProperty("size")
  private String size = null;
  
  
  @JsonProperty("price")
  private Double price = null;
  
  
  @JsonProperty("status")
  private String status = null;
  
  public Pastry name(String name) {
    this.name = name;
    return this;
  }

  
  /**
  * Name of this pastry
  * @return name
  **/
  @ApiModelProperty(value = "Name of this pastry")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public Pastry description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * A short description of this pastry
  * @return description
  **/
  @ApiModelProperty(value = "A short description of this pastry")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Pastry size(String size) {
    this.size = size;
    return this;
  }

  
  /**
  * Size of pastry (S, M, L)
  * @return size
  **/
  @ApiModelProperty(value = "Size of pastry (S, M, L)")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }
  
  public Pastry price(Double price) {
    this.price = price;
    return this;
  }

  
  /**
  * Price (in USD) of this pastry
  * @return price
  **/
  @ApiModelProperty(value = "Price (in USD) of this pastry")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  
  public Pastry status(String status) {
    this.status = status;
    return this;
  }

  
  /**
  * Status in stock (available, out_of_stock)
  * @return status
  **/
  @ApiModelProperty(value = "Status in stock (available, out_of_stock)")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pastry pastry = (Pastry) o;
    return Objects.equals(this.name, pastry.name) &&
        Objects.equals(this.description, pastry.description) &&
        Objects.equals(this.size, pastry.size) &&
        Objects.equals(this.price, pastry.price) &&
        Objects.equals(this.status, pastry.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, size, price, status);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pastry {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



