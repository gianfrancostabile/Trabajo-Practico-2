# Trabajo-Practico-2

**1)  1-**  Se crean los objetos Auto y Mecanico, siendo el Auto un objeto que extiende de Observable y el Mecanico un objeto que                     implementa el Observer.
    **2-**  El objeto Auto ejecuta el método addObserver propio de la clase Observable, y se le pasa como parametro un objeto que                     implemente de Observer, en este caso, el Mecanico.
    **3-**  Luego se ejecuta un método de Auto que provoque un cambio en algun atributo de esa clase. Por ejemplo: **cambiarAceite()**.
    **4-**  El método **cambiarAceite()** recibirá como parametro un entero, este será el valor que tomará el 'nivel de aceite'. Primero               de todo se guardará una copia del auto antes de su cambio, luego se cambia su valor. Una vez cambiado el valor se afirmará que             algo en él ha cambiado, esto se hace con el método setChanged(). Luego deberá notificar a su Observer que algo en él cambio,               con el método **notifyObserver()** y se le pasará como parámetro la copia del auto viejo.
    **5-**  El método anterior nos llevará al método **update()** del Mecánico, este método tiene como parámetro el objeto Observable que             lo notificó y el objeto que envió como parámetro anteriormente. Aqui, el Mecánico tendrá que verificar que cambio en el auto y             una vez encontrado el cambio, imprimir por pantalla en valor viejo y actual del valor cambiado en el Auto.
    
**2)** El método **update()** recibe como parámetros en objeto Observable que lo notificó y, en este caso, el viejo auto antes de sus cambios. Y este método se ejecuta despues del llamado al método **notifyObserver()** en la clase Auto.
