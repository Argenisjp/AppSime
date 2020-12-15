

// --------------------------------ALERTA PARA ELIMINAR UN CLIENTE DEL MODULO VENTAS---------------------------------------------------------

function eliminar_cli() {
	// body...
		const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar',
  text: "¿Esta seguro que desea eliminar a este cliente?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Cliente eliminado',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Cliente no eliminado',
      'error',
    )
  }
})


}
// --------------------------------ALERTA PARA ELIMINAR UN CLIENTE DEL MODULO VENTAS EN INGLES---------------------------------------------------------
 function eliminar_cli_ingles() {
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Remove',
  text: "Are you sure you want to delete this customer?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Deleted customer',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Client not deleted',
      'error',
    )
  }
})


}

// ---------------------------------------------ALERTA PARA ELIMINAR UN EMPLEADO---------------------------------------------------------------------------

function eliminar_emp(){
	// body...
		const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar',
  text: "¿Esta seguro que desea eliminar a este empleado?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Empleado eliminado',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Empleado no eliminado',
      'error',
    )
  }
})


}

// ---------------------------------------------ALERTA PARA ELIMINAR UN EMPLEADO EN INGLES---------------------------------------------------------------------------

function eliminar_emp_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Remove',
  text: "Are you sure you want to remove this employee?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Employee removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Employee not removed',
      'error',
    )
  }
})


}
// -------------------------------------------------------------ALERTA PARA ELIMINAR UN PRODUCTO DEL INVENTARIO--------------------------------------------- 
function eliminar_prod(){
	// body...
		const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Producto',
  text: "¿Esta seguro que desea eliminar este producto del inventario?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Producto eliminado',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Producto no eliminado',
      'error',
    )
  }
})


}

// -------------------------------------------------ALERTA PARA ELIMINAR UN PRODUCTO DEL INVENTARIO EN INGLES-------------------------------------------- 
function eliminar_prod_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Product',
  text: "Are you sure you want to remove this product from inventory?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Product removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Product not removed',
      'error',
    )
  }
})


}

// -------------------------------------------------------------ALERTA PARA ELIMINAR UN REGISTRO  DE VENTA--------------------------------------------- 
function eliminar_regis(){
	// body...
		const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Registro de Venta',
  text: "¿Esta seguro que desea eliminar este registro de venta?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Registro eliminado',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Registro no eliminado',
      'error',
    )
  }
})


}

// -------------------------------------------------ALERTA PARA ELIMINAR UN REGISTRO  DE VENTA EN INGLES------------------------------------------- 

function eliminar_regis_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Sales Record',
  text: "Are you sure you want to delete this sales record?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Record removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Record not deleted',
      'error',
    )
  }
})


}
// -------------------------------------------------------------ALERTA PARA ELIMINAR UNA PRODUCCIÓN--------------------------------------------- 
function eliminar_produc(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Producción',
  text: "¿Esta seguro que desea eliminar esta producción?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Producción eliminada',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Producción no eliminada',
      'error',
    )
  }
})


}
// ------------------------------------------------------ALERTA PARA ELIMINAR UNA PRODUCCIÓN EN INGLES-------------------------------------------- 
function eliminar_produc_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Production',
  text: "Are you sure you want to delete this production?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Production eliminated',
      'Successful operation',
      'success',
    )
  } else if (
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Production not eliminated',
      'error',
    )
  }
})
}

// -------------------------------------------------------------ALERTA PARA ELIMINAR MATERIA PRIMA--------------------------------------------- 
function eliminar_mate(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Materia Prima',
  text: "¿Esta seguro que desea eliminar esta materia prima?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Materia Prima eliminada',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Materia Prima no eliminada',
      'error',
    )
  }
})


}
// ------------------------------------------------------ALERTA PARA ELIMINAR MATERIA PRIMA EN INGLES----------------------------------------- 
function eliminar_mate_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Raw Material',
  text: "Are you sure you want to remove this raw material?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Raw material removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Raw material not removed',
      'error',
    )
  }
})


}


// -------------------------------------------------------------ALERTA PARA ELIMINAR UN PROVEEDOR--------------------------------------------- 
function eliminar_provee(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Proveedor',
  text: "¿Esta seguro que desea eliminar este proveedor?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Proveedor eliminado',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Proveedor no eliminado',
      'error',
    )
  }
})


}
// ---------------------------------------------------------ALERTA PARA ELIMINAR UN PROVEEDOR EN INGLES------------------------------------------- 
function eliminar_provee_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Provider',
  text: "Are you sure you want to delete this provider?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'YES',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Provider removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Provider not removed',
      'error',
    )
  }
})


}

// -------------------------------------------------------------ALERTA PARA ELIMINAR SUGERENCIAS QUEJAS Y RECLAMO ATC--------------------------------------------- 
function eliminar_atc(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Eliminar Sugerencia',
  text: "¿Esta seguro que desea eliminar sugerencia queja y reclamo?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Sugerencia eliminada',
      'Operacón exitosa',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operación Cancelada',
      'Sugerencia no eliminado',
      'error',
    )
  }
})


}
// ---------------------------------------------ALERTA PARA ELIMINAR SUGERENCIAS QUEJAS Y RECLAMO ATC EN INGLES ----------------------------------------- 

function eliminar_atc_ingles(){
  // body...
    const swalWithBootstrapButtons = Swal.mixin({
  customClass: {
    cancelButton: 'btn btn-danger',
    confirmButton: 'btn btn-primary',
  },
  buttonsStyling: true,
})

swalWithBootstrapButtons.fire({
  title: 'Delete Suggestion',
  text: "Are you sure you want to delete suggestion, complaint and claim?",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonText: 'SI',
  cancelButtonText: 'N0',
  reverseButtons: false,
}).then((result) => {
  if (result.value) {
    swalWithBootstrapButtons.fire(
      'Suggestion removed',
      'Successful operation',
      'success',
    )
  } else if (
    /* Read more about handling dismissals below */
    result.dismiss === Swal.DismissReason.cancel
  ) {
    swalWithBootstrapButtons.fire(
      'Operation cancelled',
      'Suggestion not removed',
      'error',
    )
  }
})


}


// -------------------------------------------------------------ALERTA PARA CANCELAR CON EXITO --------------------------------------------- 

function cancelar() {

	Swal.fire({
  position: 'top-end',
  icon: 'error',
  title: 'Operación cancelada',
  showConfirmButton: false,
  timer: 2000

	})


}
// -------------------------------------------------------------ALERTA PARA CANCELAR CON EXITO EN INGLES --------------------------------------------- 
function cancelar_ingles() {

  Swal.fire({
  position: 'top-end',
  icon: 'error',
  title: 'Operation cancelled',
  showConfirmButton: false,
  timer: 2000

  })


}