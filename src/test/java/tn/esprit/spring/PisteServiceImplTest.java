package tn.esprit.spring;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import tn.esprit.spring.entities.Piste;
import tn.esprit.spring.repositories.IPisteRepository;



import java.util.*;

import org.assertj.core.api.Assertions;
import tn.esprit.spring.services.PisteServicesImpl;

import javax.persistence.EntityNotFoundException;

import

        static org.junit.jupiter.api.Assertions.*;
import

        static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)

class PisteServiceImplTest {

    @Mock
    IPisteRepository pisteRepository;

    @InjectMocks

    private PisteServicesImpl pisteServices;
    private Piste piste;

    @BeforeEach
    void setUp() {
        piste = new Piste();

    }

    @Test
    void retrieveAllPistesTest() {
        List<Piste> pistes = new ArrayList<>();
        pistes.add(piste);
        pistes.add(new Piste());
        Mockito.when(pisteRepository.findAll()).thenReturn(pistes);

        List<Piste> retrievedPistes = pisteServices.retrieveAllPistes();

        Assertions.assertThat(retrievedPistes).isNotNull();

        Mockito.verify(pisteRepository).findAll();
    }
}

