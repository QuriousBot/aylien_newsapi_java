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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class ShareCounts {

    private List<ShareCount> facebook = new ArrayList<ShareCount>();
    private List<ShareCount> googlePlus = new ArrayList<ShareCount>();
    private List<ShareCount> linkedin = new ArrayList<ShareCount>();
    private List<ShareCount> reddit = new ArrayList<ShareCount>();


    /**
     * Facebook shares count
     **/
    public ShareCounts facebook(List<ShareCount> facebook) {
        this.facebook = facebook;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Facebook shares count")
    @JsonProperty("facebook")
    public List<ShareCount> getFacebook() {
        return facebook;
    }

    public void setFacebook(List<ShareCount> facebook) {
        this.facebook = facebook;
    }


    /**
     * Google Plus shares count
     **/
    public ShareCounts googlePlus(List<ShareCount> googlePlus) {
        this.googlePlus = googlePlus;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Google Plus shares count")
    @JsonProperty("google_plus")
    public List<ShareCount> getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(List<ShareCount> googlePlus) {
        this.googlePlus = googlePlus;
    }


    /**
     * LinkedIn shares count
     **/
    public ShareCounts linkedin(List<ShareCount> linkedin) {
        this.linkedin = linkedin;
        return this;
    }

    @ApiModelProperty(example = "null", value = "LinkedIn shares count")
    @JsonProperty("linkedin")
    public List<ShareCount> getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(List<ShareCount> linkedin) {
        this.linkedin = linkedin;
    }


    /**
     * Reddit shares count
     **/
    public ShareCounts reddit(List<ShareCount> reddit) {
        this.reddit = reddit;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Reddit shares count")
    @JsonProperty("reddit")
    public List<ShareCount> getReddit() {
        return reddit;
    }

    public void setReddit(List<ShareCount> reddit) {
        this.reddit = reddit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShareCounts shareCounts = (ShareCounts) o;
        return Objects.equals(this.facebook, shareCounts.facebook) &&
                Objects.equals(this.googlePlus, shareCounts.googlePlus) &&
                Objects.equals(this.linkedin, shareCounts.linkedin) &&
                Objects.equals(this.reddit, shareCounts.reddit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facebook, googlePlus, linkedin, reddit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareCounts {\n");

        sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
        sb.append("    googlePlus: ").append(toIndentedString(googlePlus)).append("\n");
        sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
        sb.append("    reddit: ").append(toIndentedString(reddit)).append("\n");
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

