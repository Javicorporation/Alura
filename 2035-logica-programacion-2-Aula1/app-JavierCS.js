function asignarTextoElemento(elemento, texto){
    let elementoHtml = document.querySelector(elemento);
    elementoHtml.textContent = texto; 
}

function intentoDeUsuario(){
    alert("clic desde del boton");
}

asignarTextoElemento('h1','Juego del numero secreto');
asignarTextoElemento('p','Escribe un número del 1 al 10');

function numeroSecreto(){
    return Math.floor(Math.random()*10)+1;
}
