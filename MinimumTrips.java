    public static int getMinimumTrips(List<Integer> weights)
    {
        int size = weights.size();
        int minTrips = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : weights)
        {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> elem : freq.entrySet())
        {
            int i = elem.getValue();
            if (i == 1)
                return -1;
            if (i % 3 == 0)
            {
                minTrips += i / 3;
            }
            else if (i % 3 == 2)
            {
                minTrips += (i - 2) / 3 + 1;
            }
            else
            {
                minTrips += (i - 1) / 3 + 1;
            }
        }
        return minTrips;
    }
}
// please define the main method