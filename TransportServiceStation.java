package pro.sky.java.course2.transport;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class TransportServiceStation {
    private Queue<Transport> transportQueue = new ArrayDeque<>();

    public TransportServiceStation() {
    }
    //ДОбавление транспорта в очередь.
    public void addTransportInQueue(Transport transport) {
        if(transport.isDiagnosticsPermitted() )
            transportQueue.add(transport);
        else
            System.err.println(" Автобусы не нуждаются в техобслуживании перед заездом.");
    }

    //Проведение техобслуживания машин, находящихся в очереди на техобслуживании.
    public void transportService() {
        while (!transportQueue.isEmpty()) {
            try {
                Transport transport = transportQueue.poll();
                transport.executeDiagnostic();
            } catch (TransportTypeException e) {
                System.out.println("Автобусы не должны проходить диагностику.");
            }
        }
    }

    @Override
    public String toString() {
        return "TransportServiceStation{" +
                "transport=" + transportQueue +
                '}';
    }
}