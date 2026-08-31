package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2534u {

    /* JADX INFO: renamed from: a */
    static final Charset f9723a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    static final Charset f9724b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    static final Charset f9725c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f9726d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f9727e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2514g f9728f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean m11644a(int i7);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        /* JADX INFO: renamed from: c */
        void mo11126c();

        /* JADX INFO: renamed from: d */
        b mo10992d(int i7);

        /* JADX INFO: renamed from: h */
        boolean mo11127h();
    }

    static {
        byte[] bArr = new byte[0];
        f9726d = bArr;
        f9727e = ByteBuffer.wrap(bArr);
        f9728f = AbstractC2514g.m11186i(bArr);
    }

    /* JADX INFO: renamed from: a */
    static Object m11637a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: b */
    static Object m11638b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m11639c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m11640d(byte[] bArr) {
        return m11641e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    static int m11641e(byte[] bArr, int i7, int i8) {
        int iM11643g = m11643g(i8, bArr, i7, i8);
        if (iM11643g == 0) {
            return 1;
        }
        return iM11643g;
    }

    /* JADX INFO: renamed from: f */
    public static int m11642f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* JADX INFO: renamed from: g */
    static int m11643g(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }
}
