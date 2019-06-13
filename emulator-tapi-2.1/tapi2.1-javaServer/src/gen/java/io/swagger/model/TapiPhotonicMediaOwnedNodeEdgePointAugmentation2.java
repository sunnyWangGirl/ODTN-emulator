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
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOwnedNodeEdgePointAugmentation2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaOwnedNodeEdgePointAugmentation2   {
  @JsonProperty("media-channel-node-edge-point-spec")
  private TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec = null;

  public TapiPhotonicMediaOwnedNodeEdgePointAugmentation2 mediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
    return this;
  }

  /**
   * Augments the base LayerProtocol information in NodeEdgePoint with OCH-specific information
   * @return mediaChannelNodeEdgePointSpec
   **/
  @JsonProperty("media-channel-node-edge-point-spec")
  @ApiModelProperty(value = "Augments the base LayerProtocol information in NodeEdgePoint with OCH-specific information")
  public TapiPhotonicMediaMediaChannelNodeEdgePointSpec getMediaChannelNodeEdgePointSpec() {
    return mediaChannelNodeEdgePointSpec;
  }

  public void setMediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOwnedNodeEdgePointAugmentation2 tapiPhotonicMediaOwnedNodeEdgePointAugmentation2 = (TapiPhotonicMediaOwnedNodeEdgePointAugmentation2) o;
    return Objects.equals(this.mediaChannelNodeEdgePointSpec, tapiPhotonicMediaOwnedNodeEdgePointAugmentation2.mediaChannelNodeEdgePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaChannelNodeEdgePointSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOwnedNodeEdgePointAugmentation2 {\n");
    
    sb.append("    mediaChannelNodeEdgePointSpec: ").append(toIndentedString(mediaChannelNodeEdgePointSpec)).append("\n");
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
