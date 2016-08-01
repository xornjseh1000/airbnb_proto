package community;

import java.io.Serializable;

public class CommunityBean implements Serializable{
	private static final long serialVersionUID = 1L;
	public String symbol,workRoom,count,story;

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getWorkRoom() {
		return workRoom;
	}

	public void setWorkRoom(String workRoom) {
		this.workRoom = workRoom;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
}
