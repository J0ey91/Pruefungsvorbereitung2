data class GraphJoey (val adjacencyMap : MutableMap<VertexJoey, MutableSet<VertexJoey>> = mutableMapOf()) {
    fun addVertex(v: VertexJoey) {
        if (!adjacencyMap.contains(v)) {
            adjacencyMap[v] = mutableSetOf()
        }
    }

    fun removeVertex(v: VertexJoey) {
        if (adjacencyMap.contains(v)) {
            adjacencyMap.remove(v)
            val it = adjacencyMap.iterator()
            while (it.hasNext()) {
                it.next().value.remove(v)
            }
        } else {
            throw NoSuchElementException("Vertex nicht im Graphen!")
        }
    }

    fun addEdge(fromVertex: VertexJoey, toVertex: VertexJoey) {
        if (adjacencyMap.contains(fromVertex) && adjacencyMap.contains(toVertex)) {
            adjacencyMap[fromVertex]!!.add(toVertex)
        }
    }

    fun removeEdge(fromVertex: VertexJoey, toVertex: VertexJoey) {
        if (adjacencyMap.contains(fromVertex)) {
            if (adjacencyMap[fromVertex]!!.contains(toVertex)) {
                adjacencyMap[fromVertex]!!.remove(toVertex)
            } else {
                throw Exception("Keine Kante zum anderen Vertex!")
            }
        } else {
            throw NoSuchElementException("Vertex nicht im Graphen!")
        }
    }
    /*
    fun deepFirstSearch(startVertex : VertexJoey) : Set<VertexJoey> {
        val visited = mutableSetOf<VertexJoey>()
        val stack = Stack<VertexJoey>()
        stack.push(startVertex)
        while (!stack.isEmpty()) {
            val curVertex = stack.pop()
            if (!visited.contains(curVertex)) {
                visited.add(curVertex)
                adjacencyMap[curVertex]?.forEach {
                    if (!visited.contains(it)) {
                        stack.push(it)
                    }
                }
            }
        }
        return visited
    }


    fun breitenSuche(startVertex : VertexJoey) : Set<VertexJoey> {
        val visited = mutableSetOf<VertexJoey>()
        val queue = LinkedList<VertexJoey>()
        queue.offer(startVertex)
        while (!queue.isEmpty()) {
            val curVertex = queue.poll()
            if (!visited.contains(curVertex)) {
                visited.add(curVertex)
                adjacencyMap[curVertex]?.forEach {
                    if (!visited.contains(it)) {
                        queue.offer(it)
                    }
                }
            }
        }
        return visited
    }

}
*/
}
data class VertexJoey(val name : String = "") {


}