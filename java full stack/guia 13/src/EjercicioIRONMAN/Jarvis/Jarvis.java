
package EjercicioIRONMAN.Jarvis;

import EjercicioIRONMAN.entidades.Esqueleto;

import java.util.ArrayList;
import java.util.Random;


public class Jarvis {

    public void estadoDispositivos(Esqueleto armadura) {
       
        System.out.println(" -- INFORMACION DE LA ARMADURA -- ");
        System.out.println(armadura.toString());
        System.out.println(" -- ESTADO DE LA ARMADURA -- ");

        if (armadura.getBateria().isEstado()) {
            System.out.println(" Bateria estado: Funcionando");
        } else {
            System.out.println(" Bateria estado: Roto ");
        }
        if (armadura.getCasco().isEstado()) {
            System.out.println(" Casco estado: Funcionando");
        } else {
            System.out.println(" Casco estado: Roto ");
        }
        if (armadura.getBotaDerecha().isEstado()) {
            System.out.println(" Bota Derecha estado: Funcionando");
        } else {
            System.out.println(" Bota Derecha estado: Roto ");
        }
        if (armadura.getBotaIzquierda().isEstado()) {
            System.out.println(" Bota Izquierda estado: Funcionando");
        } else {
            System.out.println(" Bota Izquierda estado: Roto ");
        }
        if (armadura.getGuanteIzquierdo().isEstado()) {
            System.out.println(" Guante Izquierdo estado: Funcionando");
        } else {
            System.out.println(" Guante Izquierdo estado: Roto ");
        }
        if (armadura.getGuanteDerecho().isEstado()) {
            System.out.println(" Guante Derecho estado: Funcionando");
        } else {
            System.out.println(" Guante Derecho estado: Roto ");
        }
    }

    public void estadoBaterias(Esqueleto armadura) {
        

        System.out.println(" -- ESTADO DE LA BATERIA -- ");
        float energiaTT = armadura.getBateria().getEnergiaTT();
        float energiaConsumida = armadura.getBateria().getEnergiaTotal();
        float porcentaje = (energiaConsumida / energiaTT) * 100;
        System.out.println("Porcentaje de energía consumida: " + porcentaje + "%");
    }

    public void estadoReactor(Esqueleto armadura) {
       
        float cargaReactor = armadura.getBateria().getEnergiaTotal();
        float kilovatios = cargaReactor * 0.000239006f; // Conversión a Kilovatios
        float julios = cargaReactor * 3600; // Conversión a Julios

        System.out.println(" -- ESTADO DEL REACTOR -- ");
        System.out.println("Carga del reactor Valor : " + cargaReactor);
        System.out.println("Carga del reactor en Kilovatios: " + kilovatios + " kW");
        System.out.println("Carga del reactor en Julios: " + julios + " J");
    }

    public void revisarDispositivos(Esqueleto armadura) {
        
        Random random = new Random();

        // Batería
        System.out.println("Revisando Batería");
        if (!armadura.getBateria().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getBateria().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La batería fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La batería no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La batería está funcionando correctamente.");
        }

        // Casco
        System.out.println("Revisando Casco");
        if (!armadura.getCasco().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getCasco().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El casco fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El casco no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El casco está funcionando correctamente.");
        }

        // Bota Derecha
        System.out.println("Revisando Bota Derecha");
        if (!armadura.getBotaDerecha().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getBotaDerecha().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La bota derecha fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La bota derecha no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La bota derecha está funcionando correctamente.");
        }

        // Bota Izquierda
        System.out.println("Revisando Bota Izquierda");
        if (!armadura.getBotaIzquierda().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getBotaIzquierda().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": La bota izquierda fue reparada exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": La bota izquierda no pudo ser reparada. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - La bota izquierda está funcionando correctamente.");
        }

        // Guante Izquierdo
        System.out.println("Revisando Guante Izquierdo");
        if (!armadura.getGuanteIzquierdo().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getGuanteIzquierdo().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El guante izquierdo fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El guante izquierdo no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El guante izquierdo está funcionando correctamente.");
        }

        // Guante Derecho
        System.out.println("Revisando Guante Derecho");
        if (!armadura.getGuanteDerecho().isEstado()) {
            boolean reparado = false;
            int intentos = 0;

            do {
                intentos++;

                if (random.nextInt(100) <= 40) {
                    armadura.getGuanteDerecho().setEstado(true);
                    System.out.println(" - Intento #" + intentos + ": El guante derecho fue reparado exitosamente.");
                    reparado = true;
                    break;
                } else {
                    System.out.println(" - Intento #" + intentos + ": El guante derecho no pudo ser reparado. Se intentará nuevamente.");
                }
            } while (!reparado);
        } else {
            System.out.println(" - El guante derecho está funcionando correctamente.");
        }
    }

    public void detectarObjetivos(Esqueleto armadura) {
        Radar r = new Radar();
        Random ram = new Random();
        System.out.println(" -- DETECTANDO OBJETOS -- ");
        r.detectarObjetos();
        System.out.println(" Numeros de Objetivos es : " + r.getObjetos().size());
        System.out.println(" -- POSICIONES DE OBJETOS -- ");
        r.UbicacionObejtos();
        System.out.println(" -- DESTRUYENDO ENEMIGOS --");
        ArrayList<Objetos> Objetos= r.getObjetos();
        for (Objetos Objeto : Objetos) {
            if (Objeto.hostil) {
                System.out.println(" Objetivo Hostil - Destruyendolo ");
                double x = Objeto.x;
                double y = Objeto.y;
                double z = Objeto.z;
                if (Objeto.distancia < 5000) {
                    int cont = 0;
                    do {
                        cont += 1;
                        System.out.println(" -- ATACANDO -- ");
                        System.out.println(" Veces Atacado : " + cont);
                        int cantb = ram.nextInt(2);
                        System.out.println("Resistencia Objetivo : " + Objeto.resistencia);
                        Objeto.resistencia = Objeto.resistencia - armadura.Disparo(2);
                    } while (Objeto.resistencia >= 0);
                } else {
                    System.out.println(" Hostil Fuera de RANGO ");
                }
            } else {
                System.out.println(" Objetivo NO Hostil ");
            }
        }
    }

}