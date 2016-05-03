/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aylien.newsapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


public class Error {

    private String id = null;
    private ErrorLinks links = null;
    private String status = null;
    private String code = null;
    private String title = null;
    private String detail = null;


    /**
     **/
    public Error id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     **/
    public Error links(ErrorLinks links) {
        this.links = links;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("links")
    public ErrorLinks getLinks() {
        return links;
    }

    public void setLinks(ErrorLinks links) {
        this.links = links;
    }


    /**
     **/
    public Error status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     **/
    public Error code(String code) {
        this.code = code;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     **/
    public Error title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     **/
    public Error detail(String detail) {
        this.detail = detail;
        return this;
    }

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.id, error.id) &&
                Objects.equals(this.links, error.links) &&
                Objects.equals(this.status, error.status) &&
                Objects.equals(this.code, error.code) &&
                Objects.equals(this.title, error.title) &&
                Objects.equals(this.detail, error.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, status, code, title, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

