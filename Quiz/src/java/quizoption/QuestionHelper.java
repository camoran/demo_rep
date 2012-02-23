/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizoption;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Raymond
 */
public class QuestionHelper {
    Session session = null;
    
    public QuestionHelper() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void getQuestion(int quest_id) {
        Query query = session.createQuery("from Question q where q.QId=" + quest_id);
        query.getNamedParameters();
        query.getQueryString();
    }
    
    
    
}
