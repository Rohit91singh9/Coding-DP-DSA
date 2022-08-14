// 1st Approach:
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Register {
public static List<String> implementAPI(List<String> logs) { 

	int n = logs.size(); 
	ArrayList<String> ans = new ArrayList<>(); 
	HashMap<String, String> register = new HashMap<>(); 
	HashMap<String, String> login = new HashMap<>();

	for (int i = 0; i < n; i++) { 
		String temp = logs.get(i); 
		String[] split = temp.split("\\s+"); 
		if (split[0].equals("register")) { 
			if (register.containsKey(split[1])) 
		 
				ans.add("Username already exists"); 
			else { 
				ans.add("Registered Successfully"); 
				register.put(split[1], split[2]); 
			}
		} else if (split[0].equals("login")) { 
			if (register. containsKey(split[1])) { 
				if ((login.containsKey(split[1]))) { 
					ans.add("Login Unsuccessful"); 
				} else { 
					if (register.get(split[1]).equals(split[2])) { 
						ans.add("Logged In Successfully"); 
						login.put(split[1], split[2]); 
					} else { 
						ans.add("Login Unsuccessful"); 
					}
				}
			} else { 
				ans.add("Login Unsuccessful");
			}
		} else { 
			if (register. containsKey(split[1])) { 
				if ((login.containsKey(split[1]))) { 
					ans.add("Logged Out Successfully"); 
					login.remove(split[1]); 
				} else {  
					ans.add("Logout Unsuccessful");
				} 
			} else { 
				ans.add("Logout Unsuccessful"); 
			}
		}

	} 

	return ans; 
} 

 public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("register david david123");
        logs.add("register adam 1Adam1");
        logs.add("login david david123");
        logs.add("login adam 1adam1");
        logs.add("logout david");
        System.out.print(implementAPI(logs));
    }
}


// 2nd Approach:

import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List;  
public class  Result {     
    public static void main(String[] args) {          
        String[] apis = { "register user05 qwerty", "login user05 qwerty", "logout user05"         };          
        implementAPI(apis);      
    }      public static void implementAPI(String[] logs) {         
        String[] res = new String[logs.length];                
        HashMap<String, List<String>> userNamePwdMap = new HashMap<>();          
        for (int i = 0; i < logs.length; i++) {                          
            String[] userInfo = logs[i].split(" ");                          
            if (userInfo[0].equalsIgnoreCase("register")) 
            {                               
                if (userNamePwdMap.containsKey(userInfo[1])) {                     
                    res[i] = "Username already exists";                 
                } 
                else 
                {                                         
                    List<String> list = new ArrayList<>();                     
                    list.add(userInfo[2]);                     
                    list.add("logged_out");                     
                    userNamePwdMap.put(userInfo[1], list);                     
                    res[i] = "Registered successfully";                 
                }             
            } 
            else 
            if (userInfo[0].equalsIgnoreCase("login")) 
            {                 
                if (userNamePwdMap.containsKey(userInfo[1])) {                                  
                    if (userNamePwdMap.get(userInfo[1]).get(0).equals(userInfo[2]) &&                             
                    userNamePwdMap.get(userInfo[1]).get(1).equalsIgnoreCase("logged_out")) {                         
                        userNamePwdMap.get(userInfo[1]).set(1, "logged_in");                         
                        res[i] = "Logged In Successfully";                     
                    } 
                    else 
                    {                                                 
                        res[i] = "Already Logged In";                     
                    }                 
                } else 
                {                     
                    res[i] = "Login Unsuccessful";                 
                }             
            } 
            else 
            if (userInfo[0].equalsIgnoreCase("logout")) {                                 
                if (userNamePwdMap.containsKey(userInfo[1])                         
                && userNamePwdMap.get(userInfo[1]).get(1).equalsIgnoreCase("logged_in")) {                     
                    userNamePwdMap.get(userInfo[1]).set(1,"logged_out");                     
                    res[i] = "Logged out Successfully";                 
                } 
                else 
                {                     
                    res[i] = "Logout Unsuccessful";                 
                }             
            }         
        }          
        for(int i=0;i< res.length;i++){             
            System.out.print(res[i]+",");         
        }         System.out.println();      
    } 
} 

