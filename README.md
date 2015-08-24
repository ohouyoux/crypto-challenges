The Matasano crypto challenges are 48 exercises that demonstrate attacks on real world ciphers and protocols. Exercises exploit both badly designed systems and subtle implementation bugs in theoretically rock solid crypto.

This repository contains my solutions to those exercises. A

Quick links to solutions:

1.1 Convert hex to base64
1.2 Fixed XOR
1.3 Single-byte XOR cipher
1.4 Detect single-character XOR
1.5 Implement repeating-key XOR
1.6 Break repeating-key XOR
1.7 AES in ECB mode
1.8 Detect AES in ECB mode

2.1 Implement PKCS#7 padding
2.2 Implement CBC mode
2.3 An ECB/CBC detection oracle
2.4 Byte-at-a-time ECB decryption (Simple)
2.5 ECB cut-and-paste
2.6 Byte-at-a-time ECB decryption (Harder)
2.7 PKCS#7 padding validation
2.8 CBC bitflipping attacks

3.1 The CBC padding oracle
3.2 Implement CTR, the stream cipher mode
3.3 Break fixed-nonce CTR mode using substitions
3.4 Break fixed-nonce CTR statistically
3.5 Implement the MT19937 Mersenne Twister RNG
3.6 Crack an MT19937 seed
3.7 Clone an MT19937 RNG from its output
3.8 Create the MT19937 stream cipher and break it

4.1 Break "random access read/write" AES CTR
4.2 CTR bitflipping
4.3 Recover the key from CBC with IV=Key
4.4 Implement a SHA-1 keyed MAC
4.5 Break a SHA-1 keyed MAC using length extension
4.6 Break an MD4 keyed MAC using length extension
4.7 Implement and break HMAC-SHA1 with an artificial timing leak
4.8 Break HMAC-SHA1 with a slightly less artificial timing leak

5.1 Implement Diffie-Hellman
5.2 Implement a MITM key-fixing attack on Diffie-Hellman with parameter injection
5.3 Implement DH with negotiated groups, and break with malicious "g" parameters
5.4 Implement Secure Remote Password (SRP)
5.5 Break SRP with a zero key
5.6 Offline dictionary attack on simplified SRP
5.7 Implement RSA
5.8 Implement an E=3 RSA Broadcast attack

6.1 Implement unpadded message recovery oracle
6.2 Bleichenbacher's e=3 RSA Attack
6.3 DSA key recovery from nonce
6.4 DSA nonce recovery from repeated nonce
6.5 DSA parameter tampering
6.6 RSA parity oracle
6.7 Bleichenbacher's PKCS 1.5 Padding Oracle (Simple Case)
6.8 Bleichenbacher's PKCS 1.5 Padding Oracle (Complete Case)

7.1 CBC-MAC Message Forgery
7.2 Hashing with CBC-MAC
7.3 Compression Ratio Side-Channel Attacks
7.4 Iterated Hash Function Multicollisions
7.5 Kelsey and Schneier's Expandable Messages
7.6 Kelsey and Kohno's Nostradamus Attack
7.7 MD4 Collisions
7.8 RC4 Single-Byte Biases
