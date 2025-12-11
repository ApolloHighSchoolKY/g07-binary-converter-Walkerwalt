public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    public void setBinary(String binary)
    {
        binaryValue = binary;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        //Make a temporary value int so no modifications are made to the original value
        int tempVal = value;
        String binout = "";

        //For loop where i is the power of the first place in a binary octet and goes down one every iteration
        for (int i = 7; i>=0; i--)
        {
            if (tempVal >= Math.pow(2, i))
            {
                tempVal -= Math.pow(2, i);
                binout += "1";
            }
            else
                binout += "0";
            
        }
    	return "" + binout;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int valOut = 0;
        String tempBin = binaryValue;

        for (int i = 0; i < tempBin.length(); i++)
            if  (tempBin.charAt(i) == '1')
                valOut += Math.pow(2, tempBin.length() - 1 - i);
    	return valOut;
    }


}