def integracion(f: Double => Double, a: Double, b: Double): Double = {
     val xmid = (a + b) / 2
     val resultado = (b - a) * (f(a) + 4 * f(xmid) + f(b)) / 6

      resultado
   }

// funcion ejemplo:
def in1(x: Double) = - Math.pow(x,2) + 8*x - 12
integracion (in1,3,5)


def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
   Math.abs(valorEsperado - valorObtenido)
  }

val obtenido = integracion(in1,3,5)
calcularError(7.33, obtenido)


// f2
def f2(x: Double) = 3 * Math.pow(x,2)
integracion (f2,0,2)
val obtenido = integracion (f2,0,2)
calcularError(8, obtenido)

//f3
def f3(x: Double) = x + 2 * Math.pow(x,2) - Math.pow(x,3) + 5* Math.pow(x,4)
integracion (f3,-1,1)
val obtenido = integracion (f3,-1,1)
calcularError(3.333, obtenido)

//f4
def f4(x: Double) = (2*x + 1) / (Math.pow(x,2) + x)
integracion (f4,1,2)
val obtenido = integracion (f4,1,2)
calcularError(1.09861, obtenido)

//f5
def f5(x: Double) = Math.exp(x)
integracion (f5,0,1)
val obtenido = integracion (f5,0,1)
calcularError(1.71828, obtenido)

//f6
def f6(x: Double) = 1 / (math.pow(x - 1, 0.5))
// def f6(x: Double) = 1 / (scala.math.sqrt(x-1))
integracion (f6,2,3)
val obtenido = integracion (f6,2,3)
calcularError(0.828427, obtenido)

//f7
def f7(x: Double) = 1 / (1 + math.pow(x,2))
integracion (f7,0,1)
val obtenido = integracion (f7,0,1)
calcularError( 0.785398, obtenido)
