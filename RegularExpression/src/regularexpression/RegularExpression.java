/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ali
 */
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Regular expressions =====");
		System.out.println();
		
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random text that contains gmail addresses "
				+ "like this one some-email@gmail.com. And some other random text.";
		Matcher m = p.matcher(sampleText);
		
		m.find();
		String gmailAddress = m.group();
		System.out.println(gmailAddress);
		
		String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
		String[] sentences = sampleText2.split("[\\.!?]");
		System.out.println(Arrays.toString(sentences));
    }
    
}
