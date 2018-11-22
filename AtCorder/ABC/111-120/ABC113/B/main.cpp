#include <algorithm>
#include <cmath>
#include <iostream>
#include <iterator>
#include <vector>
using namespace std;

int main() {
    int n, t, a;
    cin >> n >> t >> a;
    vector<int> h(n), ans(n);
    for (int i = 0; i < n; i++) {
        cin >> h[i];
        ans[i] = abs(a * 1000 - (t * 1000 - h[i] * 6));
    }
    int min = ans[0];
    int minIndex = 0;
    for (int i = 1; i < n; i++) {
        if (ans[i] < min) {
            min = ans[i];
            minIndex = i;
        }
    }
    cout << minIndex + 1 << endl;
}
