package org.mm.restaurant_service.controller;

import org.mm.restaurant_service.entity.Restaurant;
import org.mm.restaurant_service.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/restaurants")
@RestController
public class RestaurantController 
{
	private final RestaurantService restaurantService;
	
	@PostMapping()
	public ResponseEntity<?> addRestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant saveRestaurant = restaurantService.addRestaurant(restaurant);
		return ResponseEntity.ok(saveRestaurant);
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllRestaurant()
	{
		return ResponseEntity.ok(restaurantService.getAllRestaurant());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getRestaurantById(@PathVariable("id") Long id)
	{
		return ResponseEntity.ok(restaurantService.getRestaurantById(id));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> updateRestaurantById(@PathVariable("id") Long id,
												@RequestBody Restaurant restaurant)
	{
		return ResponseEntity.ok(restaurantService.updateRestaurantById(id, restaurant));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteRestaurantById(@PathVariable("id") Long deleteId)
	{
		return ResponseEntity.ok(restaurantService.deleteRestaurantById(deleteId));
	}
	
}
