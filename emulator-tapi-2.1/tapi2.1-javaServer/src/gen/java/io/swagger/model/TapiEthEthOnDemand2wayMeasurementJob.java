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
import io.swagger.model.TapiEthEthOnDemandMeasurementJobControlSource;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemand2wayMeasurementJob
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthOnDemand2wayMeasurementJob   {
  @JsonProperty("on-demand-control-2way-source")
  private TapiEthEthOnDemandMeasurementJobControlSource onDemandControl2waySource = null;

  public TapiEthEthOnDemand2wayMeasurementJob onDemandControl2waySource(TapiEthEthOnDemandMeasurementJobControlSource onDemandControl2waySource) {
    this.onDemandControl2waySource = onDemandControl2waySource;
    return this;
  }

  /**
   * none
   * @return onDemandControl2waySource
   **/
  @JsonProperty("on-demand-control-2way-source")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemandMeasurementJobControlSource getOnDemandControl2waySource() {
    return onDemandControl2waySource;
  }

  public void setOnDemandControl2waySource(TapiEthEthOnDemandMeasurementJobControlSource onDemandControl2waySource) {
    this.onDemandControl2waySource = onDemandControl2waySource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemand2wayMeasurementJob tapiEthEthOnDemand2wayMeasurementJob = (TapiEthEthOnDemand2wayMeasurementJob) o;
    return Objects.equals(this.onDemandControl2waySource, tapiEthEthOnDemand2wayMeasurementJob.onDemandControl2waySource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onDemandControl2waySource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemand2wayMeasurementJob {\n");
    
    sb.append("    onDemandControl2waySource: ").append(toIndentedString(onDemandControl2waySource)).append("\n");
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

