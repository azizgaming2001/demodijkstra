/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dijkstra;

/**
 *
 * @author ADMIN
 */
public class Dijkstra {

    public static void main(String[] args) {
         Vert vA = new Vert("A");
        Vert vB = new Vert("B");
        Vert vC = new Vert("C");
        Vert vD = new Vert("D");
        Vert vE = new Vert("E");

        vA.addNeighbour(new Edge(3, vA, vC));
        vA.addNeighbour(new Edge(5, vA, vB));
        vC.addNeighbour(new Edge(2, vC, vB));
        vC.addNeighbour(new Edge(6, vC, vE));
        vC.addNeighbour(new Edge(5, vC, vD));
        vB.addNeighbour(new Edge(4, vB, vC));
        vB.addNeighbour(new Edge(3, vB, vD));
        vB.addNeighbour(new Edge(4, vB, vE));
        vE.addNeighbour(new Edge(2, vE, vD));

        PathFinder shortestPath = new PathFinder();
        shortestPath.ShortestP(vA);
        System.out.println("khoang cach toi thieu tu:");
        System.out.println("A den B: " + vB.getDist());
        System.out.println("A den C: " + vC.getDist());
        System.out.println("A den D: " + vD.getDist());
        System.out.println("A den E: " + vE.getDist());
        System.out.println("duong di ngan nhat tu:");
        System.out.println("A den B: " + shortestPath.getShortestP(vB));
        System.out.println("A den C: " + shortestPath.getShortestP(vC));
        System.out.println("A den D: " + shortestPath.getShortestP(vD));
        System.out.println("A den E: " + shortestPath.getShortestP(vE));
    }
}
