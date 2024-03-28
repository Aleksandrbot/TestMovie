package com.example.crudproject.controller;

import com.example.crudproject.model.Movie;
import com.example.crudproject.service.ActorService;
import com.example.crudproject.service.MovieService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneralControllerTest {

    @Mock
    private MovieService movieService;

    @Mock
    private ActorService actorService;

    @InjectMocks
    private GeneralController generalController;

    @Test
    public void testGetMoviesByTitleContain() {
        String word = "example";
        Model model = mock(Model.class);
        List<Movie> movies = new ArrayList<>();
        when(movieService.getMoviesByTitleContain(word)).thenReturn(movies);

        String result = generalController.getMoviesByTitleContain(word, model);

        verify(model).addAttribute("movies", movies);
        assertEquals("movies", result);
    }
}