package com.nodes.demo.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nodes.demo.entity.Node;
import com.nodes.demo.service.NodeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

	@Autowired
    private NodeService nodeService;

    @PostMapping
    public ResponseEntity<?> saveNode(@Valid @RequestBody Node node) {
    	Node savedNode = nodeService.save(node);
        return new ResponseEntity<>(savedNode, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllNodes() {
    	Map<String, Object> map = new LinkedHashMap<String, Object>();
    	List<Node> nodeList = nodeService.findAllNodes();
    	if (!nodeList.isEmpty()) {
			map.put("status", true);
			map.put("data", nodeList);
			return new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.clear();
			map.put("status", false);
			map.put("message", "Data is not found");
			return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
		}
    }

}
