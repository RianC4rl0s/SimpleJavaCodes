package structures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao5 {

	
	public static void main(String[] args) {
		String path = "src/questoes/myText.txt";

		String text;
		
		try {
			 text = myReader(path);
			 System.out.println(text);
			 text = text.replaceAll("\\p{Punct}", "");
			 System.out.println(text);
			 String [] words = text.split(" ");
			 
			 
			 
			 
			 
			 RcLinkedListInter<String> wordList = new RcLinkedListSingly<String>();
			
			 
			 for(int i = 0; i < words.length;i++) {
					wordList.addLast(words[i]);
				}
			 
			wordList.show();
			 
			 for(int i = 0; i < wordList.getSize();i++) {
				 int count = 0;
				 for(int j = 0; j< wordList.getSize();j++) {
					 if(wordList.search(i).equals(wordList.search(j))){
						 count++;
						 
					 }
				 }
				 System.out.println(wordList.search(i)+ " " + count);
			 }
			 
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static String myReader(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		StringBuffer sbResult = new StringBuffer();
		String row = "";
		
		while (row != null) {
			sbResult.append(row +"\n");
			row = br.readLine();
		}
		br.close();
		
		return sbResult.toString();
	}
}
