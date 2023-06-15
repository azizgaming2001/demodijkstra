/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
/**
 *
 * @author ADMIN
 */
public class PathFinder {
    public void ShortestP(Vert sourceV) {
        sourceV.setDist(0);
        PriorityQueue<Vert> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceV);
        sourceV.setVisited(true);

        while (!priorityQueue.isEmpty()) {
            Vert actualVertex = priorityQueue.poll();
            for (Edge edge : actualVertex.getList()) {
                Vert v = edge.getTargetVert();

                if (!v.Visited()) {
                    double newDistance = actualVertex.getDist()
+ edge.getWeight();
                    if (newDistance < v.getDist()) {
                        priorityQueue.remove(v);
                        v.setDist(newDistance);
                        v.setPr(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }

    public List<Vert> getShortestP(Vert targetVertex) {
        List<Vert> path = new ArrayList<>();
        for (Vert vertex = targetVertex; vertex != null; vertex = vertex.getPr()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}
