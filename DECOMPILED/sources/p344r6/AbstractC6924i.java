package p344r6;

import p336q6.EnumC6845a;
import p352s6.C7051h;
import p352s6.InterfaceC7054k;

/* JADX INFO: renamed from: r6.i */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6924i {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6918c m30377a(InterfaceC6918c interfaceC6918c, int i7, EnumC6845a enumC6845a) {
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i7).toString());
        }
        if (i7 == -1 && enumC6845a != EnumC6845a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == -1) {
            enumC6845a = EnumC6845a.DROP_OLDEST;
            i7 = 0;
        }
        int i8 = i7;
        EnumC6845a enumC6845a2 = enumC6845a;
        if (interfaceC6918c instanceof InterfaceC7054k) {
            return InterfaceC7054k.a.m31141a((InterfaceC7054k) interfaceC6918c, null, i8, enumC6845a2, 1, null);
        }
        return new C7051h(interfaceC6918c, null, i8, enumC6845a2, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6918c m30378b(InterfaceC6918c interfaceC6918c, int i7, EnumC6845a enumC6845a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -2;
        }
        if ((i8 & 2) != 0) {
            enumC6845a = EnumC6845a.SUSPEND;
        }
        return AbstractC6920e.m30355a(interfaceC6918c, i7, enumC6845a);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6918c m30379c(InterfaceC6918c interfaceC6918c) {
        return m30378b(interfaceC6918c, -1, null, 2, null);
    }
}
