package com.ilearn.chk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ilearn.chk"})
public class AppConfig {

//    @Bean(name = "dataSource")
//    public DataSource getDataSource() {
//        BasicDataSource bds = new BasicDataSource();
//        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        bds.setUrl("jdbc:mysql://localhost:3306/ilearn?characterEncoding=UTF-8");
//        bds.setUsername("root");
//        bds.setPassword("password");
//        bds.setMaxActive(5);
//        return bds;
//    }
//
//    @Bean(name = "jtemp")
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
//        JdbcTemplate jtemp = new JdbcTemplate(dataSource);
//        return jtemp;
//    }
}
