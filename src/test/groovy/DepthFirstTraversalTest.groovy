import graph.DepthFirstTraversal
import spock.lang.Specification

import static enums.NodeEnum.A
import static enums.NodeEnum.B
import static enums.NodeEnum.C
import static enums.NodeEnum.D
import static enums.NodeEnum.E
import static enums.NodeEnum.F
import static enums.NodeEnum.G
import static enums.NodeEnum.H
import static enums.NodeEnum.I

class DepthFirstTraversalTest extends Specification {

    def "When traverse graph then success"() {
        given:
        def graphMap = Map.of(
                A, Set.of(B, C, D, E),
                E, Set.of(),
                D, Set.of(),
                C, Set.of(),
                B, Set.of(F, G),
                G, Set.of(H, I),
                H, Set.of(F),
                F, Set.of(),
                I, Set.of()
        )

        when:
        def resultedSet = DepthFirstTraversal.process(graphMap, A)

        then:
        resultedSet == Set.of(A, E, D, C, B, G, I, H, F)
    }
}