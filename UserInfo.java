public class UserInfo{

	private String Name;
	private String ID;
	private int DOB_M;
	private int DOB_D;
	private int DOB_Y;
	public UserInfo(){
		Name="";
		ID="";
		DOB_M=1;
		DOB_D=1;
		DOB_Y=1;
	}
	public String getName(){
		return this.Name;
	}
	public String getID(){
		return this.ID;
	}
	public int getDOB_M(){
		return this.DOB_M;
	}
	public int getDOB_D(){
		return this.DOB_D;
	}
	public int getDOB_Y(){
		return this.DOB_Y;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setID(String ID){
		this.ID = ID;
	}
	public void setDOB_M(int DOB_M){
		this.DOB_M = DOB_M;
	}
	public void setDOB_D(int DOB_D){
		this.DOB_D = DOB_D;
	}
	public void setDOB_Y(int DOB_Y){
		this.DOB_Y = DOB_Y;
	}
}
