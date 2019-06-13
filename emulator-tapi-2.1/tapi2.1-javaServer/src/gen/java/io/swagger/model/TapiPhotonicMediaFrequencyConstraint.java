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
import io.swagger.model.TapiPhotonicMediaAdjustmentGranularity;
import io.swagger.model.TapiPhotonicMediaGridType;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaFrequencyConstraint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaFrequencyConstraint   {
  @JsonProperty("adjustment-granularity")
  private TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity = null;

  @JsonProperty("grid-type")
  private TapiPhotonicMediaGridType gridType = null;

  public TapiPhotonicMediaFrequencyConstraint adjustmentGranularity(TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity) {
    this.adjustmentGranularity = adjustmentGranularity;
    return this;
  }

  /**
   * Adjustment granularity in Gigahertz. As per ITU-T G.694.1, it is used to calculate nominal central frequency (in THz)
   * @return adjustmentGranularity
   **/
  @JsonProperty("adjustment-granularity")
  @ApiModelProperty(value = "Adjustment granularity in Gigahertz. As per ITU-T G.694.1, it is used to calculate nominal central frequency (in THz)")
  public TapiPhotonicMediaAdjustmentGranularity getAdjustmentGranularity() {
    return adjustmentGranularity;
  }

  public void setAdjustmentGranularity(TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity) {
    this.adjustmentGranularity = adjustmentGranularity;
  }

  public TapiPhotonicMediaFrequencyConstraint gridType(TapiPhotonicMediaGridType gridType) {
    this.gridType = gridType;
    return this;
  }

  /**
   * Specifies the frequency grid standard used to determine the nominal central frequency and frequency slot width
   * @return gridType
   **/
  @JsonProperty("grid-type")
  @ApiModelProperty(value = "Specifies the frequency grid standard used to determine the nominal central frequency and frequency slot width")
  public TapiPhotonicMediaGridType getGridType() {
    return gridType;
  }

  public void setGridType(TapiPhotonicMediaGridType gridType) {
    this.gridType = gridType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaFrequencyConstraint tapiPhotonicMediaFrequencyConstraint = (TapiPhotonicMediaFrequencyConstraint) o;
    return Objects.equals(this.adjustmentGranularity, tapiPhotonicMediaFrequencyConstraint.adjustmentGranularity) &&
        Objects.equals(this.gridType, tapiPhotonicMediaFrequencyConstraint.gridType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentGranularity, gridType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaFrequencyConstraint {\n");
    
    sb.append("    adjustmentGranularity: ").append(toIndentedString(adjustmentGranularity)).append("\n");
    sb.append("    gridType: ").append(toIndentedString(gridType)).append("\n");
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
