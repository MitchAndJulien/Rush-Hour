import javax.swing.JFrame;
import javax.swing.JButton;
public class Board {

  private JFrame level;
	
	public Board(){
		level=new JFrame();
		level.setSize(1300,1000);
		level.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//set background image
		
	}
	
	public void addButton(JButton b){
		level.add(b);
	}

	public JFrame getLevel(){
		return level;
	}
  
  public Restart(){
    //this needs to restart the entire board to 
  
}
