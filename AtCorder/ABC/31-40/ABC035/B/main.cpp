#include <cmath>
#include <iostream>
using namespace std;

int main() {
    string s;
    int t;
    cin >> s >> t;
    int x = 0;
    int y = 0;
    int cnt = 0;
    for (int i = 0; i < s.size(); i++) {
        char ch = s[i];
        if (ch == 'U') {
            y++;
        } else if (ch == 'D') {
            y--;
        } else if (ch == 'L') {
            x--;
        } else if (ch == 'R') {
            x++;
        } else if (ch == '?') {
            cnt++;
        }
    }
    int ans = 0;
    if (t == 1) {
        ans = abs(x) + abs(y) + cnt;
    } else {
        ans = abs(x) + abs(y) - cnt;
        if (ans < 0) {
            ans %= 2;
            ans = abs(ans);
        }
    }
    cout << ans << endl;
}
