package BookExample;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener){
		if(listener!=null){
			this.listener=listener;
		}
	}
	void touch(){
		listener.onClick();
	}
	interface OnClickListener{
		void onClick();
	}
}
