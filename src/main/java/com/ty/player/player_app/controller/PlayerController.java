package com.ty.player.player_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.player.player_app.dao.PlayerDao;
import com.ty.player.player_app.dto.Player;

@RestController
public class PlayerController {
	@Autowired
	PlayerDao dao;
	
	@PostMapping("save")
	public Player savePlayer(@RequestBody Player player) {
		return dao.savePlayer(player);
	}
	
	@GetMapping("get")
	public Player getPlayer(@RequestParam int id) {
		return dao.getPlayer(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deletePlayer(@PathVariable int id) {
		return dao.deletePlayer(id);
	}
}
