package com.project.popupmarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PopupStoreImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seq;
    private long popupStoreSeq;
    private String image;
}