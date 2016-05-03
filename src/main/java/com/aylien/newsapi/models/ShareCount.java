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
import org.joda.time.DateTime;

import java.util.Objects;


public class ShareCount {

    private Integer count = null;
    private DateTime fetchedAt = null;


    /**
     * The number of shares
     **/
    public ShareCount count(Integer count) {
        this.count = count;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The number of shares")
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * The fetched date of the shares
     **/
    public ShareCount fetchedAt(DateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The fetched date of the shares")
    @JsonProperty("fetched_at")
    public DateTime getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(DateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShareCount shareCount = (ShareCount) o;
        return Objects.equals(this.count, shareCount.count) &&
                Objects.equals(this.fetchedAt, shareCount.fetchedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, fetchedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareCount {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    fetchedAt: ").append(toIndentedString(fetchedAt)).append("\n");
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

