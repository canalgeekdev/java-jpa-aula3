package com.canalgeekdev.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.canalgeekdev.cliente.model.Cliente;

public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
	
		entityManager.getTransaction().begin();
		
//		int idCliente = 8;
//		
//		entityManager.createQuery("delete from Cliente c where id = :idCliente")
//			.setParameter("idCliente", idCliente)
//			.executeUpdate();
		
		int idCliente = 1;
		
		entityManager.createQuery("update Cliente c set nome = 'FACEBOOK APP' where c.id = :idCliente")
			.setParameter("idCliente", idCliente)
			.executeUpdate();
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
	
}
