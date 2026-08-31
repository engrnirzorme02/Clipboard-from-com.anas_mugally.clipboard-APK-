package p072I6;

import kotlin.jvm.internal.AbstractC6118n;
import p302m6.C6402d;

/* JADX INFO: renamed from: I6.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643E {
    /* JADX INFO: renamed from: a */
    public static final byte[] m2962a(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        byte[] bytes = str.getBytes(C6402d.f24428b);
        AbstractC6118n.m27186d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: b */
    public static final String m2963b(byte[] bArr) {
        AbstractC6118n.m27187e(bArr, "<this>");
        return new String(bArr, C6402d.f24428b);
    }
}
