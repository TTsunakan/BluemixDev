package wasdev.sample.model;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped

public class HelloBean implements Serializable{
	
	private static final long serialVersionUID = 2324320609815434023L;
	private static final String MESSAGE_TBMPLATE = "【%s】こんにちわ Bluemix[%d]";
	
	private int count = 0;
	
	private String message = String.format(MESSAGE_TBMPLATE,"デフォルト値",count);
	
	@PostConstruct
	public void init(){
		setCount(0);
		setMessage(String.format(MESSAGE_TBMPLATE, "@PostConstruct",getCount()));
	}
	
	public void action(){
		int next = getCount() + 1;
		setCount(next);
		setMessage(String.format(MESSAGE_TBMPLATE, "ボタンアクション",next));
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public int getCount(){
		return count;
	}
	
	public void setCount(int count){
		this.count = count;
	}
}