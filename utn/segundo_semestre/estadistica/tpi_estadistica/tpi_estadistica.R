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