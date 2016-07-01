package org.friends.basicenglishtraining.model;

/**
 * Created by Mohammad on 7/1/2016.
 */
public abstract class  Question {
      private String type;
      private String idLesson;
      String idSection;
      private String answer;


      public String getIdQuestion() {
            return type;
      }

      public void setIdQuestion(String idQuestion) {
            this.type = idQuestion;
      }

      public String getIdLesson() {
            return idLesson;
      }

      public void setIdLesson(String idLesson) {
            this.idLesson = idLesson;
      }

      public String getAnswer() {
            return answer;
      }


}
