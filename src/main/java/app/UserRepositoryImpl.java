package app;

import lombok.NonNull;

public class UserRepositoryImpl implements UserRepository {

    private NameCreator nameCreator;

    public UserRepositoryImpl(NameCreator nameCreator) {
        this.nameCreator = nameCreator;
    }

    @Override
    public User find(@NonNull String id) {
        return new User(id, nameCreator.create(), CurrentDate.get());
    }
}
