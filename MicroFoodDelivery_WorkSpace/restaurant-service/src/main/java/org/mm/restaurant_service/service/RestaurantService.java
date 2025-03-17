package org.mm.restaurant_service.service;

import java.util.List;

import org.mm.restaurant_service.entity.Restaurant;
import org.mm.restaurant_service.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RestaurantService 
{
	private final RestaurantRepository restaurantRepo;
	
	public Restaurant addRestaurant(Restaurant restaurant)
	{
		return restaurantRepo.save(restaurant);
	}
	
	public List<Restaurant> getAllRestaurant()
	{
		return restaurantRepo.findAll();
	}

	public Restaurant getRestaurantById(Long id) 
	{
		return restaurantRepo.findById(id).orElseThrow();
	}

	public Restaurant updateRestaurantById(Long id, Restaurant restaurant)
	{
		restaurant.setId(id);
		return restaurantRepo.save(restaurant);
	}

	public String deleteRestaurantById(Long deleteId)
	{
		if(restaurantRepo.findById(deleteId) != null)
		{
			restaurantRepo.deleteById(deleteId);
			
			return "Restaurant Deleted ...";
		}
		return "Restaurant Not available ..";
	}
	
}
