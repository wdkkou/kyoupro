package main

import "fmt"

func main() {
	var x1, y1, x2, y2 int
	fmt.Scan(&x1, &y1, &x2, &y2)
	var xdist int
	var ydist int
	xdist = x2 - x1
	ydist = y2 - y1
	fmt.Printf("%d %d %d %d\n", x2-ydist, y2+xdist, x1-ydist, y1+xdist)
}
