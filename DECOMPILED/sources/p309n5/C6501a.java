package p309n5;

import kotlin.jvm.internal.AbstractC6118n;
import p301m5.InterfaceC6365T;

/* JADX INFO: renamed from: n5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6501a {

    /* JADX INFO: renamed from: a */
    public static final C6501a f24584a = new C6501a();

    /* JADX INFO: renamed from: b */
    public static InterfaceC6365T f24585b;

    private C6501a() {
    }

    /* JADX INFO: renamed from: b */
    public static final void m27674b() {
        try {
            if (f24585b == null) {
                f24584a.m27676c(InterfaceC6365T.f24270a.m27437a());
            }
            C6501a c6501a = f24584a;
            if (c6501a.m27675a().mo27434a()) {
                c6501a.m27675a().mo27435b();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6365T m27675a() {
        InterfaceC6365T interfaceC6365T = f24585b;
        if (interfaceC6365T != null) {
            return interfaceC6365T;
        }
        AbstractC6118n.m27197o("sharedSessionRepository");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m27676c(InterfaceC6365T interfaceC6365T) {
        AbstractC6118n.m27187e(interfaceC6365T, "<set-?>");
        f24585b = interfaceC6365T;
    }
}
