import spock.lang.Specification

class StackPartTest extends Specification {

    def "when parentheses validate then success"() {
        given:
        def parenthesesVersionOne = "({[[{}]]}[([]())])"

        when:
        def isValid = StackPart.isValidParentheses(parenthesesVersionOne)

        then:
        isValid
    }

    def "when parentheses validate then fail"() {
        given:
        def parenthesesVersionTwo = "({[[{]]}[([]())])"

        when:
        def isNotValid = StackPart.isValidParentheses(parenthesesVersionTwo)

        then:
        !isNotValid
    }
}
