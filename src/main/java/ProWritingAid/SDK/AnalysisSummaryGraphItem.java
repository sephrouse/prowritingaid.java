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


package ProWritingAid.SDK;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AnalysisSummaryGraphItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T12:42:14.072+01:00")
public class AnalysisSummaryGraphItem {
  @SerializedName("Label")
  private String label = null;

  @SerializedName("Color")
  private String color = null;

  @SerializedName("Length")
  private Integer length = null;

  @SerializedName("SubCategory")
  private String subCategory = null;

  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Id")
  private String id = null;

  public AnalysisSummaryGraphItem label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AnalysisSummaryGraphItem color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public AnalysisSummaryGraphItem length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public AnalysisSummaryGraphItem subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @ApiModelProperty(value = "")
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }

  public AnalysisSummaryGraphItem index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public AnalysisSummaryGraphItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisSummaryGraphItem analysisSummaryGraphItem = (AnalysisSummaryGraphItem) o;
    return Objects.equals(this.label, analysisSummaryGraphItem.label) &&
        Objects.equals(this.color, analysisSummaryGraphItem.color) &&
        Objects.equals(this.length, analysisSummaryGraphItem.length) &&
        Objects.equals(this.subCategory, analysisSummaryGraphItem.subCategory) &&
        Objects.equals(this.index, analysisSummaryGraphItem.index) &&
        Objects.equals(this.id, analysisSummaryGraphItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, color, length, subCategory, index, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisSummaryGraphItem {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

