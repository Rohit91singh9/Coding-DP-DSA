/* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, I would love to hear
    from you on the Mail ID I have Provided. if you've cracked the Interview.

    beingactual@gmail.com

    */

public static int demolitionRobot(int[][]grid) {

//Write your code

int n = grid.length;
int m = grid[0].length;

Queue<int[]> q = new LinkedList<>();
boolean[][] visited = new boolean [n][m];

int minD = Integer.MAX_VALUE;

int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1, 0}};

q.add(new int []{0,0});
visited[0][0] =true;
while(!q.isEmpty())
{
    int[] cur = q.remove();
    for(int[] d : directions)
    {
        int nX = cur[0]+d[0];
        int nY = cur[1]+d[1];
        
        if(nX<0|| nY<0 || nX>=n || nY>=m || grid[nX][nY]==0)
            continue;
        
        if(grid[nX][nY]==9)
            minD = Math.min(minD, grid[cur[0]][cur[1]]);
        
        if(grid[nX][nY]==1 && !visited[nX][nY])
        {
            grid[nX][nY]=  grid[cur[0]][cur[1]]+1;
            visited[nX][nY]= true;
            q.add(new int[]{nX, nY});
        }
    }
}

return minD;

}



/*
============================================================
2nd Approach
============================================================
#include<vector>
#include<queue>
#include<utility>
#include<iostream>
using namespace std;

vector<pair<int,int >> dir = {{-1,0},{0,1},{1,0},{0,-1}};

void input(vector<vector<int> > &lot, int row, int col) {
	for (int i = 0; i < row ;i++) {
		for (int j = 0 ; j < col ; j++) {
			int x;
			cin >> x;

			lot[i][j] = x;
		}
	}
}

int bfs(vector<vector<int> > &lot,int row, int col) {
	queue<pair<pair<int,int>, int>  > q;
	q.push({{0,0},0});

	int min_dis = -1;

	while (!q.empty()) {
		int x = q.front().first.first;
		int y = q.front().first.second;
		int dis = q.front().second;

		q.pop();

		if (lot[x][y] == 9) {
			min_dis = dis;
			break;
		}

		lot[x][y] = -1;

		for (auto d : dir) {
			int x_coord = x + d.first;
			int y_coord = y + d.second;

			if (x_coord < 0 || x_coord >= row || y_coord < 0 || y_coord >= col || lot[x_coord][y_coord] == 0 || lot[x_coord][y_coord] == -1) continue;

			q.push({{x_coord,y_coord},dis+1});

		}
	}

	return min_dis;
} 


int main() {
	int row,col;
	cin >> row >> col;

	vector<vector<int> > lot(row,vector<int> (col,0));
	input(lot,row,col);

	cout << bfs(lot,row,col);
}

*/

/* 
==========================================================
Python Code
==========================================================
from collections import deque
from typing import List

def move_obstacle(lot: List[List[int]]) -> int:
    num_rows = len(lot)
    num_cols = len(lot[0])

    def get_neighbors(coord):
        row, col = coord
        for dx, dy in [(-1, 0), (0, -1), (1, 0), (0, 1)]:
            r = row + dx
            c = col + dy
            if 0 <= r < num_rows and 0 <= c < num_cols:
                yield (r, c)

    def bfs(start):
        queue = deque([start])
        r, c = start
        lot[r][c] = 0
        dist = 0
        while len(queue) > 0:
            dist += 1
            n = len(queue)
            for _ in range(n):
                node = queue.popleft()
                for r, c in get_neighbors(node):
                    if lot[r][c] == 9:
                        return dist
                    if lot[r][c] == 0:
                        continue
                    queue.append((r, c))
                    lot[r][c] = 0

    return bfs((0, 0))

if __name__ == '__main__':
    lot = [[int(x) for x in input().split()] for _ in range(int(input()))]
    res = move_obstacle(lot)
    print(res)

/*