# Approach 1:

def songs_pair_index(songDurations, rideDuration):
    # finding sum of duration of two songs
    total_song_duration_sum = rideDuration - 30
    # intilising variable to store all pairs
    results = [-1,-1]
    all_results=[]
    # finding index
    for i in range(len(songDurations) - 1):
        for j in range(i + 1, len(songDurations)):
            if total_song_duration_sum == (songDurations[i] + songDurations[j]):
                    result=[i,j]
                    all_results.append([i,j])

    if (len(all_results) == 0):
        return [-1, -1]
    elif (len(all_results) == 1):
        return all_results[0]
    # else:
    #     return all_results
    max_index=0
    if(songDurations[all_results[0][0]]>songDurations[all_results[0][1]]):
        current_max=songDurations[all_results[0][0]]
    else:
        current_max=songDurations[all_results[0][1]]
    #getting index of pair with having largest play duration song
    for i in range(len(all_results)):
        if(songDurations[all_results[i][0]]>current_max):
            max_index=i
        elif  (songDurations[all_results[i][1]]>current_max):
            max_index=i
    return all_results[max_index]


rideDuration = 90
songDurations = [1, 10, 25, 35, 60]
print(songs_pair_index(songDurations, rideDuration))

rideDuration = 90
songDurations = [1, 10, 25, 35, 60, 50]
print(songs_pair_index(songDurations, rideDuration))

rideDuration = 90
songDurations = [1, 10, 25, 35, 60, 50, 59]
print(songs_pair_index(songDurations, rideDuration))

rideDuration = 92
songDurations = [1, 10, 25, 35, 60]
print(songs_pair_index(songDurations, rideDuration))

