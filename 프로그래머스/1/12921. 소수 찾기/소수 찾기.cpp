#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    vector<bool> sieve(n + 1, true);  
    sieve[0] = sieve[1] = false;

    for (int i = 2; i * i <= n; ++i) {
        if (sieve[i]) {
            for (int j = i * i; j <= n; j += i) {
                sieve[j] = false;
            }
        }
    }
    
    int answer = 0;
    for (int i = 2; i <= n; ++i) {
        if (sieve[i]) {
            ++answer;
        }
    }

    return answer;
}
