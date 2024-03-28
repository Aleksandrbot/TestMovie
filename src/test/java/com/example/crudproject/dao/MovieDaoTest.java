package com.example.crudproject.dao;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDaoTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @Mock
    private ActorDao actorDao;

    @InjectMocks
    private MovieDao movieDao;


}
