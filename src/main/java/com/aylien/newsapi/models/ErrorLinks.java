/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
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

/**
 * ErrorLinks
 */

public class ErrorLinks {
    @JsonProperty("about")
    private String about = null;

    public ErrorLinks about(String about) {
        this.about = about;
        return this;
    }

    /**
     * Get about
     *
     * @return about
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorLinks errorLinks = (ErrorLinks) o;
        return Objects.equals(this.about, errorLinks.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(about);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorLinks {\n");

        sb.append("    about: ").append(toIndentedString(about)).append("\n");
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

