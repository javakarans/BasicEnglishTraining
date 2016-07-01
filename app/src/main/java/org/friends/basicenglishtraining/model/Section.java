package org.friends.basicenglishtraining.model;

import java.util.List;

/**
 * Created by Mohammad on 7/1/2016.
 */
public class Section {
    private String idSec;
    private String name;
    private List<Lesson> lessonList;

    public String getIdSec() {
        return idSec;
    }

    public void setIdSec(String idSec) {
        this.idSec = idSec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}
