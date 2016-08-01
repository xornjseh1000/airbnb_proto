package guide;

import java.io.Serializable;

public class GuideBookBean implements Serializable{
	private static final long serialVersionUID = 1L;
	public String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
