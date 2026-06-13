
# Sistema de Monitoreo de Flota - Patrón Iterator

Para este proyecto elegí implementar el Recorrido con Filtro de Estado.

Esto principalmente: para un escenario real, un despachador de un terminal de 
autobuses como Emtrafesa, no necesita ver en su pantalla los vehículos que están 
malogrados o en el taller mecánico durante las horas punta.

Este algoritmo nos ayuda a optimiza el monitoreo porque internamente evalúa la lista y salta 
los vehículos inactivos, entregándole al despachador 
únicamente los autobuses que están Activos para coordinar sus salidas. 
Todo esto se logra gracias al patrón Iterator, que hace este filtrado de forma 
automática sin exponer cómo están almacenados los datos en la base del sistema.