package ru.liga.prerevolutionarytinder.repository.profiles;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liga.prerevolutionarytinder.models.jpa.profiles.UserProfileEntity;

//@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long> {
}
