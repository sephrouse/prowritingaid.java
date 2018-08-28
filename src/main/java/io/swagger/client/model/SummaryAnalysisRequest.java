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
import io.swagger.client.model.AnalysisSettings;
import java.io.IOException;

/**
 * SummaryAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-28T18:23:44.793+01:00")
public class SummaryAnalysisRequest {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("Settings")
  private AnalysisSettings settings = null;

  /**
   * Document&#39;s writing style
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    NOTSET("NotSet"),
    
    GENERAL("General"),
    
    ACADEMIC("Academic"),
    
    BUSINESS("Business"),
    
    TECHNICAL("Technical"),
    
    CREATIVE("Creative"),
    
    CASUAL("Casual"),
    
    WEB("Web");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Style")
  private StyleEnum style = StyleEnum.GENERAL;

  /**
   * Document&#39;s language. Set correct UK/US language to get region-specific suggestions
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN_US("en_US"),
    
    EN_UK("en_UK"),
    
    EN("en"),
    
    ES("es");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Language")
  private LanguageEnum language = LanguageEnum.EN;

  public SummaryAnalysisRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text to be analyzed
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Text to be analyzed")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SummaryAnalysisRequest settings(AnalysisSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Analysis settings
   * @return settings
  **/
  @ApiModelProperty(required = true, value = "Analysis settings")
  public AnalysisSettings getSettings() {
    return settings;
  }

  public void setSettings(AnalysisSettings settings) {
    this.settings = settings;
  }

  public SummaryAnalysisRequest style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Document&#39;s writing style
   * @return style
  **/
  @ApiModelProperty(required = true, value = "Document's writing style")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public SummaryAnalysisRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Document&#39;s language. Set correct UK/US language to get region-specific suggestions
   * @return language
  **/
  @ApiModelProperty(required = true, value = "Document's language. Set correct UK/US language to get region-specific suggestions")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryAnalysisRequest summaryAnalysisRequest = (SummaryAnalysisRequest) o;
    return Objects.equals(this.text, summaryAnalysisRequest.text) &&
        Objects.equals(this.settings, summaryAnalysisRequest.settings) &&
        Objects.equals(this.style, summaryAnalysisRequest.style) &&
        Objects.equals(this.language, summaryAnalysisRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, settings, style, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryAnalysisRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

