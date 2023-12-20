package teamA04.iso;

public class Query {
	
	private int queryID;
	
	private String parameters;
		
	
	public Query(int queryID, String parameters) {
		super();
		this.queryID = queryID;
		this.parameters = parameters;
	}

	public int getQueryID() {
		return queryID;
	}

	public void setQueryID(int queryID) {
		this.queryID = queryID;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	
	public void execute() {
		
	}


}
