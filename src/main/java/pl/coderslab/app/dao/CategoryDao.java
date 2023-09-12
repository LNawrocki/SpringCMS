package pl.coderslab.app.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDao {

    @PersistenceContext
    EntityManager em;

    public void save(Category entity) {
        em.persist(entity);
    }

    public void update(Category entity) {
        em.merge(entity);
    }

    public void delete(Category entity) {
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }
}
