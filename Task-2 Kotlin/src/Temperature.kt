//This Program converts the temperature from one unit to another : both units being distinct

fun KeltoCelsius(kel: Double) : Double
{
    val cel = kel-273.15
    return cel
}
fun CeltoKelvin(cel: Double) : Double
{
    val kelvin = cel+273.15
    return kelvin
}
fun FahtoCelsius(fah: Double) : Double
{
    var cel = fah-32
    cel = cel/9
    cel = cel*5
    return cel
}

fun CeltoFahrenheit(cel: Double) : Double
{
    var fah = cel/5
    fah = fah*9
    fah = fah + 32
    return fah
}

fun main()
{
    println("Input the temperature : ")
    var temp = readLine()!!.toDouble()
    println("Input the unit for temperature : ")
    println("K for Kelvin, C for deg Celsius and F for deg Fahrenheit")
    val unit = readLine()
    println("Enter K to convert to Kelvin,")
    println("F to convert to Fahrenheit and")
    println("Enter C to convert to Celsius")
    val conversion_unit = readLine()
    // For Kelvin
    if(unit == "K")
    {
        if(conversion_unit == "F")
        {
            temp = KeltoCelsius(temp)
            temp = CeltoFahrenheit(temp)
        }
        else //conversion_unit = C
        {
            temp = KeltoCelsius(temp)
        }
    }
    // For Fahrenheit
    if(unit == "F")
    {
        if(conversion_unit == "K")
        {
            temp = FahtoCelsius(temp)
            temp = CeltoKelvin(temp)
        }
        else //conversion_unit = C
        {
            temp = FahtoCelsius(temp)
        }
    }
    // For Celsius
    if(unit == "C")
    {
        if(conversion_unit == "F")
        {
            temp = CeltoFahrenheit(temp)
        }
        else //conversion_unit = K
        {
            temp = CeltoKelvin(temp)
        }
    }

    print("The temperature is ${temp} ${conversion_unit}")
}