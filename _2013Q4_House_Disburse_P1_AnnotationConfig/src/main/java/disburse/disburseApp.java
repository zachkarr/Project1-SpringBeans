package disburse;

import config.HouseDisburseConfig;
import disburse.dao.JdbcHouseDisburseDetailDAO;
import disburse.vo.HouseDisburseDetail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class disburseApp
{
    public static void main(String[] args) {
        SpringApplication.run(disburseApp.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(HouseDisburseConfig.class);

        ctx.refresh();
        JdbcHouseDisburseDetailDAO hdDAO = (JdbcHouseDisburseDetailDAO)ctx.getBean("housedisburseDAO");

        List<HouseDisburseDetail> hddList = hdDAO.selectQuery("Select BIOGUIDE_ID, OFFICE, PURPOSE, PAYEE, AMOUNT from T_2013Q4_HOUSE_DISBURSE LIMIT 1");
        for (HouseDisburseDetail hdd : hddList) {
            System.out.println(hdd.getBIOGUIDE_ID() + "\t" + hdd.getOFFICE() + "\t" + hdd.getAMOUNT());
        }
    }
}
