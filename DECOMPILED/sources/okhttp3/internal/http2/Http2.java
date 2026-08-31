package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0651h;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class Http2 {

    /* JADX INFO: renamed from: a */
    public static final Http2 f25822a = new Http2();

    /* JADX INFO: renamed from: b */
    public static final C0651h f25823b = C0651h.f2562d.m3114d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c */
    private static final String[] f25824c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d */
    private static final String[] f25825d = new String[64];

    /* JADX INFO: renamed from: e */
    private static final String[] f25826e;

    static {
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            AbstractC6118n.m27186d(binaryString, "toBinaryString(it)");
            strArr[i7] = AbstractC6406h.m27550D(Util.m28780t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f25826e = strArr;
        String[] strArr2 = f25825d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = strArr2[i8] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f25825d;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            strArr3[i12 | 8] = strArr3[i11] + '|' + strArr3[i10] + "|PADDED";
        }
        int length = f25825d.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f25825d;
            if (strArr4[i13] == null) {
                strArr4[i13] = f25826e[i13];
            }
        }
    }

    private Http2() {
    }

    /* JADX INFO: renamed from: a */
    public final String m29147a(int i7, int i8) {
        String str;
        if (i8 == 0) {
            return "";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4 || i7 == 6) {
                return i8 == 1 ? "ACK" : f25826e[i8];
            }
            if (i7 != 7 && i7 != 8) {
                String[] strArr = f25825d;
                if (i8 < strArr.length) {
                    str = strArr[i8];
                    AbstractC6118n.m27184b(str);
                } else {
                    str = f25826e[i8];
                }
                String str2 = str;
                if (i7 != 5 || (i8 & 4) == 0) {
                    return (i7 != 0 || (i8 & 32) == 0) ? str2 : AbstractC6406h.m27551E(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return AbstractC6406h.m27551E(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f25826e[i8];
    }

    /* JADX INFO: renamed from: b */
    public final String m29148b(int i7) {
        String[] strArr = f25824c;
        return i7 < strArr.length ? strArr[i7] : Util.m28780t("0x%02x", Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: c */
    public final String m29149c(boolean z7, int i7, int i8, int i9, int i10) {
        return Util.m28780t("%s 0x%08x %5d %-13s %s", z7 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), m29148b(i9), m29147a(i9, i10));
    }
}
