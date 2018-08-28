/*
 * ProWritingAid API V2
 * Official ProWritingAid API Version 2
 *
 * OpenAPI spec version: v2
 * Contact: hello@prowritingaid.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalysisSummaryItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents report summary
 */
@ApiModel(description = "Represents report summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-28T18:23:44.793+01:00")
public class AnalysisSummary {
  @SerializedName("ReportDisplayName")
  private String reportDisplayName = null;

  @SerializedName("ReportName")
  private String reportName = null;

  @SerializedName("SummaryItems")
  private List<AnalysisSummaryItem> summaryItems = null;

  @SerializedName("NumberOfIssues")
  private Integer numberOfIssues = null;

  @SerializedName("ReportDescription")
  private String reportDescription = null;

   /**
   * Report&#39;s display name
   * @return reportDisplayName
  **/
  @ApiModelProperty(value = "Report's display name")
  public String getReportDisplayName() {
    return reportDisplayName;
  }

   /**
   * Report&#39;s ID
   * @return reportName
  **/
  @ApiModelProperty(value = "Report's ID")
  public String getReportName() {
    return reportName;
  }

  public AnalysisSummary summaryItems(List<AnalysisSummaryItem> summaryItems) {
    this.summaryItems = summaryItems;
    return this;
  }

  public AnalysisSummary addSummaryItemsItem(AnalysisSummaryItem summaryItemsItem) {
    if (this.summaryItems == null) {
      this.summaryItems = new ArrayList<AnalysisSummaryItem>();
    }
    this.summaryItems.add(summaryItemsItem);
    return this;
  }

   /**
   * Found issues
   * @return summaryItems
  **/
  @ApiModelProperty(value = "Found issues")
  public List<AnalysisSummaryItem> getSummaryItems() {
    return summaryItems;
  }

  public void setSummaryItems(List<AnalysisSummaryItem> summaryItems) {
    this.summaryItems = summaryItems;
  }

   /**
   * Number of found issues
   * @return numberOfIssues
  **/
  @ApiModelProperty(value = "Number of found issues")
  public Integer getNumberOfIssues() {
    return numberOfIssues;
  }

  public AnalysisSummary reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * Short report description
   * @return reportDescription
  **/
  @ApiModelProperty(value = "Short report description")
  public String getReportDescription() {
    return reportDescription;
  }

  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisSummary analysisSummary = (AnalysisSummary) o;
    return Objects.equals(this.reportDisplayName, analysisSummary.reportDisplayName) &&
        Objects.equals(this.reportName, analysisSummary.reportName) &&
        Objects.equals(this.summaryItems, analysisSummary.summaryItems) &&
        Objects.equals(this.numberOfIssues, analysisSummary.numberOfIssues) &&
        Objects.equals(this.reportDescription, analysisSummary.reportDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDisplayName, reportName, summaryItems, numberOfIssues, reportDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisSummary {\n");
    
    sb.append("    reportDisplayName: ").append(toIndentedString(reportDisplayName)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    summaryItems: ").append(toIndentedString(summaryItems)).append("\n");
    sb.append("    numberOfIssues: ").append(toIndentedString(numberOfIssues)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
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

