package p179X4;

import android.util.Base64;
import com.google.protobuf.AbstractC5104i;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1990m {

    /* JADX INFO: renamed from: a */
    private final int f6613a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5104i f6614b;

    /* JADX INFO: renamed from: c */
    private final int f6615c;

    /* JADX INFO: renamed from: d */
    private final MessageDigest f6616d;

    /* JADX INFO: renamed from: X4.m$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public C1990m(AbstractC5104i abstractC5104i, int i7, int i8) {
        if (i7 < 0 || i7 >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i7);
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i8);
        }
        if (abstractC5104i.size() > 0 && i8 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i8);
        }
        if (abstractC5104i.size() == 0 && i7 != 0) {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i7);
        }
        this.f6614b = abstractC5104i;
        this.f6615c = i8;
        this.f6613a = (abstractC5104i.size() * 8) - i7;
        this.f6616d = m8338b();
    }

    /* JADX INFO: renamed from: a */
    public static C1990m m8337a(AbstractC5104i abstractC5104i, int i7, int i8) throws a {
        if (i7 < 0 || i7 >= 8) {
            throw new a("Invalid padding: " + i7);
        }
        if (i8 < 0) {
            throw new a("Invalid hash count: " + i8);
        }
        if (abstractC5104i.size() > 0 && i8 == 0) {
            throw new a("Invalid hash count: " + i8);
        }
        if (abstractC5104i.size() != 0 || i7 == 0) {
            return new C1990m(abstractC5104i, i7, i8);
        }
        throw new a("Expected padding of 0 when bitmap length is 0, but got " + i7);
    }

    /* JADX INFO: renamed from: b */
    private static MessageDigest m8338b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e7);
        }
    }

    /* JADX INFO: renamed from: d */
    private int m8339d(long j7, long j8, int i7) {
        return (int) m8343i(j7 + (j8 * ((long) i7)), this.f6613a);
    }

    /* JADX INFO: renamed from: e */
    private static long m8340e(byte[] bArr, int i7) {
        long j7 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j7 |= (((long) bArr[i7 + i8]) & 255) << (i8 * 8);
        }
        return j7;
    }

    /* JADX INFO: renamed from: f */
    private boolean m8341f(int i7) {
        return ((1 << (i7 % 8)) & this.f6614b.mo23093g(i7 / 8)) != 0;
    }

    /* JADX INFO: renamed from: g */
    private byte[] m8342g(String str) {
        return this.f6616d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: i */
    private static long m8343i(long j7, long j8) {
        long j9 = j7 - ((((j7 >>> 1) / j8) << 1) * j8);
        if (j9 < j8) {
            j8 = 0;
        }
        return j9 - j8;
    }

    /* JADX INFO: renamed from: c */
    int m8344c() {
        return this.f6613a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m8345h(String str) {
        if (this.f6613a == 0) {
            return false;
        }
        byte[] bArrM8342g = m8342g(str);
        if (bArrM8342g.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrM8342g.length + " (expected 16)");
        }
        long jM8340e = m8340e(bArrM8342g, 0);
        long jM8340e2 = m8340e(bArrM8342g, 8);
        for (int i7 = 0; i7 < this.f6615c; i7++) {
            if (!m8341f(m8339d(jM8340e, jM8340e2, i7))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f6615c + ", size=" + this.f6613a + ", bitmap=\"" + Base64.encodeToString(this.f6614b.m23167T(), 2) + "\"}";
    }
}
