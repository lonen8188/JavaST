package ch14.list;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// 백터는 멀티스레드 환경에서 동기화된 메서드로 구현
		// 동시에 여러명이 수정할 수 없다.
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		list.add(new Board("제목6", "내용6", "작성자6"));
		
		System.out.println("게시물 전체 보기");
		for(int i=0 ; i<list.size() ; i++) {
			Board board = list.get(i); // 0~끝까지 반복하면 객체 생성
			System.out.println(board.subject + " | " + board.content + " | " + board.writer);
		}
		
		System.out.println("2번 게시물 보기");
		Board board = list.get(2);
		System.out.println(board.subject + " | " + board.content + " | " + board.writer);
		
		System.out.println("3번 게시물 수정");
		Board boardmod = list.get(3);
		board.subject = "수정제목3";
		System.out.println(board.subject + " | " + board.content + " | " + board.writer);
		
		
		System.out.println("게시물 전체 보기");
		for(int i=0 ; i<list.size() ; i++) {
			Board board1 = list.get(i); // 0~끝까지 반복하면 객체 생성
			System.out.println(board1.subject + " | " + board1.content + " | " + board1.writer);
		}
		
		System.out.println("4번게시물 삭제");
		list.remove(4);
		System.out.println("게시물 전체 보기");
		for(int i=0 ; i<list.size() ; i++) {
			Board board1 = list.get(i); // 0~끝까지 반복하면 객체 생성
			System.out.println(board1.subject + " | " + board1.content + " | " + board1.writer);
		}

	}

}
