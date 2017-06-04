package model;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import dao.EmployerDAO;

/**
 * Main class that runs the client.
 * @author Gloria
 *
 */
@SpringBootApplication
public class Application {
    /** Partner ID assigned by Glassdoor. */
    // TODO configure your own partner ID
    private static final String ID = "xxxxxx";
    /** Partner key assigned by Glassdoor. */
    // TODO configure your own key
    private static final String KEY = "xxxxxxxxxxx";

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Answer answer = restTemplate.getForObject("http://api.glassdoor.com/api/api.htm?v=1&format=json&t.p=" + ID
                    + "&t.k=" + KEY+ "&action=employers", Answer.class);
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
            EmployerDAO employerDAO = (EmployerDAO) context.getBean("employerDAO");

            // We get the number of pages that the glassdoor data has
            int totalNumberOfPages = answer.getResponse().getTotalNumberOfPages();
            ArrayList<Employer> employers = new ArrayList<>();
            // We get all the employers that belongs to every glassdoor page
            for (int i = 1; i <= totalNumberOfPages; i++) {
                answer = restTemplate.getForObject("http://api.glassdoor.com/api/api.htm?v=1&format=json&t.p=" + ID
                        + "&t.k=" + KEY+ "&action=employers&pn=" + i, Answer.class);
                // We storage the employers in an array
                employers.addAll(answer.getResponse().getEmployers());
                // When the array has at least 50 elements, we insert all the employers to the database
                if (employers.size() >= 50) {
                    log.info(employers.toString());
                    employerDAO.insert(employers);
                    employers.clear();
                }
            }
        };
    }
}