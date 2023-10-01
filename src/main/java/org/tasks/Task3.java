package org.tasks;

import java.util.List;

public class Task3 {

    public int downSearchAlgorithm(List<List<Integer>> listOfPairs) {

        int graphsCount = 0;
        boolean[] visited = new boolean[listOfPairs.size()];

        for (int i = 0; i < listOfPairs.size(); i++) {
            if (!visited[i]) {
                dfs(listOfPairs, visited, i);
                graphsCount++;
            }
        }
        System.out.println(graphsCount);
        return graphsCount;
    }

    private void dfs(List<List<Integer>> connections, boolean[] visited, int index) {
        visited[index] = true;
        List<Integer> connection = connections.get(index);

        for (int i = 0; i < connections.size(); i++) {
            if (!visited[i] && visitedShares(connection, connections.get(i))) {
                dfs(connections, visited, i);
            }
        }
    }

    private boolean visitedShares(List<Integer> connection1, List<Integer> connection2) {
        for (int vertex : connection1) {
            if (connection2.contains(vertex)) {
                return true;
            }
        }
        return false;
    }

}
