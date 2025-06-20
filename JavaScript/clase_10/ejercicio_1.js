//Ejercicio 1: Calcular estación del año
let mes = "abril";

if (mes === "diciembre" || mes === "enero" || mes === "febrero") {
    console.log("Estamos en verano");
} else if (mes === "marzo" || mes === "abril" || mes === "mayo") {
    console.log("Estamos en otoño");
} else if (mes === "junio" || mes === "julio" || mes === "agosto") {
    console.log("Estamos en invierno");
} else if (mes === "septiembre" || mes === "octubre" || mes === "noviembre") {
    console.log("Estamos en primavera");
} else {
    console.log("Mes incorrecto");
}