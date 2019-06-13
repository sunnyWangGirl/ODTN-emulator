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
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimePeriod;
import io.swagger.model.TapiEthEthOnDemand1DmPerformanceData;
import io.swagger.model.TapiEthEthOnDemand1LmPerformanceData;
import io.swagger.model.TapiEthEthOnDemandDmPerformanceData;
import io.swagger.model.TapiEthEthOnDemandLmPerformanceData;
import io.swagger.model.TapiEthEthProActive1DmPerformanceData;
import io.swagger.model.TapiEthEthProActive1LmPerformanceData;
import io.swagger.model.TapiEthEthProActiveDmPerformanceData;
import io.swagger.model.TapiEthEthProActiveLmPerformanceData;
import io.swagger.model.TapiEthPmHistoryDataAugmentation1;
import io.swagger.model.TapiEthPmHistoryDataAugmentation2;
import io.swagger.model.TapiEthPmHistoryDataAugmentation3;
import io.swagger.model.TapiEthPmHistoryDataAugmentation4;
import io.swagger.model.TapiEthPmHistoryDataAugmentation5;
import io.swagger.model.TapiEthPmHistoryDataAugmentation6;
import io.swagger.model.TapiEthPmHistoryDataAugmentation7;
import io.swagger.model.TapiEthPmHistoryDataAugmentation8;
import io.swagger.model.TapiOamPmHistoryData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamPmcurrentdataPmHistoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamPmcurrentdataPmHistoryData   {
  @JsonProperty("eth-on-demand-lm-performance-data")
  private TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData = null;

  @JsonProperty("eth-on-demand-1-lm-performance-data")
  private TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData = null;

  @JsonProperty("eth-pro-active-dm-performance-data")
  private TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData = null;

  @JsonProperty("eth-pro-active-1-lm-performance-data")
  private TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData = null;

  @JsonProperty("eth-on-demand-1-dm-performance-data")
  private TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData = null;

  @JsonProperty("eth-pro-active-1-dm-performance-data")
  private TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData = null;

  @JsonProperty("eth-pro-active-lm-performance-data")
  private TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData = null;

  @JsonProperty("eth-on-demand-dm-performance-data")
  private TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  @JsonProperty("period-end-time")
  private String periodEndTime = null;

  @JsonProperty("suspect-interval-flag")
  private Boolean suspectIntervalFlag = false;

  public TapiOamPmcurrentdataPmHistoryData ethOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethOnDemandLmPerformanceData
   **/
  @JsonProperty("eth-on-demand-lm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemandLmPerformanceData getEthOnDemandLmPerformanceData() {
    return ethOnDemandLmPerformanceData;
  }

  public void setEthOnDemandLmPerformanceData(TapiEthEthOnDemandLmPerformanceData ethOnDemandLmPerformanceData) {
    this.ethOnDemandLmPerformanceData = ethOnDemandLmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethOnDemand1LmPerformanceData
   **/
  @JsonProperty("eth-on-demand-1-lm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemand1LmPerformanceData getEthOnDemand1LmPerformanceData() {
    return ethOnDemand1LmPerformanceData;
  }

  public void setEthOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethProActiveDmPerformanceData
   **/
  @JsonProperty("eth-pro-active-dm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthProActiveDmPerformanceData getEthProActiveDmPerformanceData() {
    return ethProActiveDmPerformanceData;
  }

  public void setEthProActiveDmPerformanceData(TapiEthEthProActiveDmPerformanceData ethProActiveDmPerformanceData) {
    this.ethProActiveDmPerformanceData = ethProActiveDmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethProActive1LmPerformanceData
   **/
  @JsonProperty("eth-pro-active-1-lm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthProActive1LmPerformanceData getEthProActive1LmPerformanceData() {
    return ethProActive1LmPerformanceData;
  }

  public void setEthProActive1LmPerformanceData(TapiEthEthProActive1LmPerformanceData ethProActive1LmPerformanceData) {
    this.ethProActive1LmPerformanceData = ethProActive1LmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethOnDemand1DmPerformanceData
   **/
  @JsonProperty("eth-on-demand-1-dm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemand1DmPerformanceData getEthOnDemand1DmPerformanceData() {
    return ethOnDemand1DmPerformanceData;
  }

  public void setEthOnDemand1DmPerformanceData(TapiEthEthOnDemand1DmPerformanceData ethOnDemand1DmPerformanceData) {
    this.ethOnDemand1DmPerformanceData = ethOnDemand1DmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethProActive1DmPerformanceData
   **/
  @JsonProperty("eth-pro-active-1-dm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthProActive1DmPerformanceData getEthProActive1DmPerformanceData() {
    return ethProActive1DmPerformanceData;
  }

  public void setEthProActive1DmPerformanceData(TapiEthEthProActive1DmPerformanceData ethProActive1DmPerformanceData) {
    this.ethProActive1DmPerformanceData = ethProActive1DmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethProActiveLmPerformanceData
   **/
  @JsonProperty("eth-pro-active-lm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthProActiveLmPerformanceData getEthProActiveLmPerformanceData() {
    return ethProActiveLmPerformanceData;
  }

  public void setEthProActiveLmPerformanceData(TapiEthEthProActiveLmPerformanceData ethProActiveLmPerformanceData) {
    this.ethProActiveLmPerformanceData = ethProActiveLmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData ethOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethOnDemandDmPerformanceData
   **/
  @JsonProperty("eth-on-demand-dm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemandDmPerformanceData getEthOnDemandDmPerformanceData() {
    return ethOnDemandDmPerformanceData;
  }

  public void setEthOnDemandDmPerformanceData(TapiEthEthOnDemandDmPerformanceData ethOnDemandDmPerformanceData) {
    this.ethOnDemandDmPerformanceData = ethOnDemandDmPerformanceData;
  }

  public TapiOamPmcurrentdataPmHistoryData name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamPmcurrentdataPmHistoryData addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiOamPmcurrentdataPmHistoryData localId(String localId) {
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

  public TapiOamPmcurrentdataPmHistoryData granularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
    return this;
  }

  /**
   * none
   * @return granularityPeriod
   **/
  @JsonProperty("granularity-period")
  @ApiModelProperty(value = "none")
  public TapiCommonTimePeriod getGranularityPeriod() {
    return granularityPeriod;
  }

  public void setGranularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
  }

  public TapiOamPmcurrentdataPmHistoryData periodEndTime(String periodEndTime) {
    this.periodEndTime = periodEndTime;
    return this;
  }

  /**
   * none
   * @return periodEndTime
   **/
  @JsonProperty("period-end-time")
  @ApiModelProperty(value = "none")
  public String getPeriodEndTime() {
    return periodEndTime;
  }

  public void setPeriodEndTime(String periodEndTime) {
    this.periodEndTime = periodEndTime;
  }

  public TapiOamPmcurrentdataPmHistoryData suspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
    return this;
  }

  /**
   * This attribute indicates that the performance data may not be reliable.
   * @return suspectIntervalFlag
   **/
  @JsonProperty("suspect-interval-flag")
  @ApiModelProperty(value = "This attribute indicates that the performance data may not be reliable.")
  public Boolean isSuspectIntervalFlag() {
    return suspectIntervalFlag;
  }

  public void setSuspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmcurrentdataPmHistoryData tapiOamPmcurrentdataPmHistoryData = (TapiOamPmcurrentdataPmHistoryData) o;
    return Objects.equals(this.ethOnDemandLmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethOnDemandLmPerformanceData) &&
        Objects.equals(this.ethOnDemand1LmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethOnDemand1LmPerformanceData) &&
        Objects.equals(this.ethProActiveDmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethProActiveDmPerformanceData) &&
        Objects.equals(this.ethProActive1LmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethProActive1LmPerformanceData) &&
        Objects.equals(this.ethOnDemand1DmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethOnDemand1DmPerformanceData) &&
        Objects.equals(this.ethProActive1DmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethProActive1DmPerformanceData) &&
        Objects.equals(this.ethProActiveLmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethProActiveLmPerformanceData) &&
        Objects.equals(this.ethOnDemandDmPerformanceData, tapiOamPmcurrentdataPmHistoryData.ethOnDemandDmPerformanceData) &&
        Objects.equals(this.name, tapiOamPmcurrentdataPmHistoryData.name) &&
        Objects.equals(this.localId, tapiOamPmcurrentdataPmHistoryData.localId) &&
        Objects.equals(this.granularityPeriod, tapiOamPmcurrentdataPmHistoryData.granularityPeriod) &&
        Objects.equals(this.periodEndTime, tapiOamPmcurrentdataPmHistoryData.periodEndTime) &&
        Objects.equals(this.suspectIntervalFlag, tapiOamPmcurrentdataPmHistoryData.suspectIntervalFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemandLmPerformanceData, ethOnDemand1LmPerformanceData, ethProActiveDmPerformanceData, ethProActive1LmPerformanceData, ethOnDemand1DmPerformanceData, ethProActive1DmPerformanceData, ethProActiveLmPerformanceData, ethOnDemandDmPerformanceData, name, localId, granularityPeriod, periodEndTime, suspectIntervalFlag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmcurrentdataPmHistoryData {\n");
    
    sb.append("    ethOnDemandLmPerformanceData: ").append(toIndentedString(ethOnDemandLmPerformanceData)).append("\n");
    sb.append("    ethOnDemand1LmPerformanceData: ").append(toIndentedString(ethOnDemand1LmPerformanceData)).append("\n");
    sb.append("    ethProActiveDmPerformanceData: ").append(toIndentedString(ethProActiveDmPerformanceData)).append("\n");
    sb.append("    ethProActive1LmPerformanceData: ").append(toIndentedString(ethProActive1LmPerformanceData)).append("\n");
    sb.append("    ethOnDemand1DmPerformanceData: ").append(toIndentedString(ethOnDemand1DmPerformanceData)).append("\n");
    sb.append("    ethProActive1DmPerformanceData: ").append(toIndentedString(ethProActive1DmPerformanceData)).append("\n");
    sb.append("    ethProActiveLmPerformanceData: ").append(toIndentedString(ethProActiveLmPerformanceData)).append("\n");
    sb.append("    ethOnDemandDmPerformanceData: ").append(toIndentedString(ethOnDemandDmPerformanceData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
    sb.append("    periodEndTime: ").append(toIndentedString(periodEndTime)).append("\n");
    sb.append("    suspectIntervalFlag: ").append(toIndentedString(suspectIntervalFlag)).append("\n");
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
