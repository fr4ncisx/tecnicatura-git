// Hacer un ejercicio similar al que esta hecho, pero ahora con los meses del año
// debes hacerlo con la estructura switch y luego con la función en la opción mejorada

function getMonthSwitch(num) {
  switch (num) {
    case 1:
      return "Enero";
    case 2:
      return "Febrero";
    case 3:
      return "Marzo";
    case 4:
      return "Abril";
    case 5:
      return "Mayo";
    case 6:
      return "Junio";
    case 7:
      return "Julio";
    case 8:
      return "Agosto";
    case 9:
      return "Septiembre";
    case 10:
      return "Octubre";
    case 11:
      return "Noviembre";
    case 12:
      return "Diciembre";
    default:
      return "Número fuera de rango";
  }
}
console.log("funcion switch");
console.log(getMonthSwitch(5));

function getMonth(num) {
  const months = [
    "Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre",
  ];

  if (num < 1 || num > 12) {
    return "Número fuera de rango";
  }

  return months[num - 1];
}

console.log("función for-i");
console.log(getMonth(8));
