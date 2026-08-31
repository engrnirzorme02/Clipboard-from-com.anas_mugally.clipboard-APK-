package p301m5;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: m5.N */
/* JADX INFO: loaded from: classes.dex */
public final class C6360N {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6369X f24256a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6371Z f24257b;

    public C6360N(InterfaceC6369X timeProvider, InterfaceC6371Z uuidGenerator) {
        AbstractC6118n.m27187e(timeProvider, "timeProvider");
        AbstractC6118n.m27187e(uuidGenerator, "uuidGenerator");
        this.f24256a = timeProvider;
        this.f24257b = uuidGenerator;
    }

    /* JADX INFO: renamed from: b */
    private final String m27419b() {
        String string = this.f24257b.next().toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        String lowerCase = AbstractC6406h.m27551E(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public final C6354H m27420a(C6354H c6354h) {
        String strM27393a;
        String strM27419b = m27419b();
        if (c6354h == null || (strM27393a = c6354h.m27393a()) == null) {
            strM27393a = strM27419b;
        }
        return new C6354H(strM27419b, strM27393a, c6354h != null ? c6354h.m27395c() + 1 : 0, this.f24256a.mo27470a().m27466b());
    }
}
