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

## Imágenes (Image)
Es el reemplazo del clásico ImageView.

## Iconos (Icons)


## Referencias
- Tutorial por DevExperto: https://www.youtube.com/watch?v=uonwBFewofI
