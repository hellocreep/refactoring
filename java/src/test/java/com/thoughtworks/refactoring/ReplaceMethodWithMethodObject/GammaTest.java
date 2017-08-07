package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by yzeng on 07/08/2017.
 */
public class GammaTest {
    private Gamma gamma;

    @Before
    public void setUp() {
        gamma = new Gamma(new UserAccount(), 1,2,3);
    }

    @Test
    public void shouldInitGamma() {
        assertThat(gamma, instanceOf(Gamma.class));
    }

    @Test
    public void computeMethodShouldBeSameAsGammaFunctionOfOriginalClass() {
        assertThat(gamma.compute(), is(697));
    }

}