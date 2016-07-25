package jdbctest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class which is used to handle/manipulate XML files.
 * The assignment is all about extracting certain data 
 * from the XML file and output it on different XML file.
 * Logic:
 * The user will provide XML file
 * The class will then call different kind of methods that will
 * do some business logic and produce a new XML file/s on a give
 * file path.
 * 
 * This class is using regex, pattern and matcher which i 
 * have learned on the scjp-sun-certified-programmer-for-java-platform-6th-edt
 * during my 4weeks of learning java core.
 * 
 * @author jelica60589
 *
 */
public class XmlManipulation {
	/**
	 * @xmlFilePath = changeable directory for the XML file.
	 * this will be use to read the file. 
	 */
	private static String xmlFilePath = "C:\\Users\\jelica60589\\Desktop\\Assignment\\61AddrLine.xml";
	/**
	 * Create a constructor which will creates a new File instance,
	 * by converting the given pathname string into an abstract pathname
	 */
	private static File file = new File(xmlFilePath);
	/**
	 * Index used for creating XML files, it increases for every new file created
	 */
	private static int index = 0;
	/**
	 * use for header section 
	 */
	private static String header;
	/**
	 * 
	 */
	private static String footer;
	
	public static void main(String args[]){
		checkIfExists();
		checkFileExtension();
		String fileString = getStringFromFile(file);
		checkXmlFileTextFormat(fileString);
		setHeaderAndFooter(fileString);
		//Creating a patter for highlighting area between our given tags
		//this means that 
		String patternMatchRegionString = "<(ns:)?CDSNetChange-All-MessageTypes[^>]*>((?!</(ns:)?CDSNetChange-All-MessageTypes>).)*</(ns:)?CDSNetChange-All-MessageTypes>";
		Pattern patternMatchRegion = Pattern.compile(patternMatchRegionString);
		Matcher matchRegion = patternMatchRegion.matcher(fileString);
		//for every found region we format our region of tags from pattern and create new xml file
		while(matchRegion.find()){
			String regionString = matchRegion.group();
			String formatRegion = formatNewXML(regionString);
			createXmlFile(formatRegion);
		}
		//Program has ended
		System.out.println("*********Program finished************");
	}
	
	/**
	 * Method use for checking if the XML file exists on the given xmlFilePath.
	 * Error message will be shown if the file doesn't exists.
	 */
	private static void checkIfExists(){
		if (!file.exists() && !file.isDirectory()){
			System.err.println("Error: File doesn't exists in the file path.");
		}
	}
	
	/**
	 * This method check the file extension of the file if it is an xml file
	 * Error message will be shown when the file extension is not equal to
	 * XML.
	 */
	private static void checkFileExtension(){
		//get the name of the file
		String fileName = file.getName();
		//get the file extension of fileName but doing a substring
		String fileExtension = fileName.substring(fileName.lastIndexOf(".")+ 1);
		//check if the fileExtension is equals to xml
		if (!fileExtension.equals("xml")){
			System.err.println("Error: The file extension is " + fileExtension +
			" .Please correct the file extenstion or changet the file to xml file.");
		}
	}
	
	/**
	 * Method that gets whole text in a string from a given file.
	 * I used StringBuilder because as mentioned in the scjp-sun-
	 * certified-programmer-for-java-platform-6th-edt
	 * StringBuilder is much more faster to use than StringBuffer.
	 * 
	 * @param f
	 * @return builder
	 */
	private static String getStringFromFile(File file){
		StringBuilder builder = new StringBuilder();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: File reading failed");
		}
		BufferedReader bufferedReader = null;
		bufferedReader = new BufferedReader(fileReader);
		String line = null;
		try {
			while((line = bufferedReader.readLine()) != null){
				builder.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: Buffered reader failed");
		}
	
		return builder.toString();
	}

	/**
	 * Method use for checking the text of the file if it is
	 * XML format "<?xml"
	 * 
	 * @param fileTextFormat
	 */
	//***************************************************************
	//Note: Go back on this one later on.
	//***************************************************************
	//this section is a bit wrong as the logic is not properly working.s
	private static void checkXmlFileTextFormat(String fileTextFormat){
		String pattern = "<?xml version= 1.0 encoding= UTF-8 ?>";
		try{
			if (fileTextFormat.substring(0, 38).equals(pattern)){
				System.out.println("jbjbsj");
			}
			if (!fileTextFormat.startsWith("") || (!fileTextFormat.substring(0,5).equals("<?xml"))){
				System.out.println("XML file doesn't have the right xml format.");
			}
		}catch (StringIndexOutOfBoundsException e){
			System.err.println("XML File doesn't have the right xml format.");
		}
		//catch the StringIndexOutOfBoundsException when theres no text
		//in the xml file.
	}
	

	/**
	 * Method used to create a new xml file 
	 * for a given string
	 * @param xmlString
	 */
	private static void createXmlFile(String xmlString){
		index++;
		String name = file.getName().replaceFirst("[.][^.]+$", "");
		//First we create a new file and index it
		File file = new File("C:\\Users\\jelica60589\\Desktop\\Assignment\\ " + name + "_" + index +".xml");
		FileWriter fileWriter = null;
		//Then we create writer to file, if it fails we generate error message
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: Writing to file " + file.getName() + " failed");
		}
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		try {
			//write our header to the new created file.
			bufferedWriter.write(header);
			bufferedWriter.write(xmlString);
			//write our footer to the new created file.
			bufferedWriter.write(footer);
		} catch (IOException e) {
			System.err.println("Error: Writing to xml file " + file.getName()+ " failed");
		}
		try {
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			System.err.println("Error: Closing file "+ file.getName() +"failed");
		}
	}
	
	/**
	 * Method use to format the newly created XML file
	 * @param regionString
	 * @return creanedString
	 */
	private static String formatNewXML(String regionString){
		String indentString = ">[\t]";
		Pattern indentPatter = Pattern.compile(indentString);
		Matcher indentMatcher = indentPatter.matcher(regionString);
		String indenterString = indentMatcher.replaceAll(">\r\n\t");
		return indenterString;
	}
	
	/**
	 * method use to set the right header and footer
	 * for the new xml file.
	 * 
	 * @param xmlString
	 */
	private static void setHeaderAndFooter(String xmlString){
		String removePatternString = "<(ns:)?CDSNetChange-All-MessageTypes[^>]*>((?!</(ns:)?CDSNetChange-All-MessageTypes>).)*</(ns:)?CDSNetChange-All-MessageTypes>";
		Pattern removePattern = Pattern.compile(removePatternString);
		Matcher removeMatcher = removePattern.matcher(xmlString);
		String headerAndFooterTogether = removeMatcher.replaceAll("_0_");
		String[] splitedString = headerAndFooterTogether.split("_0_");
		header = splitedString[0];
		footer = splitedString[splitedString.length - 1];
		
		String indentString = ">[\t]";
		Pattern indentPatter = Pattern.compile(indentString);
		Matcher matcherHeader = indentPatter.matcher(header);
		header = matcherHeader.replaceAll(">\r\n\t");
		
		Matcher matcherFooter = indentPatter.matcher(footer);
		footer = matcherFooter.replaceAll(">\r\n\t");
	}
}
