
public class BinaryConverterRunner
{

    public static void main(String[] args)
    {
    	BinaryConverter steve = new BinaryConverter();

    	System.out.println(steve.getValue());

    	steve.setValue(153);

    	System.out.println(steve.getValue());

    	System.out.println(steve.toBinary());

    	System.out.println((int)Math.pow(2,4));

    	BinaryConverter jane = new BinaryConverter("00000001");

    	System.out.println(jane.getBinary());

    	System.out.println(jane.toDecimal());

		BinaryConverter tom = new BinaryConverter(152, "10011000");

		System.out.println(tom);
    }


}