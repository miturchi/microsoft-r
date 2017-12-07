/*
 * WeatherService
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
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
import io.swagger.client.model.OutputParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebServiceResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-01T18:07:18.003Z")
public class WebServiceResult {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("consoleOutput")
  private String consoleOutput = null;

  @SerializedName("changedFiles")
  private List<String> changedFiles = null;

  @SerializedName("outputParameters")
  private OutputParameters outputParameters = null;

  public WebServiceResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Boolean flag indicating the success status of web service execution.
   * @return success
  **/
  @ApiModelProperty(value = "Boolean flag indicating the success status of web service execution.")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public WebServiceResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error messages if any occurred during the web service execution.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error messages if any occurred during the web service execution.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public WebServiceResult consoleOutput(String consoleOutput) {
    this.consoleOutput = consoleOutput;
    return this;
  }

   /**
   * Console output from the web service execution.
   * @return consoleOutput
  **/
  @ApiModelProperty(value = "Console output from the web service execution.")
  public String getConsoleOutput() {
    return consoleOutput;
  }

  public void setConsoleOutput(String consoleOutput) {
    this.consoleOutput = consoleOutput;
  }

  public WebServiceResult changedFiles(List<String> changedFiles) {
    this.changedFiles = changedFiles;
    return this;
  }

  public WebServiceResult addChangedFilesItem(String changedFilesItem) {
    if (this.changedFiles == null) {
      this.changedFiles = new ArrayList<String>();
    }
    this.changedFiles.add(changedFilesItem);
    return this;
  }

   /**
   * The filenames of the files modified during the web service execution.
   * @return changedFiles
  **/
  @ApiModelProperty(value = "The filenames of the files modified during the web service execution.")
  public List<String> getChangedFiles() {
    return changedFiles;
  }

  public void setChangedFiles(List<String> changedFiles) {
    this.changedFiles = changedFiles;
  }

  public WebServiceResult outputParameters(OutputParameters outputParameters) {
    this.outputParameters = outputParameters;
    return this;
  }

   /**
   * Get outputParameters
   * @return outputParameters
  **/
  @ApiModelProperty(value = "")
  public OutputParameters getOutputParameters() {
    return outputParameters;
  }

  public void setOutputParameters(OutputParameters outputParameters) {
    this.outputParameters = outputParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebServiceResult webServiceResult = (WebServiceResult) o;
    return Objects.equals(this.success, webServiceResult.success) &&
        Objects.equals(this.errorMessage, webServiceResult.errorMessage) &&
        Objects.equals(this.consoleOutput, webServiceResult.consoleOutput) &&
        Objects.equals(this.changedFiles, webServiceResult.changedFiles) &&
        Objects.equals(this.outputParameters, webServiceResult.outputParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorMessage, consoleOutput, changedFiles, outputParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebServiceResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    consoleOutput: ").append(toIndentedString(consoleOutput)).append("\n");
    sb.append("    changedFiles: ").append(toIndentedString(changedFiles)).append("\n");
    sb.append("    outputParameters: ").append(toIndentedString(outputParameters)).append("\n");
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

