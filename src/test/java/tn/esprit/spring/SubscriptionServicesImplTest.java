package tn.esprit.spring;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.repositories.ISubscriptionRepository;
import tn.esprit.spring.services.SubscriptionServicesImpl;



import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class SubscriptionServicesImplTest {

    @Mock
    private ISubscriptionRepository subscriptionRepository;

    @InjectMocks
    private SubscriptionServicesImpl subscriptionServices;



    @Test
     void retrieveSubscriptions_shouldCallSubscriptionRepository() {
        subscriptionServices.retrieveSubscriptions();

        verify(subscriptionRepository).findDistinctOrderByEndDateAsc();
    }


}

