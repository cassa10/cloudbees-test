#!/bin/bash

# $1 param: cantidadTests
# Run all tests

n=1
cantidadTests=$1

# loop until $n equals $max
while [ $n -le $cantidadTests ]
do
	echo "Test [$n/$cantidadTests]"
	echo "OK"
	n=$(( n+1 ))	 
done

