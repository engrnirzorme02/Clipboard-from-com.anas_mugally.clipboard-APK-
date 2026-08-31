package kotlin.jvm.internal;

import p286k6.InterfaceC6077c;
import p286k6.InterfaceC6078d;
import p286k6.InterfaceC6079e;
import p286k6.InterfaceC6080f;
import p286k6.InterfaceC6081g;
import p286k6.InterfaceC6082h;

/* JADX INFO: renamed from: kotlin.jvm.internal.D */
/* JADX INFO: loaded from: classes.dex */
public class C6101D {
    /* JADX INFO: renamed from: a */
    public InterfaceC6079e m27146a(AbstractC6115k abstractC6115k) {
        return abstractC6115k;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC6077c m27147b(Class cls) {
        return new C6110f(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC6078d m27148c(Class cls, String str) {
        return new C6120p(cls, str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC6080f m27149d(AbstractC6121q abstractC6121q) {
        return abstractC6121q;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC6081g m27150e(AbstractC6123s abstractC6123s) {
        return abstractC6123s;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC6082h m27151f(AbstractC6125u abstractC6125u) {
        return abstractC6125u;
    }

    /* JADX INFO: renamed from: g */
    public String m27152g(InterfaceC6114j interfaceC6114j) {
        String string = interfaceC6114j.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: h */
    public String m27153h(AbstractC6119o abstractC6119o) {
        return m27152g(abstractC6119o);
    }
}
