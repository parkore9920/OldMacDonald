class Chick implements Animal 
{   
    private String myType;     
    private String mySound;
    private int myNum;      
    public Chick(String type, String sound1, String sound2)     
    {   
    myNum = (int)(Math.random()*2);     
         myType = type;   
         if(myNum % 2 == 0)      
         mySound = sound1;  
         else 
         mySound = sound2;
    }     
    public Chick()     
    {         
         myType = "unknown";         
         mySound = "unknown";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
}