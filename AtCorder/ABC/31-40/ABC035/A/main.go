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
func main() {
	sc.Split(bufio.ScanWords)
	var w, h int
	w = nextInt()
	h = nextInt()
	x := w / 4
	if h/x == 3 {
		fmt.Println("4:3")
		return
	}
	fmt.Println("16:9")
}
