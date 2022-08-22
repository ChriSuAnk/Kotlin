package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /*
        En el onCreate se llamaran y ejeutaran todas las funciones
        que creemon
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //leccion 1
        variablesYConstantes()//llamar a la clase que creamos
        //lecion 2
        tiposDeDatos()//llamar a la clase que creamos
        //leccion 3
        sentenciasIF_1de2()//llamar a la clase que creamos
        //leccion 4
        sentenciasIF_2de2()//llamar a la clase que creamos
    }
    //Aqui hablaremos de variables y constantes
    private fun variablesYConstantes(){
        //Variable
        /*
            hay dos formas de declarar variables, la primera es:
            -VAR
            que puede ser cambiado o modificado mas adelante segun el codigo,
            se puede cambiar el dato, mas no se le puede cambiar el tipo de dato
         */
        var numEntero:Int= 10 //Variable declarada como Entero
        var numDecimal:Double=10.0//Variable declarada como decimal
        var texto:String="Hola soy un texto"//Variable declarada como String="Cadena de texto"
        /*
            Tambien se puede reemplazar o llamar las mismas variables pero con otro nombre,
            no se puede cambiar el dato de la variable con otro tipo de dato.
         */
        var texto2=texto//Aqui estamos llamando a otra variable para que tenga el mismo dato
        //que otra variable con el mismo tipo de datos
        /*
        Lo que hace el println es imprimir en la consola lo que llamemos dentro del
        "()" osea numEntero que es 10, en la consola se debe imprimir lo que le asignemos
        a la variable que llamamos
        */
        println(numEntero)  //debe mostrar en la consola el numero 10 tal y como lo
        // asignamos en la linea 25

        println(numDecimal) //debe mostrar en la consola el decimal 10.0 tal y como
        //lo declaramos en la linea 26

        println(texto)      //debe mostrar en la consola el texto "Hola soy un texto" tal
        //y como la declaramos en la linea 27

        println(texto2)     //aca llamamos a la segunda variable que llamara a TEXTO
        //que tiene como dato "Hola soy un string"

        //Constantes
        /*
            Esta es la segunda forma de declarar una variable:
            -VAL
            , la diferencia es que luego
            de asignarle un valor, luego no se podra cambiar a menos que lo hagas desde la
            constante...
        */
        val intConstante:Int=20//declaramos una constante tipo entero con un dato 20
        val stringConstante:String="Constante String"//declaramos una constante de tipo String con dato "Constante String"
        val doubleConstante:Double=20.0//declaramos una constante de tipo Double,que tiene como dato 20.0

        println(intConstante)   //Tipo Int, Se mostrara en la consola como: 20

        println(stringConstante)//Tipo String, Se mostrara en la consola como "Constante String"

        println(doubleConstante)//Tipo Double, Se mostrara en la consola como 20.0
    }

    //Aqui hablaremos de los tipos de datos
    private fun tiposDeDatos(){
        //Estos serian los tipos de datos basicos

        //------------------------------String-Cadena de texto--------------------------
        val string:String="Tipo de datos String "
        val string2:String=",Tipo de datos String 2"
        /*
            Se pueden juntar contatenando ambas variables,Ejemplo:
         */
        val concatenarString:String=string+string//El resultado seria <-Tipo de datos String ,Tipo de datos String 2->

        //-------------------------------Numeros enteros(Byte,Short,Int,Long)--------------------
        /*
            la diferencia de estos tipos es el rango de numeros enteros que puede tener cada uno
            el int es el mas usado, el Long para una gran cantidad de numeros
            Byte: Rango del numero (127 y 128)
            Short: Rango del numero negativo al positivo (-32 768 y 32 767)
            Long:Si son numeros muy grandes 00000000000000000000000
         */
        val int:Int=100
        val int2:Int=100
        /*
            Concatenando estas dos variables seria el resultado de la suma de ambos numero
         */
        val concatenarInt:Int=int+int2//El resultado seria <-200-> que es la suma de ambos numeros

        //---------------------------------Numeros Decimales(Float,Double)--------------------
        /*
            Float:Rango de 32
            Double:Rango de 64
        */
        val double:Double=100.0
        val double2:Double=100.0
        /*
            Concatenando estas dos variables seria el resultado de la suma de ambos decimales, el resultado
            saldria como el tipo de datos que es Decimal(DOuble)
         */
        val concatenarDouble:Double=double+double2//El restulado seria <-200.0-> la suma de ambos decimales

        //--------------------------------Boolean------------------------------------
        /*
            Un tipo de dato Boolean solo puede tomar un dato TRUE o FALSE,Verdadero o falso
         */
        val boolean:Boolean=true
        val boolean2:Boolean=false

        /*
            Concatenando se debaterian el resulado si es verdadero o falso, seria como multiplicar
            numeros positivos y negativos
         */
        /*
            Para concatenar las variables Boolean, no se necesitas de suma,resta,division,multiplicacion,etc.
            para esto se requiere la logica

            == Igual

            && And, suma logica ambos datos deben ser TRUE para que salga como resultado true
                    de lo contrario si hay un false y un true, saldra FALSE
        */
        val concatenarBoolean:Boolean=boolean==boolean2//resultado saldra false porque no son iguales son true y el otro false
        val concetenarBoolean2:Boolean=boolean&&boolean2//saldra como resultado false, porque ambas deben ser true para que salga TRUE
    }

    //Aqui hablaremos de las condiciones IF, ELSE
    private fun sentenciasIF_1de2(){

        val texto:String="Hola"
        val numero:Int=100
        val boolean:Boolean=true
        /*
            Con las condiciones if se pueden manejar de manera mejorada los
            boolean(true,false) y los operadores logicos(==,&&,!=,>,<,>=,<=,etc)
         */

        //--------------Ejemplo 1 Con textos-------------
        if(texto=="Hola")//Si texto es igual a "Hola"
        {
            //imprime esto
            println("Si es igual")
        }
        else//de lo contrario
        {
            //imprima esto
            println("No es igual")
        }

        //--------------Ejemplo 2 con numeros----------
        if(numero<200)//Si numero es menor que 200
        {
            //imprima esto
            println("Si es menor")
        }
        else//De lo contrario
        {
            //imprima esto
            println("No es menor")
        }
        //-------------Ejemplo 3 con Boolean---------------
        if(boolean!=false)//si boolean es diferente que false
        {
            //imprima esto
            println("Es diferente")
        }
        else//de lo contrario
        {
            //imprima esto
            println("No es diferente")
        }
    }

    private fun sentenciasIF_2de2(){
        val numero1:Int=10
        val numero2:Int=20
        /*
            Operadores logicos, otros mas:
            && operador "y"
            || operador "o"
            ! operador "no"
            tambien haremos una sentencia mas dificil
        */
        //--------------Ejemplo 1------------------------
        if(numero1==10 && numero2==20)//Si numero 1 es igual a 10 -Y-(||) numero2 es igual a 20
        {
            //se imprime lo siguiente
            println("numero1 si es igual 10 y numero2 si es igual a 20")
        }
        else
        {
            //imprima
            println("numero1 no es igual a 10 y numero2 no es igual a 20")
        }
        //---------------Ejemplo 2-------------------------
        if(numero1>1 && numero1<100)//si numero1 es mayor que 1 y menor que 100
        {
            //se imprime lo siguiente
            println("Si es mayor a 1 y menor que 100")
        }
        else//de lo contrario
        {
            //se imprime
            println("$numero1 No es mayor que 1 y menor que 100")
        }
        //-----------------Ejemplo 1/3 Boolean--------------------------
        val boolean1:Boolean=true
        val boolean2:Boolean=false

        if(boolean1==boolean2)//si boolean1 es igual a boolean2
        {
            println("Son iguales")
        }
        else//de lo contrario
        {
            println("No son iguales")
        }
        //------------------Ejemplo 2/3 Boolean----------------------
        if(boolean1!=boolean2)//si boolean1 es diferente que boolean2
        {
            //imprime lo siguiente
            println("Son diferentes")
        }
        else//de lo contrario
        {
            //imprimira
            println("No son diferentes")
        }
        //-------------------Ejemplo 3/3 Boolean--------------------
        if(boolean1==boolean2||boolean1==boolean2)//si boolean1 es igual a boolean2 -O- boolean 1 es igual a boolean 2
        {
            //se imprimira
            println("Uno de los dos o los dos son iguales")
        }
        else//de lo contrario
        {
            //se imprimira
            println("Ninguno de los dos son iguales o uno no es igual")
        }
    }
}