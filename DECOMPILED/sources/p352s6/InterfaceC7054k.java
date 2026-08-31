package p352s6;

import p173W5.C1880j;
import p173W5.InterfaceC1879i;
import p336q6.EnumC6845a;
import p344r6.InterfaceC6918c;

/* JADX INFO: renamed from: s6.k */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7054k extends InterfaceC6918c {

    /* JADX INFO: renamed from: s6.k$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC6918c m31141a(InterfaceC7054k interfaceC7054k, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i8 & 1) != 0) {
                interfaceC1879i = C1880j.f6044a;
            }
            if ((i8 & 2) != 0) {
                i7 = -3;
            }
            if ((i8 & 4) != 0) {
                enumC6845a = EnumC6845a.SUSPEND;
            }
            return interfaceC7054k.mo30397c(interfaceC1879i, i7, enumC6845a);
        }
    }

    /* JADX INFO: renamed from: c */
    InterfaceC6918c mo30397c(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a);
}
