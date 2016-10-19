package org.globant.topic2.e02;

public class PostObject {
	public String title=null;
	public String date=null;
	public String text=null;
	public boolean state = true;
	
	public PostObject(String title1, String date1, String text1, boolean state1) {
		this.title=title1;
		this.date=date1;
		this.text=text1;
		this.state=state1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
}
