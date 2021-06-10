qmp6 pseudocodigo 


//Aclaraciones
//No comprendí mucho el enunciado así que traté de diseñar algún pseudocódigo, pregunto las dudas en clase


class Usuario{

String mail 
List<Notificaciones> notificaciones (tienen que tener un campo de si estan activas o no) 

}


class Vestidor{

Atuendo sugerenciaDiaria = this.sugerenciaDiaria(); 


Atuendo sugerenciaDiaria(){

//algun timer para que se realice una vez por dia? ?
calzado = seleccionarPrenda(calzados); 
superior = seleccionarPrenda(superior); 
inferior = seleccionarPrenda(inferior); 

crear atuendo(superior, inferior, calzado); 
return atuendo; 
}

actualizarSugerencia(Alerta){

Alerta.notificar(); 

}



}

//dispararSugerencias: debería no ser ningún metodo sino la manera
de activar ese método en todos los vestidores al mismo tiempo? 


class Clima{

Lista alertasActuales;  

void obtenerAlertas(){

apiAlertas = apiClima.getAlertas("Buenos Aires"); 
this.alertas =  alertas.get("CurrentAlerts"); 

}


}
 //considero que acutalizar alertas sería volver a llamar al metodo
obtener alertas, que actualizaria el atributo alertasActuales


interface Alerta{

notificar(); 

}

class tormenta implements Alerta{

notificar(){

notificacionService.notify("llevar paraguas!"); 

}


}

class granizo implements Alerta{

notificar(){

notificacionService.notify("evitar salir en auto"); 

}


}



class Notificador{

apiMail mailSender
String mensaje 

void enviarMail(Usuario){

mailSender.send(Usuario.mail, mensaje); 

}

}


class Empleado{


dispararCalculoSugerencias(){

paraTodos(vestidor -> vestidor.sugerenciaDiaria()); 

}



}