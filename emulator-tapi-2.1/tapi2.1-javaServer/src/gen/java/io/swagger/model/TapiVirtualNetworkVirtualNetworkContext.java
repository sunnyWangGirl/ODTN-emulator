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
import io.swagger.model.TapiVirtualNetworkVirtualNetworkService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkVirtualNetworkContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiVirtualNetworkVirtualNetworkContext   {
  @JsonProperty("virtual-nw-service")
  private List<TapiVirtualNetworkVirtualNetworkService> virtualNwService = null;

  public TapiVirtualNetworkVirtualNetworkContext virtualNwService(List<TapiVirtualNetworkVirtualNetworkService> virtualNwService) {
    this.virtualNwService = virtualNwService;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkContext addVirtualNwServiceItem(TapiVirtualNetworkVirtualNetworkService virtualNwServiceItem) {
    if (this.virtualNwService == null) {
      this.virtualNwService = new ArrayList<TapiVirtualNetworkVirtualNetworkService>();
    }
    this.virtualNwService.add(virtualNwServiceItem);
    return this;
  }

  /**
   * none
   * @return virtualNwService
   **/
  @JsonProperty("virtual-nw-service")
  @ApiModelProperty(value = "none")
  public List<TapiVirtualNetworkVirtualNetworkService> getVirtualNwService() {
    return virtualNwService;
  }

  public void setVirtualNwService(List<TapiVirtualNetworkVirtualNetworkService> virtualNwService) {
    this.virtualNwService = virtualNwService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNetworkContext tapiVirtualNetworkVirtualNetworkContext = (TapiVirtualNetworkVirtualNetworkContext) o;
    return Objects.equals(this.virtualNwService, tapiVirtualNetworkVirtualNetworkContext.virtualNwService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNwService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNetworkContext {\n");
    
    sb.append("    virtualNwService: ").append(toIndentedString(virtualNwService)).append("\n");
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
