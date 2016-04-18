package be.nitroxis.matasano.script

// FIXME Fix the grab
//@Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')
import spock.lang.Specification

class XorTest extends Specification {

    def "should apply the exclusive disjunction"() {
        expect:
          Xor.apply(hex1, hex2) == '746865206b696420646f6e277420706c6179'

        where:
          hex1 = '1c0111001f010100061a024b53535009181c'
          hex2 = '686974207468652062756c6c277320657965'
    }
}
