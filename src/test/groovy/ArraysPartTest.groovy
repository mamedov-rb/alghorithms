import spock.lang.Specification

class ArraysPartTest extends Specification {

    def "return new length as it was removed all duplicates"() {
        given:
        def array = [1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5] as int[]

        when:
        def newLength = ArraysPart.removeDuplicatesReturningNewLength(array)

        then:
        newLength == 5
    }

    def "return new length as it was removed all instances of element"() {
        given:
        def array = [1, 1, 2, 3, 1] as int[]

        when:
        def newLength = ArraysPart.removeElementReturnNewLength(array, 2)

        then:
        newLength == 4
    }

    def "return new length as it was removed all duplicates max two allowed"() {
        given:
        def array = [1, 1, 1, 2, 3, 4] as int[]

        when:
        def newLength = ArraysPart.removeDuplicatesWithMaxTwoAllowedReturningNewLength(array)

        then:
        newLength == 5
    }

    def "move zeros to tail returning new array"() {
        given:
        def array = [0, 1, 3, 7, 0, 0, 0, 4] as int[]

        when:
        def changedArray = ArraysPart.moveZerosToTailReturningNewArray(array)

        then:
        changedArray == [1, 3, 7, 4, 0, 0, 0, 0] as int[]
    }
}