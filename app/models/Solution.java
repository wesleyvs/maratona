package models;

public class Solution {
	public String sourcecode;
	public String filename;
	public String problem;

	public Solution() {
	}
	
	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSourcecode() {
		return sourcecode;
	}

	public void setSourcecode(String sourcecode) {
		this.sourcecode = sourcecode;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}