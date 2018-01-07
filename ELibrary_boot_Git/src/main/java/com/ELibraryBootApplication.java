package com;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;

import entity.AdminBean;
import entity.BookBean;
import entity.IssueBookBean;
import entity.LibrarianBean;
import entity.OrderBookBean;

@SpringBootApplication
@ComponentScan(basePackages = { "controller", "dao", "entity", "service" })
public class ELibraryBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELibraryBootApplication.class, args);
	}

	@Bean
	public static DataSource dataSource() {
		DataSource ds = new DriverManagerDataSource();
		((DriverManagerDataSource) ds).setDriverClassName("oracle.jdbc.driver.OracleDriver");
		((AbstractDriverBasedDataSource) ds).setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		((AbstractDriverBasedDataSource) ds).setUsername("scott");
		((AbstractDriverBasedDataSource) ds).setPassword("tiger");
		return ds;
	}

	@Bean
	public static SessionFactory createSessionFactory() {
		return (SessionFactory) new LocalSessionFactoryBuilder(dataSource()).addAnnotatedClasses(AdminBean.class,OrderBookBean.class,LibrarianBean.class,BookBean.class,IssueBookBean.class)
				.buildSessionFactory();
	}
	
   	 @Bean
	  public JpaTransactionManager transactionManager() {
	      JpaTransactionManager txManager = new JpaTransactionManager();
          txManager.setDataSource(dataSource());
	      return txManager;
	  }


	@Bean
	public static HibernateTemplate createTemplate() {
		return new HibernateTemplate(createSessionFactory());
	}

}
