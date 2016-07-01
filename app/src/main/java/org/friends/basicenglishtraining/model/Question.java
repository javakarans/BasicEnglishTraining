package org.friends.basicenglishtraining.model;

/**
 * Created by Mohammad on 7/1/2016.
 */
public abstract class  Question {
      private String type;
      private String idLesson;
      private String idSection;
      private String answer;


      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }

      public String getIdLesson() {
            return idLesson;
      }

      public void setIdLesson(String idLesson) {
            this.idLesson = idLesson;
      }

      public String getIdSection() {
            return idSection;
      }

      public void setIdSection(String idSection) {
            this.idSection = idSection;
      }

      public String getAnswer() {
            return answer;
      }

      public void setAnswer(String answer) {
            this.answer = answer;
      }
}
