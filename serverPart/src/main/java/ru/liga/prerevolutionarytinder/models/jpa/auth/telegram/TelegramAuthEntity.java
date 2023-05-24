package ru.liga.prerevolutionarytinder.models.jpa.auth.telegram;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.liga.prerevolutionarytinder.models.jpa.auth.AnyAuthEntity;

@Entity
@Table(name = "telegram_auth")
//@Table(name = "telegram_auth", schema = "my_schema")
@Data
@EqualsAndHashCode(callSuper = true)
public class TelegramAuthEntity extends AnyAuthEntity {
    @Column(name = "user_id", nullable = false, unique = true)
    private Integer userId;
}
