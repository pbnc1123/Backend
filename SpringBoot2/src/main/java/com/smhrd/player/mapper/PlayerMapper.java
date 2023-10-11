package com.smhrd.player.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.player.entity.Player;

@Mapper
public interface PlayerMapper {

	// Player를 담는 리스트 형식으로 받는 추상메소드
	public List<Player> PlayerList();

}
