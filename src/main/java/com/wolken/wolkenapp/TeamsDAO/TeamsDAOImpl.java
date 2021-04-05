package com.wolken.wolkenapp.TeamsDAO;

import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.wolken.wolkenapp.Exception.IplException;
import com.wolken.wolkenapp.dto.TeamsDTO;

@Component
public class TeamsDAOImpl implements TeamsDAO {
	Logger logger = Logger.getLogger("TeamsController");

	@Autowired
	LocalSessionFactoryBean bean;

	public String save(TeamsDTO teamsdto) {
		// TODO Auto-generated method stub
		logger.info("inside savedao");

		SessionFactory factoty = bean.getObject();
		/*
		 * Configuration config=bean.getConfiguration(); config.configure();
		 * SessionFactory factory=config.buildSessionFactory();
		 */
		Session session = factoty.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(teamsdto);
		transaction.commit();
		session.close();

		return "data added";
	}

	public String deleteTeam(String team) {
		try {
			logger.info("inside deleteTeam");
			System.out.println("inside delete" + team);
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			Query query = session.getNamedQuery("delete");

			query.setParameter("team", team);
			query.executeUpdate();

			transaction.commit();
			session.close();
			return "data deleted";

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "failed";

	}

	public String updateCaptainByTeam(String teamName, String captain) throws IplException {
		logger.info("inside update");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session
				.createQuery("update TeamsDTO td set td.teamCaptain=:teamCaptain where td.teamName=:teamName");

		query.setParameter("teamCaptain", captain);
		query.setParameter("teamName", teamName);

		query.executeUpdate();
		transaction.commit();
		session.close();

		return "data updated";
		
	}

	@Override
	public List<TeamsDTO> getAllTeams() {
		logger.info("inside getall");
		// TODO Auto-generated method stub
		System.out.println("inside dao");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.getNamedQuery("selectAll");

		List<TeamsDTO> dto1 = query.list();
		return dto1;
	}

}
