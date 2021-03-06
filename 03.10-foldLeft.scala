
def foldLeft[A,B](as: List[A], z: B)(f: (B, A) => B) : B = as match {
  case Nil => z
  case x::xs => foldLeft(xs, f(z,x))(f)
}

assert(foldLeft(List(1,2,3,4), 0)(_ + _), 10)
assert(foldLeft(List(1,2,3,4), 1)(_ * _), 24)

def assert(a: Any, b: Any) {
  if (a == b)
    println(s"assertion successful - $a equals $b")
  else
    println(s"assertion failed - expected $a to equal $b")
}