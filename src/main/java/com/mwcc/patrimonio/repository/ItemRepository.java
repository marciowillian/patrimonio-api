package com.mwcc.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwcc.patrimonio.model.Item;


public 	interface ItemRepository extends JpaRepository<Item, Long> {

}
