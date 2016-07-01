package org.friends.basicenglishtraining.model;

/**
 * Created by Mohammad on 7/1/2016.
 */
public class Word {
    private String idW;
    private String idLesson;
    private String name;
    private String meaning;
    private String synonim;
    private String example;

    public String getIdW() {
        return idW;
    }

    public void setIdW(String idW) {
        this.idW = idW;
    }

    public String getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(String idLesson) {
        this.idLesson = idLesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getSynonim() {
        return synonim;
    }

    public void setSynonim(String synonim) {
        this.synonim = synonim;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
