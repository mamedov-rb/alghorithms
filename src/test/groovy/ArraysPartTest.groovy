import spock.lang.Specification

class ArraysPartTest extends Specification {

    def "return new length as it was removed all instances of element"() {
        given:
        def array = [1, 1, 2, 3, 1] as int[]

        when:
        def newLength = ArraysPart.removeElementReturnNewLength(array, 2)

        then:
        newLength == 4
    }

    def "return new length as it was removed all duplicates"() {
        given:
        def array = [1, 2, 3, 4, 4, 5] as int[]

        when:
        def newLength = ArraysPart.removeDuplicatesReturningNewLength(array)

        then:
        newLength == 4
    }
}