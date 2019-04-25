import java.util.*;

public class BFS {

    enum color {
        WHITE, GRAY, BLACK
    }

    private static class Vertex {
        public String name;
        public color myColor;
        public int distance;
        public Vertex pie;
        Vertex(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        HashMap<Vertex, LinkedList<Vertex>> adjList = new HashMap<>();
        Vertex hit = new Vertex("hit");
        Vertex hot = new Vertex("hot");
        Vertex dot = new Vertex("dot");
        Vertex lot = new Vertex("lot");
        Vertex dog = new Vertex("dog");
        Vertex log = new Vertex("log");
        Vertex cog = new Vertex("cog");
        adjList.put(hit, new LinkedList<>(List.of(hot)) );
        adjList.put(hot, new LinkedList<>(List.of(dot, lot)) );
        adjList.put(dot, new LinkedList<>(List.of(lot, dog)) );
        adjList.put(lot, new LinkedList<>(List.of(log, dot)) );
        adjList.put(dog, new LinkedList<>(List.of(log, dot)) );
        adjList.put(log, new LinkedList<>(List.of(dog, cog)) );
        adjList.put(cog, new LinkedList<>(List.of(dog, log)) );
        
        
        BreadthFS(adjList, hit);

        System.out.println(cog.distance); // this is the shortest distance from hit to cog
    }

    private static void BreadthFS(HashMap<Vertex, LinkedList<Vertex>> adjList, Vertex hit) {
        // created from pseudo code in Intro to Algorithms CLRS 22.2 page 595
        for (Vertex v :
                adjList.keySet()) {
            if (v == hit)
                continue;
            v.distance = Integer.MAX_VALUE;
            v.myColor = color.WHITE;
            v.pie = null;
        }

        hit.pie = null;
        hit.myColor = color.GRAY;
        hit.distance = 0;
        Queue<Vertex> Q = new LinkedList<>();
        Q.add(hit);

        while(!Q.isEmpty()) {
            Vertex current = Q.poll();
            for (Vertex v :
                    adjList.get(current)) {
                if (v.myColor == color.WHITE) {
                    v.myColor = color.GRAY;
                    v.distance = current.distance + 1;
                    v.pie = current;
                    Q.add(v);
                }
            }
            current.myColor = color.BLACK;
        }
    }
}
