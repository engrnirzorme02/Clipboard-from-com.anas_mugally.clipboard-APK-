package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5063B {

    /* JADX INFO: renamed from: a */
    static final Charset f19293a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    static final Charset f19294b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    static final Charset f19295c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f19296d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f19297e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC5106j f19298f;

    /* JADX INFO: renamed from: com.google.protobuf.B$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo22846a();
    }

    /* JADX INFO: renamed from: com.google.protobuf.B$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.protobuf.B$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean m22847a(int i7);
    }

    /* JADX INFO: renamed from: com.google.protobuf.B$d */
    public interface d extends e {
    }

    /* JADX INFO: renamed from: com.google.protobuf.B$e */
    public interface e extends List, RandomAccess {
        /* JADX INFO: renamed from: c */
        void mo22848c();

        /* JADX INFO: renamed from: d */
        e mo22823d(int i7);

        /* JADX INFO: renamed from: h */
        boolean mo22849h();
    }

    static {
        byte[] bArr = new byte[0];
        f19296d = bArr;
        f19297e = ByteBuffer.wrap(bArr);
        f19298f = AbstractC5106j.m23189k(bArr);
    }

    /* JADX INFO: renamed from: a */
    static Object m22837a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: b */
    static Object m22838b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m22839c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m22840d(byte[] bArr) {
        return m22841e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    static int m22841e(byte[] bArr, int i7, int i8) {
        int iM22844h = m22844h(i8, bArr, i7, i8);
        if (iM22844h == 0) {
            return 1;
        }
        return iM22844h;
    }

    /* JADX INFO: renamed from: f */
    public static int m22842f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m22843g(byte[] bArr) {
        return AbstractC5139z0.m23827s(bArr);
    }

    /* JADX INFO: renamed from: h */
    static int m22844h(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public static String m22845i(byte[] bArr) {
        return new String(bArr, f19294b);
    }
}
