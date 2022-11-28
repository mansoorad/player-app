package com.ty.player.player_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.player.player_app.dto.Player;
import com.ty.player.player_app.repo.PlayerRepository;

@Repository
public class PlayerDao {
	@Autowired
	PlayerRepository  repository;
	
	public Player savePlayer(Player player) {
		return repository.save(player);
	}
	
	public Player getPlayer(int id) {
		return repository.findById(id).get();
	}
	
	public String deletePlayer(int id) {
		repository.deleteById(id);
		return "Player Deleted";
	}
}
