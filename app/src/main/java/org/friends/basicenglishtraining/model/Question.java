package org.friends.basicenglishtraining.model;

/**
 * Created by Mohammad on 7/1/2016.
 */
public abstract class  Question {
      private String idQuestion;
      private String idLesson;
      private String answer;

      public String getIdQuestion() {
            return idQuestion;
      }

      public void setIdQuestion(String idQuestion) {
            this.idQuestion = idQuestion;
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
