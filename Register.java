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