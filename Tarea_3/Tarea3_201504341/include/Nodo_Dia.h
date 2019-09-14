#ifndef NODO_DIA_H
#define NODO_DIA_H
#include <string>
#include "listaAct.h"
using namespace std;
class Nodo_Dia
{
    public:
        int dia;
        string nombre_dia;
        Nodo_Dia *Siguiente;
        listaAct *actividad;

        Nodo_Dia(std::string dia,int valor_dia);
        virtual ~Nodo_Dia();

    protected:

    private:
};

#endif // NODO_DIA_H
