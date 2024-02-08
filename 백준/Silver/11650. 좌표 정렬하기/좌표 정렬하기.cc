#include <iostream>
#include <utility>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, x, y;
    cin >> n;
    vector<pair<int, int>> vec;

    for (int i=0; i<n; i++) {
        cin >> x >> y;
        vec.push_back(make_pair(x,y));
    }

    sort(vec.begin(), vec.end());
    for (int i=0; i<n; i++) {
        cout << vec[i].first << " " << vec[i].second << "\n";
    }

    return 0;
}