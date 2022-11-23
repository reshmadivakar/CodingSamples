package string;

/**
 * Program to learn about string immutability
 */
public class ImmutableString
{
    static String str = "knowledge";
    static String str1 = "knowledge";

    public static void main(String[] args)
    {
        //Verify that both String reference points to same object.
        System.out.println("First String is "+str+ " and hashcode is "+str.hashCode());
        System.out.println("Second String is "+str1+ " and hashcode is "+str1.hashCode());

        //Do a concatenation on first string and don't assign to any reference
        str.concat("base");

        //JVM creates another string "knowledge base" but nothing refer to it. So it is instantly lost.
        System.out.println(" First string after concatenation is "+str);

        //Create a reference to concatenated string
        str1 = str1.concat("base");

        //Now print the string and verify that hashcode is different from previous hashcode as it is pointing to new literal "knowledgebase" in string pool.
        System.out.println(" Second string after concatenation is "+str1+ " and hashcode is "+str1.hashCode());
        //Create another String same as concatenated string

        String str2 = "knowledgebase";
        //print the new string defined above and confirm that it is pointing to previously created literal
        System.out.println(" Third string is "+str2+ " and hashcode is "+str2.hashCode());
        //create string using new operator
        String str3 = new String("knowledgebase");
        //Print it to confirm it is creating object in heap memory instead of string constant pool.
        System.out.println("Fourth string is "+str3+" and hashcode is "+str3.hashCode());


    }

}
