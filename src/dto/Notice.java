<<<<<<< HEAD
package dto;

public class Notice {
	private String searchItem;
	private String searchWord;
	private String title;
	private String content;
	private String date;
	private String num;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSearchItem() {
		return searchItem;
	}
	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
}
=======
package dto;

public class Notice {
	private int notNum;
	private String notName;
	private String notContent;
	private String notDate;
	private String notEmail;
	// private Byte[] notFile;
	private String notFile;

	public int getNotNum() {
		return notNum;
	}

	public void setNotNum(int notNum) {
		this.notNum = notNum;
	}

	public String getNotName() {
		return notName;
	}

	public void setNotName(String notname) {
		this.notName = notname;
	}

	public String getNotContent() {
		return notContent;
	}

	public void setNotContent(String notContent) {
		this.notContent = notContent;
	}

	public String getNotDate() {
		return notDate;
	}

	public void setNotDate(String notDate) {
		this.notDate = notDate;
	}

	public String getNotEmail() {
		return notEmail;
	}

	public void setNotEmail(String notEmail) {
		this.notEmail = notEmail;
	}

	public String getNotFile() {
		return notFile;
	}

	public void setNotFile(String notFile) {
		this.notFile = notFile;
	}
}
>>>>>>> 43babc188e4515235e6d1e5358a620aecdbb01be