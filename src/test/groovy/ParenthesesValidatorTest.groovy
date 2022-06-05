import spock.lang.Specification

class ParenthesesValidatorTest extends Specification {

    def "when parentheses validate then success"() {
        given:
        def parenthesesVersionOne = "({[[{}]]}[([]())])"

        when:
        def isValid = ParenthesesValidator.isValidParentheses(parenthesesVersionOne)

        then:
        isValid
    }

    def "when parentheses validate then fail"() {
        given:
        def parenthesesVersionTwo = "({[[{]]}[([]())])"

        when:
        def isValid = ParenthesesValidator.isValidParentheses(parenthesesVersionTwo)

        then:
        !isValid
    }
}
