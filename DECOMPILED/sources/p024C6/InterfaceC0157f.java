package p024C6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.InterfaceC7619e;

/* JADX INFO: renamed from: C6.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0157f {

    /* JADX INFO: renamed from: C6.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static InterfaceC0155d m734a(InterfaceC0157f interfaceC0157f, InterfaceC0096d descriptor, int i7) {
            AbstractC6118n.m27187e(descriptor, "descriptor");
            return interfaceC0157f.mo730a(descriptor);
        }

        /* JADX INFO: renamed from: b */
        public static void m735b(InterfaceC0157f interfaceC0157f) {
        }

        /* JADX INFO: renamed from: c */
        public static void m736c(InterfaceC0157f interfaceC0157f, InterfaceC7619e serializer, Object obj) {
            AbstractC6118n.m27187e(serializer, "serializer");
            if (serializer.mo1120a().mo372c()) {
                interfaceC0157f.mo713p(serializer, obj);
            } else if (obj == null) {
                interfaceC0157f.mo731c();
            } else {
                interfaceC0157f.mo709k();
                interfaceC0157f.mo713p(serializer, obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0155d mo730a(InterfaceC0096d interfaceC0096d);

    /* JADX INFO: renamed from: c */
    void mo731c();

    /* JADX INFO: renamed from: f */
    void mo732f(double d7);

    /* JADX INFO: renamed from: h */
    void mo733h(boolean z7);

    /* JADX INFO: renamed from: k */
    void mo709k();

    /* JADX INFO: renamed from: m */
    InterfaceC0155d mo711m(InterfaceC0096d interfaceC0096d, int i7);

    /* JADX INFO: renamed from: o */
    void mo712o(int i7);

    /* JADX INFO: renamed from: p */
    void mo713p(InterfaceC7619e interfaceC7619e, Object obj);

    /* JADX INFO: renamed from: q */
    void mo714q(long j7);

    /* JADX INFO: renamed from: r */
    void mo715r(String str);
}
