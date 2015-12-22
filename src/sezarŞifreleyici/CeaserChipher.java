package sezarÞifreleyici;

public class CeaserChipher {
	
	 private static String message = "message";
	 private static int encyrptMode = 3;
	
	
	 public static void main(String[] args) {
	  
	    String encyrptedMessage = encyrptMessage(message, encyrptMode);
	    System.out.print("Mesaj: " + message +"\n");
	    System.out.print("Þifreli Mesaj: " + encyrptedMessage); 
	 }
	 
	 private static String encyrptMessage(String message, int mode){
		 String encyrptedMessage = "";
		 
		 for (int i = 0; i < message.length(); i++)
		      encyrptedMessage += letterChipher(message.charAt(i), mode);
		 
		return encyrptedMessage;
	 }
	 
	  private static char letterChipher(char ch, int mode) {
	    
		  if (!Character.isLetter(ch))
	      return ch;
	    
		  if (Character.isUpperCase(ch))
			  return (char) (((ch - 'A') + mode) % 26 + 'A');
	    
		  return (char) (((ch - 'a') + mode) % 26 + 'a');
	  }
}
