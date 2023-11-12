package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.entities.Instructor;
import tn.esprit.spring.repositories.ICourseRepository;
import tn.esprit.spring.repositories.IInstructorRepository;
import tn.esprit.spring.services.InstructorServicesImpl;

import java.util.List;
@ExtendWith(MockitoExtension.class)
 class InstructorServicesImplTest {

    @Mock
    private IInstructorRepository instructorRepositoryMock;

    @Mock
    private ICourseRepository courseRepositoryMock;

    @InjectMocks
    private InstructorServicesImpl instructorServices;

    @Test
    void testRetrieveAllInstructors() {
        // Mockito.when(instructorRepositoryMock.findAll()).thenReturn(expectedInstructors);

        List<Instructor> actualInstructors = instructorServices.retrieveAllInstructors();

        Assertions.assertNotNull(actualInstructors);
    }


}
