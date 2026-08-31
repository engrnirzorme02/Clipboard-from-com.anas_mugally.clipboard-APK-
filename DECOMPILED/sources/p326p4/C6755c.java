package p326p4;

import java.util.HashMap;

/* JADX INFO: renamed from: p4.c */
/* JADX INFO: loaded from: classes.dex */
public class C6755c implements InterfaceC6756d {

    /* JADX INFO: renamed from: a */
    private final int f27134a;

    public C6755c(int i7) {
        this.f27134a = i7;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m29541b(StackTraceElement[] stackTraceElementArr, int i7, int i8) {
        int i9 = i8 - i7;
        if (i8 + i9 > stackTraceElementArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!stackTraceElementArr[i7 + i10].equals(stackTraceElementArr[i8 + i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static StackTraceElement[] m29542c(StackTraceElement[] stackTraceElementArr, int i7) {
        int i8;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !m29541b(stackTraceElementArr, num.intValue(), i9)) {
                stackTraceElementArr2[i10] = stackTraceElementArr[i9];
                i10++;
                i11 = 1;
                i8 = i9;
            } else {
                int iIntValue = i9 - num.intValue();
                if (i11 < i7) {
                    System.arraycopy(stackTraceElementArr, i9, stackTraceElementArr2, i10, iIntValue);
                    i10 += iIntValue;
                    i11++;
                }
                i8 = (iIntValue - 1) + i9;
            }
            map.put(stackTraceElement, Integer.valueOf(i9));
            i9 = i8 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        return stackTraceElementArr3;
    }

    @Override // p326p4.InterfaceC6756d
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo29540a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrM29542c = m29542c(stackTraceElementArr, this.f27134a);
        return stackTraceElementArrM29542c.length < stackTraceElementArr.length ? stackTraceElementArrM29542c : stackTraceElementArr;
    }
}
