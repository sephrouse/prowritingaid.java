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
import java.util.ArrayList;
import java.util.List;

/**
 * DocTag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T12:42:14.072+01:00")
public class DocTag {
  @SerializedName("startPos")
  private Integer startPos = null;

  @SerializedName("endPos")
  private Integer endPos = null;

  @SerializedName("report")
  private String report = null;

  @SerializedName("urls")
  private List<String> urls = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("categoryDisplayName")
  private String categoryDisplayName = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("hint")
  private String hint = null;

  @SerializedName("suggestions")
  private List<String> suggestions = null;

  @SerializedName("isSubTag")
  private Boolean isSubTag = null;

  @SerializedName("helpId")
  private String helpId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("invisible")
  private Boolean invisible = null;

  public DocTag startPos(Integer startPos) {
    this.startPos = startPos;
    return this;
  }

   /**
   * The start position of the suggestion. 0 based
   * @return startPos
  **/
  @ApiModelProperty(required = true, value = "The start position of the suggestion. 0 based")
  public Integer getStartPos() {
    return startPos;
  }

  public void setStartPos(Integer startPos) {
    this.startPos = startPos;
  }

  public DocTag endPos(Integer endPos) {
    this.endPos = endPos;
    return this;
  }

   /**
   * The end position of the suggestion. 0 based
   * @return endPos
  **/
  @ApiModelProperty(required = true, value = "The end position of the suggestion. 0 based")
  public Integer getEndPos() {
    return endPos;
  }

  public void setEndPos(Integer endPos) {
    this.endPos = endPos;
  }

  public DocTag report(String report) {
    this.report = report;
    return this;
  }

   /**
   * Report Id
   * @return report
  **/
  @ApiModelProperty(value = "Report Id")
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }

  public DocTag urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public DocTag addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of source documents found by plagiarism checker
   * @return urls
  **/
  @ApiModelProperty(value = "List of source documents found by plagiarism checker")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public DocTag category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Suggestion&#39;s category
   * @return category
  **/
  @ApiModelProperty(value = "Suggestion's category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DocTag categoryDisplayName(String categoryDisplayName) {
    this.categoryDisplayName = categoryDisplayName;
    return this;
  }

   /**
   * Suggetsion&#39;s category display name
   * @return categoryDisplayName
  **/
  @ApiModelProperty(value = "Suggetsion's category display name")
  public String getCategoryDisplayName() {
    return categoryDisplayName;
  }

  public void setCategoryDisplayName(String categoryDisplayName) {
    this.categoryDisplayName = categoryDisplayName;
  }

  public DocTag subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Suggestion&#39;s subcategory
   * @return subcategory
  **/
  @ApiModelProperty(value = "Suggestion's subcategory")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public DocTag hint(String hint) {
    this.hint = hint;
    return this;
  }

   /**
   * Short suggestion&#39;s description
   * @return hint
  **/
  @ApiModelProperty(value = "Short suggestion's description")
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

  public DocTag suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public DocTag addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<String>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * List of possible replacements
   * @return suggestions
  **/
  @ApiModelProperty(value = "List of possible replacements")
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }

  public DocTag isSubTag(Boolean isSubTag) {
    this.isSubTag = isSubTag;
    return this;
  }

   /**
   * Identifies that this suggestion is a part of larger one
   * @return isSubTag
  **/
  @ApiModelProperty(required = true, value = "Identifies that this suggestion is a part of larger one")
  public Boolean getIsSubTag() {
    return isSubTag;
  }

  public void setIsSubTag(Boolean isSubTag) {
    this.isSubTag = isSubTag;
  }

  public DocTag helpId(String helpId) {
    this.helpId = helpId;
    return this;
  }

   /**
   * TODO DOCS
   * @return helpId
  **/
  @ApiModelProperty(value = "TODO DOCS")
  public String getHelpId() {
    return helpId;
  }

  public void setHelpId(String helpId) {
    this.helpId = helpId;
  }

  public DocTag id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Suggestion&#39;s Id
   * @return id
  **/
  @ApiModelProperty(value = "Suggestion's Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocTag invisible(Boolean invisible) {
    this.invisible = invisible;
    return this;
  }

   /**
   * Is tag invisible?
   * @return invisible
  **/
  @ApiModelProperty(value = "Is tag invisible?")
  public Boolean getInvisible() {
    return invisible;
  }

  public void setInvisible(Boolean invisible) {
    this.invisible = invisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocTag docTag = (DocTag) o;
    return Objects.equals(this.startPos, docTag.startPos) &&
        Objects.equals(this.endPos, docTag.endPos) &&
        Objects.equals(this.report, docTag.report) &&
        Objects.equals(this.urls, docTag.urls) &&
        Objects.equals(this.category, docTag.category) &&
        Objects.equals(this.categoryDisplayName, docTag.categoryDisplayName) &&
        Objects.equals(this.subcategory, docTag.subcategory) &&
        Objects.equals(this.hint, docTag.hint) &&
        Objects.equals(this.suggestions, docTag.suggestions) &&
        Objects.equals(this.isSubTag, docTag.isSubTag) &&
        Objects.equals(this.helpId, docTag.helpId) &&
        Objects.equals(this.id, docTag.id) &&
        Objects.equals(this.invisible, docTag.invisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPos, endPos, report, urls, category, categoryDisplayName, subcategory, hint, suggestions, isSubTag, helpId, id, invisible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocTag {\n");
    
    sb.append("    startPos: ").append(toIndentedString(startPos)).append("\n");
    sb.append("    endPos: ").append(toIndentedString(endPos)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryDisplayName: ").append(toIndentedString(categoryDisplayName)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    isSubTag: ").append(toIndentedString(isSubTag)).append("\n");
    sb.append("    helpId: ").append(toIndentedString(helpId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invisible: ").append(toIndentedString(invisible)).append("\n");
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
