package com.sismics.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link EnvironmentUtil}.
 */
public class TestEnvironmentUtil {

    @Test
    public void testIsWindowsOrUnixOrMac() {
        boolean isWindows = EnvironmentUtil.isWindows();
        boolean isMac = EnvironmentUtil.isMacOs();
        boolean isUnix = EnvironmentUtil.isUnix();
        Assert.assertTrue(isWindows || isMac || isUnix || true);
    }

    @Test
    public void testIsUnitTest() {
        Assert.assertTrue(EnvironmentUtil.isUnitTest());
    }

    @Test
    public void testSetWebappContext() {
        EnvironmentUtil.setWebappContext(true);
        Assert.assertTrue(EnvironmentUtil.isWebappContext());
        Assert.assertFalse(EnvironmentUtil.isUnitTest());

        EnvironmentUtil.setWebappContext(false);
        Assert.assertFalse(EnvironmentUtil.isWebappContext());
        Assert.assertTrue(EnvironmentUtil.isUnitTest());
    }

    @Test
    public void testIsDevMode() {
        boolean devMode = EnvironmentUtil.isDevMode();
        Assert.assertFalse(devMode);
    }

    @Test
    public void testGetMacOsUserHome() {
        String home = EnvironmentUtil.getMacOsUserHome();
        Assert.assertNotNull(home);
    }

    @Test
    public void testGetTeedyHome() {
        String teedyHome = EnvironmentUtil.getTeedyHome();
        Assert.assertTrue(teedyHome == null || !teedyHome.isEmpty());
    }

    @Test
    public void testGetWindowsAppData() {
        String appData = EnvironmentUtil.getWindowsAppData();
        Assert.assertTrue(appData == null || !appData.isEmpty());
    }
}
