package org.ansj.test;

import org.ansj.dic.impl.Url2Stream;
import org.junit.Test;

import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public class ESAnalysisAnsjTests {

    @Test
    public void testDefaultsIcuAnalysis() throws InterruptedException, ExecutionException {
        // System.out.println(analysis);

    }

    @Test
    public void testHTTP() {
        InputStream stream = Url2Stream.stream("http://localhost:8000/test.txt");
        System.out.println(stream.toString());
    }
}
