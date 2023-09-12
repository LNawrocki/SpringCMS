package pl.coderslab.app.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ArticleDao {
    @PersistenceContext
    EntityManager em;

    public void save(Article entity) {
        em.persist(entity);
    }

    public void update(Article entity) {
        em.merge(entity);
    }

    public void delete(Article entity) {
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }
}
