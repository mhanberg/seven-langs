prime := method(num, factor, if((num % factor == 0 and factor != 1), false, if(factor == 1, true, prime(num, factor - 1))))

for(i, 2, 600851475143 sqrt floor, if(600851475143 % i == 0 and prime(i, (i sqrt floor) + 1), i println))

"Done!" println
