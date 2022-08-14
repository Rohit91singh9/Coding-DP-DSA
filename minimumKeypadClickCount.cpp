int minimumKeypadClickCount(string input)
{
       char right[9][3] = {
           {'a', 'j', 's'},
           {'b', 'o', 't'},
           {'c', 'p', 'u'},
           {'d', 'k', 'v'},
           {'h', 'm', 'z'},
           {'g', 'l', '@'},
           {'e', 'n', 'w'},
           {'f', 'q', 'x'},
           {'i', 'r', 'y'}};
         int n, count1 = 0, count2 = 0;
            n = input.length();
            for (int i = 0; i < n; i++)
            {
                int d = input[i] - 97;
                d = d % 3;
                count1 += (d + 1);
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        if (right[j][k] == input[i])
                        {
                            count2 += (k + 1);
                        }
                    }
                }
            }
            return count2;
            
}