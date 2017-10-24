class Cow implements Animal 
{     
	//private String myName;
    protected String myType;     
    protected String mySound;      
    public Cow(String type, String sound)     
    {         
         myType = type;         
         mySound = sound;     
    }     
    public Cow()     {         
         myType = "unknown";         
         mySound = "unknown";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;}
    //public String getName(){return myName;} 
}