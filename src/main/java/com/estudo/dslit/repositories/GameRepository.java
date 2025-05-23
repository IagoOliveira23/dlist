package com.estudo.dslit.repositories;

import com.estudo.dslit.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
