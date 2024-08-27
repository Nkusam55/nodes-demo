package com.nodes.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "nodes")
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Node ID must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Node ID contains invalid characters")
    private String nodeId;

    @NotEmpty(message = "Node Name must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Node Name contains invalid characters")
    private String nodeName;

    @NotEmpty(message = "Description must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Description contains invalid characters")
    private String description;

    @NotEmpty(message = "Memo must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Memo contains invalid characters")
    private String memo;

    @NotEmpty(message = "Node Type must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Node Type contains invalid characters")
    private String nodeType;

    @NotEmpty(message = "Parent Node Group Name must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Parent Node Group Name contains invalid characters")
    private String parentNodeGroupName;

    @NotEmpty(message = "Parent Node Group ID must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Parent Node Group ID contains invalid characters")
    private String parentNodeGroupId;

    @NotEmpty(message = "Parent Node Name must not be null")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Parent Node Name contains invalid characters")
    private String parentNodeName;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getParentNodeGroupName() {
        return parentNodeGroupName;
    }

    public void setParentNodeGroupName(String parentNodeGroupName) {
        this.parentNodeGroupName = parentNodeGroupName;
    }

    public String getParentNodeGroupId() {
        return parentNodeGroupId;
    }

    public void setParentNodeGroupId(String parentNodeGroupId) {
        this.parentNodeGroupId = parentNodeGroupId;
    }

    public String getParentNodeName() {
        return parentNodeName;
    }

    public void setParentNodeName(String parentNodeName) {
        this.parentNodeName = parentNodeName;
    }
}

