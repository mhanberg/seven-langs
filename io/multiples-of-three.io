sum := 0
for(
  i, 1, 999,
  (i % 3 == 0 or i % 5 == 0) ifTrue(sum := sum + i)
)

sum println
