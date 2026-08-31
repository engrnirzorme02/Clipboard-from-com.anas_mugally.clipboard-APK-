package p304n0;

import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import kotlin.jvm.internal.AbstractC6118n;
import p286k6.InterfaceC6077c;
import p312o0.C6516f;
import p312o0.C6518h;

/* JADX INFO: renamed from: n0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6431d {

    /* JADX INFO: renamed from: a */
    private final C2637b0 f24474a;

    /* JADX INFO: renamed from: b */
    private final C2635a0.c f24475b;

    /* JADX INFO: renamed from: c */
    private final AbstractC6428a f24476c;

    /* JADX INFO: renamed from: d */
    private final C6516f f24477d;

    public C6431d(C2637b0 store, C2635a0.c factory, AbstractC6428a defaultExtras) {
        AbstractC6118n.m27187e(store, "store");
        AbstractC6118n.m27187e(factory, "factory");
        AbstractC6118n.m27187e(defaultExtras, "defaultExtras");
        this.f24474a = store;
        this.f24475b = factory;
        this.f24476c = defaultExtras;
        this.f24477d = new C6516f();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC2632Y m27646e(C6431d c6431d, InterfaceC6077c interfaceC6077c, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = C6518h.f24643a.m27755c(interfaceC6077c);
        }
        return c6431d.m27647d(interfaceC6077c, str);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2632Y m27647d(InterfaceC6077c modelClass, String key) {
        AbstractC2632Y abstractC2632YM12605b;
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(key, "key");
        synchronized (this.f24477d) {
            try {
                abstractC2632YM12605b = this.f24474a.m12605b(key);
                if (modelClass.mo27116c(abstractC2632YM12605b)) {
                    if (this.f24475b instanceof C2635a0.e) {
                        C2635a0.e eVar = (C2635a0.e) this.f24475b;
                        AbstractC6118n.m27184b(abstractC2632YM12605b);
                        eVar.mo12571d(abstractC2632YM12605b);
                    }
                    AbstractC6118n.m27185c(abstractC2632YM12605b, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C6429b c6429b = new C6429b(this.f24476c);
                    c6429b.m27642c(C2635a0.f10444c, key);
                    abstractC2632YM12605b = AbstractC6432e.m27648a(this.f24475b, modelClass, c6429b);
                    this.f24474a.m12607d(key, abstractC2632YM12605b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC2632YM12605b;
    }
}
