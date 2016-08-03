package book;

public class BookCityBean {
	public int count, room, toilet, bed;
	public String address, checkIn,checkOut, explain, review, price, 
	option, local, facilities, policy, houseType, language, photo;
	
	public BookCityBean(int count, int room, int toilet, int bed, String address, String checkIn, 
			String checkOut, String explain, String review,String price, 
			String option,String local,String facilities, String policy, String houseType,
			String language, String photo) {
		this.count = count;		
		this.room = room;		
		this.toilet = toilet;		
		this.bed = bed;
		this.address = address;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.explain = explain;
		this.review = review;
		this.price = price;
		this.option = option;
		this.local = local;
		this.facilities = facilities;
		this.policy = policy;
		this.houseType = houseType;
		this.language = language;
		this.photo = photo;
	}
	
	/**
	 * 
	 */
	public BookCityBean() {
	}

	private int getCount() {
		return count;
	}
	private void setCount(int count) {
		this.count = count;
	}
	private int getRoom() {
		return room;
	}
	private void setRoom(int room) {
		this.room = room;
	}
	private int getToilet() {
		return toilet;
	}
	private void setToilet(int toilet) {
		this.toilet = toilet;
	}
	private int getBed() {
		return bed;
	}
	private void setBed(int bed) {
		this.bed = bed;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	private String getCheckIn() {
		return checkIn;
	}
	private void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	private String getCheckOut() {
		return checkOut;
	}
	private void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	private String getExplain() {
		return explain;
	}
	private void setExplain(String explain) {
		this.explain = explain;
	}
	private String getReview() {
		return review;
	}
	private void setReview(String review) {
		this.review = review;
	}
	private String getPrice() {
		return price;
	}
	private void setPrice(String price) {
		this.price = price;
	}
	private String getOption() {
		return option;
	}
	private void setOption(String option) {
		this.option = option;
	}
	private String getLocal() {
		return local;
	}
	private void setLocal(String local) {
		this.local = local;
	}
	private String getFacilities() {
		return facilities;
	}
	private void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	private String getPolicy() {
		return policy;
	}
	private void setPolicy(String policy) {
		this.policy = policy;
	}
	private String getHouseType() {
		return houseType;
	}
	private void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	private String getLanguage() {
		return language;
	}
	private void setLanguage(String language) {
		this.language = language;
	}
	private String getPhoto() {
		return photo;
	}
	private void setPhoto(String photo) {
		this.photo = photo;
	}
}
