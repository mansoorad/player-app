package com.ty.player.player_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.player.player_app.dto.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
