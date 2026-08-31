package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.common.util.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3756k {
    /* JADX INFO: renamed from: a */
    public static void m18186a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m18187b(InputStream inputStream, OutputStream outputStream) {
        return m18188c(inputStream, outputStream, false, 1024);
    }

    /* JADX INFO: renamed from: c */
    public static long m18188c(InputStream inputStream, OutputStream outputStream, boolean z7, int i7) {
        byte[] bArr = new byte[i7];
        long j7 = 0;
        while (true) {
            try {
                int i8 = inputStream.read(bArr, 0, i7);
                if (i8 == -1) {
                    break;
                }
                j7 += (long) i8;
                outputStream.write(bArr, 0, i8);
            } catch (Throwable th) {
                if (z7) {
                    m18186a(inputStream);
                    m18186a(outputStream);
                }
                throw th;
            }
        }
        if (z7) {
            m18186a(inputStream);
            m18186a(outputStream);
        }
        return j7;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m18189d(InputStream inputStream, boolean z7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m18188c(inputStream, byteArrayOutputStream, z7, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
