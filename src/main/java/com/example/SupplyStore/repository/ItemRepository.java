package com.example.SupplyStore.repository;

import com.example.SupplyStore.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
