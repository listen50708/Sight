package model;

public class Sight {
	private String SightName=null;
	private String Zone=null;
	private String Category=null;
	private String PhotoURL=null;
	private String Description=null;
	private String Address=null;
	
	public void setSightName(String SightName) {
		this.SightName = SightName;
	}
	public String getSightName() {
		return SightName;
	}
	public void setZone(String Zone) {
		this.Zone = Zone;
	}
	public String getZone() {
		return Zone;
	}
	public void setCategory(String Category) {
		this.Category = Category;
	}
	public String getCategory() {
		return Category;
	}
	public void setPhotoURLe(String PhotoURL) {
		this.PhotoURL = PhotoURL;
	}
	public String getPhotoURL() {
		return PhotoURL;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public String getDescription() {
		return Description;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	}
	public Sight(String SightName, String Zone, String Category, String PhotoURL, String Description, String Address) {
		this.SightName = SightName;
		this.Zone = Zone;
		this.Category = Category;
		this.PhotoURL = PhotoURL;
		this.Description = Description;
		this.Address = Address;
	}
	
	@Override
	public String toString() {
		return "SightName: "+SightName+"\n"+"Zone: "+Zone+"\n"+"Category: "+Category+"\nPhotoURL:\n "+PhotoURL+"\nDescription: "+Description+"\nAddress: "+Address;
	}

}
