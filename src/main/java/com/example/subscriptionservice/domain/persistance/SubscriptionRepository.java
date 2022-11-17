package com.example.subscriptionservice.domain.persistance;


import com.example.subscriptionservice.domain.model.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

}
