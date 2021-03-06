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
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityRouteRef;
import io.swagger.model.TapiConnectivitySelectionControl;
import io.swagger.model.TapiConnectivitySelectionReason;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiConnectivitySwitch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiConnectivitySwitch   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("selected-connection-end-point")
  private List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint = null;

  @JsonProperty("selected-route")
  private List<TapiConnectivityRouteRef> selectedRoute = null;

  @JsonProperty("selection-control")
  private TapiConnectivitySelectionControl selectionControl = null;

  @JsonProperty("selection-reason")
  private TapiConnectivitySelectionReason selectionReason = null;

  @JsonProperty("switch-direction")
  private TapiCommonPortDirection switchDirection = null;

  public TapiConnectivitySwitch name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiConnectivitySwitch addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiConnectivitySwitch localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
   **/
  @JsonProperty("local-id")
  @ApiModelProperty(value = "none")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiConnectivitySwitch selectedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
    return this;
  }

  public TapiConnectivitySwitch addSelectedConnectionEndPointItem(TapiConnectivityConnectionEndPointRef selectedConnectionEndPointItem) {
    if (this.selectedConnectionEndPoint == null) {
      this.selectedConnectionEndPoint = new ArrayList<TapiConnectivityConnectionEndPointRef>();
    }
    this.selectedConnectionEndPoint.add(selectedConnectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return selectedConnectionEndPoint
   **/
  @JsonProperty("selected-connection-end-point")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityConnectionEndPointRef> getSelectedConnectionEndPoint() {
    return selectedConnectionEndPoint;
  }

  public void setSelectedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
  }

  public TapiConnectivitySwitch selectedRoute(List<TapiConnectivityRouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
    return this;
  }

  public TapiConnectivitySwitch addSelectedRouteItem(TapiConnectivityRouteRef selectedRouteItem) {
    if (this.selectedRoute == null) {
      this.selectedRoute = new ArrayList<TapiConnectivityRouteRef>();
    }
    this.selectedRoute.add(selectedRouteItem);
    return this;
  }

  /**
   * none
   * @return selectedRoute
   **/
  @JsonProperty("selected-route")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityRouteRef> getSelectedRoute() {
    return selectedRoute;
  }

  public void setSelectedRoute(List<TapiConnectivityRouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
  }

  public TapiConnectivitySwitch selectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
    return this;
  }

  /**
   * Degree of administrative control applied to the switch selection.
   * @return selectionControl
   **/
  @JsonProperty("selection-control")
  @ApiModelProperty(value = "Degree of administrative control applied to the switch selection.")
  public TapiConnectivitySelectionControl getSelectionControl() {
    return selectionControl;
  }

  public void setSelectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
  }

  public TapiConnectivitySwitch selectionReason(TapiConnectivitySelectionReason selectionReason) {
    this.selectionReason = selectionReason;
    return this;
  }

  /**
   * The reason for the current switch selection.
   * @return selectionReason
   **/
  @JsonProperty("selection-reason")
  @ApiModelProperty(value = "The reason for the current switch selection.")
  public TapiConnectivitySelectionReason getSelectionReason() {
    return selectionReason;
  }

  public void setSelectionReason(TapiConnectivitySelectionReason selectionReason) {
    this.selectionReason = selectionReason;
  }

  public TapiConnectivitySwitch switchDirection(TapiCommonPortDirection switchDirection) {
    this.switchDirection = switchDirection;
    return this;
  }

  /**
   * Indicates whether the switch selects from ingress to the FC or to egress of the FC, or both.
   * @return switchDirection
   **/
  @JsonProperty("switch-direction")
  @ApiModelProperty(value = "Indicates whether the switch selects from ingress to the FC or to egress of the FC, or both.")
  public TapiCommonPortDirection getSwitchDirection() {
    return switchDirection;
  }

  public void setSwitchDirection(TapiCommonPortDirection switchDirection) {
    this.switchDirection = switchDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivitySwitch tapiConnectivitySwitch = (TapiConnectivitySwitch) o;
    return Objects.equals(this.name, tapiConnectivitySwitch.name) &&
        Objects.equals(this.localId, tapiConnectivitySwitch.localId) &&
        Objects.equals(this.selectedConnectionEndPoint, tapiConnectivitySwitch.selectedConnectionEndPoint) &&
        Objects.equals(this.selectedRoute, tapiConnectivitySwitch.selectedRoute) &&
        Objects.equals(this.selectionControl, tapiConnectivitySwitch.selectionControl) &&
        Objects.equals(this.selectionReason, tapiConnectivitySwitch.selectionReason) &&
        Objects.equals(this.switchDirection, tapiConnectivitySwitch.switchDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, selectedConnectionEndPoint, selectedRoute, selectionControl, selectionReason, switchDirection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivitySwitch {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    selectedConnectionEndPoint: ").append(toIndentedString(selectedConnectionEndPoint)).append("\n");
    sb.append("    selectedRoute: ").append(toIndentedString(selectedRoute)).append("\n");
    sb.append("    selectionControl: ").append(toIndentedString(selectionControl)).append("\n");
    sb.append("    selectionReason: ").append(toIndentedString(selectionReason)).append("\n");
    sb.append("    switchDirection: ").append(toIndentedString(switchDirection)).append("\n");
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

