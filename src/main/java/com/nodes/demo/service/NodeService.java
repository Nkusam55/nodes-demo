package com.nodes.demo.service;

import java.util.List;

import com.nodes.demo.entity.Node;

public interface NodeService {

	Node save(Node employee);

    List<Node> findAllNodes();

}
