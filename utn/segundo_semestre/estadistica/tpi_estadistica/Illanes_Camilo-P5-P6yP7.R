if(!require(readxl)) install.packages("readxl", dependencies = TRUE)
library(readxl)

archivo <- file.choose()
datos <- read_excel(archivo)

col_satisfaccion <- "SATISFACCIÓN CON LA CARRERA"
col_estatura <- "ESTATURA CM."

N_total <- nrow(datos)
cat("Total de registros:", N_total, "\n")

# Ejercicio 5 - Distribución Binomial
cat("\nEjercicio 5\n")

# 1 = Muy satisfecho | 2 = Satisfecho | 3 = Insatisfecho | 4 = Muy insatisfecho
p_muy_satisfecho <- sum(datos[[col_satisfaccion]] == 1, na.rm = TRUE) / N_total
p_satisfecho     <- sum(datos[[col_satisfaccion]] == 2, na.rm = TRUE) / N_total
p_insatisfecho   <- sum(datos[[col_satisfaccion]] == 3, na.rm = TRUE) / N_total
p_muy_insat      <- sum(datos[[col_satisfaccion]] == 4, na.rm = TRUE) / N_total

n_muestra_5 <- 16

cat("p(Muy satisfecho) =", sprintf("%.4f", p_muy_satisfecho), "\n")
cat("p(Satisfecho) =", sprintf("%.4f", p_satisfecho), "\n\n")

# a. Más de 9 estudiantes estén muy satisfechos: P(X > 9)
prob_5a <- pbinom(q = 9, size = n_muestra_5, prob = p_muy_satisfecho, lower.tail = FALSE)
cat("a. P(X > 9) Muy Satisfechos:      ", sprintf("%.4f", prob_5a), "\n")

# b. Entre 4 y 8 estudiantes estén satisfechos: P(4 <= X <= 8)
prob_5b <- pbinom(q = 8, size = n_muestra_5, prob = p_satisfecho) - pbinom(q = 3, size = n_muestra_5, prob = p_satisfecho)
cat("b. P(4 <= X <= 8) Satisfechos:    ", sprintf("%.4f", prob_5b), "\n")

# c. Menos de 5 estudiantes estén insatisfechos: P(X < 5)
prob_5c <- pbinom(q = 4, size = n_muestra_5, prob = p_insatisfecho)
cat("c. P(X < 5) Insatisfechos:        ", sprintf("%.4f", prob_5c), "\n")

# d. Exactamente 10 estudiantes estén muy insatisfechos: P(X = 10)
prob_5d <- dbinom(x = 10, size = n_muestra_5, prob = p_muy_insat)
cat("d. P(X = 10) Muy Insatisfechos:   ", sprintf("%.8f", prob_5d), "\n")

# Ejercicio 6 - Distribución Poisson
cat("\nEjercicio 6\n")
tasa_base <- 15 # consultas
tiempo_base <- 30 # minutos

# a. Que lleguen por lo menos 6 consultas en 20 minutos: P(X >= 6)
lambda_20m <- (tasa_base / tiempo_base) * 20
prob_6a <- ppois(q = 5, lambda = lambda_20m, lower.tail = FALSE)
cat("a. P(X >= 6) en 20 min (λ=", lambda_20m, "):    ", round(prob_6a * 100, 2), "%\n", sep="")

# b. Que lleguen a lo sumo 12 consultas en 40 minutos: P(X <= 12)
lambda_40m <- (tasa_base / tiempo_base) * 40
prob_6b <- ppois(q = 12, lambda = lambda_40m)
cat("b. P(X <= 12) en 40 min (λ=", lambda_40m, "):   ", round(prob_6b * 100, 2), "%\n", sep="")

# c. Más de 7 y menos de 10 consultas en 30 minutos: P(7 < X < 10)
lambda_30m <- tasa_base
prob_6c <- dpois(x = 8, lambda = lambda_30m) + dpois(x = 9, lambda = lambda_30m)
cat("c. P(7 < X < 10) en 30 min (λ=", lambda_30m, "):", round(prob_6c * 100, 2), "%\n", sep="")

# Ejercicio 7 - Distribución Normal
cat("\nEjercicio 7\n")

if(col_estatura %in% colnames(datos)) {
  
  media_est_real <- mean(datos[[col_estatura]], na.rm = TRUE)
  desvio_est_real <- sd(datos[[col_estatura]], na.rm = TRUE)
  
  cat("Media (μ) =", round(media_est_real, 2), "| Desvío Estándar (σ) =", round(desvio_est_real, 2), "\n\n")
  
  # a. Probabilidad de estatura mayor o igual que 179 cm: P(X >= 179)
  prob_7a <- pnorm(q = 179, mean = media_est_real, sd = desvio_est_real, lower.tail = FALSE)
  cat("a. P(X >= 179 cm):                ", round(prob_7a * 100, 2), "%\n")
  
  # b. Probabilidad de estatura comprendida entre 147 cm y 172 cm: P(147 <= X <= 172)
  prob_7b <- pnorm(q = 172, mean = media_est_real, sd = desvio_est_real) - pnorm(q = 147, mean = media_est_real, sd = desvio_est_real)
  cat("b. P(147 <= X <= 172 cm):         ", round(prob_7b * 100, 2), "%\n")
  
  # c. Valor que excede al 97,5% de las estaturas (Percentil 97.5)
  valor_7c <- qnorm(p = 0.975, mean = media_est_real, sd = desvio_est_real)
  cat("c. Valor que excede al 97.5%:     ", round(valor_7c, 2), "cm\n")
  
} else {
  cat("No se encontró la columna llamada '", col_estatura, "' en el Excel.\n", sep="")
}