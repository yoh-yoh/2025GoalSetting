package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Review;

/*インフラ層*/
/*データアクセス*/
public interface ReviewRepository {
	//引数は登録するデータReview review
	void add(Review review);

	List<Review> selectByRestaurantId(int restaurantId);

	void update(Review review);

	void delete(Review review);

}
