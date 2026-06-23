if(!require(readxl)) install.packages("readxl", dependencies = TRUE)
library(readxl)
archivo <- file.choose()
datos <- read_excel(archivo)

# -- Consigna 1 --
# cantidad de datos
n <- nrow(datos)

# Regla de Sturges
k <- 1 + 3.3222 * log10(n)

# defino tiempo
tiempo <- datos$`TIEMPO SEMANAL en HS. DEDIC. EST.`

# defino rango
rango <- max(tiempo, na.rm = TRUE) - min(tiempo, na.rm = TRUE)
# calculo amplitud
amplitud <- ceiling(rango / k)

# armo intervalos
limite_inf <- min(tiempo, na.rm = TRUE)
limite_sup <- limite_inf + k * amplitud
breaks_tiempo <- seq(limite_inf, limite_sup, by = amplitud)

# armo frecuencias con intervalos [a, b)
tabla_tiempo <- cut(tiempo,
                    breaks = breaks_tiempo,
                    right = FALSE,
                    include.lowest = TRUE)

# calculo frecuencias
tabla_tiempo <- table(tabla_tiempo)
f_acum        <- cumsum(tabla_tiempo)
f_rel         <- prop.table(tabla_tiempo)
f_rel_acum    <- cumsum(f_rel)

# creo tabla de tiempo
tabla_frecuencia_tiempo <- data.frame(
  Intervalo     = names(tabla_tiempo),
  Frec_Abs      = as.vector(tabla_tiempo),
  Frec_Acum     = as.vector(f_acum),
  Frec_Rel      = round(as.vector(f_rel), 4),
  Frec_Rel_Acum = round(as.vector(f_rel_acum), 4)
)
print(tabla_frecuencia_tiempo, row.names = FALSE)

# encuesta de satisfacción
# convierto números a datos ordinales
datos$SATISFACCION_CAMPOS <- factor(datos$`SATISFACCIÓN CON LA CARRERA`,
                                    levels = 1:4,
                                    labels = c("Muy satisfecho",
                                               "Satisfecho",
                                               "Insatisfecho",
                                               "Muy insatisfecho"))

# creo tabla de encuesta de satisfaccion
tabla_satisfaccion <- table(datos$SATISFACCION_CAMPOS)
f_acum        <- cumsum(tabla_satisfaccion)
f_rel         <- prop.table(tabla_satisfaccion)
f_rel_acum    <- cumsum(f_rel)

# creo tabla de frecuencias
tabla_frecuencia_sat <- data.frame(
  Categoria     = names(tabla_satisfaccion),
  Frec_Abs      = as.vector(tabla_satisfaccion),
  Frec_Acum     = as.vector(f_acum),
  Frec_Rel      = round(as.vector(f_rel), 4),
  Frec_Rel_Acum = round(as.vector(f_rel_acum), 4)
)
print(tabla_frecuencia_sat, row.names = FALSE)

# Variables de tiempo

cat("\nVariables de tiempo\n")
# elimino NA por seguridad
tiempo_limpio <- na.omit(tiempo)

# Medidas de tendencia central
cat("\nMedidas de tendencia central\n")
media_tiempo <- mean(tiempo_limpio) #media aritmetica
mediana_tiempo <- median(tiempo_limpio)#mediana
moda_tiempo <- as.numeric(names(sort(table(tiempo_limpio), decreasing = TRUE)[1]))

# Medidas de posición
cuartiles_tiempo <- quantile(tiempo_limpio)

# Medidas de dispersión
min_tiempo <- min(tiempo_limpio)
max_tiempo <- max(tiempo_limpio)
rango_tiempo <- max_tiempo - min_tiempo
varianza_tiempo <- var(tiempo_limpio)
desvio_tiempo <- sd(tiempo_limpio)
coef_var_tiempo <- desvio_tiempo / media_tiempo

# Muestro resultados de medidas de tiempo
cat("Media:", round(media_tiempo, 4), "\n")
cat("Mediana:", round(mediana_tiempo, 4), "\n")
cat("Moda:", moda_tiempo, "\n")

cat("\nCuartiles:\n")
print(round(cuartiles_tiempo, 4))

cat("\nDispersión:\n")
cat("Mínimo:", min_tiempo, "\n")
cat("Máximo:", max_tiempo, "\n")
cat("Rango:", rango_tiempo, "\n")
cat("Varianza:", round(varianza_tiempo, 4), "\n")
cat("Desvío estándar:", round(desvio_tiempo, 4), "\n")
cat("Coeficiente de variación:", round(coef_var_tiempo, 4), "\n")

# Variables de Satisfaccion
cat("\nMedidas de satisfaccion\n")
satisfaccion <- datos$SATISFACCION_CAMPOS

# Moda
moda_sat <- names(sort(table(satisfaccion), decreasing = TRUE)[1])

# Mediana
mediana_sat <- median(as.numeric(satisfaccion))

# Cuartiles
cuartiles_sat <- quantile(as.numeric(satisfaccion))

# Medidas de satisfaccion
cat("Moda:", moda_sat, "\n")
cat("Mediana (numérica):", mediana_sat, "\n")

cat("\nCuartiles (numéricos):\n")
print(cuartiles_sat)

cat("\nReferencia de valores:\n")
cat("1 = Muy satisfecho\n2 = Satisfecho\n3 = Insatisfecho\n4 = Muy insatisfecho\n")

# Gráficos

# Histograma de Tiempo

hist(tiempo_limpio,
     breaks = breaks_tiempo,
     col = "skyblue",
     border = "black",
     main = "Histograma del Tiempo de Estudio",
     xlab = "Horas semanales",
     ylab = "Frecuencia absoluta")

# Diagrama Circular
porcentajes <- prop.table(tabla_satisfaccion)

pie(porcentajes,
    labels = paste(names(porcentajes),
                   round(porcentajes * 100, 2), "%"),
    col = rainbow(length(porcentajes)),
    main = "Nivel de Satisfacción con la Carrera")

