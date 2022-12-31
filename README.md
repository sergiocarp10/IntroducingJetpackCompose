# IntroducingJetpackCompose
Avanzando en la programación Android. Una vez aprendido Kotlin, sigue actualizarse con este nuevo paradigma que evita el uso de XML para el diseño de vistas.

## Textos (Text)
Es el reemplazo del clásico TextView. Sus parámetros principales son:

- text: es el String a mostrar. Si dicho String proviene de los resources, se usa la función stringResource(id = R.string.nombreKey)
- color: es el color del texto, especificado por la clase Color.
- fontSize: es el tamaño de fuente, especificado como numero.sp; recordemos que "sp" se adapta al tamaño configurado por el usuario.
- fontStyle: permite aplicar la *itálica* al texto, mediante la clase FontStyle.
- fontWeight: permite aplicar **negrita** al texto, con diferentes espesores, mediante la clase FontWeight.
- fontFamily: permite cambiar la fuente, mediante la clase FontFamily.
- letterSpacing: es la separación entre caracteres de una misma línea, especificado como numero.sp
- lineHeight: es la altura de cada línea, no del caracter, especificado como numero.em; donde "1.em" es la altura normal.
- maxLines: es el número máximo de líneas del texto.
- overflow: especifica qué hacer con el texto cuando es muy largo, mediante la clase TextOverflow. Ejemplo: Ellipsis (...)
- textAlign: es la alineación del texto, que puede ser a izquierda, derecha, centrado o justificado, mediante clase TextAlign.
- textDecoration: permite aplicar subrayado o tachado al texto, mediante la clase TextDecoration.
- style: permite aplicar un estilo ya definido con un conjunto de parámetros, por ejemplo de la clase MaterialTheme. Para cambiar valores a partir del estilo se utiliza la función copy(), donde se especifica cada atributo con su nuevo valor.

## Imágenes de Internet (AsyncImage)
Se debe utilizar la librería Coil, ya que sigue sin existir soporte nativo para carga de imágenes externas.

``` implementation("io.coil-kt:coil-compose:2.0.0") ```

Recordar agregar el permiso de Internet al Manifest. Se pueden especificar los siguientes parámetros:

- model: se indica la URL de la imagen o bien un objeto ImageRequest.Builder si se desea aplicar crossfade y transformaciones.
- contentDescription: es el texto alternativo para accesibilidad. Se puede dejar como null.
- contentScale: permite ajustar el tamaño y recortar la imagen mediante clase ContentClase. Por ejemplo: Crop.
- modifier: como en todo componente, se puede indicar que ocupe el tamaño completo del parent (fillMaxSize), pero también se pueden realizar transformaciones para evitar el uso de ImageRequest mediante clip(). Por ejemplo: clip(RounderCornerShape(4.dp))

## Iconos (Icon)
Permite cargar íconos de MaterialTheme o drawables de los resources. Si se desea tener el pack completo de iconos se debe agregar la librería ``` androidx.compose.material:material-icons-extended:1.1.1 ```. Se aceptan los siguientes parámetros:

- imageVector: en caso de usar un ícono de MaterialTheme, se especifica mediante la clase Icons.
- painter: en caso de usar un drawable de resources, se indica painterResource(id = R.drawable.nombre)
- contentDescription: es el texto alternativo para accesibilidad. Se puede dejar como null.
- tint: permite cambiar el color mediante la clase Color.
- modifier: permite cambiar el tamaño y la ubicación, mediante size(numero.dp) y la clase Alignment, respectivamente.

## Listas (LazyColumn)
Es el reemplazo del clásico RecyclerView. En general se especifica un Modifier.fillMaxSize() para ocupar toda la pantalla. En el LazyColumnScope (dentro de las llaves) se indica "items", que recibe la lista de objetos a mostrar. Para renderizar cada item se abre llaves nuevamente (esto es el LazyItemScope), donde se puede usar un layout determinado para cada item "it". Por ejemplo: Column con 2 Text() y 1 Divider()

Ventajas: en uso conjunto a ViewModel se evita la creación de clases Adapter y ViewHolder.

## Referencias
- Tutorial por DevExperto: https://www.youtube.com/watch?v=uonwBFewofI
- Listas con ViewModel: https://www.youtube.com/watch?v=eOS3M3vYVzA
