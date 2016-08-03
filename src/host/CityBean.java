package host;

import java.io.Serializable;

public class CityBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private int room,toilet,bed,count;
	private String address,explain,review,price,option,local,facilities,policy,houseType,language,photo,id,pw;
	public int getRoom() {
		return room;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	public int getToilet() {
		return toilet;
	}
	
	public String getPw() {
		return pw;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public int getBed() {
		return bed;
	}
	public void setBed(int bed) {
		this.bed = bed;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "CityBean [room=" + room + ", toilet=" + toilet + ", bed=" + bed + ", address=" + address + ", explain="
				+ explain + ", review=" + review + ", price=" + price + ", option=" + option + ", local=" + local
				+ ", facilities=" + facilities + ", policy=" + policy + ", houseType=" + houseType + ", language="
				+ language + ", photo=" + photo + ", id=" + id + ", pw=" + pw + "]";
	}
}