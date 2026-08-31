package p145S5;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: S5.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1431i {

    /* JADX INFO: renamed from: S5.i$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4950a;

        static {
            int[] iArr = new int[EnumC1433k.values().length];
            try {
                iArr[EnumC1433k.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1433k.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1433k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4950a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1429g m6065a(EnumC1433k mode, InterfaceC5356a initializer) {
        AbstractC6118n.m27187e(mode, "mode");
        AbstractC6118n.m27187e(initializer, "initializer");
        int i7 = a.f4950a[mode.ordinal()];
        int i8 = 2;
        if (i7 == 1) {
            AbstractC6112h abstractC6112h = null;
            return new C1439q(initializer, abstractC6112h, i8, abstractC6112h);
        }
        if (i7 == 2) {
            return new C1438p(initializer);
        }
        if (i7 == 3) {
            return new C1445w(initializer);
        }
        throw new C1434l();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1429g m6066b(InterfaceC5356a initializer) {
        AbstractC6118n.m27187e(initializer, "initializer");
        AbstractC6112h abstractC6112h = null;
        return new C1439q(initializer, abstractC6112h, 2, abstractC6112h);
    }
}
