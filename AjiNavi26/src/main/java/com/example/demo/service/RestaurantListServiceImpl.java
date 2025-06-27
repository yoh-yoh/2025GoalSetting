package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class RestaurantListServiceImpl implements RestaurantListService {

	
	private final RestaurantRepository repository;
	@Override
	public List<Restaurant> findByNameWildcard(String restaurantName) {
		// TODO 自動生成されたメソッド・スタブ
		List<Restaurant> list =
				repository.selectByNameWildcard(restaurantName);
		return list;
	}

}
