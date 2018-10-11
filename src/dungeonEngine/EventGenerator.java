package dungeonEngine;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import entities.*;
import events.Events;
import player.*;
public class EventGenerator {
	
	int amount = 0;
	private LinkedList<Events> events = new LinkedList<Events>();
	private int counter = 0;
	
	public void addEvent()
	{
		int random = (int) (Math.random()*amount);
		Events s = null;
		try {
			BufferedReader bR = new BufferedReader(new FileReader("events.xml"));
			LinkedList<String> gatherer= new LinkedList<String>();
			gatherer.add("");
			String help;
			int n=0;
			while((help=bR.readLine())!=null)
			{
				gatherer.set(n, gatherer.get(n)+help);
				if(help.contains("</Dungeon>"))
					n++;
			}
			String lan = getContent(gatherer.get(random),"Lan=Deutsch");
			System.out.println(lan);
			String story = getContent(lan,"Story");
			String[] monster = new String[10];
			for(int i = 0; i < monster.length;i++ ) 
			{
				try {
				monster[i] = getContent(lan,"Monster"+(i+1));
				}catch(IndexOutOfBoundsException p)
				{
					break;
				}
			
			}
			String decisions[] = new String[3]; 
			for(int i = 0; i <decisions.length;i++ )
			{
				decisions[i] = getContent(lan,"Decision"+(i+1));
			}
			
			s = new Events( getContent(lan,"Name"), story, decisions) {
								
			};
			s.setResults(new String[]{getContent(decisions[0],"Result"),getContent(decisions[1],"Result"),getContent(decisions[2],"Result")});
					
		
		
		
		
		
		
		switch(random)
		{
		case 0:
						
			
			break;
			
		case 1:
				
			
			
			
			break;
			
		case 2:
				
			
			
			
			break;
		case 3:
					
				
				
				
			break;
				
		case 4:
					
				
				
				
			break;
				
		case 5:
					
				
				
				
			break;
		
		}
		events.addLast(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public Events getScene()
	{
		
		return events.get(counter++);
	}
	 String getContent(String s, String tag) throws IndexOutOfBoundsException
     {
          return s.substring((s.indexOf(tag)+tag.length()+1), s.indexOf("</"+tag)).trim();
     }
}

