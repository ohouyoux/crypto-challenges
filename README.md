The Matasano crypto challenges are 48 exercises that demonstrate attacks on real world ciphers and protocols.<br> Exercises exploit both badly designed systems and subtle implementation bugs in theoretically rock solid crypto.
<br><br>
This repository contains my solutions to those exercises.
<br><br>
Quick links to solutions:
<br><br>
1.1 Convert hex to base64<br>
1.2 Fixed XOR<br>
1.3 Single-byte XOR cipher<br>
1.4 Detect single-character XOR<br>
1.5 Implement repeating-key XOR<br>
1.6 Break repeating-key XOR<br>
1.7 AES in ECB mode<br>
1.8 Detect AES in ECB mode<br>
<br>
2.1 Implement PKCS#7 padding<br>
2.2 Implement CBC mode<br>
2.3 An ECB/CBC detection oracle<br>
2.4 Byte-at-a-time ECB decryption (Simple)<br>
2.5 ECB cut-and-paste<br>
2.6 Byte-at-a-time ECB decryption (Harder)<br>
2.7 PKCS#7 padding validation<br>
2.8 CBC bitflipping attacks<br>
<br>
3.1 The CBC padding oracle<br>
3.2 Implement CTR, the stream cipher mode<br>
3.3 Break fixed-nonce CTR mode using substitions<br>
3.4 Break fixed-nonce CTR statistically<br>
3.5 Implement the MT19937 Mersenne Twister RNG<br>
3.6 Crack an MT19937 seed<br>
3.7 Clone an MT19937 RNG from its output<br>
3.8 Create the MT19937 stream cipher and break it<br>
<br>
4.1 Break "random access read/write" AES CTR<br>
4.2 CTR bitflipping<br>
4.3 Recover the key from CBC with IV=Key<br>
4.4 Implement a SHA-1 keyed MAC<br>
4.5 Break a SHA-1 keyed MAC using length extension<br>
4.6 Break an MD4 keyed MAC using length extension<br>
4.7 Implement and break HMAC-SHA1 with an artificial timing leak<br>
4.8 Break HMAC-SHA1 with a slightly less artificial timing leak<br>
<br>
5.1 Implement Diffie-Hellman<br>
5.2 Implement a MITM key-fixing attack on Diffie-Hellman with parameter injection<br>
5.3 Implement DH with negotiated groups, and break with malicious "g" parameters<br>
5.4 Implement Secure Remote Password (SRP)<br>
5.5 Break SRP with a zero key<br>
5.6 Offline dictionary attack on simplified SRP<br>
5.7 Implement RSA<br>
5.8 Implement an E=3 RSA Broadcast attack<br>
<br>
6.1 Implement unpadded message recovery oracle<br>
6.2 Bleichenbacher's e=3 RSA Attack<br>
6.3 DSA key recovery from nonce<br>
6.4 DSA nonce recovery from repeated nonce<br>
6.5 DSA parameter tampering<br>
6.6 RSA parity oracle<br>
6.7 Bleichenbacher's PKCS 1.5 Padding Oracle (Simple Case)<br>
6.8 Bleichenbacher's PKCS 1.5 Padding Oracle (Complete Case)<br>
<br>
7.1 CBC-MAC Message Forgery<br>
7.2 Hashing with CBC-MAC<br>
7.3 Compression Ratio Side-Channel Attacks<br>
7.4 Iterated Hash Function Multicollisions<br>
7.5 Kelsey and Schneier's Expandable Messages<br>
7.6 Kelsey and Kohno's Nostradamus Attack<br>
7.7 MD4 Collisions<br>
7.8 RC4 Single-Byte Biases<br>
