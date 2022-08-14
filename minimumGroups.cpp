int minimumGroups(vector<int> awards, int k)
{
	sort(awards.begin(), awards.end());
	int count = 1;
	int flag = 0;
	for (int i = 0; i < awards.size() - 1; i++)
	{
		for (int j = i + 1; j < awards.size(); j++)
		{
			if ((awards[j] - awards[i]) > k)
			{
				count++;
				flag = 1;
				i = j;
			}
			else
			{
				flag = 0;
			}
		}
	}

	return count;
}

/* 	This is complete logic of a Program in C++
	Remaining codes are in-built

 NOTE_

   I completed this Assessment during Amazon Hackerrank 1st Round 

   If you can figure out any other Approach to solve this problem, feel free to share me the code 
   which will help other candidates
   I would love to hear from you if you've cracked the Interview.
   beingactual@gmail.com

*/