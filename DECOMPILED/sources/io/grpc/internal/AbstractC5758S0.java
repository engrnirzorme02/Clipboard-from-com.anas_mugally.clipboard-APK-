package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p063H5.AbstractC0518M;
import p063H5.C0530Z;
import p122P3.AbstractC1199c;
import p136R3.AbstractC1331a;

/* JADX INFO: renamed from: io.grpc.internal.S0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5758S0 {

    /* JADX INFO: renamed from: a */
    private static final Logger f22268a = Logger.getLogger(AbstractC5758S0.class.getName());

    /* JADX INFO: renamed from: b */
    private static final byte[] f22269b = "-bin".getBytes(AbstractC1199c.f4277a);

    /* JADX INFO: renamed from: a */
    private static boolean m25693a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i7 = length; i7 < bArr.length; i7++) {
            if (bArr[i7] != bArr2[i7 - length]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m25694b(byte[] bArr) {
        for (byte b7 : bArr) {
            if (b7 < 32 || b7 > 126) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static byte[][] m25695c(byte[][] bArr, int i7) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(bArr[i8]);
        }
        while (i7 < bArr.length) {
            byte[] bArr2 = bArr[i7];
            byte[] bArr3 = bArr[i7 + 1];
            if (m25693a(bArr2, f22269b)) {
                int i9 = 0;
                for (int i10 = 0; i10 <= bArr3.length; i10++) {
                    if (i10 == bArr3.length || bArr3[i10] == 44) {
                        byte[] bArrM5694b = AbstractC1331a.m5692a().m5694b(new String(bArr3, i9, i10 - i9, AbstractC1199c.f4277a));
                        arrayList.add(bArr2);
                        arrayList.add(bArrM5694b);
                        i9 = i10 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i7 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m25696d(C0530Z c0530z) {
        byte[][] bArrM2170d = AbstractC0518M.m2170d(c0530z);
        if (bArrM2170d == null) {
            return new byte[0][];
        }
        int i7 = 0;
        for (int i8 = 0; i8 < bArrM2170d.length; i8 += 2) {
            byte[] bArr = bArrM2170d[i8];
            byte[] bArr2 = bArrM2170d[i8 + 1];
            if (m25693a(bArr, f22269b)) {
                bArrM2170d[i7] = bArr;
                bArrM2170d[i7 + 1] = AbstractC0518M.f1938b.m5697e(bArr2).getBytes(AbstractC1199c.f4277a);
            } else {
                if (m25694b(bArr2)) {
                    bArrM2170d[i7] = bArr;
                    bArrM2170d[i7 + 1] = bArr2;
                } else {
                    String str = new String(bArr, AbstractC1199c.f4277a);
                    f22268a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
                }
            }
            i7 += 2;
        }
        return i7 == bArrM2170d.length ? bArrM2170d : (byte[][]) Arrays.copyOfRange(bArrM2170d, 0, i7);
    }

    /* JADX INFO: renamed from: e */
    public static byte[][] m25697e(byte[][] bArr) {
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            byte[] bArr2 = bArr[i7];
            int i8 = i7 + 1;
            byte[] bArr3 = bArr[i8];
            if (m25693a(bArr2, f22269b)) {
                for (byte b7 : bArr3) {
                    if (b7 == 44) {
                        return m25695c(bArr, i7);
                    }
                }
                bArr[i8] = AbstractC1331a.m5692a().m5694b(new String(bArr3, AbstractC1199c.f4277a));
            }
        }
        return bArr;
    }
}
