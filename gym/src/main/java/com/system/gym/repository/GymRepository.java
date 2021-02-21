package com.system.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.gym.models.Gym;

public interface GymRepository extends JpaRepository<Gym, Long> {

}
