package p186Y4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C4928n;
import com.google.protobuf.AbstractC5104i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import p063H5.C0554l0;
import p063H5.C0556m0;
import p063H5.C0558n0;
import p115O3.AbstractC1144a;

/* JADX INFO: renamed from: Y4.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2032B {

    /* JADX INFO: renamed from: a */
    private static final Random f6721a = new SecureRandom();

    /* JADX INFO: renamed from: b */
    private static final Continuation f6722b = new Continuation() { // from class: Y4.w
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            return AbstractC2032B.m8439d(task);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8438c(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m8439d(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excM8448m = m8448m(task.getException());
        if (excM8448m instanceof C4928n) {
            throw excM8448m;
        }
        throw new C4928n(excM8448m.getMessage(), C4928n.a.UNKNOWN, excM8448m);
    }

    /* JADX INFO: renamed from: e */
    private static Object m8440e(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Comparator m8441f() {
        return new Comparator() { // from class: Y4.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static int m8442g(boolean z7, boolean z8) {
        if (z7 == z8) {
            return 0;
        }
        return z7 ? 1 : -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m8443h(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = bArr2[i7] & 255;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    /* JADX INFO: renamed from: i */
    public static int m8444i(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
        int iMin = Math.min(abstractC5104i.size(), abstractC5104i2.size());
        for (int i7 = 0; i7 < iMin; i7++) {
            int iMo23093g = abstractC5104i.mo23093g(i7) & 255;
            int iMo23093g2 = abstractC5104i2.mo23093g(i7) & 255;
            if (iMo23093g < iMo23093g2) {
                return -1;
            }
            if (iMo23093g > iMo23093g2) {
                return 1;
            }
        }
        return Integer.compare(abstractC5104i.size(), abstractC5104i2.size());
    }

    /* JADX INFO: renamed from: j */
    public static int m8445j(double d7, double d8) {
        return AbstractC1144a.m4968b(d7, d8);
    }

    /* JADX INFO: renamed from: k */
    public static int m8446k(double d7, long j7) {
        return AbstractC1144a.m4967a(d7, j7);
    }

    /* JADX INFO: renamed from: l */
    public static int m8447l(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i7 = 0; i7 < iMin; i7++) {
            char cCharAt = str.charAt(i7);
            char cCharAt2 = str2.charAt(i7);
            if (cCharAt != cCharAt2) {
                if (Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2)) {
                    return Character.compare(cCharAt, cCharAt2);
                }
                return Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    /* JADX INFO: renamed from: m */
    private static Exception m8448m(Exception exc) {
        if (exc instanceof C0556m0) {
            return m8452q(((C0556m0) exc).m2475a());
        }
        return exc instanceof C0558n0 ? m8452q(((C0558n0) exc).m2476a()) : exc;
    }

    /* JADX INFO: renamed from: n */
    public static void m8449n(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Y4.x
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2032B.m8438c(runtimeException);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    /* JADX INFO: renamed from: o */
    private static void m8450o(Iterator it, Iterator it2, Comparator comparator, InterfaceC2043k interfaceC2043k, InterfaceC2043k interfaceC2043k2) {
        Object objM8440e = m8440e(it);
        Object objM8440e2 = m8440e(it2);
        while (true) {
            if (objM8440e == null && objM8440e2 == null) {
                return;
            }
            boolean z7 = false;
            boolean z8 = true;
            if (objM8440e != null && objM8440e2 != null) {
                int iCompare = comparator.compare(objM8440e, objM8440e2);
                if (iCompare >= 0) {
                    if (iCompare > 0) {
                        z8 = false;
                        z7 = true;
                    } else {
                        z8 = false;
                    }
                }
            } else if (objM8440e == null) {
                z8 = false;
                z7 = true;
            }
            if (z7) {
                interfaceC2043k.accept(objM8440e2);
                objM8440e2 = m8440e(it2);
            } else if (z8) {
                interfaceC2043k2.accept(objM8440e);
                objM8440e = m8440e(it);
            } else {
                objM8440e = m8440e(it);
                objM8440e2 = m8440e(it2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8451p(SortedSet sortedSet, SortedSet sortedSet2, InterfaceC2043k interfaceC2043k, InterfaceC2043k interfaceC2043k2) {
        m8450o(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: Y4.z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }, interfaceC2043k, interfaceC2043k2);
    }

    /* JADX INFO: renamed from: q */
    public static C4928n m8452q(C0554l0 c0554l0) {
        C0556m0 c0556m0M2454c = c0554l0.m2454c();
        return new C4928n(c0556m0M2454c.getMessage(), C4928n.a.m22174h(c0554l0.m2458m().m2466h()), c0556m0M2454c);
    }

    /* JADX INFO: renamed from: r */
    public static Map m8453r(Map map, int i7, final Comparator comparator) {
        if (map.size() <= i7) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: Y4.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            }
        });
        HashMap map2 = new HashMap();
        for (int i8 = 0; i8 < i7; i8++) {
            map2.put(((Map.Entry) arrayList.get(i8)).getKey(), ((Map.Entry) arrayList.get(i8)).getValue());
        }
        return map2;
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m8454s(CharSequence charSequence, int i7, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i7 != 0) {
            sb.append(charSequence);
            for (int i8 = 1; i8 < i7; i8++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static String m8455t(AbstractC5104i abstractC5104i) {
        int size = abstractC5104i.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i7 = 0; i7 < size; i7++) {
            byte bMo23093g = abstractC5104i.mo23093g(i7);
            sb.append(Character.forDigit((bMo23093g & 255) >>> 4, 16));
            sb.append(Character.forDigit(bMo23093g & 15, 16));
        }
        return sb.toString();
    }
}
