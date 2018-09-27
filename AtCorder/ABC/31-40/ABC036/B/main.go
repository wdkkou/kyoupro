package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func nextInt() int {
	sc.Scan()
	x, _ := strconv.Atoi(sc.Text())
	return x
}

func nextLine() string {
	sc.Scan()
	return sc.Text()
}

func main() {
	sc.Split(bufio.ScanWords)
	n := nextInt()
	dot := make([][]string, n)
	for i := range dot {
		dot[i] = make([]string, n)
	}
	for i := range dot {
		str := nextLine()
		for j, v := range str {
			dot[i][j] = string(v)
		}
	}
	result := make([][]string, n)
	for i := range result {
		result[i] = make([]string, n)
	}
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			result[i][j] = dot[n-j-1][i]
		}
	}

	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			fmt.Print(result[i][j])
		}
		fmt.Println()
	}
}
