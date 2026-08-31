package p336q6;

import com.google.android.gms.common.api.C3553a;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: q6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6854j {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6851g m30029a(int i7, EnumC6845a enumC6845a, InterfaceC5367l interfaceC5367l) {
        if (i7 == -2) {
            return enumC6845a == EnumC6845a.SUSPEND ? new C6849e(InterfaceC6851g.f27476q.m30027a(), interfaceC5367l) : new C6863s(1, enumC6845a, interfaceC5367l);
        }
        if (i7 == -1) {
            if (enumC6845a == EnumC6845a.SUSPEND) {
                return new C6863s(1, EnumC6845a.DROP_OLDEST, interfaceC5367l);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == 0) {
            return enumC6845a == EnumC6845a.SUSPEND ? new C6849e(0, interfaceC5367l) : new C6863s(1, enumC6845a, interfaceC5367l);
        }
        if (i7 != Integer.MAX_VALUE) {
            return enumC6845a == EnumC6845a.SUSPEND ? new C6849e(i7, interfaceC5367l) : new C6863s(i7, enumC6845a, interfaceC5367l);
        }
        return new C6849e(C3553a.e.API_PRIORITY_OTHER, interfaceC5367l);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6851g m30030b(int i7, EnumC6845a enumC6845a, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            enumC6845a = EnumC6845a.SUSPEND;
        }
        if ((i8 & 4) != 0) {
            interfaceC5367l = null;
        }
        return m30029a(i7, enumC6845a, interfaceC5367l);
    }
}
