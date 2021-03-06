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
 * HistogramInterval
 */

public class HistogramInterval {
    @JsonProperty("bin")
    private Integer bin = null;

    @JsonProperty("count")
    private Integer count = null;

    public HistogramInterval bin(Integer bin) {
        this.bin = bin;
        return this;
    }

    /**
     * Histogram bin
     *
     * @return bin
     **/
    @ApiModelProperty(example = "null", value = "Histogram bin")
    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public HistogramInterval count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Histogram bin size
     *
     * @return count
     **/
    @ApiModelProperty(example = "null", value = "Histogram bin size")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistogramInterval histogramInterval = (HistogramInterval) o;
        return Objects.equals(this.bin, histogramInterval.bin) &&
                Objects.equals(this.count, histogramInterval.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bin, count);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistogramInterval {\n");

        sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

