package com.iviberberi;

import com.iviberberi.app.model.Film;
import com.iviberberi.app.repository.FilmRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class FilmRepositoryTest {

    @Inject
    FilmRepository filmRepository;


//    @Test
//    public void test() {
//        Optional<Film> film = filmRepository.getFilm((short) 5);
//        assertTrue(film.isPresent());
//        assertEquals("AFRICAN EGG", film.get().getTitle());
//    }

}
