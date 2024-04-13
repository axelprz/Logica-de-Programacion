# Ejercicio N°5: Cálculo del Dígito de Control del NIF

> [!TIP]
>**El Número de Identificación Fiscal (NIF) en España consta de 8 dígitos seguidos de una letra de control. La letra de control se calcula de la siguiente manera**:
>- Se divide el número de 8 dígitos entre 23.
>- El resto de esta división se utiliza para obtener la letra de control. Para cada resto, hay una letra asociada en el orden "T R W A G M Y F P D X B N J Z S Q V H L C K E".
>- Por ejemplo, si el resto es 0, la letra de control sería "T". Si el resto es 1, la letra de control sería "R", y así sucesivamente.

> [!NOTE]
> **Escribe un programa en Java que solicite al usuario los 8 dígitos del NIF y luego calcule e imprima la letra de control correspondiente**.

> [!IMPORTANT]
> **El programa debe cumplir con los siguientes requisitos**:
> 1. Debe solicitar al usuario los 8 dígitos del NIF.
> 2. Debe calcular la letra de control según la regla mencionada anteriormente.
> 3. Debe imprimir la letra de control resultante.
> 4. Debe manejar entradas inválidas, como dígitos no numéricos o una longitud incorrecta del NIF.

☑️ Asegúrate de utilizar bucles, estructuras de control y posiblemente arrays para implementar la lógica del cálculo de la letra de control de manera eficiente.
