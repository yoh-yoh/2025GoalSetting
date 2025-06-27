package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;
/*サービス層*/
/*業務処理*/
@Service
@RequiredArgsConstructor
public class RegistServiceimpl implements RegistService {

	private final ReviewRepository repository;

	@Override
	public void regist(Review review) {

		repository.add(review);

	}

}
