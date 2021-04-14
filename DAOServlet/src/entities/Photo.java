package entities;

public class Photo {
	
	    public int id;
		public String title;
		public String creator;
		public String weburl;
		public String type;
		public String location;
		public String keywords;
		public String mimetype;
		
		public Photo(int id, String title, String creator, String weburl, String type, String location, String keywords, String mimetype ) {
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.weburl = weburl;
		this.type = type;
		this.location = location;
		this.keywords = keywords;
		this.mimetype = mimetype;
		
		}


		public String getWeburl() {
			return weburl;
		}


		public void setWeburl(String weburl) {
			this.weburl = weburl;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public String getCreator() {
			return creator;
		}


		public void setCreator(String creator) {
			this.creator = creator;
		}


		public String getMimetype() {
			return mimetype;
		}


		public void setMimetype(String mimetype) {
			this.mimetype = mimetype;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public String getKeywords() {
			return keywords;
		}


		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}
		
		
		
		
}

