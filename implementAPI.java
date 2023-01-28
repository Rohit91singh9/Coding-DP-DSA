public static List<String> implementAPI(List<String> logs) {

    Map<String, Boolean> loggedIn = new HashMap<>();
    Map<String, String> password = new HashMap<>();

    List<String> res = new ArrayList<>();

    for (String l : logs) {
        String[] temp = l.split(" ");
        if (temp[0].equals("register")) {
            if (password.containsKey(temp[1]))
                res.add("Username already exists");
            else {
                password.put(temp[1], temp[2]);
                res.add("Registered Successfully");
            }
        } else if (temp[0].equals("login")) {
            if (password.containsKey(temp[1]) && password.get(temp[1]).equals(temp[2])) {
                if (loggedIn.containsKey(temp[1])) {
                    if (loggedIn.get(temp[1]) == false) {
                        loggedIn.put(temp[1], true);
                        res.add("Logged In Successfully");
                    } else {
                        res.add("Login Unsuccessful");
                    }
                } else {
                    loggedIn.put(temp[1], true);
                    res.add("Logged In Successfully");
                }
            } else
                res.add("Login Unsuccessful");
        } else if (temp[0].equals("logout")) {
            if (password.containsKey(temp[1]) && loggedIn.containsKey(temp[1]) && loggedIn.get(temp[1]) == true) {
                loggedIn.put(temp[1], false);
                res.add("Logged Out Successfully");
            } else {
                res.add("Logout Unsuccessful");
            }
        }
    }

    return res;
}