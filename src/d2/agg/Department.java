package d2.agg;

class Department {
	int did;
	String dname;
	String location;
	public Department(int did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
		this.location = location;
	}
	
	public String deptDetails() {
		return "did:"+did+"\nDname:"+dname+"\nLocation:"+location;
	}

}
