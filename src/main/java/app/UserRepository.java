package app;

import lombok.NonNull;

public interface UserRepository {
    User find(@NonNull final String id);
}
