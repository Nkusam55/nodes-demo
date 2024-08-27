package com.nodes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nodes.demo.entity.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
	
}
