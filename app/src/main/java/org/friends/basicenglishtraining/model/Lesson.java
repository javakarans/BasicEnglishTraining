package org.friends.basicenglishtraining.model;

import java.util.List;

/**
 * Created by Mohammad on 7/1/2016.
 */
public class Lesson {
    private String lessonId;
    private String idSection;
    private String name;
    private List<Word> wordList;

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getIdSection() {
        return idSection;
    }

    public void setIdSection(String idSection) {
        this.idSection = idSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }


}
