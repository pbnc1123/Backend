package com.smhrd.player.converter;

import java.io.File;
import java.io.IOException;

public interface PlayerImageConverter<F, S> {

	// 이미지 파일(File의 F)을 byte문자열(Sting의 S) 형태로 변환할 때 해당 인터페이스를 상속받아서
	// 정해진 틀대로 변환할 수 있도록 진행
	
	
	// F: 실제파일
	// S: 바이트 문자열
	// IOException: 입출력 관련한 예외처리
	public S convert(F f) throws IOException;
	
	
}
