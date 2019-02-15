package helloSpring.by9ye.helloWebApp.bootstrap;

import helloSpring.by9ye.helloWebApp.model.Author;
import helloSpring.by9ye.helloWebApp.model.Book;
import helloSpring.by9ye.helloWebApp.model.Publisher;
import helloSpring.by9ye.helloWebApp.repositories.AuthorRepo;
import helloSpring.by9ye.helloWebApp.repositories.BookRepo;
import helloSpring.by9ye.helloWebApp.repositories.PublisherRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component //泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> { // 事件监听
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;
    private PublisherRepo publisherRepo;

    public DevBootstrap(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher pub_ddd = new Publisher();
        pub_ddd.setName("Bin");
        pub_ddd.setAddress("474 Seymour Rd");
        publisherRepo.save(pub_ddd);
        Book ddd = new Book("Domain Driven Design", "1234", pub_ddd);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepo.save(eric);
        bookRepo.save(ddd);



        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher pub_rot = new Publisher("Jamin", "Finkenstr 64");
        publisherRepo.save(pub_rot);
        Book noEJB = new Book("J2EE Development without EJB", "23444", pub_rot );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepo.save(rod);
        bookRepo.save(noEJB);

    }
}
