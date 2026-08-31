package okhttp3.internal.p320ws;

import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketProtocol {

    /* JADX INFO: renamed from: a */
    public static final WebSocketProtocol f26108a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    /* JADX INFO: renamed from: a */
    public final String m29482a(int i7) {
        if (i7 < 1000 || i7 >= 5000) {
            return "Code must be in range [1000,5000): " + i7;
        }
        if ((1004 > i7 || i7 >= 1007) && (1015 > i7 || i7 >= 3000)) {
            return null;
        }
        return "Code " + i7 + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: b */
    public final void m29483b(C0648e.a cursor, byte[] key) {
        AbstractC6118n.m27187e(cursor, "cursor");
        AbstractC6118n.m27187e(key, "key");
        int length = key.length;
        int i7 = 0;
        do {
            byte[] bArr = cursor.f2557e;
            int i8 = cursor.f2558f;
            int i9 = cursor.f2559r;
            if (bArr != null) {
                while (i8 < i9) {
                    int i10 = i7 % length;
                    bArr[i8] = (byte) (bArr[i8] ^ key[i10]);
                    i8++;
                    i7 = i10 + 1;
                }
            }
        } while (cursor.m3081m() != -1);
    }

    /* JADX INFO: renamed from: c */
    public final void m29484c(int i7) {
        String strM29482a = m29482a(i7);
        if (strM29482a == null) {
            return;
        }
        AbstractC6118n.m27184b(strM29482a);
        throw new IllegalArgumentException(strM29482a.toString());
    }
}
