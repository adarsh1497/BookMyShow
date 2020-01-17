package com.epam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.entity.Tier;
import com.epam.service.TierService;

@RestController
@RequestMapping(value = "/tiers")
public class TierController {
	@Autowired
	private TierService tiers;

	@GetMapping(value = "All")
	public List<Tier> getAllTiers() {
		return tiers.getAllTiers();
	}

	@PostMapping(value = "/tier")
	public Tier insert(@RequestBody Tier dto) {
		return tiers.insert(dto);
	}

	@PutMapping(value = "/tier")
	public Tier update(@RequestBody Tier dto) {
		return tiers.update(dto);
	}
}
