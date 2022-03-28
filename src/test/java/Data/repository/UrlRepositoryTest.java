package Data.repository;

import Data.models.Url;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@ActiveProfiles("test")
class UrlRepositoryTest {
    @Autowired
    UrlRepository urlRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByShortLink() {
        //create a url
        Url url = new Url();
        //set all the values of the url
        url.setShortenedUrl("1234");
        url.setOriginalUrl("heaohvvhavhjjvsewp.com");
        //save the url and the short link to the repository
        UrlRepository.save(url);
        //find the url by the shortlink saved with
        //if found assert true
    }
}