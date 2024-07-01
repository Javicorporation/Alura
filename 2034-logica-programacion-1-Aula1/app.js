let numeroSecret = 6;

alert("¡Bienvenida y bienvenido a nuestro sitio web!");

/*
let numeroDeVentas = 50;
let saldoDisponible = 1000;
let mensajeError = "¡Error! Completa todos los campos";
alert(mensajeError);
nombre = prompt("cual es tú nombre")
edad = prompt("Cual es tu edad: ")
if(edad > 18){
    alert("¡Puedes obtener tu licencia de conducir!");
}else{
    alert("vete de aqui niño.")
}*/

let numeroDeUsuario = prompt("Escribe un número: ");
console.log(numeroDeUsuario);

if (numeroDeUsuario == numeroSecret) {
    console.log("lo encontraste");
}