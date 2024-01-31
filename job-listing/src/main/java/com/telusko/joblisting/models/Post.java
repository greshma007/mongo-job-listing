package com.telusko.joblisting.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost") // Mongodb collection name - JobPost
public class Post {

    // vars need to match with collection
    private String profile;
    private String desc;
    private int exp;
    private String techs[];


    public Post(){

    }

    public Post(String profile, String desc, int exp, String[] techs) {
        this.profile = profile;
        this.desc = desc;
        this.exp = exp;
        this.techs = techs;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }


    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
