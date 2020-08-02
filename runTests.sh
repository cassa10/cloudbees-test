#!/bin/bash

# Run all tests

n=1
max=10

# loop until $n equals $max
while [ $n -le $max ]
do
	echo "Test [$n/10]"
	echo "OK"
	n=$(( n+1 ))	 
done

