package main

import (
	"bufio"
	"fmt"
	"os"
)

var sc = bufio.NewScanner(os.Stdin)

func main() {
	var n int
	fmt.Scan(&n)
	used := map[string]bool{}
	ws := make([]string, n)
	answer := true
	for i := 0; i < n; i++ {
		sc.Scan()
		ws[i] = sc.Text()
	}

	for i := 0; i+1 < n; i++ {
		if string(ws[i][len(ws[i])-1]) != string(ws[i+1][0]) {
			answer = false
			break
		}
	}

	for _, w := range ws {
		if used[w] {
			answer = false
		}
		used[w] = true
	}

	if !answer {
		fmt.Println("No")
		return
	}
	fmt.Println("Yes")
}
