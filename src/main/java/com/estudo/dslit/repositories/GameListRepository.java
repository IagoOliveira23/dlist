package com.estudo.dslit.repositories;

import com.estudo.dslit.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
