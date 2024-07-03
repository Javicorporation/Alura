let numeroSecret = Math.floor(Math.random()*100);
let numeroDeUsuario = 0;
let intentos = 1;
let palabraVes = " vez"
let maximoIntento = 3;

alert("¡Bienvenida y bienvenido a nuestro sitio web! "+numeroSecret);

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
}
*/

while(numeroDeUsuario != numeroSecret ){
    numeroDeUsuario = prompt("Escribe un número: ");
    console.log(numeroDeUsuario);

    if (numeroDeUsuario == numeroSecret) {
        alert(`Acertaste el numero es: ${numeroDeUsuario}, el numero de intentos fue ${intentos} ${intentos == 1 ? " vez" : " veces"}`);
    }else{
        if(numeroDeUsuario < numeroSecret){
            alert("el numero secreto es mayor")
        }else{
            alert("el numero secreto es menor")
        }
        intentos++;
        if(intentos > maximoIntento){
            alert("este fue el numero maximo de intentos "+maximoIntento)
            break;
        }
    }
}

/*

console.log("Bienvenido");
let nombre = "javier";
console.log(nombre);
alert("Tu nombre es "+nombre);

let leng = prompt("¿Cuál es el lenguaje de programación que más te gusta?");
console.log(leng);

let val1 = 9;
let val2 = 2;
let resultado = val1+val2;
console.log("la suma es: "+resultado);

let edad = prompt("Escribe tu edad: ");
if( edad >= 18){
    alert("es mayor de edad");

}else{
    alert("no es mayor de edad");
}
    */
