#ifndef CABECERA_DIAS_H
#define CABECERA_DIAS_H
#include "Nodo_Dia.h"
#include <string>
using namespace std;

class cabecera_dias
{
    public:
        Nodo_Dia *primero;
        Nodo_Dia *ultimo;


        cabecera_dias();

        int existe(string dia);
        void insertar_dia(string dia, int valor);
        void insertarAct(string dia, string actividad);
        void recorrerv2();
        void recorrer();

        virtual ~cabecera_dias();

    protected:

    private:
};

#endif // CABECERA_DIAS_H
