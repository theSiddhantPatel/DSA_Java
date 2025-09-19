#include <bits/stdc++.h>
using namespace std;

int main()
{
    int numNodes, numEdges, targetCount, days = 1, activeNodes = 0;
    cin >> numNodes >> numEdges;

    vector<set<int>> adjacencyList(numNodes);
    for (int i = 0, node1, node2; i < numEdges; ++i)
    {
        cin >> node1 >> node2;
        adjacencyList[node1].insert(node2);
        adjacencyList[node2].insert(node1);
    }

    cin >> targetCount;

    vector<bool> currentState(numNodes, true);
    activeNodes = numNodes;

    while (activeNodes < targetCount)
    {
        vector<bool> nextState(numNodes, false);

        for (int node = 0; node < numNodes; ++node)
        {
            int neighborCount = 0;
            for (int neighbor : adjacencyList[node])
                neighborCount += currentState[neighbor];

            if (currentState[node] && neighborCount == 3)
                nextState[node] = true;
            else if (!currentState[node] && neighborCount < 3)
                nextState[node] = true;
        }

        currentState = nextState;
        activeNodes += count(currentState.begin(), currentState.end(), true);
        ++days;
    }

    cout << days;
    return 0;
}
