package net.tjololo.quarkus.sample;

import io.quarkus.test.junit.SubstrateTest;

@SubstrateTest
public class NativeHelloResourceIT extends HelloResourceTest {

    // Execute the same tests but in native mode.
}