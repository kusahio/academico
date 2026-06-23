if(!require(readxl)) install.packages("readxl", dependencies = TRUE)
library(readxl)

archivo <- file.choose()
datos <- read_excel(archivo)

#Nombre de campo en excel "PESO KG."
poblacion_prueba <- datos$`PESO KG.`
#omite campos nulos o vacíos
poblacion_prueba <- na.omit(poblacion_prueba)

#semilla
set.seed(456)

#cálculo de la media
media_poblacional <- mean(poblacion_prueba)
print(paste("El peso promedio de toda la población (parámetro) es:", round(media_poblacional, 2)))

#cantidad de la muestra
cantidad_muestras <- 6
#tamaño muestra
tamano_muestra <- 20

#contenedor para almacenar las medias
medias_muestrales <- numeric(cantidad_muestras)

#bucle para automatizar las extracciones
for (i in 1:cantidad_muestras) {
  # Sorteamos los 20 pesos de la población sin reposición
  muestra_i <- sample(poblacion_prueba, size = tamano_muestra, replace = FALSE)
  
  # Calculamos la media de la muestra actual y la guardamos
  medias_muestrales[i] <- mean(muestra_i)
}

#consolidación de datos
tabla_resumen <- data.frame(
  Muestra = paste("Muestra", 1:cantidad_muestras),
  Peso_Promedio_Muestral = round(medias_muestrales, 2)
)

#cálculo de la desviación de cada muestra respecto al parámetro
tabla_resumen$Diferencia_con_Poblacion <- round(tabla_resumen$Peso_Promedio_Muestral - media_poblacional, 2)

#visualización de la tabla
print(tabla_resumen)