package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.BookingDto;


public class BookingDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(BookingDto dto){
	entityTransaction.begin();
	entityManager.persist(dto);
	entityTransaction.commit();
}
public void fetchall() {
	Query q = entityManager.createQuery("select a from BookingDto a");
	List<BookingDto> d = q.getResultList();
	for (BookingDto s : d)
		System.out.println(s);
}

}
