package test1.model;

public class Decrypt {

	        public String decode(String user_key){
	            
	        String account_pwd = user_key;
	    	String account_pwd2 = "";
	        
	    	String temp_len = account_pwd.substring(account_pwd.length()-1,account_pwd.length());
	        char character = temp_len.charAt(0); 
	        int ascii = (int) character;
	        //Integer.toString(i);
	       // temp_len= Integer.toString(ascii);
	         temp_len= String.format("%03d",ascii);
	        String one = temp_len.substring(0,1);
	        String two =temp_len.substring(1,2);
	        String three = temp_len.substring(temp_len.length()-1,temp_len.length());
	        int temp_lenInt = Integer.parseInt(one)+Integer.parseInt(two)+Integer.parseInt(three); //Integer.parseInt("1234");
	        account_pwd = account_pwd.substring(0,account_pwd.length()-1);//#Left(account_pwd,Evaluate(Len(account_pwd)-1))#>
	    
	        int temp_len2 = account_pwd.length()/3;
	        
	        one = account_pwd.substring(0,temp_len2);
	        two = account_pwd.substring(temp_len2,temp_len2+temp_len2);//
		    three = account_pwd.substring(account_pwd.length()-temp_len2,account_pwd.length());
	        
	        String temp_pwd = "";
	        
	        for (int i=0;i<=one.length()-1;i++)
	        
	        {
	            temp_pwd = temp_pwd + one.substring(i,i+1);
	            temp_pwd = temp_pwd + two.substring(i,i+1);
	            temp_pwd = temp_pwd + three.substring(i,i+1);

	        }

		    temp_pwd =  temp_pwd.substring(0,temp_lenInt*3);
	        
	        
		    String temp_char ="";
		    
	        String temp_pwd2 = "";
	    
	          for (int ind3=1;ind3<=(temp_lenInt)*3;ind3=ind3+3)
	        
	        {
	           temp_char =Integer.toString(((int)temp_pwd.substring(ind3-1,ind3).charAt(0))).substring(Integer.toString(((int)temp_pwd.substring(ind3-1,ind3).charAt(0))).length()-1,Integer.toString(((int)temp_pwd.substring(ind3-1,ind3).charAt(0))).length())+Integer.toString(((int)temp_pwd.substring(ind3,ind3+1).charAt(0))).substring(Integer.toString(((int)temp_pwd.substring(ind3,ind3+1).charAt(0))).length()-1,Integer.toString(((int)temp_pwd.substring(ind3,ind3+1).charAt(0))).length())+Integer.toString(((int)temp_pwd.substring(ind3+1,ind3+2).charAt(0))).substring(Integer.toString(((int)temp_pwd.substring(ind3+1,ind3+2).charAt(0))).length()-1,Integer.toString(((int)temp_pwd.substring(ind3+1,ind3+2).charAt(0))).length());
	          temp_pwd2 = temp_pwd2 + Character.toString((char)(Integer.parseInt(temp_char))); //Character.toString(char)
	        }
	        
	        
	                 
	        return temp_pwd2;
	         }
	}

		

