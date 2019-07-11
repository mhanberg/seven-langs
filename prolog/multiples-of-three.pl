multiple(Num, Three, Num) :- Three = 3, (Num mod Three) =:= 0.
multiple(Num, Five, Num) :- Five = 5, (Num mod Five) =:= 0.
multiple(_, _, 0).

multiples(0, Acc, Acc).
multiples(Num, Acc, Result) :- 
  multiple(Num, (3; 5), Res),
  Sum is Res + Acc,
  multiples(Num - 1, Sum, Result).
