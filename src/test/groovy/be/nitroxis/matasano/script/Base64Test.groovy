package be.nitroxis.matasano.script

// FIXME Fix the grab
//@Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')
import spock.lang.Specification

class Base64Test extends Specification {

    def "should convert hexadecimal string to Base64"() {
        expect:
          Base64.hexToBase64(hex) == 'SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t'
        
        where:
          hex = '49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d'
    }
}

