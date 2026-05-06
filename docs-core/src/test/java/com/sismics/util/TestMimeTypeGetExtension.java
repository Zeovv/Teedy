package com.sismics.util;

import com.sismics.util.mime.MimeType;
import com.sismics.util.mime.MimeTypeUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link MimeTypeUtil#getFileExtension(String)}.
 */
public class TestMimeTypeGetExtension {

    @Test
    public void testZip() {
        Assert.assertEquals("zip", MimeTypeUtil.getFileExtension(MimeType.APPLICATION_ZIP));
    }

    @Test
    public void testGif() {
        Assert.assertEquals("gif", MimeTypeUtil.getFileExtension(MimeType.IMAGE_GIF));
    }

    @Test
    public void testJpeg() {
        Assert.assertEquals("jpg", MimeTypeUtil.getFileExtension(MimeType.IMAGE_JPEG));
    }

    @Test
    public void testPng() {
        Assert.assertEquals("png", MimeTypeUtil.getFileExtension(MimeType.IMAGE_PNG));
    }

    @Test
    public void testPdf() {
        Assert.assertEquals("pdf", MimeTypeUtil.getFileExtension(MimeType.APPLICATION_PDF));
    }

    @Test
    public void testOdt() {
        Assert.assertEquals("odt", MimeTypeUtil.getFileExtension(MimeType.OPEN_DOCUMENT_TEXT));
    }

    @Test
    public void testDocx() {
        Assert.assertEquals("docx", MimeTypeUtil.getFileExtension(MimeType.OFFICE_DOCUMENT));
    }

    @Test
    public void testTxt() {
        Assert.assertEquals("txt", MimeTypeUtil.getFileExtension(MimeType.TEXT_PLAIN));
    }

    @Test
    public void testCsv() {
        Assert.assertEquals("csv", MimeTypeUtil.getFileExtension(MimeType.TEXT_CSV));
    }

    @Test
    public void testMp4() {
        Assert.assertEquals("mp4", MimeTypeUtil.getFileExtension(MimeType.VIDEO_MP4));
    }

    @Test
    public void testWebm() {
        Assert.assertEquals("webm", MimeTypeUtil.getFileExtension(MimeType.VIDEO_WEBM));
    }

    @Test
    public void testDefault() {
        Assert.assertEquals("bin", MimeTypeUtil.getFileExtension("application/octet-stream"));
    }
}
