function eliminar(id){
	swal({
  title: "Realmente desea eliminar registro?",
  text: "Una vez eliminado no podra recuperar el registro!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar" + id,
		success:function(res){
			conosole.log(res);
		},
	});
    swal("El registro ha sido eliminado correctamente!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
		location.href="/listar";
	}
	});
  } else {
    swal("No se guardó ningun cambio!");
  }
});
}