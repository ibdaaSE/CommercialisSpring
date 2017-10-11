package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import util.DatabaseQuery;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        String querySearch = DatabaseQuery.getQueryJoinSearch("*", "Article a",
				"a.categorie a.designation a.famille a.marque a.reference a.codeBarres", ":filter", ":filterAttribut",
				":filterValue") + " ORDER BY a.idArticle DESC";
        System.out.println(querySearch);
    }
}
