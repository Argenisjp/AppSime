   function validar(){

    var exp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
    tel = /^\d{10}$/,
    contra = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/,
    nombre = document.getElementById('nombre').value,
    apellidos = document.getElementById('apellidos').value,
    contraseña = document.getElementById('contraseña').value,
    correo = document.getElementById('correo').value,
    telefono = document.getElementById('telefono').value,
    direccion = document.getElementById('direccion').value,
    ciudad = document.getElementById('ciudad').value,
    checkbox = document.getElementById("terminos");


    if (nombre == 0 ){
      Swal.fire({
        icon: 'warning',
        text: 'El campo nombre esta vacio',
        position: 'top',
        toast: true,
        timer: 5000,
        allowQutsidClick: false,
        customClass:{
          content: 'content-class',
        },

      });
      nombre.value ="";
      nombre.focus();
      return false;

    } else if(nombre.length>30){
     Swal.fire({
      icon: 'warning',
      text: 'El campo nombre es muy largo minimo 30 caracteres',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
     document.getElementById("nombre").value="";
     nombre.focus();
     return false;


   }
   else if (apellidos == 0 ){
     Swal.fire({
      icon: 'warning',
      text: 'El campo apellido esta vacio',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
     apellidos.value="";
     apellidos.focus();
     return false;

   }else if (apellidos.length > 20 ){
     Swal.fire({
      icon: 'warning',
      text: 'Apellido muy largo minimo 30 caracteres como minimo',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
     document.getElementById("apellidos").value="";
     apellidos.focus();
     return false;

   }else if (correo === "") {
    Swal.fire({
      icon: 'warning',
      text: 'El campo correo esta vacio',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
    correo.value="";
    correo.focus();
    return false;


  }

  else if (!exp.test(correo)){
   Swal.fire({
    icon: 'warning',
    text: 'El correo ingresado no es valido, ingrese un correo valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("correo").value="";
   correo.focus();
   return false;


 }else if (contraseña == "" ){
  Swal.fire({
    icon: 'warning',
    text: 'El campo contraseña esta vacio',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
  contraseña.value ="";
  contraseña.focus();
  return false;



}else if (!contra.test(contraseña)){
  Swal.fire({
    icon: 'warning',
    title: 'Contraseña invalidad',
    text: 'La contraseña debe tener  8 y 20 caracteres, al menos un número, una minúscula y  mayúscula. \n EJEMPLO: Geniio12345 ',
    position: 'top',
    toast: true,
    timer: 20000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
      title: 'title-class',
    },
  });
  document.getElementById("contraseña").value="";
  contraseña.focus();
  return false;

}else if (telefono ==""){
 Swal.fire({
  icon: 'warning',
  text: 'El campo teléfono esta vacio',
  position: 'top',
  toast: true,
  timer: 5000,
  allowQutsidClick: false,
  customClass:{
    content: 'content-class',
  },

});
 telefono.value ="";
 telefono.focus();
 return false;


}else if (!tel.test(telefono)){
 Swal.fire({
  icon: 'warning',
  text: 'Ingrese un numero de teléfono valido',
  position: 'top',
  toast: true,
  timer: 5000,
  allowQutsidClick: false,
  customClass:{
    content: 'content-class',
  },

});
 document.getElementById("telefono").value="";
 telefono.focus();
 return false;




} else if (ciudad == 0 ){
 Swal.fire({
  icon: 'warning',
  text: 'El campo ciudad esta vacio',
  position: 'top',
  toast: true,
  timer: 5000,
  allowQutsidClick: false,
  customClass:{
    content: 'content-class',
  },

});
 ciudad.value ="";
 ciudad.focus();
 return false;

}



else if (direccion == 0 ){
 Swal.fire({
  icon: 'warning',
  text: 'El campo dirección esta vacio',
  position: 'top',
  toast: true,
  timer: 5000,
  allowQutsidClick: false,
  customClass:{
    content: 'content-class',
  },

});
 direccion.value ="";
 direccion.focus();
 return false;



}else if( !checkbox.checked ){
  Swal.fire({
    icon: 'warning',
    text: 'Tiene que aceptar los terminos y condiciones',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
     // checkbox.focus();
     return false;
   }






   
 }



 //------------------------------------ VALIDACION DEL LOGIN PARA EL IGRESO DEL SISTEMA EN LA PAGINA PRINCIPAL---------------------------------------------------

 function validar_login() {
   // body...
   // expresion para validar la contraseña
   // var contra = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/; 
   var usuario = document.getElementById("usuario").value;
   var contraseña_login = document.getElementById("contraseña_login").value;

   if (usuario === "" || contraseña_login === "") {
     Swal.fire({
      icon: 'warning',
      text: 'Todos los campos son obligatorios',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
     document.getElementById("usuario").focus();
     return false;

   }  

   else if (usuario.length>30) {
     Swal.fire({
      icon: 'warning',
      text: 'Nombre de usuario muy largo maximo 30 caracteres',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
     document.getElementById("usuario").focus();
     document.getElementById("usuario").value="";
     return false;



   }else if (contraseña_login.length>16) {
    Swal.fire({
      icon: 'warning',
      text: 'Contraseña muy larga maximo 16 caracteres',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
    document.getElementById("contraseña_login").focus();
    document.getElementById("contraseña_login").value="";
    return false;


  }



}


 // ---------------------------------------------VALIDACION DEL FORMULARIO DE CONTACTO EN LA PAGINA PRINCIPAL----------------------------------------------
 function validar_cont(){

  var exp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;  

  var nombre_cont = document.getElementById("nombre_cont").value;
  var correo_cont = document.getElementById("correo_cont").value;
  var mensaje = document.getElementById("mensaje").value;

  if (nombre_cont === "" || correo_cont === "" || mensaje === "") {
   Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("usuario").focus();
   return false;

 } 

 else if (nombre_cont.length>30) {
   Swal.fire({
    icon: 'warning',
    text: 'El nombre es muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("nombre_cont").focus();
   document.getElementById("nombre_cont").value="";
   return false;



 }     else if (!exp.test(correo_cont)) {
   Swal.fire({
    icon: 'warning',
    text: 'El correo ingresado no es valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("correo_cont").focus();
   document.getElementById("correo_cont").value="";
   return false;



 }


 else if (mensaje.length>100) {
   Swal.fire({
    icon: 'warning',
    text: 'El mensaje es muy extenso maximo 100 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("mensaje").focus();
   document.getElementById("mensaje").value="";
   return false;

 }

 return true;
}

//----------------------------- VALIDACION DEL FORMULARIO PARA REGISTRAR UN NUEVO CLIENTE EN EL MODULO DE VENTAS-------------------------------------------

function validarcliente(){
  // body...
  var exp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  var telClien = /^\d{10}$/;
  var contra = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
  var nombre_Clien = document.getElementById('nombreclien').value;
  var apellidos_Clien = document.getElementById('apellidoclien').value;
  var correo_Clien = document.getElementById('correoclien').value;
  var contraseña_Clien = document.getElementById('contraseñaclien').value;
  var telefono_Clien = document.getElementById('telefonoclien').value;
  var direccion_Clien = document.getElementById('direccionclien').value;

  if (nombre_Clien === "" || apellidos_Clien === "" || correo_Clien === "" || contraseña_Clien === "" || telefono_Clien === "" || direccion_Clien ==="") {
    Swal.fire({
      icon: 'warning',
      text: 'Todos los campos son obligatorios',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
    return false;
  }

  else if (nombre_Clien.length>30) {
   Swal.fire({
    icon: 'warning',
    text: 'El nombre es muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("nombreclien").focus();
   document.getElementById("nombreclien").value="";
   return false;



 }

 else if (apellidos_Clien.length>30) {
   Swal.fire({
    icon: 'warning',
    text: 'Apellidos  muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("apellidoclien").focus();
   document.getElementById("apellidoclien").value="";
   return false;

 }

 else if (!exp.test(correo_Clien)) {
   Swal.fire({
    icon: 'warning',
    text: 'El correo ingresado no es valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("correoclien").focus();
   document.getElementById("correoclien").value="";
   return false;



 }

 else if (!contra.test(contraseña_Clien)) {
   Swal.fire({
    icon: 'warning',
    title: 'Contraseña invalidad',
    text: 'La contraseña debe tener entre 8 y 16 caracteres, al menos un número, una minúscula y  mayúscula. \n EJEMPLO: Geniio12345',
    position: 'top',
    toast: true,
    timer: 20000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
      title: 'title-class',
    },

  });
   document.getElementById("contraseñaclien").focus();
   document.getElementById("contraseñaclien").value="";
   return false;



 }

 else if (!telClien.test(telefono_Clien)) {
   Swal.fire({
    icon: 'warning',
    text: 'Ingrese un numero de teléfono valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("telefonoclien").focus();
   document.getElementById("telefonoclien").value="";
   return false;



 }



}

//----------------------------------------- VALIDACION DEL FORMULARIO PARA REGISTRAR UN NUEVO EMPLEADO EN EL MODULO DE VENTAS------------------------------------------

function validaremp(){
  // body...
  var exp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  var telClien = /^\d{10}$/;
  var contra = /^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
  var nombre_Emp = document.getElementById('nombre_emp').value;
  var apellidos_Emp = document.getElementById('apellidos_emp').value;
  var correo_Emp = document.getElementById('correo_emp').value;
  var contraseña_Emp = document.getElementById('contraseña_emp').value;
  var telefono_Emp = document.getElementById('telefono_emp').value;
  var direccion_Emp = document.getElementById('direccion_emp').value;

  if (nombre_Emp === "" || apellidos_Emp === "" || correo_Emp === "" || contraseña_Emp === "" || telefono_Emp === "" || direccion_Emp ==="") {
    Swal.fire({
      icon: 'warning',
      text: 'Todos los campos son obligatorios',
      position: 'top',
      toast: true,
      timer: 5000,
      allowQutsidClick: false,
      customClass:{
        content: 'content-class',
      },

    });
    return false;
  }

  else if (nombre_Emp.length>30) {
   Swal.fire({
    icon: 'warning',
    text: 'El nombre es muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("nombre_emp").focus();
   document.getElementById("nombre_emp").value="";
   return false;



 }

 else if (apellidos_Emp.length>30) {
   Swal.fire({
    icon: 'warning',
    text: 'Apellidos  muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("apellidos_emp").focus();
   document.getElementById("apellidos_emp").value="";
   return false;

 }

 else if (!exp.test(correo_Emp)) {
   Swal.fire({
    icon: 'warning',
    text: 'El correo ingresado no es valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("correo_emp").focus();
   document.getElementById("correo_emp").value="";
   return false;



 }

 else if (!contra.test(contraseña_Emp)) {
   Swal.fire({
    icon: 'warning',
    title: 'Contraseña invalidad',
    text: 'La contraseña debe tener entre 8 y 16 caracteres, al menos un número, una minúscula y  mayúscula. \n EJEMPLO: Geniio12345',
    position: 'top',
    toast: true,
    timer: 20000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
      title: 'title-class',
    },

  });
   document.getElementById("contraseña_emp").focus();
   document.getElementById("contraseña_emp").value="";
   return false;



 }

 else if (!telClien.test(telefono_Emp)) {
   Swal.fire({
    icon: 'warning',
    text: 'Ingrese un numero de teléfono valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById("telefono_emp").focus();
   document.getElementById("telefono_emp").value="";
   return false;



 }



}

// --------------------------------VALIDACION DEL FORMULARIO DE NUEVO PRODUCTO DEL INVENTARIO EN EL MODULO DE VENTAS ------------------------------------------
function validar_inv(){
  // body...
  var exp_fecha = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
  var nombre_Prod = document.getElementById('nombre_prod').value;
  var cantidad_Prod = document.getElementById('cantidad_prod').value;
  var fecha_ingreso = document.getElementById('fecha_ingreso').value;
  var fecha_salidad = document.getElementById('fecha_salidad').value;
  var precio_Prod = document.getElementById('precio_uni').value;


  if (nombre_Prod === "" || cantidad_Prod === "" || fecha_ingreso === "" || fecha_salidad === "" || precio_Prod === "" ) {

   Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   return false;

 }


 else if (nombre_Prod.length>20) {
   Swal.fire({
    icon: 'warning',
    text: 'Nombre del producto es muy largo maximo 20 caracteres ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('nombre_prod').focus();
   document.getElementById('nombre_prod').value="";
   return false;
 }

 else if (isNaN(cantidad_Prod)) {
   Swal.fire({
    icon: 'warning',
    text: 'Ingrese una cantidad validad ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('cantidad_prod').focus();
   document.getElementById('cantidad_prod').value="";
   return false;
 }

 // else if (!exp_fecha.test(fecha_ingreso)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('fecha_ingreso').focus();
 //   document.getElementById('fecha_ingreso').value="";
 //   return false;
 // }


 // else if (!exp_fecha.test(fecha_salidad)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('fecha_salidad').focus();
 //   document.getElementById('fecha_salidad').value="";
 //   return false;
 // }


 else if (isNaN(precio_Prod)) {
   Swal.fire({
    icon: 'warning',
    text: 'Precio unitario invalido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('precio_uni').focus();
   document.getElementById('precio_uni').value="";
   return false;
 }



}

//------------------------------------------ VALIDACION DEL FORMULARIO DE NUEVO REGISTRO DE VENTA EN EL MODULO DE VENTAS --------------------------------------
function validar_ven(){

  var tipo_ven = document.getElementById('tipo_ven').value;
  var cantida_ven = document.getElementById('cantida_ven').value;
  var valor_ven = document.getElementById('valor_ven').value;
  var descriccion = document.getElementById('descriccion').value;

  if (tipo_ven === "" || cantida_ven === "" || valor_ven === "" || descriccion === "") {

   Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   return false;
 }


else if (tipo_ven.length>20) {
   Swal.fire({
    icon: 'warning',
    text: 'Nombre del tipo de venta es muy largo maximo 20 caracteres ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('tipo_ven').focus();
   document.getElementById('tipo_ven').value="";
   return false;

}

else if (isNaN(cantida_ven)) {
   Swal.fire({
    icon: 'warning',
    text: 'Cantidada de venta invalidad',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('cantida_ven').focus();
   document.getElementById('cantida_ven').value="";
   return false;

}

else if (isNaN(valor_ven)) {
   Swal.fire({
    icon: 'warning',
    text: 'Valor de la venta invalido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('valor_ven').focus();
   document.getElementById('valor_ven').value="";
   return false;

}

else if (descriccion.length>50) {
   Swal.fire({
    icon: 'warning',
    text: 'Descricción muy largo maximo 50 caracteres ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('descriccion').focus();
   document.getElementById('descriccion').value="";
   return false;

}



}

// -------------------------------VALIDACION DEL FORMULARIO DE NUEVA PRODUCCION DEL MODULO PRODUCCION-------------------------------
function validar_produc(){
  var exp_fecha = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
  var modelo_prod = document.getElementById('modelo_prod').value;
  var cantidad_prod = document.getElementById('cantidad_prod').value;
  var ingreso_prod = document.getElementById('ingreso_prod').value;
  var salida_prod = document.getElementById('salida_prod').value;

  if (modelo_prod === "" || cantidad_prod === "" || ingreso_prod === "" || salida_prod === "") {
       Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   return false;
  }

  else if (modelo_prod.length>20) {
     Swal.fire({
    icon: 'warning',
    text: 'Nombre del modelo de producción es muy largo maximo 20 caracteres ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('modelo_prod').focus();
   document.getElementById('modelo_prod').value="";
   return false;
  }


else if (isNaN(cantidad_prod)) {
   Swal.fire({
    icon: 'warning',
    text: 'Ingrese una valoración validad',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('cantidad_prod').focus();
   document.getElementById('cantidad_prod').value="";
   return false;

}


 // else if (!exp_fecha.test(ingreso_prod)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('ingreso_prod').focus();
 //   document.getElementById('ingreso_prod').value="";
 //   return false;
 // }

 // else if (!exp_fecha.test(salida_prod)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('salida_prod').focus();
 //   document.getElementById('salida_prod').value="";
 //   return false;
 // }



}



// -------------------------------VALIDACION DEL FORMULARIO DE NUEVA MATERIA PRIMA DEL MODULO PRODUCCION-------------------------------
function validar_materiap(){
  var exp_fecha = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
  var tipo_mp = document.getElementById('tipo_mp').value;
  var cantidad_mp = document.getElementById('cantidad_mp').value;
  var entrada_mp = document.getElementById('entrada_mp').value;
  var salida_mp = document.getElementById('salida_mp').value;

  if (tipo_mp === "" || cantidad_mp === "" || entrada_mp === "" || salida_mp === "") {
       Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   return false;
  }

  else if (tipo_mp.length>20) {
     Swal.fire({
    icon: 'warning',
    text: 'Nombre del tipo de materia prima es muy largo maximo 20 caracteres ',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('tipo_mp').focus();
   document.getElementById('tipo_mp').value="";
   return false;
  }


else if (isNaN(cantidad_mp)) {
   Swal.fire({
    icon: 'warning',
    text: 'Cantidad de materia prima no validad',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('cantidad_mp').focus();
   document.getElementById('cantidad_mp').value="";
   return false;

}


 // else if (!exp_fecha.test(entrada_mp)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('entrada_mp').focus();
 //   document.getElementById('entrada_mp').value="";
 //   return false;
 // }

 // else if (!exp_fecha.test(salida_mp)) {
 //   Swal.fire({
 //    icon: 'warning',
 //    text: 'Fecha no validad',
 //    position: 'top',
 //    toast: true,
 //    timer: 5000,
 //    allowQutsidClick: false,
 //    customClass:{
 //      content: 'content-class',
 //    },

 //  });
 //   document.getElementById('salida_mp').focus();
 //   document.getElementById('salida_mp').value="";
 //   return false;
 // }



}


// -------------------------------VALIDACION DEL FORMULARIO PARA UN NUEVO PROVEEDOR DEL MODULO PRODUCCION-------------------------------
function validar_provee(){
  // body...
  var exp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  var tel = /^\d{10}$/;
  var nombre_provee = document.getElementById('nombre_provee').value;
  var apellido_provee = document.getElementById('apellido_provee').value;
  var correo_provee = document.getElementById('correo_provee').value;
  var tel_provee = document.getElementById('tel_provee').value;
  var direccion_provee = document.getElementById('direccion_provee').value;

  if (nombre_provee ==="" || apellido_provee ==="" || correo_provee ==="" || tel_provee ==="" || direccion_provee ==="") {
        Swal.fire({
    icon: 'warning',
    text: 'Todos los campos son obligatorios',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   return false;
  }

  else if (nombre_provee.length>30) {
        Swal.fire({
    icon: 'warning',
    text: 'Nombre del proveedor es muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('nombre_provee').focus();
   document.getElementById('nombre_provee').value="";
   return false;
  }


  else if (apellido_provee.length>30) {
        Swal.fire({
    icon: 'warning',
    text: 'Apellidos  muy largo maximo 30 caracteres',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('apellido_provee').focus();
   document.getElementById('apellido_provee').value="";
   return false;
  }

  else if (!exp.test(correo_provee)) {
        Swal.fire({
    icon: 'warning',
    text: 'El correo ingresado no es valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('correo_provee').focus();
   document.getElementById('correo_provee').value="";
   return false;
  }


    else if (!tel.test(tel_provee)) {
        Swal.fire({
    icon: 'warning',
    text: 'El telefono ingresado no es valido',
    position: 'top',
    toast: true,
    timer: 5000,
    allowQutsidClick: false,
    customClass:{
      content: 'content-class',
    },

  });
   document.getElementById('tel_provee').focus();
   document.getElementById('tel_provee').value="";
   return false;
  }


}

window.sr = ScrollReveal();

              sr.reveal('.navbar', {
                duration: 2000,
                origin: 'right'
              });

              sr.reveal('.carusel', {
                duration: 2000,
                origin: 'left',
                distance: '300px'
              });

              sr.reveal('.produc', {
                duration: 2000,
                origin: 'right',
                distance: '300px'
              });
