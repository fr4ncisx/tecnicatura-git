//Ejercicio 2: Hora del día

let hora = 20;

if (hora >= 0 && hora < 6) {
    console.log("Es de madrugada");
} else if (hora >= 6 && hora < 12) {
    console.log("Es de mañana");
} else if (hora >= 12 && hora < 18) {
    console.log("Es de tarde");
} else if (hora >= 18 && hora <= 23) {
    console.log("Es de noche");
} else {
    console.log("La hora es incorrecta");
}