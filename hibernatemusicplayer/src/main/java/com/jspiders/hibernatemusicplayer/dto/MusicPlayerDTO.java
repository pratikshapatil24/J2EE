package com.jspiders.hibernatemusicplayer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="musiclist")
public class MusicPlayerDTO {
	
	@Id
	private int id;
	private String name;
	private String album;
	private String singer;

}