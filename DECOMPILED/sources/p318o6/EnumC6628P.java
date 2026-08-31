package p318o6;

import p145S5.C1434l;
import p173W5.AbstractC1877g;
import p173W5.InterfaceC1875e;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p238e6.InterfaceC5371p;
import p368u6.AbstractC7196a;
import p368u6.AbstractC7197b;

/* JADX INFO: renamed from: o6.P */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6628P {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ InterfaceC2059a f24919f = AbstractC2060b.m8524a(m28105c());

    /* JADX INFO: renamed from: o6.P$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24920a;

        static {
            int[] iArr = new int[EnumC6628P.values().length];
            try {
                iArr[EnumC6628P.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6628P.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6628P.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6628P.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24920a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m28106d(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e interfaceC1875e) {
        int i7 = a.f24920a[ordinal()];
        if (i7 == 1) {
            AbstractC7196a.m31765c(interfaceC5371p, obj, interfaceC1875e);
            return;
        }
        if (i7 == 2) {
            AbstractC1877g.m7778a(interfaceC5371p, obj, interfaceC1875e);
        } else if (i7 == 3) {
            AbstractC7197b.m31766a(interfaceC5371p, obj, interfaceC1875e);
        } else if (i7 != 4) {
            throw new C1434l();
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28107h() {
        return this == LAZY;
    }
}
