package tn.esprit.spring;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.repositories.ICourseRepository;
import tn.esprit.spring.services.CourseServicesImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class CourseServiceImpTest {
	@Mock
	private ICourseRepository courseRepositoryMock;

	@InjectMocks
	private CourseServicesImpl  courseServices;



	@Test
	void retrieveCourses_shouldCallCourseRepository() {
		courseServices.retrieveAllCourses();

		verify(courseRepositoryMock).findAll();
	}

}
