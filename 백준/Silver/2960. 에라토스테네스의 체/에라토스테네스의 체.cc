#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

	int N, K, tmp;
	int erase[1000] = { 0 };
	cin >> N >> K;

	int num = 0;
	for (int i = 2; i <= N; i++)
		for (int j = i; j <= N; j = j + i)
		{

			tmp = 0;
			for (int x = 0; erase[x] != 0; x++)
			{
				if (erase[x] == j)
					tmp++; 
			}
			if (tmp == 0)
				erase[num++] = j;
		}
	cout << erase[K - 1] << endl; 

	return 0;
}