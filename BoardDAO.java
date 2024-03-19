class BoardDAO{
	public void insert(){
		System.out.println("BoardDAO");
		System.out.println("파일을 생성하였음");	
	}
	public List list(){
		ArrayList list = new ArrayList();
		list.add("1번 게시물");
		list.add("2번 게시물");
		list.add("3번 게시물");
		return list;
	}
}