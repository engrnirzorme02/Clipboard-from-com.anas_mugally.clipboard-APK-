package p360t6;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p318o6.InterfaceC6636T0;

/* JADX INFO: renamed from: t6.O */
/* JADX INFO: loaded from: classes.dex */
final class C7115O {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1879i f28403a;

    /* JADX INFO: renamed from: b */
    private final Object[] f28404b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6636T0[] f28405c;

    /* JADX INFO: renamed from: d */
    private int f28406d;

    public C7115O(InterfaceC1879i interfaceC1879i, int i7) {
        this.f28403a = interfaceC1879i;
        this.f28404b = new Object[i7];
        this.f28405c = new InterfaceC6636T0[i7];
    }

    /* JADX INFO: renamed from: a */
    public final void m31426a(InterfaceC6636T0 interfaceC6636T0, Object obj) {
        Object[] objArr = this.f28404b;
        int i7 = this.f28406d;
        objArr[i7] = obj;
        InterfaceC6636T0[] interfaceC6636T0Arr = this.f28405c;
        this.f28406d = i7 + 1;
        AbstractC6118n.m27185c(interfaceC6636T0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC6636T0Arr[i7] = interfaceC6636T0;
    }

    /* JADX INFO: renamed from: b */
    public final void m31427b(InterfaceC1879i interfaceC1879i) {
        int length = this.f28405c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            InterfaceC6636T0 interfaceC6636T0 = this.f28405c[length];
            AbstractC6118n.m27184b(interfaceC6636T0);
            interfaceC6636T0.m28123K0(interfaceC1879i, this.f28404b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
