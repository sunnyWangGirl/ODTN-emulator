/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * TapiCommonGetserviceinterfacepointdetailsInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonGetserviceinterfacepointdetailsInput   {
  @JsonProperty("sip-id-or-name")
  private String sipIdOrName = null;

  public TapiCommonGetserviceinterfacepointdetailsInput sipIdOrName(String sipIdOrName) {
    this.sipIdOrName = sipIdOrName;
    return this;
  }

  /**
   * none
   * @return sipIdOrName
   **/
  @JsonProperty("sip-id-or-name")
  @ApiModelProperty(value = "none")
  public String getSipIdOrName() {
    return sipIdOrName;
  }

  public void setSipIdOrName(String sipIdOrName) {
    this.sipIdOrName = sipIdOrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonGetserviceinterfacepointdetailsInput tapiCommonGetserviceinterfacepointdetailsInput = (TapiCommonGetserviceinterfacepointdetailsInput) o;
    return Objects.equals(this.sipIdOrName, tapiCommonGetserviceinterfacepointdetailsInput.sipIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sipIdOrName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonGetserviceinterfacepointdetailsInput {\n");
    
    sb.append("    sipIdOrName: ").append(toIndentedString(sipIdOrName)).append("\n");
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

