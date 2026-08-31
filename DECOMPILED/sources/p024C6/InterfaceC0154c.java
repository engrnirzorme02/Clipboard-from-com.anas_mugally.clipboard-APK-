package p024C6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.InterfaceC7615a;

/* JADX INFO: renamed from: C6.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0154c {

    /* JADX INFO: renamed from: C6.c$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static int m720a(InterfaceC0154c interfaceC0154c, InterfaceC0096d descriptor) {
            AbstractC6118n.m27187e(descriptor, "descriptor");
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m721b(InterfaceC0154c interfaceC0154c) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Object m722c(InterfaceC0154c interfaceC0154c, InterfaceC0096d interfaceC0096d, int i7, InterfaceC7615a interfaceC7615a, Object obj, int i8, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i8 & 8) != 0) {
                obj = null;
            }
            return interfaceC0154c.mo697h(interfaceC0096d, i7, interfaceC7615a, obj);
        }
    }

    /* JADX INFO: renamed from: b */
    void mo718b(InterfaceC0096d interfaceC0096d);

    /* JADX INFO: renamed from: d */
    long mo693d(InterfaceC0096d interfaceC0096d, int i7);

    /* JADX INFO: renamed from: e */
    int mo694e(InterfaceC0096d interfaceC0096d, int i7);

    /* JADX INFO: renamed from: f */
    Object mo695f(InterfaceC0096d interfaceC0096d, int i7, InterfaceC7615a interfaceC7615a, Object obj);

    /* JADX INFO: renamed from: h */
    Object mo697h(InterfaceC0096d interfaceC0096d, int i7, InterfaceC7615a interfaceC7615a, Object obj);

    /* JADX INFO: renamed from: k */
    int mo699k(InterfaceC0096d interfaceC0096d);

    /* JADX INFO: renamed from: o */
    String mo702o(InterfaceC0096d interfaceC0096d, int i7);

    /* JADX INFO: renamed from: p */
    boolean mo703p();

    /* JADX INFO: renamed from: q */
    int mo719q(InterfaceC0096d interfaceC0096d);
}
