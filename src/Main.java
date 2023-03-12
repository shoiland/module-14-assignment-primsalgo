import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Vertex<Character> a = new Vertex<>('A');
        Vertex<Character> b = new Vertex<>('B');
        Vertex<Character> c = new Vertex<>('C');
        Vertex<Character> d = new Vertex<>('D');
        Vertex<Character> e = new Vertex<>('E');
        Vertex<Character> f = new Vertex<>('F');
        Vertex<Character> g = new Vertex<>('G');
        Vertex<Character> h = new Vertex<>('H');
        Vertex<Character> i = new Vertex<>('I');

        Set<Vertex<Character>> vertices = new HashSet<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);
        vertices.add(e);
        vertices.add(f);
        vertices.add(g);
        vertices.add(h);
        vertices.add(i);


        Edge<Character> ab = new Edge<>(a, b, 4);
        Edge<Character> ba = new Edge<>(b, a, 4);

        Edge<Character> ah = new Edge<>(a, h, 8);
        Edge<Character> ha = new Edge<>(h, a, 8);

        Edge<Character> bh = new Edge<>(b, h, 11);
        Edge<Character> hb = new Edge<>(h, b, 11);

        Edge<Character> bc = new Edge<>(b, c, 8);
        Edge<Character> cb = new Edge<>(c, b, 8);

        Edge<Character> ci = new Edge<>(c, i, 2);
        Edge<Character> ic = new Edge<>(i, c, 2);

        Edge<Character> hg = new Edge<>(h, g, 1);
        Edge<Character> gh = new Edge<>(g, h, 1);

        Edge<Character> hi = new Edge<>(h, i, 7);
        Edge<Character> ih = new Edge<>(i, h, 7);

        Edge<Character> ig = new Edge<>(i, g, 6);
        Edge<Character> gi = new Edge<>(g, i, 6);

        Edge<Character> gf = new Edge<>(g, f, 2);
        Edge<Character> fg = new Edge<>(f, g, 2);

        Edge<Character> cf = new Edge<>(c, f, 4);
        Edge<Character> fc = new Edge<>(f, c, 4);

        Edge<Character> cd = new Edge<>(c, d, 7);
        Edge<Character> dc = new Edge<>(d, c, 7);

        Edge<Character> de = new Edge<>(d, e, 9);
        Edge<Character> ed = new Edge<>(e, d, 9);

        Edge<Character> ef = new Edge<>(e, f, 10);
        Edge<Character> fe = new Edge<>(f, e, 10);

        Edge<Character> df = new Edge<>(d, f, 14);
        Edge<Character> fd = new Edge<>(f, d, 14);

        Edge<Character>[] edgeNames = new Edge[]{ab, ba, ah, ha, bh, hb, bc, cb, ci, ic, hg, gh, hi, ih, ig, gi, gf, fg, cf, fc, cd, dc, de, ed, ef, fe, df, fd};

        Set<Edge<Character>> edges = new HashSet<>();
        for (int s = 0; s < edgeNames.length; s++){
            edges.add(edgeNames[s]);
        }

        Graph<Character> letters = new Graph<>(vertices, edges);
        Set<Vertex<Character>> verticesFound = letters.getVertices();
        Set<Edge<Character>> primMST = GraphAlgorithms.prims(b, letters);


    }
}
