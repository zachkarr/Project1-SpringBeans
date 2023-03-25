package config;

import disburse.dao.JdbcHouseDisburseDetailDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
@ComponentScan("disburse")
public class HouseDisburseConfig
{

    @Primary
    @Bean(name = "ds")
    public DataSource ds(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:2013Q4_HOUSE_DISBURSE.sql").build();
    }

    @Bean
    public DataSource dataSource2(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:potentialLeads.sql").build();
    }
    @Bean
    public JdbcHouseDisburseDetailDAO housedisburseDAO(DataSource ds) {
        JdbcHouseDisburseDetailDAO hdDAO = new JdbcHouseDisburseDetailDAO();
        hdDAO.setDataSource(ds);
        return hdDAO;
    }
}

