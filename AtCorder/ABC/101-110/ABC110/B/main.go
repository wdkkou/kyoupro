package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func nextInt() int {
	sc.Scan()
	x, _ := strconv.Atoi(sc.Text())
	return x
}

func isWar(x, y []int, xLarge, yLarge int) bool {
	sort.Sort(sort.IntSlice(x))
	sort.Sort(sort.IntSlice(y))
	for z := xLarge + 1; z <= yLarge; z++ {
		if x[len(x)-1] < z && z <= y[0] {
			return false
		}
	}
	return true
}

func main() {
	sc.Split(bufio.ScanWords)
	var n, m, xLarge, yLarge int
	n = nextInt()
	m = nextInt()
	xLarge = nextInt()
	yLarge = nextInt()

	x := make([]int, n)
	y := make([]int, m)
	for i := range x {
		x[i] = nextInt()
	}

	for i := range y {
		y[i] = nextInt()
	}
	var war bool
	war = isWar(x, y, xLarge, yLarge)
	if !war {
		fmt.Println("No War")
		return
	}
	fmt.Println("War")
}
