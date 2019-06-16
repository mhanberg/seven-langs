fib := method(sum, first, second,
  third := first + second

  newSum := if(third % 2 == 0, sum + third, sum)

  if(newSum < 4000000, fib(newSum, second, third), newSum)
)

fib(2, 1, 2) println
