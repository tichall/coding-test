#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    int sort[1000];

    for (int i = 0; i < n; i++)
    {
        cin >> sort[i];
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int tmp = sort[i];
            if (sort[i] > sort[j])
            {
                sort[i] = sort[j];
                sort[j] = tmp;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << sort[i] << '\n';
    }
    return 0;
}