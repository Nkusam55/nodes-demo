package com.nodes.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nodes.demo.entity.Node;
import com.nodes.demo.repository.NodeRepository;

@Service
public class NodeServiceImpl implements NodeService {

	@Autowired
	NodeRepository nodeRepository;
	
	@Override
	public Node save(Node node) {
		 return nodeRepository.save(node);
	}

	@Override
	public List<Node> findAllNodes() {
		return nodeRepository.findAll();
	}


}
