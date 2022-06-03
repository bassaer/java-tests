package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserRepositoryImplTest {

    UserRepositoryImpl repository;

    @Mock
    NameCreator nameCreator;

    @BeforeEach
    void before() {
        repository = new UserRepositoryImpl(nameCreator);
    }

    @Test
    void test1() {
        String id = "123";
        String name = "Hello";
        when(nameCreator.create()).thenReturn(name);

        User actual = repository.find(id);

        assertThat(actual).isEqualTo(new User(id, name));
    }
}
