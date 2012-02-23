package quizoption;
// Generated 23 ��� 2012 11:10:51 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name="question"
    ,catalog="exam_quest"
)
public class Question implements java.io.Serializable {


     private Integer QId;
     private String QText;
     private String QAnswer;
     private String QFakeAnsw1;
     private String QFakeAnsw2;
     private String QFakeAnsw3;
     private String QFakeAnsw4;

    public Question() {
    }

	
    public Question(String QText, String QAnswer, String QFakeAnsw1) {
        this.QText = QText;
        this.QAnswer = QAnswer;
        this.QFakeAnsw1 = QFakeAnsw1;
    }
    public Question(String QText, String QAnswer, String QFakeAnsw1, String QFakeAnsw2, String QFakeAnsw3, String QFakeAnsw4) {
       this.QText = QText;
       this.QAnswer = QAnswer;
       this.QFakeAnsw1 = QFakeAnsw1;
       this.QFakeAnsw2 = QFakeAnsw2;
       this.QFakeAnsw3 = QFakeAnsw3;
       this.QFakeAnsw4 = QFakeAnsw4;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="q_id", unique=true, nullable=false)
    public Integer getQId() {
        return this.QId;
    }
    
    public void setQId(Integer QId) {
        this.QId = QId;
    }
    
    @Column(name="q_text", nullable=false, length=65535)
    public String getQText() {
        return this.QText;
    }
    
    public void setQText(String QText) {
        this.QText = QText;
    }
    
    @Column(name="q_answer", nullable=false, length=65535)
    public String getQAnswer() {
        return this.QAnswer;
    }
    
    public void setQAnswer(String QAnswer) {
        this.QAnswer = QAnswer;
    }
    
    @Column(name="q_fake_answ_1", nullable=false, length=65535)
    public String getQFakeAnsw1() {
        return this.QFakeAnsw1;
    }
    
    public void setQFakeAnsw1(String QFakeAnsw1) {
        this.QFakeAnsw1 = QFakeAnsw1;
    }
    
    @Column(name="q_fake_answ_2", length=65535)
    public String getQFakeAnsw2() {
        return this.QFakeAnsw2;
    }
    
    public void setQFakeAnsw2(String QFakeAnsw2) {
        this.QFakeAnsw2 = QFakeAnsw2;
    }
    
    @Column(name="q_fake_answ_3", length=65535)
    public String getQFakeAnsw3() {
        return this.QFakeAnsw3;
    }
    
    public void setQFakeAnsw3(String QFakeAnsw3) {
        this.QFakeAnsw3 = QFakeAnsw3;
    }
    
    @Column(name="q_fake_answ_4", length=65535)
    public String getQFakeAnsw4() {
        return this.QFakeAnsw4;
    }
    
    public void setQFakeAnsw4(String QFakeAnsw4) {
        this.QFakeAnsw4 = QFakeAnsw4;
    }




}

