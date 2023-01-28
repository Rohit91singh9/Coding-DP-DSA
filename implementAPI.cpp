vector<string> implementAPI(vector<string> &logs){
vector<string> ans;
map<string, pair<string, bool>> mp;
for(string&s : logs){
	vector<string> temp;
	stringstream str(s);
	string word;
	while(str >> word){
		temp.push_back(word);
	}
	string first = temp[0];
	string user = temp[1];
	if(first == "register"){
		string pass = temp[2];
		if(mp.find(user) != mp.end()){
			ans.push_back("Username already exists");
		}
		else{
			mp[user] = {pass, false};
			ans.push_back("Registered Successfully");
		}
	}
	else if(first == "login"){
		string pass = temp[2];
		if(mp.find(user) == mp.end()){
			ans.push_back("Login Unsuccessful");
		}
		else if(mp[user].first != pass || mp[user].second == true){
			ans.push_back("Login Unsuccessful");
		}
		else if(mp[user].first == pass){
			ans.push_back("Logged In Successfully");
			mp[user].second = true;
		}
	}
	else if(first == "logout"){
		if(mp.find(user) == mp.end() || mp[user].second == false){
			ans.push_back("Logout Unsuccessful");
		}
		else{
			ans.push_back("Logged Out Successfully");
			mp[user].second = false;
		}
	}
}
return ans;
}