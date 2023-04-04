##
## Dada una URL con parámetros, crea una función que obtenga sus valores.
## No se pueden usar operaciones del lenguaje que realicen esta tarea directamente. 
## Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
## los parámetros serían ["2023", "0"]

def paramUrl(str):
    
    substr= str.split("?")[1].split("&")
    for a in substr:
        if "=" in a:
            param = a.split("=")
            if len(param) == 2 and param[1] != "":
                print(param[1])



url = "https://retosdeprogramacion.com?year=2023&challenge=0&languaje=python"
paramUrl(url)